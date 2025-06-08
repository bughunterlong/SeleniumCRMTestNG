package Customers.CustomersPage;

import Common.BaseTest;
import Common.CRMDataUtils;
import Locators.Customers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.List;

public class deleteCustomer extends BaseTest {
    static String currentTotalCustomersBeforeDelete;
    static String currentActiveCustomersBeforeDelete;


    @Test(priority = 1, description = "Get all current Total Customers,Active Customers for comparsion")
    public static void getCustomersSummary() throws InterruptedException {
        loginCRM();
        // Click Customers menu
        driver.findElement(By.xpath(Customers.menuCustomer)).click();
        currentTotalCustomersBeforeDelete = driver.findElement(By.xpath(Customers.totalCustomers)).getText();
        currentActiveCustomersBeforeDelete = driver.findElement(By.xpath(Customers.activeCustomers)).getText();
    }
    @Test(priority = 2,description = "Verify delete a customer successfully")
    public static void checkDeleteCustomerSuccess() throws InterruptedException {
        driver.findElement(By.xpath(Customers.inputSearch)).sendKeys(addNewCustomer.company);
        //Thread.sleep(1000);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(Customers.listCompany),addNewCustomer.company));
        Assert.assertTrue(driver.findElement(By.xpath(Customers.listCompany)).isDisplayed());
        // Hover chuột đến Company để thấy nút delete
        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath(Customers.listCompany))).perform();
        //Thread.sleep(1000);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Customers.listbuttonDeleteCompany))).click();
        // Handle Popup Window
        driver.switchTo().alert().accept();
        //Thread.sleep(1000);
        SoftAssert softassert = new SoftAssert();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Customers.alertDeleteCustomerSuccess)));
        softassert.assertEquals(driver.findElement(By.xpath(Customers.alertDeleteCustomerSuccess)).getText(),"Customer deleted");
        softassert.assertTrue(driver.findElement(By.xpath(Customers.alertDeleteCustomerSuccess)).isDisplayed());
        softassert.assertAll();
    }
    @Test(priority = 3,description = "Verify Total Customers data decrease 1 at Customer Summary after delete a customer",dependsOnMethods = "checkDeleteCustomerSuccess")
    public static void checkTotalCustomers() throws InterruptedException{
        int totalCustomersInt = Integer.parseInt(currentTotalCustomersBeforeDelete);
        int expect_TotalCustomersAfterDelete = CRMDataUtils.getTotalAfterDelete(totalCustomersInt);
        String numberTotalCustomerAfterDelete = driver.findElement(By.xpath(Customers.totalCustomers)).getText();
        Assert.assertEquals(Integer.parseInt(numberTotalCustomerAfterDelete),expect_TotalCustomersAfterDelete);
    }
    @Test(priority = 4,description = "Verify Active Customers data decrease 1 at Customer Summary after delete a customer",dependsOnMethods = "checkDeleteCustomerSuccess")
    public static void checkActiveCustomers() throws InterruptedException{
        int totalCustomersInt = Integer.parseInt(currentActiveCustomersBeforeDelete);
        int expect_ActiveCustomersAfterDelete = CRMDataUtils.getTotalAfterDelete(totalCustomersInt);
        String numberActiveCustomerAfterDelete = driver.findElement(By.xpath(Customers.activeCustomers)).getText();
        Assert.assertEquals(Integer.parseInt(numberActiveCustomerAfterDelete),expect_ActiveCustomersAfterDelete);
    }

    @Test(priority = 5,description = "Verify Customer disappeared in table after delete customer", dependsOnMethods = "checkDeleteCustomerSuccess")
    public static void checkDataCustomerTable() throws InterruptedException{
        driver.findElement(By.xpath(Customers.inputSearch)).sendKeys(addNewCustomer.company);
        //Thread.sleep(1000);
        boolean isCustomerAbsent = wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(Customers.listCompany)));
        Assert.assertTrue(isCustomerAbsent, "Customer still exists in the table after deletion!");
    }

}

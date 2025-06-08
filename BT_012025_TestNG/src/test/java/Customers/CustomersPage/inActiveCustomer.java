package Customers.CustomersPage;

import Common.BaseTest;
import Common.CRMDataUtils;
import Locators.Customers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class inActiveCustomer extends BaseTest {
    static String currentInactiveCustomersBeforeInactive;
    static int totalInactiveCustomersInt;
    static String currentActiveCustomersBeforeInactive;
    static int totalActiveCustomersInt;

    @Test(priority = 1,description = "Get all current Inactive Customers,Active Customers for comparsion")
    public static void getCustomersSummary() throws InterruptedException {
        loginCRM();
        // Click Customers menu
        driver.findElement(By.xpath(Customers.menuCustomer)).click();
        currentInactiveCustomersBeforeInactive = driver.findElement(By.xpath(Customers.inactiveCustomers)).getText();
        currentActiveCustomersBeforeInactive = driver.findElement(By.xpath(Customers.activeCustomers)).getText();
    }
    @Test(priority = 2,description = "Verify inactive a customer successfully")
    public static void checkInactiveCustomerSuccess() throws InterruptedException {
        driver.findElement(By.xpath(Customers.inputSearch)).sendKeys(addNewCustomer.company);
        //Thread.sleep(2000);
        wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(Customers.listCompany),addNewCustomer.company));
        Assert.assertTrue(driver.findElement(By.xpath(Customers.listCompany)).isDisplayed());
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath(Customers.listToggleInactiveCustomer))).click();
        Assert.assertFalse(driver.findElement(By.xpath(Customers.listIsSelectedToggleInactiveCustomer)).isSelected());

    }
    @Test(priority = 3,description = "Verify Inactive Customers data increase 1 at Customer Summary after inactive a customer",dependsOnMethods = "checkInactiveCustomerSuccess")
    public static void checkInactiveCustomer() throws InterruptedException{
        driver.navigate().refresh();
        //Thread.sleep(1000);
        totalInactiveCustomersInt = Integer.parseInt(currentInactiveCustomersBeforeInactive);
        int expect_TotalInActiveCustomers = CRMDataUtils.getTotalAfterAdd(totalInactiveCustomersInt);
        String numberTotalInactiveCustomers = driver.findElement(By.xpath(Customers.inactiveCustomers)).getText();
        Assert.assertEquals(Integer.parseInt(numberTotalInactiveCustomers),expect_TotalInActiveCustomers);
    }
    @Test(priority = 4,description = "Verify Active Customers data decrease 1 at Customer Summary after inactive a customer",dependsOnMethods = "checkInactiveCustomerSuccess")
    public static void checkActiveCustomer() throws InterruptedException{
        totalActiveCustomersInt = Integer.parseInt(currentActiveCustomersBeforeInactive);
        int expect_TotalActiveCustomers = CRMDataUtils.getTotalAfterDelete(totalActiveCustomersInt);
        String numberTotalActiveCustomers = driver.findElement(By.xpath(Customers.activeCustomers)).getText();
        Assert.assertEquals(Integer.parseInt(numberTotalActiveCustomers),expect_TotalActiveCustomers);
    }
}

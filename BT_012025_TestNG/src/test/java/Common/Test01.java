package Common;

import Locators.Customers;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Test01 extends BaseTest {
    @Test
    public static void addNewCustomer() throws InterruptedException {
        loginCRM();
        // Click Customers menu
        driver.findElement(By.xpath(Customers.menuCustomer)).click();
        // Click button New Customer
        driver.findElement(By.xpath(Customers.buttonNewCustomer)).click();
        Thread.sleep(1000);
        driver.findElement(By.id(Customers.input_company)).sendKeys("Python");
        Thread.sleep(1000);
        driver.findElement(By.xpath(Customers.buttonSaveCustomer)).click();
    }
}

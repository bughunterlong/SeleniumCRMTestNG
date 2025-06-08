package Customers.CustomersPage;

import Common.BaseTest;
import Locators.Customers;
import Locators.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class checkLabel extends BaseTest {
    @Test(description = "Verify check Label on Add new customer form")
    public static void checkLabel() throws InterruptedException {
        loginCRM();
        // Click Customers menu
        driver.findElement(By.xpath(Customers.menuCustomer)).click();
        // Click button New Customer
        driver.findElement(By.xpath(Customers.buttonNewCustomer)).click();
        Thread.sleep(1000);
        String labelCustomerDetail = driver.findElement(By.xpath(Customers.customer_details)).getText();
        String labelCompany = driver.findElement(By.xpath(Customers.company)).getText().replace("*", "");
        String labelVAT = driver.findElement(By.xpath(Customers.vat_number)).getText();
        String labelPhone = driver.findElement(By.xpath(Customers.phone_number)).getText();
        String labelWebsite = driver.findElement(By.xpath(Customers.website)).getText();
        String labelGroups = driver.findElement(By.xpath(Customers.group)).getText();
        String labelCurrency = driver.findElement(By.xpath(Customers.currency)).getText();
        String labelLanguage = driver.findElement(By.xpath(Customers.default_language)).getText();
        String labelAddress = driver.findElement(By.xpath(Customers.address)).getText();
        String labelCity = driver.findElement(By.xpath(Customers.city1)).getText();
        String labelState = driver.findElement(By.xpath(Customers.state1)).getText();
        String labelZipcode = driver.findElement(By.xpath(Customers.zipcode1)).getText();
        String labelCountry = driver.findElement(By.xpath(Customers.country1)).getText();
        // Verify all labels
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(labelCustomerDetail.trim(), "Customer Details");
        softAssert.assertEquals(labelCompany.trim(), "Company");
        softAssert.assertEquals(labelVAT, "VAT Number");
        softAssert.assertEquals(labelPhone, "Phone");
        softAssert.assertEquals(labelWebsite, "Website");
        softAssert.assertEquals(labelGroups, "Groups");
        softAssert.assertEquals(labelCurrency, "Currency");
        softAssert.assertEquals(labelLanguage, "Default Language");
        softAssert.assertEquals(labelAddress, "Address");
        softAssert.assertEquals(labelCity, "City");
        softAssert.assertEquals(labelState, "State");
        softAssert.assertEquals(labelZipcode, "Zip Code");
        softAssert.assertEquals(labelCountry, "Country");
        softAssert.assertAll();
    }
}

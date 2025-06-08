package Customers.CustomersPage;

import Common.BaseTest;
import Common.CRMDataUtils;
import Locators.Customers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.util.List;


import static Locators.Customers.inputSearch;
import static Locators.Customers.listcountry;

public class addNewCustomer extends BaseTest {
    public static String company = "Long White Box";
    static String VATnumber = "123456789";
    static String phoneNumber = "0123456789";
    static String website = "https://anhtester.com/";
    static String group = "VIP";
    static String currency = "USD$";
    static String language = "Vietnamese";
    static String address = "FPT";
    static String city = "Ho Chi Minh";
    static String state = "Thu Duc";
    static String zipcode = "123456";
    static String country = "Vietnam";

    static String currentTotalCustomersBeforeAdd;
    static String currentActiveCustomersBeforeAdd;


    @Test(priority = 1, description = "Get all current Total Customers,Active Customers for comparsion")
    public static void getCustomersSummary() throws InterruptedException {
        loginCRM();
        // Click Customers menu
        driver.findElement(By.xpath(Customers.menuCustomer)).click();
        currentTotalCustomersBeforeAdd = driver.findElement(By.xpath(Customers.totalCustomers)).getText();
        currentActiveCustomersBeforeAdd = driver.findElement(By.xpath(Customers.activeCustomers)).getText();
    }

    @Test(priority = 2,description = "Verify add a new customer successfully")
    public static void checkAddNewCustomerSuccess() throws InterruptedException {
        // Click button New Customer
        driver.findElement(By.xpath(Customers.buttonNewCustomer)).click();
        //Thread.sleep(1000);
        driver.findElement(By.id(Customers.input_company)).sendKeys(company);
        driver.findElement(By.id(Customers.input_vatnumber)).sendKeys(VATnumber);
        driver.findElement(By.id(Customers.input_phonenumber)).sendKeys(phoneNumber);
        driver.findElement(By.id(Customers.input_webiste)).sendKeys(website);
        driver.findElement(By.xpath(Customers.dropdown_group)).click();
        //Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Customers.input_searchgroup)));
        driver.findElement(By.xpath(Customers.input_searchgroup)).sendKeys("v");
        //Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Customers.listgroup)));
        List<WebElement> listGroup = driver.findElements(By.xpath(Customers.listgroup));
        for (int i = 0; i < listGroup.size(); i++) {
            if (listGroup.get(i).getText().equals(group)) {
                listGroup.get(i).click();
                break;
            }
        }
        driver.findElement(By.xpath(Customers.dropdown_group)).click();// Click again to close the dropdown
        driver.findElement(By.xpath(Customers.dropdown_currency)).click();
        //Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Customers.listcurrency)));
        List<WebElement> listCurrency = driver.findElements(By.xpath(Customers.listcurrency));
        for (int i = 0; i < listCurrency.size(); i++) {
            if (listCurrency.get(i).getText().equals(currency)) {
                listCurrency.get(i).click();
                break;
            }
        }
        driver.findElement(By.xpath(Customers.dropdown_language)).click();
        //Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Customers.listlanguage)));
        List<WebElement> listLanguage = driver.findElements(By.xpath(Customers.listlanguage));
        for (int i = 0; i < listLanguage.size(); i++) {
            if (listLanguage.get(i).getText().equals(language)) {
                listLanguage.get(i).click();
                break;
            }
        }
        driver.findElement(By.id(Customers.input_address)).sendKeys(address);
        driver.findElement(By.id(Customers.input_city)).sendKeys(city);
        driver.findElement(By.id(Customers.input_state)).sendKeys(state);
        driver.findElement(By.id(Customers.input_zipcode)).sendKeys(zipcode);
        driver.findElement(By.xpath(Customers.select_country)).click();

        driver.findElement(By.xpath(Customers.input_searchcountry)).sendKeys(country);
        //Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(listcountry)));
        List<WebElement> listCountry = driver.findElements(By.xpath(listcountry));
        for (int i = 0; i < listCountry.size(); i++) {
            if (listCountry.get(i).getText().equals(country)) {
                listCountry.get(i).click();
                break;
            }
        }
        driver.findElement(By.xpath(Customers.buttonSaveCustomer)).click();
        //Thread.sleep(1000);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Customers.alertAddCustomerSuccess)));
        String alertAddCustomerSuccess = driver.findElement(By.xpath(Customers.alertAddCustomerSuccess)).getText();
        boolean checkaAlertAddCustomerSuccess = driver.findElement(By.xpath(Customers.alertAddCustomerSuccess)).isDisplayed();
        SoftAssert softassert = new SoftAssert();
        softassert.assertEquals(alertAddCustomerSuccess, "Customer added successfully.");
        softassert.assertTrue(checkaAlertAddCustomerSuccess);
        softassert.assertAll();
    }

    @Test(priority = 3,description = "Verify corrected data at Customer Datails after add new customer", dependsOnMethods = "checkAddNewCustomerSuccess")
    public void checkDataCustomerDetails() throws InterruptedException {
        //Thread.sleep(1000);
        String valueCompany = driver.findElement(By.id(Customers.input_company)).getAttribute("value");
        String valueVATnumber = driver.findElement(By.id(Customers.input_vatnumber)).getAttribute("value");
        String valuePhoneNumber = driver.findElement(By.id(Customers.input_phonenumber)).getAttribute("value");
        String valueWebsite = driver.findElement(By.id(Customers.input_webiste)).getAttribute("value");
        String valueGroup = driver.findElement(By.xpath(Customers.dropdown_group)).getText();
        String valueCurrency = driver.findElement(By.xpath(Customers.dropdown_currency)).getText();
        String valueLanguage = driver.findElement(By.xpath(Customers.dropdown_language)).getText();
        String valueAddress = driver.findElement(By.id(Customers.input_address)).getAttribute("value");
        String valueCity = driver.findElement(By.id(Customers.input_city)).getAttribute("value");
        String valueState = driver.findElement(By.id(Customers.input_state)).getAttribute("value");
        String valueZipcode = driver.findElement(By.id(Customers.input_zipcode)).getAttribute("value");
        String valueCountry = driver.findElement(By.xpath(Customers.select_country)).getText();
        SoftAssert softassert = new SoftAssert();
        softassert.assertEquals(valueCompany, company);
        softassert.assertEquals(valueVATnumber, VATnumber);
        softassert.assertEquals(valuePhoneNumber, phoneNumber);
        softassert.assertEquals(valueWebsite, website);
        softassert.assertEquals(valueGroup, group);
        softassert.assertEquals(valueCurrency, currency.replace("$", ""));
        softassert.assertEquals(valueLanguage, language);
        softassert.assertEquals(valueAddress, address);
        softassert.assertEquals(valueCity, city);
        softassert.assertEquals(valueState, state);
        softassert.assertEquals(valueZipcode, zipcode);
        softassert.assertEquals(valueCountry, country);
        softassert.assertAll();
    }

    @Test(priority = 4,description = "Verify Total Customers data increase 1 at Customer Summary after add a new customer", dependsOnMethods = "checkAddNewCustomerSuccess")
    public static void checkTotalCustomers() throws InterruptedException {
        driver.findElement(By.xpath(Customers.menuCustomer)).click();
        //Thread.sleep(1000);
        int totalCustomersInt = Integer.parseInt(currentTotalCustomersBeforeAdd);
        int expect_TotalCustomersAfterAdd = CRMDataUtils.getTotalAfterAdd(totalCustomersInt);
        String numberTotalCustomerAfterAdd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Customers.totalCustomers))).getText();
        Assert.assertEquals(expect_TotalCustomersAfterAdd, Integer.parseInt(numberTotalCustomerAfterAdd));
    }

    @Test(priority = 5,description = "Verify Active Customers data increase 1 at Customer Summary after add a new customer", dependsOnMethods = "checkAddNewCustomerSuccess")
    public static void checkActiveCustomers() throws InterruptedException {
        int activeCustomersInt = Integer.parseInt(currentActiveCustomersBeforeAdd);
        int expect_ActiveCustomersAfterAdd = CRMDataUtils.getTotalAfterAdd(activeCustomersInt);
        String numberActiveCustomerAfterAdd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(Customers.activeCustomers))).getText();
        Assert.assertEquals(expect_ActiveCustomersAfterAdd, Integer.parseInt(numberActiveCustomerAfterAdd));
    }
    @Test(priority = 6,description = "Verify corrected data in table after add new customer", dependsOnMethods = "checkAddNewCustomerSuccess")
    public static void checkDataCustomerTable() throws InterruptedException{
        driver.findElement(By.xpath(inputSearch)).sendKeys(company);
        //Thread.sleep(1000);
        boolean check = wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath(Customers.listCompany),company));
        Assert.assertTrue(check,"Customer name in table does not match");

    }

}

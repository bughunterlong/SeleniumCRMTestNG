package LoginPage;

import Common.BaseTest;
import Locators.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginFail extends BaseTest {
    @Test(priority = 1,description = "Verify alert error email/password message required is displayed correctly when user not input email and password")
    public static void checkAlertBothErrorMessage(){
        openLoginPage();
        driver.findElement(By.xpath(LoginPage.buttonLogin)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LoginPage.alertErrorEmailRequired)));
        String alertErrorEmailRequired = driver.findElement(By.xpath(LoginPage.alertErrorEmailRequired)).getText();
        boolean alertErrorEmailRequiredIsDisplayed = driver.findElement(By.xpath(LoginPage.alertErrorEmailRequired)).isDisplayed();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LoginPage.alertErrorPasswordRequired)));
        String alertErrorPasswordRequired = driver.findElement(By.xpath(LoginPage.alertErrorPasswordRequired)).getText();
        boolean alertErrorPasswordRequiredIsDisplayed = driver.findElement(By.xpath(LoginPage.alertErrorPasswordRequired)).isDisplayed();
        Assert.assertTrue(alertErrorEmailRequiredIsDisplayed);
        Assert.assertEquals(alertErrorEmailRequired.trim(),"The Email Address field is required.");
        Assert.assertTrue(alertErrorPasswordRequiredIsDisplayed);
        Assert.assertEquals(alertErrorPasswordRequired.trim(),"The Password field is required.");
    }
    @Test(priority = 2,description = "Verify alert error email message required is displayed correctly when user not input email")
    public static void checkAlertErrorEmailMessage() throws InterruptedException {
        //Thread.sleep(1000);
        driver.findElement(By.xpath(LoginPage.inputPassword)).sendKeys("123456");
        driver.findElement(By.xpath(LoginPage.buttonLogin)).click();
        //Thread.sleep(500);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LoginPage.alertErrorMessage)));
        String alertErrorEmailRequired = driver.findElement(By.xpath(LoginPage.alertErrorMessage)).getText();
        boolean alertErrorEmailRequiredIsDisplayed = driver.findElement(By.xpath(LoginPage.alertErrorMessage)).isDisplayed();
        Assert.assertTrue(alertErrorEmailRequiredIsDisplayed);
        Assert.assertEquals(alertErrorEmailRequired.trim(),"The Email Address field is required.");
    }
    @Test(priority = 3,description = "Verify alert error password message required is displayed correctly when user not input password")
    public static void checkAlertErrorPasswordMesage() throws InterruptedException{
        driver.findElement(By.xpath(LoginPage.inputEmail)).sendKeys("test@mail.com");
        driver.findElement(By.xpath(LoginPage.buttonLogin)).click();
        //Thread.sleep(500);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LoginPage.alertErrorMessage)));
        String alertErrorPasswordRequired = driver.findElement(By.xpath(LoginPage.alertErrorMessage)).getText();
        boolean alertErrorPasswordRequiredIsDisplayed = driver.findElement(By.xpath(LoginPage.alertErrorMessage)).isDisplayed();
        Assert.assertTrue(alertErrorPasswordRequiredIsDisplayed);
        Assert.assertEquals(alertErrorPasswordRequired.trim(),"The Password field is required.");
    }
    @Test(priority = 4,description = "Verify alert error message is displayed correctly when user input incorrect email or password")
    public static void checkAlertErrorMessage() throws InterruptedException{
        //Thread.sleep(1000);
        driver.findElement(By.xpath(LoginPage.inputEmail)).sendKeys("test@mail.com");
        driver.findElement(By.xpath(LoginPage.inputPassword)).sendKeys("123");
        driver.findElement(By.xpath(LoginPage.buttonLogin)).click();
        //Thread.sleep(500);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LoginPage.alertErrorMessage)));
        String alertErrorMsg = driver.findElement(By.xpath(LoginPage.alertErrorMessage)).getText();
        boolean alertErrorMsgIsDisplayed = driver.findElement(By.xpath(LoginPage.alertErrorMessage)).isDisplayed();
        Assert.assertTrue(alertErrorMsgIsDisplayed);
        Assert.assertEquals(alertErrorMsg.trim(),"Invalid email or password");
    }

}

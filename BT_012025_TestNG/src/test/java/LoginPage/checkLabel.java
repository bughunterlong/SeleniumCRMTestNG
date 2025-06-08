package LoginPage;

import Common.BaseTest;
import Locators.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class checkLabel extends BaseTest {
    @Test(description = "Verify check Label on Login form")
    public static void checkLabel() throws InterruptedException {
        openLoginPage();
        String labelEmailAddress = driver.findElement(By.xpath(LoginPage.labelEmail)).getText();
        String labelPassword = driver.findElement(By.xpath(LoginPage.labelPassword)).getText();
        String labelLogin = driver.findElement(By.xpath(LoginPage.headerLoginPage)).getText();
        String labelRememberMe = driver.findElement(By.xpath(LoginPage.labelRememberMe)).getText();
        String labelForgotPassword = driver.findElement(By.xpath(LoginPage.linkForgotPassword)).getText();
        String linkForgotPassword = driver.findElement(By.xpath(LoginPage.linkForgotPassword)).getAttribute("href");
        SoftAssert softAssert = new SoftAssert();
        softAssert.assertEquals(labelEmailAddress.trim(),"Email Address");
        softAssert.assertEquals(labelPassword.trim(),"Password");
        softAssert.assertEquals(labelLogin.trim(),"Login");
        softAssert.assertEquals(labelRememberMe.trim(),"Remember me");
        softAssert.assertEquals(labelForgotPassword.trim(),"Forgot Password?");
        softAssert.assertTrue(linkForgotPassword.contains("forgot_password"));
        softAssert.assertAll();
    }
}

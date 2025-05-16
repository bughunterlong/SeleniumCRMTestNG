package LoginPage;

import Common.BaseTest;
import Locators.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

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
        Assert.assertEquals(labelEmailAddress.trim(),"Email Address");
        Assert.assertEquals(labelPassword.trim(),"Password");
        Assert.assertEquals(labelLogin.trim(),"Login");
        Assert.assertEquals(labelRememberMe.trim(),"Remember me");
        Assert.assertEquals(labelForgotPassword.trim(),"Forgot Password?");
        Assert.assertTrue(linkForgotPassword.contains("forgot_password"));
    }
}

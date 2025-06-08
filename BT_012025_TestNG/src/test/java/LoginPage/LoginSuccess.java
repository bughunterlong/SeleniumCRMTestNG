package LoginPage;

import Common.BaseTest;
import Locators.SidebarMenu;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginSuccess extends BaseTest {
    @Test(description = "Verify login success with valid email and password")
    public static void checkLoginSuccess() throws InterruptedException {
        loginCRM();
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SidebarMenu.listmenu)));
        boolean menuIsDisplayed = driver.findElement(By.xpath(SidebarMenu.listmenu)).isDisplayed();
        Assert.assertTrue(menuIsDisplayed);
    }
}

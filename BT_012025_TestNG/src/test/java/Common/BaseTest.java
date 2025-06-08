package Common;

import Locators.LoginPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {
    public static WebDriver driver;
    public static WebDriverWait wait;
    @BeforeClass
    public void createDriver(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(0));
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));// Thời gian chờ tối đa, nếu tìm thấy phần tử thỏa mãn d/k sớm hơn 10s, sẽ tiếp tục thực thi lệnh tiếp theo
    }
    @AfterClass
    public void closeDriver() throws InterruptedException{
        Thread.sleep(2000);
        driver.quit();
    }

    public static void openLoginPage(){
        driver.get("https://crm.anhtester.com/admin/authentication");
    }

    public static void loginCRM(){
        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.xpath(LoginPage.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(LoginPage.inputPassword)).sendKeys("123456");
        driver.findElement(By.xpath(LoginPage.buttonLogin)).click();
    }
}

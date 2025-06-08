package Locators;

public class LoginPage {
    // Xpath for Header Login Page
    public static String headerLoginPage = "//h1[normalize-space()='Login']";

    // Xpath in Login form
    public static String labelEmail = "//label[normalize-space()='Email Address']";
    public static String labelPassword = "//label[normalize-space()='Password']";
    public static String labelRememberMe = "//label[@for='remember']";
    public static String inputEmail = "//input[@type='email']";
    public static String inputPassword = "//input[@type='password']";
    public static String buttonLogin = "//button[@type='submit']";
    public static String checkboxRememberMe = "//input[@id='remember']";
    public static String linkForgotPassword = "//a[contains(@href,'forgot_password') or normalize-space() ='Forgot Password?']";

    // Xpath for errorMessage
    public static String alertErrorMessage = "//div[contains(@class,'alert-danger')]";
    public static String alertErrorEmailRequired = "//div[contains(text(),'The Email Address field')]";
    public static String alertErrorPasswordRequired = "//div[contains(text(),'The Password field')]";
}

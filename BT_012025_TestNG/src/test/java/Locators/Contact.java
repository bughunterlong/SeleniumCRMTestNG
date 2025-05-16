package Locators;

public class Contact {
    // Xpath for Add New Contacts on
    public static String headerContact = "//h4[normalize-space()='Contacts']";
    public static String buttonNewContact = "//a[normalize-space()='New Contact']";
    public static String formContact = "//form[@id='contact-form']";
    public static String inputFirstName = "firstname";
    public static String inputLastname = "lastname";
    public static String inputPosition = "title";
    public static String inputEmail = "email";
    public static String inputPhone = "phonenumber";
    public static String inputPassword = "password";
    public static String buttonClose = "//button[text() = 'Close']";
    public static String buttonSaveContact = "//button[text() = 'Save']";

    // Xpath for alert error message
    public static String alertErrorFirstNameRequired = "//p[@class='text-danger' and @id='firstname-error']";
    public static String alertErrorLastNameRequired = "//p[@class='text-danger' and @id='lastname-error']";
    public static String alertErrorEmailRequired = "//p[@class='text-danger' and @id='email-error']";
    public static String alertErrorPasswordRequired = "//p[@class='text-danger' and @id='password-error']";

    // Xpath for add new contact success message
    public static String alertAddContactSuccess = "//span[text() = 'Contact added successfully.']";

    // Xpath for listFullName, listEmail
    public static String listFullName = "//th[contains(@aria-label,'Full Name')]/following::tr/td[1]";
    public static String listEmail = "//th[contains(@aria-label,'Email')]/following::tr/td[2]";

    // Xpath for toggleInactiveContact
    public static String toggleInactiveContact = "//th[contains(@aria-label,'Active')]/following::td[5]/div[@class='onoffswitch']/input";
}

package Locators;

public class Customers {
    // Xpath for Customers menu
    public static String menuCustomer = "//span[normalize-space()='Customers']";
    // Xpath for New Customer button
    public static String buttonNewCustomer = "//a[normalize-space()='New Customer']";
    // Xpath for Contacts button
    public static String buttonContacts = "//a[normalize-space()='Contacts' and contains(@href,'all_contacts')]";
    // Xpath for input Search Customer
    public static String inputSearch = "//div[@id='clients_filter']//input[@type='search']";

    // Label xpath on Customer Details
    public static String customer_details = "//a[normalize-space()='Customer Details']";
    public static String billing_shipping = "//a[contains(text(),'Billing & Shipping')]";
    public static String company = "//label[@for='company']";
    public static String vat_number = "//label[@for='vat']";
    public static String phone_number = "//label[@for='phonenumber']";
    public static String website = "//label[@for='website']";
    public static String group = "//label[@for='groups_in[]']";
    public static String currency = "//label[@for='default_currency']";
    public static String default_language = "//label[@for='default_language']";
    public static String address = "//label[@for='address']";
    public static String city1 = "//label[@for='city']";
    public static String state1 = "//label[@for='state']";
    public static String zipcode1 = "//label[@for='zip']";
    public static String country1 = "//label[@for='country']";

    // Button xpath Save/Create Customer and Submit
    public static String buttonSaveCreateContact = "//div[@id='profile-save-section']/button[normalize-space() = 'Save and create contact']";
    public static String buttonSaveCustomer = "//div[@id='profile-save-section']//button[normalize-space() = 'Save']";


    // Field input xpath on Customer Details
    public static String input_company = "company";
    public static String input_vatnumber = "vat";
    public static String input_phonenumber = "phonenumber";
    public static String input_webiste = "website";
    public static String dropdown_group = "//button[@data-id='groups_in[]']";
    public static String input_searchgroup = "//select[@id='groups_in[]']/following-sibling::div//input[@type='search']";
    public static String listgroup  = "//label[@for='default_currency']/preceding::div[@role='listbox']//li";
    public static String dropdown_currency = "//button[@data-id='default_currency']";
    public static String input_searchcurrency = "//select[@id='default_currency']/following-sibling::div//input[@type='search']";
    public static String listcurrency = "//label[@for='default_currency']/following::div[@role='listbox' and @id='bs-select-2']//li";
    public static String dropdown_language = "//button[@data-id='default_language']";
    public static String listlanguage = "//label[@for='default_language']/following::div[@role='listbox' and @id='bs-select-3']//li";
    public static String input_address = "address";
    public static String input_city = "city";
    public static String input_state = "state";
    public static String input_zipcode = "zip";
    public static String select_country = "//button[@data-id='country']";
    public static String input_searchcountry = "//button[@data-id='country']/following-sibling::div//input[@type='search']";
    public static String listcountry = "//label[@for='country']/following::div[@role='listbox' and @id = 'bs-select-4']//li";

    // Xpath on Add new customer group
    public static String add_new_customer_group = "//div[@class='input-group-btn']";
    public static String name = "//label[@for='name']";
    public static String input_name = "name";
    public static String close = "//form[@id='customer-group-modal']//button[text() = 'Close']";
    public static String save_new_customer_group = "//form[@id='customer-group-modal']//button[text() = 'Save']";

    // Label xpath on Billing & Shipping
// 1. Label xpath on Billing Address
    public static String billing_address = "//h4[contains(text(),'Billing Address')]";
    public static String street2 = "//label[@for='billing_street']";
    public static String city2 = "//label[@for='billing_city']";
    public static String state2 = "//label[@for='billing_state']";
    public static String zipcode2 = "//label[@for='billing_zip']";
    public static String country2 = "//label[@for='billing_country']";

    // Field input xpath on Billing Address
    public static String input_street2 = "billing_street";
    public static String input_city2 = "billing_city";
    public static String input_state2 = "billing_state";
    public static String input_zipcode2 = "billing_zip";
    public static String dropdown_country2 = "//button[@data-id='billing_country']";

    // 2. Label xpath on Shipping Address
    public static String shipping_address = "//*[normalize-space()='Shipping Address']";
    public static String street3 = "//label[@for='shipping_street']";
    public static String city3 = "//label[@for='shipping_city']";
    public static String state3 = "//label[@for='shipping_state']";
    public static String zipcode3 = "//label[@for='shipping_zip']";
    public static String country3 = "//label[@for='shipping_country']";

    // Field input xpath on Shipping Address
    public static String input_street3 = "shipping_street";
    public static String input_city3 = "shipping_city";
    public static String input_state3 = "shipping_state";
    public static String input_zipcode3 = "shipping_zip";
    public static String dropdown_country3 = "//button[@data-id='shipping_country']";

    // Xpath for message addCustomer success
    public static String alertAddCustomerSuccess = "//span[text()='Customer added successfully.']";
    public static String alertDeleteCustomerSuccess = "//span[text()='Customer deleted']";

    // Xpath for number of Total Customers, Active Customers, Inactive Customers, Active Contacts, Inactive Contacts
    public static String totalCustomers = "//span[text()='Total Customers']/preceding-sibling::span";
    public static String activeCustomers = "//span[text()='Active Customers']/preceding-sibling::span";
    public static String inactiveCustomers = "//span[text()='Inactive Customers']/preceding-sibling::span";
    public static String activeContacts = "//span[text()='Active Contacts']/preceding-sibling::span";
    public static String inactiveContacts = "//span[text()='Inactive Contacts']/preceding-sibling::span";

    // Xpath for list Company in table
    public static String listCompany = "//table[@id='clients']//th[@id='th-company']/following::tr/td[3]/a";
    public static String listbuttonContactCompany ="//th[@id='th-company']/following::tr/td[3]/div/a[2]";
    public static String listbuttonDeleteCompany = "//th[@id='th-company']/following::tr/td[3]/div/a[3]";

    // Xpath for toggleInactiveCustomer
    public static String listToggleInactiveCustomer = "//th[contains(@aria-label,'Active')]/following::td/div[@class='onoffswitch']";
    public static String listIsSelectedToggleInactiveCustomer = "//th[contains(@aria-label,'Active')]/following::td/div[@class='onoffswitch']/input";

}

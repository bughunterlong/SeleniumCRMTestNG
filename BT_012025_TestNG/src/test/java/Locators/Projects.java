package Locators;

public class Projects {
    // Xpath for Projects menu
    public static String menuProject = "//span[normalize-space()='Projects']";
    // Xpath for New Project button
    public static String buttonNewProject = "//a[normalize-space()='New Project']";
    // Xpath for Projects form
    public static String inputProjectName = "name";
    public static String dropdownCustomer = "//button[@data-id='clientid']";
    public static String inputSearchCustomer = "//button[@data-id='clientid']/following-sibling::div//input[@type='search']";
    public static String listSearchCustomer = "//button[@data-id='clientid']/following-sibling::div//li";
    public static String checkboxCalculateProgress = "//input[@id='progress_from_tasks']";
    public static String slidebarProgress = "//div[@id='tab_project']/descendant::div[contains(@class,'project_progress_slider')]";
    public static String dropdownBillingType = "//button[@data-id='billing_type']";
    public static String dropdownlistBillingType = "//button[@data-id='billing_type']/following-sibling::div//li";
    public static String dropdownStatus = "//button[@data-id='status']";
    public static String dropdownlistStatus = "//button[@data-id='status']/following-sibling::div//li";
    public static String inputRatePerHour = "//input[@id='project_rate_per_hour']";
    public static String inputEstimateHour = "//input[@id='estimated_hours']";
    public static String dropdownMembers = "//button[@data-id='project_members[]']";
    public static String inputSearchMember = "//button[@data-id='project_members[]']/following-sibling::div//input[@type='search']";
    public static String inputStartDate = "//input[@id='start_date']";
    public static String selectStartDate = "//input[@id='start_date']/following-sibling::div//i[contains(@class,'calendar-icon')]";
    public static String inputDeadline = "//input[@id='deadline']";
    public static String selectDeadline = "//input[@id='deadline']/following-sibling::div/i[contains(@class,'calendar-icon')]";
    public static String buttonSave = "//button[normalize-space()='Save']";

    // Xpath for Rich Text Editor
    public static String buttonFile = "//span[text()='File']";
    public static String buttonEdit = "//span[text()='Edit']";
    public static String buttonView = "//span[text()='View']";
    public static String buttonInsert = "//span[text()='Insert']";
    public static String buttonFormat = "//span[text()='Format']";
    public static String buttonTools = "//span[text()='Tools']";
    public static String buttonTable = "//span[text()='Table']";
    public static String dropdownFont = "//button[@title='Font System Font']";
    public static String dropdownlistFont = "//button[@title='Font System Font']/following::div[contains(@class,'item-label')]";
    public static String dropdownFontSize = "//button[contains(@title,'Font size')]";
    public static String dropdownlistFontSize = "//button[contains(@title,'Font size')]/following::div[contains(@class,'item-label')]";

    public static String buttonBold = "//button[@title='Bold']";
    public static String buttonItalic = "//button[@title='Italic']";
    public static String buttonAlignLeft = "//button[@title='Align left']";
    public static String buttonAlignCenter = "//button[@title='Align center']";
    public static String buttonAlignRight = "//button[@title='Align right']";
    public static String buttonAlignJustify = "//button[@title='Justify']";
    public static String buttonInsertIMG = "//button[@title='Insert/edit image']";
    public static String buttonInsertLink = "//button[@title='Insert/edit link']";
    public static String buttonBulletList = "//div[@title='Bullet list']";
    public static String buttonNumberList = "//div[@title='Numbered list']";
    public static String buttonRestore = "//button[@title='Restore last draft']";

    // Xpath for number of Projects status: On hold
    public static String numberOnHold = "//span[normalize-space()='On Hold']/preceding-sibling::span";
    // Xpath for add Project success
    public static String alertAddProjectSuccess = "//span[@class='alert-title' and text()='Project added successfully.']";
    // Xpath for input Search Project
    public static String inputSearch = "//div[@id='projects_filter']//input[@type='search']";
    // Xpath for Project Name, Customer, Status in table
    public static String projectName = "//tbody/tr/td[2]/a";
    public static String customerName = "//tbody/tr/td[3]/a";
    public static String status = "//tbody/tr/td[8]";
}

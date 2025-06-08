package Locators;

public class SidebarMenu {
    // Xpath for Sidebar Menu
    public static String menuDashboard = "//span[normalize-space()='Dashboard']";
    public static String menuCustomers = "//span[normalize-space()='Customers']";
    public static String menuSales = "//li[@class='menu-item-sales']//span[normalize-space()='Sales']";
    public static String menuSubscriptions = "//span[normalize-space()='Subscriptions']";
    public static String menuExpenses = "//li[@class='menu-item-expenses']//span[normalize-space() = 'Expenses']";
    public static String menuContracts = "//span[normalize-space() = 'Contracts']";
    public static String menuProjects = "/span[normalize-space()='Projects']";
    public static String menuTask = "/span[normalize-space()='Tasks']";
    public static String menuSupport = "//span[normalize-space() = 'Support']";
    public static String menuLeads = "//li[@class='menu-item-leads']//span[normalize-space()='Leads']";
    public static String menuEstimateRequest = "//span[normalize-space()='Estimate Request']";
    public static String menuKnowledgeBase = "//span[normalize-space()='Knowledge Base']";
    public static String menuUtility = "//span[normalize-space()='Utilities']";
    public static String menuReport = "//span[normalize-space()='Reports']";

    // Xpath for subMenu Sales
    public static String submenuProposals = "//span[normalize-space()='Proposals']";
    public static String submenuEstimates = "//span[normalize-space()='Estimates']";
    public static String submenuInvoices = "//span[normalize-space()='Invoices']";
    public static String submenuPayments = "//span[normalize-space()='Payments']";
    public static String submenuCreditNotes = "//span[normalize-space()='Credit Notes']";
    public static String submenuItems = "//span[normalize-space()='Items']";

    // Xpath for subMenu Utilities
    public static String submenuMedia = "//span[normalize-space()='Media']";
    public static String submenuPDFExport = "//span[contains(normalize-space(),'PDF')]";
    public static String submenuCalendar = "//span[normalize-space()='Calendar']";

    // Xpath for List Menu Sidebar
    public static String listmenu = "//ul[@id='side-menu']/li[starts-with(@class,'menu-item')]";

    // Xpath for List SubMenu Sales
    public static String listsubmenuSales = "//li[starts-with(@class,'menu-item-sales')]//li";


}

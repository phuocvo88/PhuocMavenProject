package PageObject;

import org.openqa.selenium.By;

public class createAccountPage {

    public static By genderMale = By.id("id_gender1");
    public static By genderFemale = By.id("id_gender2");
    public static By firstNamebox = By.id("customer_firstname");
    public static By lastNamebox = By.id("customer_lastname");
    public static By emalbox = By.id("email");
    public static By pwdbox = By.id("passwd");
    public static By listDoB_day = By.id("uniform-days");
    public static By listDoB_month = By.id("uniform-months");
    public static By listDoB_year = By.id("uniform-years");

    public static By optDoB_day = By.xpath("//*[@id='days']/option[2]");
    public static By optDoB_month = By.xpath("//select[@id='months']/option[5]");
    public static By optDoB_year = By.xpath("//select[@id='years']/option[5]");

    public static By subcribeNewsletter =  By.id("newsletter");
    public static By receiveSpecialOffer = By.id("optin");

    public static By address_firstName =  By.id("firstname");
    public static By address_lastName = By.id("lastname");
    public static By address_company = By.id("company");
    public static By address_address = By.id("address1");
    public static By address_city = By.id("city");
    public static By address_state = By.id("city");
    public static By address_stateOtp = By.xpath("//*[@id=\'id_state\']/option[4]");
    public static By address_postcode = By.id("postcode");
    public static By address_country = By.id("id_country");
    public static By address_additionalInfo = By.id("other");
    public static By address_homephone = By.id("phone");
    public static By address_mobilephone = By.id("phone_mobile");
    public static By address_aliasAddress = By.id("alias");
    public static By btnSubmitAccount = By.id("submitAccount");






}

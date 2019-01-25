package PageObject;

import SeleniumUtils.SeleniumFunction;
import org.openqa.selenium.By;


public class createAccountForm {

    public static By genderMale = By.id("id_gender1");
    public static By genderFemale = By.id("id_gender2");
    public static By firstNamebox = By.id("customer_firstname");
    public static By lastNamebox = By.id("customer_lastname");
    public static By emalbox = By.id("email");
    public static int randomNum = (int) ((Math.random() * ((200 - 1) + 1)) + 1);
    public static String randomEmail = "minhphuoc" + randomNum +"@gmail.com";
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




    public static void fillSignUpForm(){
        //Put personal info
        //Title
        SeleniumFunction.click(genderMale);
        //FirstName
        SeleniumFunction.click(firstNamebox);
        SeleniumFunction.sendKey(firstNamebox, "Phuoc");
        //LastName
        SeleniumFunction.click(lastNamebox);
        SeleniumFunction.sendKey(lastNamebox, "Vo");
        //Email
        SeleniumFunction.click(emalbox);
        //SeleniumFunction.sendKey(emalbox, randomEmail);
        //Password
        SeleniumFunction.click(pwdbox);
        SeleniumFunction.sendKey(pwdbox, "123456");
        //DoB
        SeleniumFunction.click(listDoB_day);
        SeleniumFunction.click(optDoB_day);
        SeleniumFunction.click(listDoB_month);
        SeleniumFunction.click(optDoB_month);
        SeleniumFunction.click(listDoB_year);
        SeleniumFunction.click(optDoB_year);

        //YOUR ADDRESS
        //Firstname
        SeleniumFunction.sendKey(address_firstName,"Phuoc");
        //Lastname
        SeleniumFunction.sendKey(address_lastName,"Phuoc");
        //Company
        SeleniumFunction.sendKey(address_company,"Phuoc");
        //address
        SeleniumFunction.sendKey(address_address,"kckcx, dsahdsah, gdgffdjhn");
        //city
        SeleniumFunction.sendKey(address_city,"Phuoc");
        //state
        SeleniumFunction.click(address_state);
        SeleniumFunction.click(address_stateOtp);
        //zip code
        SeleniumFunction.sendKey(address_postcode,"70000");
        //country
        SeleniumFunction.click(address_country);
        //additional info
        SeleniumFunction.sendKey(address_additionalInfo,"Phuoc");
        //homephone
        SeleniumFunction.sendKey(address_homephone,"09082934558");
        //mobile phone
        SeleniumFunction.sendKey(address_mobilephone,"09082934558");
        //alias address
        SeleniumFunction.sendKey(address_aliasAddress,"Phuoc");
        //Submit
        SeleniumFunction.click(btnSubmitAccount);
        //Assert test case
        String actualResult = SeleniumFunction.getCurrentUrl();
        String expectedResult = "http://automationpractice.com/index.php?controller=my-account";
        SeleniumFunction.assertEquals(actualResult,expectedResult);
        System.out.println("current url: " + actualResult);
        System.out.println("Sign up successful");


    }





}

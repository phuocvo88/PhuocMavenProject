package testcases.Homepage;

import PageObject.Homepage;
import PageObject.loginPage;
import PageObject.createAccountPage;
import SeleniumUtils.SeleniumFunction;
import org.testng.annotations.Test;

public class TC_Home_Signup {
    @Test
    public static void signUp(){
        SeleniumFunction.click(Homepage.btnLogin);
        SeleniumFunction.sendKey(loginPage.emailCreate, "testingPhuoc1@gmail.com");
        SeleniumFunction.click(loginPage.submitCreate);

        //Put personal info
        SeleniumFunction.click(createAccountPage.genderMale);
        SeleniumFunction.click(createAccountPage.firstNamebox);
        SeleniumFunction.sendKey(createAccountPage.firstNamebox, "Phuoc");
        SeleniumFunction.click(createAccountPage.lastNamebox);
        SeleniumFunction.sendKey(createAccountPage.lastNamebox, "Vo");
       // SeleniumFunction.click(createAccountPage.emalbox);
       // SeleniumFunction.sendKey(createAccountPage.emalbox, "phuoctest1@gmail.com");
        SeleniumFunction.click(createAccountPage.pwdbox);
        SeleniumFunction.sendKey(createAccountPage.pwdbox, "123456");
        SeleniumFunction.click(createAccountPage.listDoB_day);
        SeleniumFunction.click(createAccountPage.optDoB_day);
        SeleniumFunction.click(createAccountPage.listDoB_month);
        SeleniumFunction.click(createAccountPage.optDoB_month);
        SeleniumFunction.click(createAccountPage.listDoB_year);
        SeleniumFunction.click(createAccountPage.optDoB_year);

        //your address
        SeleniumFunction.sendKey(createAccountPage.address_firstName,"Phuoc");
        SeleniumFunction.sendKey(createAccountPage.address_lastName,"Phuoc");
        SeleniumFunction.sendKey(createAccountPage.address_company,"Phuoc");
        SeleniumFunction.sendKey(createAccountPage.address_address,"kckcx, dsahdsah, gdgffdjhn");
        SeleniumFunction.sendKey(createAccountPage.address_city,"Phuoc");
        SeleniumFunction.click(createAccountPage.address_state);
        SeleniumFunction.click(createAccountPage.address_stateOtp);
        SeleniumFunction.sendKey(createAccountPage.address_postcode,"70000");
        SeleniumFunction.sendKey(createAccountPage.address_additionalInfo,"Phuoc");
        SeleniumFunction.sendKey(createAccountPage.address_homephone,"09082934558");
        SeleniumFunction.sendKey(createAccountPage.address_mobilephone,"09082934558");
        SeleniumFunction.sendKey(createAccountPage.address_aliasAddress,"Phuoc");
        SeleniumFunction.click(createAccountPage.btnSubmitAccount);

        //Assert test case
        String actualResult = SeleniumFunction.getCurrentUrl();
        String expectedResult = "http://automationpractice.com/index.php?controller=my-account";
        SeleniumFunction.assertEquals(actualResult,expectedResult);
        System.out.println("current url: " + actualResult);
        System.out.println("Sign up successful");




    }
}

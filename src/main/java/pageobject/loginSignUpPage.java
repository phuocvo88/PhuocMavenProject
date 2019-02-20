package pageobject;

import seleniumutils.SeleniumFunction;
import org.openqa.selenium.By;

public class loginSignUpPage {

    public static By txtboxEmail = By.id("email");
    public static By txtboxPwd = By.id("passwd");
    public static By btnSubmit = By.id("SubmitLogin");
    public static By errLogin = By.cssSelector("div.alert.alert-danger p");
    public static By emailCreate = By.id("email_create");
    public static By submitCreate = By.id("SubmitCreate");



    public static void goToSignUpform(){
        SeleniumFunction.click(Homepage.btnLogin);
        SeleniumFunction.click(emailCreate);
        SeleniumFunction.sendKey(emailCreate,createAccountForm.randomEmail);
        SeleniumFunction.click(submitCreate);
    }


    public static void login(String username, String password){
        SeleniumFunction.click(Homepage.btnLogin);
        SeleniumFunction.sendKey(loginSignUpPage.txtboxEmail,username);
        SeleniumFunction.sendKey(loginSignUpPage.txtboxPwd,password);
        SeleniumFunction.click(loginSignUpPage.btnSubmit);
    }

    public static void verifyLoginSuccess(){
        //using assert to verify
    }

    public static void verifyLoginFailedWithInvalidUsernamePassword(){
        //using assert to verify
    }

    public static void verifySignUpSuccess(){
        //login with created account
        //verify using assert
    }
}

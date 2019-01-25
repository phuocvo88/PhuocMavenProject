package PageObject;

import SeleniumUtils.SeleniumFunction;
import org.openqa.selenium.By;

public class loginPage {

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


    public static void SignInSuccess(){
        SeleniumFunction.click(Homepage.btnLogin);
        SeleniumFunction.sendKey(loginPage.txtboxEmail,"p.minh@aswhiteglobal.com");
        SeleniumFunction.sendKey(loginPage.txtboxPwd,"123456");
        SeleniumFunction.click(loginPage.btnSubmit);

        System.out.println("Log in successful");

    }


    public static void SignInFailed(){
        SeleniumFunction.click(Homepage.btnLogin);
        SeleniumFunction.sendKey(loginPage.txtboxEmail,"fgter654v@aswhiteglobal.com");
        SeleniumFunction.sendKey(loginPage.txtboxPwd,"ytrytrytr");
        SeleniumFunction.click(loginPage.btnSubmit);

        System.out.println("Log in Failed");

    }


}

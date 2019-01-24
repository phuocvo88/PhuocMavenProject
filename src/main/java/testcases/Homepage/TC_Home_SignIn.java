package testcases.Homepage;

import PageObject.Homepage;
import PageObject.loginPage;
import PageObject.createAccountPage;
import SeleniumUtils.SeleniumFunction;
import org.testng.annotations.Test;



public class TC_Home_SignIn {
    @Test
    public static void SignInSuccess(){
        SeleniumFunction.click(Homepage.btnLogin);
        SeleniumFunction.sendKey(loginPage.txtboxEmail,"p.minh@aswhiteglobal.com");
        SeleniumFunction.sendKey(loginPage.txtboxPwd,"123456");
        SeleniumFunction.click(loginPage.btnSubmit);

        System.out.println("Log in successful");

    }

    @Test
    public static void SignInFailed(){
        SeleniumFunction.click(Homepage.btnLogin);
        SeleniumFunction.sendKey(loginPage.txtboxEmail,"fgter654v@aswhiteglobal.com");
        SeleniumFunction.sendKey(loginPage.txtboxPwd,"ytrytrytr");
        SeleniumFunction.click(loginPage.btnSubmit);

        System.out.println("Log in Failed");

    }

}

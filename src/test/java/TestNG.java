import PageObject.Homepage;
import PageObject.loginPage;
import SeleniumUtils.SeleniumFunction;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import testcases.Homepage.TC_Home_SignIn;
import testcases.Homepage.TC_Home_Signup;

public class TestNG {

    @BeforeMethod
     public void beforeMethod() throws Exception {
        SeleniumFunction.openBrowser("firefox");
        SeleniumFunction.goToHomePage();
    }


    @Test
    public static void signInSuccess(){
        //copy from TC_Home_SignIn.SignInSuccess();
        SeleniumFunction.click(Homepage.btnLogin);
        SeleniumFunction.sendKey(loginPage.txtboxEmail,"p.minh@aswhiteglobal.com");
        SeleniumFunction.sendKey(loginPage.txtboxPwd,"123456");
        SeleniumFunction.click(loginPage.btnSubmit);
        System.out.println("Log in successful");
    }


    @Test
    public static void signInFailed(){
        //copy from TC_Home_SignIn.SignInFailed();
        SeleniumFunction.click(Homepage.btnLogin);
        SeleniumFunction.sendKey(loginPage.txtboxEmail,"fgter654v@aswhiteglobal.com");
        SeleniumFunction.sendKey(loginPage.txtboxPwd,"ytrytrytr");
        SeleniumFunction.click(loginPage.btnSubmit);
        System.out.println("Log in Failed");
    }


    @Test
    public static void signUpSuccess(){
        TC_Home_Signup.signUp();
    }


    @AfterMethod
     public void afterMethod(){
        SeleniumFunction.closeBrowser();
    }



}

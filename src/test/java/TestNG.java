import PageObject.loginPage;
import PageObject.createAccountForm;
import SeleniumUtils.SeleniumFunction;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG {

    @BeforeMethod
     public void beforeMethod() throws Exception {
        SeleniumFunction.openBrowser("firefox");
        SeleniumFunction.goToHomePage();
    }


    @Test
    public static void signInSuccess(){
        loginPage.SignInSuccess();
    }


    @Test
    public static void signInFailed(){
       loginPage.SignInFailed();
    }


    @Test
    public static void signUpSuccess(){
        loginPage.goToSignUpform();
        createAccountForm.fillSignUpForm();
    }


    @AfterMethod
     public void afterMethod(){
        SeleniumFunction.closeBrowser();
    }



}

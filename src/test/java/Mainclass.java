import PageObject.Homepage;
import PageObject.loginPage;
import SeleniumUtils.SeleniumFunction;
import testcases.Homepage.TC_Home_Signup;


public  class Mainclass {



    public static void main(String[] args) throws Exception {
        SeleniumFunction.openBrowser("firefox");
        //SeleniumFunction.openBrowser("chrome");

        SeleniumFunction.goToHomePage();
        TC_Home_Signup.signUp();
        SeleniumFunction.closeBrowser();
    }

}

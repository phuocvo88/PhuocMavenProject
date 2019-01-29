import seleniumutils.SeleniumFunction;


public  class Mainclass {



    public static void main(String[] args) throws Exception {
        SeleniumFunction.openBrowser("firefox");
        //SeleniumFunction.openBrowser("chrome");

        SeleniumFunction.goToHomePage();

    }

}

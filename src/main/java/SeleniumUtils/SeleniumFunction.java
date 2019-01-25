package SeleniumUtils;
import ProjectItems.projectItems;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;


import java.lang.Exception;

import java.util.concurrent.TimeUnit;

public class SeleniumFunction {

    public static WebDriver driver;
    public static boolean result;

    public static void openBrowser(String browser) throws Exception{
       /* System.setProperty("webdriver.gecko.driver", "D:\\Automation learning\\GeckoDriver\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get(projectItems.baseUrl);
        driver.manage().window().maximize();*/
        //Check if parameter passed from TestNG is 'firefox'
        if(browser.equalsIgnoreCase("firefox")){
            //create firefox instance
            System.setProperty("webdriver.gecko.driver", "D:\\Automation learning\\GeckoDriver\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        //Check if parameter passed as 'chrome'
        else if(browser.equalsIgnoreCase("chrome")){
            //set path to chromedriver.exe
            System.setProperty("webdriver.chrome.driver","D:\\Automation learning\\ChromeDriver\\chromedriver.exe");
            //create chrome instance
            driver = new ChromeDriver();
        }
        //Check if parameter passed as 'Edge'
        else if(browser.equalsIgnoreCase("Edge")){
            //set path to Edge.exe
            System.setProperty("webdriver.edge.driver","D:\\Automation learning\\EdgeDriver\\MicrosoftWebDriver.exe");
            //create Edge instance
            driver = new EdgeDriver();
        }
        else{
            //If no browser passed throw exception
            throw new Exception("Browser is not correct");

        }
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    public static void closeBrowser(){
        driver.close();
    }

    public static void click(By element){
        driver.findElement(element).click();
    }

    public static void sendKey(By element, String input){
        driver.findElement(element).sendKeys(input);
    }

    public static void goToHomePage(){
        driver.get("http://automationpractice.com/index.php");
    }

    public static String getCurrentUrl(){
        String s = driver.getCurrentUrl();
        return s;
    }

    public static void assertEquals(String s, String y){

        Assert.assertEquals(s,y);

    }


}

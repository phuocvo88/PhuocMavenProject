package PageObject;

import org.openqa.selenium.By;

public class loginPage {

    public static By txtboxEmail = By.id("email");
    public static By txtboxPwd = By.id("passwd");
    public static By btnSubmit = By.id("SubmitLogin");
    public static By errLogin = By.cssSelector("div.alert.alert-danger p");
    public static By emailCreate = By.id("email_create");
    public static By submitCreate = By.id("SubmitCreate");



}

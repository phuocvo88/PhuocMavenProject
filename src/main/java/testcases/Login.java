/**
 * Copyright (c) 2019 Absolute Software Corporation. All rights reserved. Reproduction or
 * transmission in whole or in part, in any form or by any means, electronic, mechanical or
 * otherwise, is prohibited without the prior written consent of the copyright owner.
 */
package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObject.loginSignUpPage;
import SeleniumUtils.SeleniumFunction;

public class Login {
    String validUsername = "p.minh@aswhiteglobal.com";
    String validPassword = "123456";
    String invalidUsername = "p.fdsafds@fadf.de";
    String invalidPassword = "123456";
    @BeforeMethod
    public void beforeMethod() throws Exception {
        SeleniumFunction.openBrowser("firefox");
        SeleniumFunction.goToHomePage();
    }


    @Test
    public  void signInSuccess(){
        loginSignUpPage.login(validUsername, validPassword);
        loginSignUpPage.verifyLoginSuccess();
    }


    @Test
    public  void signInFailed(){
        loginSignUpPage.login(invalidUsername, invalidPassword);
        loginSignUpPage.verifyLoginFailedWithInvalidUsernamePassword();
    }

    @AfterMethod
    public void afterMethod(){
        SeleniumFunction.closeBrowser();
    }
}

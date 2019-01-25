/**
 * Copyright (c) 2019 Absolute Software Corporation. All rights reserved. Reproduction or
 * transmission in whole or in part, in any form or by any means, electronic, mechanical or
 * otherwise, is prohibited without the prior written consent of the copyright owner.
 */
package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import PageObject.createAccountForm;
import PageObject.loginSignUpPage;
import SeleniumUtils.SeleniumFunction;

public class SignUp {
    @BeforeMethod
    public void beforeMethod() throws Exception {
        SeleniumFunction.openBrowser("firefox");
        SeleniumFunction.goToHomePage();
    }


    @Test
    public static void signUpSuccess(){
        loginSignUpPage.goToSignUpform();
        createAccountForm.fillSignUpForm();
        loginSignUpPage.verifySignUpSuccess();
    }


    @AfterMethod
    public void afterMethod() {
        SeleniumFunction.closeBrowser();
    }
}

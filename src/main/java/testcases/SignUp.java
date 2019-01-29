/**
 * Copyright (c) 2019 Absolute Software Corporation. All rights reserved. Reproduction or
 * transmission in whole or in part, in any form or by any means, electronic, mechanical or
 * otherwise, is prohibited without the prior written consent of the copyright owner.
 */
package testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import dataobject.User;
import pageobject.createAccountForm;
import pageobject.loginSignUpPage;
import seleniumutils.SeleniumFunction;

public class SignUp {
    static User usertest;

    @BeforeMethod
    public void beforeMethod() throws Exception {
        SeleniumFunction.openBrowser("firefox");
        SeleniumFunction.goToHomePage();
    }

    private static void prepareData(){
        usertest = new User();
        usertest.setTitle("Mr.");
        usertest.setFirtname("Phuoc");
        usertest.setLastname("Vo");
        usertest.setPassword("123456AA");
        //set more data for full info
    }
    @Test
    public static void signUpSuccess(){
        loginSignUpPage.goToSignUpform();

        createAccountForm.fillSignUpForm(usertest);
        loginSignUpPage.verifySignUpSuccess();
    }


    @AfterMethod
    public void afterMethod() {
        SeleniumFunction.closeBrowser();
    }
}

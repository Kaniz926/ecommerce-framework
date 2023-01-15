package com.flipkart.testcases;

import com.flipkart.base.BaseTest;
import com.flipkart.pages.HomePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.IOException;

public class HomePageTest extends BaseTest {
    public HomePage homePage;
    public SoftAssert assertion;

    @BeforeMethod
    public void startBrowser() throws IOException {
        setUp();
        homePage = new HomePage(driver);
        assertion = new SoftAssert();
    }

    @Test
    public void verifyTheFormWithRequiredFields() {
        homePage.fillTheRequiredForm();
        homePage.verifyRequiredFormValues(assertion);
    }

    @Test
    public void verifyTheFormWithAllFields() {
        homePage.formWithAllFields();
        homePage.verifyAllFieldsFormValues(assertion);
    }

    @Test
    public void verifyTheFormWithEmptyFields() {
        homePage.formWithEmptyData();
    }

    @AfterMethod
    public void closeBrowser() {
        tearDown();
    }
}

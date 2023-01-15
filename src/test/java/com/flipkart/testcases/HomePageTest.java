package com.flipkart.testcases;

import com.flipkart.base.BaseTest;
import com.flipkart.pages.HomePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class HomePageTest extends BaseTest {
    public HomePage homePage;

    @BeforeMethod
    public void startBrowser() throws IOException {
        setUp();
        homePage = new HomePage(driver);
    }

    @Test
    public void verifyTheFormWithRequiredFields() throws InterruptedException {
        homePage.fillTheRequiredForm();
    }

    @Test
    public void verifyTheFormWithAllFields() {
        homePage.formWithAllFields();
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

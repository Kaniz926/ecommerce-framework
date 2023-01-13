package com.flipkart.testcases;

import com.flipkart.base.BaseTest;
import com.flipkart.pages.HomePage;
import org.testng.annotations.*;

import java.io.IOException;

public class HomePageTest extends BaseTest {
    @BeforeMethod
    public void startBrowser() throws IOException {
        setUp();
    }
@Test
    public void verifyTheFormWithRequiredFields() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        homePage.fillTheRequiredForm();

    }
    @Test
    public void verifyTheFormWithAllFields(){
        HomePage homePage = new HomePage(driver);
        homePage.formWithAllFields();

    }
    @Test
    public void verifyTheFormWithEmptyFields(){
        HomePage homepage = new HomePage(driver);
        homepage.formWithEmptyData();

    }
@AfterMethod
public void closeBrowser() {
tearDown();
   }
}

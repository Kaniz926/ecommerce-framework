package com.flipkart.pages;

import com.flipkart.constants.AssertionConstants;
import com.flipkart.constants.PageConstants;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import java.time.Duration;

public class HomePage {

    public WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    By firstName = By.id("inputName");
    By lastName = By.id("inputlastName");
    By emailId = By.id("inputEmail");
    By mobileNumber = By.id("inputNumber");
    By currentAddress = By.id("inputCAddress");
    By permanentAddress = By.id("inputPAddress");
    By city = By.id("inputCity");
    By dateOfBirth = By.id("inputDate");
    By declareCheckBox = By.id("gridCheck");
    By stateDropdown = By.id("inputState");
    By zipCode = By.id("inputZip");
    By birthTiming = By.xpath("//input[@type='time']");
   // By favColor = By.id("exampleColorInput");
    By description = By.id("inputAbout");
    By femaleRadioButton = By.id("gridRadios2");
    By selectCityDropdown = By.xpath("//label[text()='Select Your City']/..//select");
    By selectSkills = By.xpath("//label[text()='Skills']/..//select");
    By hobbies = By.xpath("//legend[text()='Hobbies']/..//div//div//input[@id='gridCheck1']");
    By submitButton = By.xpath("//button[@type='submit']");
    By formName = By.id("showName");
    By formLastName = By.id("showlastName");
    By formEmail = By.id("showEmail");
    By formCurrentAddress = By.id("showCurrantAddress");
    By formPermanentAddress = By.id("showParmanentAddress");
    By formZipCode = By.id("showZip");
    By formPhoneNo = By.id("showPhoneNo");
    By formShowCity = By.id("showCity");
    By formDOB = By.id("showDateOBirth");
    By formAbout = By.id("showAbout");

    public WebElement getFirstName() {
        return driver.findElement(firstName);
    }

    public WebElement getLastName() {
        return driver.findElement(lastName);
    }

    public WebElement getEmailId() {
        return driver.findElement(emailId);
    }

    public WebElement getMobileNumber() {
        return driver.findElement(mobileNumber);
    }

    public WebElement getCurrentAddress() {
        return driver.findElement(currentAddress);
    }

    public WebElement getPermanentAddress() {
        return driver.findElement(permanentAddress);
    }

    public WebElement getCity() {
        return driver.findElement(city);
    }

    public WebElement getDateOfBirth() {
        return driver.findElement(dateOfBirth);
    }

    public WebElement getDeclareCheckBox() {
        return driver.findElement(declareCheckBox);
    }

    public WebElement getHobbies() {
        return driver.findElement(hobbies);
    }

    public WebElement getStateDropDown() {
        return driver.findElement(stateDropdown);
    }

    public WebElement getZipCode() {
        return driver.findElement(zipCode);
    }

    public WebElement getBirthTiming() {
        return driver.findElement(birthTiming);
    }

//    public WebElement getFavColor() {
//        return driver.findElement(favColor);
//    }

    public WebElement getDescription() {
        return driver.findElement(description);
    }

    public WebElement getFemaleRadioButton() {
        return driver.findElement(femaleRadioButton);
    }

    public WebElement getSelectCityDropdown() {
        return driver.findElement(selectCityDropdown);
    }

    public WebElement getSelectSkillsDropdown() {
        return driver.findElement(selectSkills);
    }

    public WebElement getSubmitButton() {
        return driver.findElement(submitButton);
    }

    public WebElement getFormName() {
        return driver.findElement(formName);
    }

    public WebElement getFormLastName() {
        return driver.findElement(formLastName);
    }

    public WebElement getFormEmail() {
        return driver.findElement(formEmail);
    }

    public WebElement getFormCurrentAddress() {
        return driver.findElement(formCurrentAddress);
    }

    public WebElement getFormPermanentAddress() {
        return driver.findElement(formPermanentAddress);
    }

    public WebElement getFormPhoneNo() {
        return driver.findElement(formPhoneNo);
    }

    public WebElement getFormZipCode() {
        return driver.findElement(formZipCode);
    }

    public WebElement getFomCity() {
        return driver.findElement(formShowCity);
    }

    public WebElement getFormDOB() {
        return driver.findElement(formDOB);
    }

    public WebElement getFormAbout() {
        return driver.findElement(formAbout);
    }

    public void fillTheRequiredForm() {
        getFirstName().sendKeys(PageConstants.FIRST_NAME);
        getEmailId().sendKeys(PageConstants.EMAIL);
        getCurrentAddress().sendKeys(PageConstants.CURRENT_ADDRESS);
        getCity().sendKeys(PageConstants.CITY);
        getMobileNumber().sendKeys(PageConstants.PHONE_NUMBER);
        getDateOfBirth().sendKeys(PageConstants.DOB);
        clickWithJsExecutor(getDeclareCheckBox());
        clickWithJsExecutor(getSubmitButton());
    }

    public void formWithAllFields() {
        getFirstName().sendKeys(PageConstants.FIRST_NAME);
        getLastName().sendKeys(PageConstants.LAST_NAME);
        getEmailId().sendKeys(PageConstants.EMAIL);
        getCurrentAddress().sendKeys(PageConstants.CURRENT_ADDRESS);
        getPermanentAddress().sendKeys(PageConstants.PERMANENT_ADDRESS);
        getCity().sendKeys(PageConstants.CITY);
        getMobileNumber().sendKeys(PageConstants.PHONE_NUMBER);
        getDateOfBirth().sendKeys(PageConstants.DOB);
        getZipCode().sendKeys(PageConstants.ZIP_CODE);
        getBirthTiming().sendKeys(PageConstants.BIRTH_TIMING);
        getDescription().sendKeys(PageConstants.ABOUT);
        clickWithJsExecutor(getFemaleRadioButton());
        clickWithJsExecutor(getHobbies());
        selectFromDropDown(getStateDropDown(), PageConstants.STATE);
        selectFromDropDown(getSelectCityDropdown(), PageConstants.CITY);
        selectFromDropDown(getSelectSkillsDropdown(), PageConstants.SKILLS);
        clickWithJsExecutor(getDeclareCheckBox());
        clickWithJsExecutor(getSubmitButton());
    }

    public void formWithCombination(){ 
        getFirstName().sendKeys(PageConstants.FIRST_NAME);
        getEmailId().sendKeys(PageConstants.EMAIL);
        getCurrentAddress().sendKeys(PageConstants.CURRENT_ADDRESS);
        getCity().sendKeys(PageConstants.CITY);
        getMobileNumber().sendKeys(PageConstants.PHONE_NUMBER);
        getDateOfBirth().sendKeys(PageConstants.DOB);
        clickWithJsExecutor(getDeclareCheckBox());
        clickWithJsExecutor(getSubmitButton());
    }

    public void formWithEmptyData() {
        clickWithJsExecutor(getSubmitButton());
        acceptAlert();
    }

    public void clickWithJsExecutor(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);
    }

//    public void scrollToElement(WebElement element) {
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].scrollIntoView();", element);
//    }

    public void selectFromDropDown(WebElement element, String visibleText) {
        Select select = new Select(element);
        select.selectByVisibleText(visibleText);
    }

    public void acceptAlert() {
        Alert alert = driver.switchTo().alert();
        String alertMessage = driver.switchTo().alert().getText();
        System.out.println(alertMessage);
        alert.accept();
    }

    public void verifyRequiredFormValues(SoftAssert assertion) {
        assertion.assertTrue(getFormName().getText().contains(PageConstants.FIRST_NAME), AssertionConstants.FIRST_NAME_Message);
        assertion.assertTrue(getFormEmail().getText().contains(PageConstants.EMAIL), AssertionConstants.EMAIL_Message);
        assertion.assertTrue(getFormCurrentAddress().getText().contains(PageConstants.CURRENT_ADDRESS), AssertionConstants.CURRENT_ADDRESS_Message);
        assertion.assertTrue(getFormPhoneNo().getText().contains(PageConstants.PHONE_NUMBER), AssertionConstants.PHONE_NO_Message);
        assertion.assertTrue(getFomCity().getText().contains(PageConstants.CITY), AssertionConstants.CITY_Message);
        assertion.assertTrue(getFormDOB().getText().contains(PageConstants.FORM_DOB), AssertionConstants.DOB_Message);
        assertion.assertAll();
    }

    public void verifyAllFieldsFormValues(SoftAssert assertion) {
        assertion.assertTrue(getFormName().getText().contains(PageConstants.FIRST_NAME), AssertionConstants.FIRST_NAME_Message);
        assertion.assertTrue(getFormLastName().getText().contains(PageConstants.LAST_NAME), AssertionConstants.LAST_NAME_Message);
        assertion.assertTrue(getFormEmail().getText().contains(PageConstants.EMAIL), AssertionConstants.EMAIL_Message);
        assertion.assertTrue(getFormCurrentAddress().getText().contains(PageConstants.CURRENT_ADDRESS), AssertionConstants.CURRENT_ADDRESS_Message);
        assertion.assertTrue(getFormPermanentAddress().getText().contains(PageConstants.PERMANENT_ADDRESS), AssertionConstants.PERMANENT_ADDRESS_Message);
        assertion.assertTrue(getFormPhoneNo().getText().contains(PageConstants.PHONE_NUMBER), AssertionConstants.PHONE_NO_Message);
        assertion.assertTrue(getFomCity().getText().contains(PageConstants.CITY), AssertionConstants.CITY_Message);
        assertion.assertTrue(getFormDOB().getText().contains(PageConstants.FORM_DOB), AssertionConstants.DOB_Message);
        assertion.assertTrue(getFormZipCode().getText().contains(PageConstants.ZIP_CODE), AssertionConstants.ZIP_CODE_Message);
        assertion.assertTrue(getFormAbout().getText().contains(PageConstants.ABOUT), AssertionConstants.ABOUT_Message);
        assertion.assertAll();
    }

    public void verifyAlertDisplayed(SoftAssert assertion) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        if (wait.until(ExpectedConditions.alertIsPresent()) == null) {
            assertion.assertTrue(false, "Alert is not displayed");
        } else {
            assertion.assertTrue(true, "Alert is  displayed");
        }
        assertion.assertAll();
    }

//    public void waitForElement(WebElement element) {
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
//        wait.until(ExpectedConditions.visibilityOf(element));
//    }
}

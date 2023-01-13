package com.flipkart.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;

import javax.swing.*;

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
    By permannetAddress = By.id("inputPAddress");
    By city = By.id("inputCity");
    By dateOfBirth = By.id("inputDate");
    By declareCheckBox = By.id("gridCheck");
    By stateDropdown = By.id("inputState");
    By submitButton = By.xpath("//button[@type='submit']");

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
        return driver.findElement(permannetAddress);
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

    public WebElement getStateDropDown() {
        return driver.findElement(stateDropdown);
    }

    public WebElement getSubmitButton() {
        return driver.findElement(submitButton);
    }


    public void fillTheRequiredForm() throws InterruptedException {
        getFirstName().sendKeys("Kaniz");
        getEmailId().sendKeys("kanizthoughts@gmail.com");
        getCurrentAddress().sendKeys("Noida Sector 19 A block");
        getCity().sendKeys("Noida");
        getMobileNumber().sendKeys("7846828014");
        getDateOfBirth().sendKeys("26/12/1996");
        clickWithJsExecutor(getDeclareCheckBox());
        clickWithJsExecutor(getSubmitButton());
    }

    public void formWithAllFields() {
        getFirstName().sendKeys("Kaniz");
        getLastName().sendKeys("Phatma");
        getEmailId().sendKeys("kanizthoughts@gmail.com");
        getCurrentAddress().sendKeys("Noida Sector 19 A block");
        getPermanentAddress().sendKeys("Jagatsinghpur Odisha");
        getCity().sendKeys("Noida");
        getMobileNumber().sendKeys("7846828014");
        getDateOfBirth().sendKeys("26/12/1996");
        selectFromDropDown(getStateDropDown(),"Odisha");
        clickWithJsExecutor(getDeclareCheckBox());
        clickWithJsExecutor(getSubmitButton());

    }
    public void formWithEmptyData(){
        clickWithJsExecutor(getSubmitButton());
        acceptAlert();
    }

    public void clickWithJsExecutor(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].click();", element);

    }

    public void selectFromDropDown(WebElement element, String visibleText) {
        Select select = new Select(element);
        select.selectByVisibleText(visibleText);

    }
    public void acceptAlert()
    {
        Alert alert = driver.switchTo().alert();
        String alertMessage = driver.switchTo().alert().getText();
        System.out.println(alertMessage);
        alert.accept();
    }


}
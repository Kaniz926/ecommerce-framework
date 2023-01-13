package com.flipkart.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class BaseTest {
    public WebDriver driver;
    Properties properties;
    FileInputStream fileInputStream;
    public void setUp() throws IOException {
        fileInputStream = new FileInputStream(System.getProperty("user.dir") + "\\src\\test\\java\\com\\flipkart\\resources\\config.properties");
        //FileInputStream is used to read data
        properties = new Properties();
        properties.load(fileInputStream);
        String url = properties.getProperty("url");
        System.out.println(url);
        String browser = properties.getProperty("browser");
        if(browser.equals("chrome")){
             driver = new ChromeDriver();
        } else if (browser.equals("firefox")){
             driver = new FirefoxDriver();
        } else if (browser.equals("edge")) {
             driver = new EdgeDriver();
        }else {
             driver= new SafariDriver();
        }
        driver.manage().window().maximize();
        driver.get(url);
       String implicitWait= properties.getProperty("implicit.wait");
       System.out.println(implicitWait);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(implicitWait)));
    }
    public void tearDown(){
        driver.quit();
    }

}

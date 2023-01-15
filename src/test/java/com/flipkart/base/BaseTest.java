package com.flipkart.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
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
        switch (browser) {
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "IE":
                driver = new InternetExplorerDriver();
                break;
            default:
                System.out.println("browser : " + browser + " is invalid, Launching Chrome as browser of choice..");
                driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        driver.get(url);
        String implicitWait = properties.getProperty("implicit.wait");
        System.out.println(implicitWait);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Integer.parseInt(implicitWait)));
    }

    public void tearDown() {
        driver.quit();
    }

}

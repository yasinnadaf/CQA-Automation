package com.bridgelabz.selenium.base;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class BaseClass {
    public static WebDriver driver;
    @BeforeTest
    public void initializationTest(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--disable-notifications"); // to disable the popup notification
        driver.manage().window().maximize();
        driver.get("https://www.facebook.com/");
//        driver.get("https://www.guru99.com/selenium-tutorial.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
    }

    @AfterTest
    public void browserClose(){
        driver.close();
    }
}

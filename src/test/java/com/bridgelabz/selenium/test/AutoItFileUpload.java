package com.bridgelabz.selenium.test;

import com.bridgelabz.selenium.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class AutoItFileUpload extends BaseClass {

    @BeforeTest
    public void setUp() throws InterruptedException {
        initializationTest();
        driver.get("https://www.freepdfconvert.com/");
        Thread.sleep(2000);
    }

    @Test
    public void fileUpload() throws InterruptedException, IOException {
        WebElement chooseBtn = driver.findElement(By.xpath("//*[@id=\"top\"]/body/main/div[1]/div/div/div[2]/section/label/div/div[1]/a/span"));
        chooseBtn.click();
        Thread.sleep(2000);

        Runtime.getRuntime().exec("C:\\Users\\Yasin Nadaf\\Documents\\CqaFileUpload.exe");
        Thread.sleep(2000);
        System.out.println("File uploaded success");
    }


    @AfterTest
    public void tearDown(){
        browserClose();
    }

}

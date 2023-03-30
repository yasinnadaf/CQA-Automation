package com.bridgelabz.selenium.test;

import com.bridgelabz.selenium.base.BaseClass;
import com.google.gson.internal.bind.util.ISO8601Utils;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class FindFramesJSExecutor extends BaseClass {

    @Test
    public void findFramesUsingJsExecutor() throws InterruptedException {
        Thread.sleep(1000);

        JavascriptExecutor js = (JavascriptExecutor) driver;
        Integer noOfFrames = Integer.parseInt(js.executeScript("return.window.length").toString());
        System.out.println("Number of frames: "+noOfFrames);
    }
}

package com.automation;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Calculator {


    @Test
    public void scroll() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion", "7.0");
        desiredCapabilities.setCapability("deviceName", "Pixel_2");
        //app telefonda yuklu appinfo.apk yada cmd ile yerini bulup sonra test ediyoruz
        desiredCapabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
        desiredCapabilities.setCapability("appPackage", "com.android.calculator2");
// we create remote emulator
        AndroidDriver<AndroidElement> driver =new AndroidDriver<AndroidElement>(new URL("http:localhost:4723/wd/hub"), desiredCapabilities);
        Thread.sleep(5000);


        WebElement digit9 = driver.findElementById("com.android.calculator2:id/digit_9");
        WebElement digit5 = driver.findElementById("com.android.calculator2:id/digit_5");
        WebElement digit2 = driver.findElementById("com.android.calculator2:id/digit_2");
        WebElement digit8 = driver.findElementById("com.android.calculator2:id/digit_8");
        WebElement plus = driver.findElementByAccessibilityId("plus");
        WebElement equals = driver.findElementByAccessibilityId("equals");
        Thread.sleep(2000);
        WebElement result = driver.findElementById("com.android.calculator2:id/result");


        digit9.click();
        digit5.click();
        plus.click();
        digit2.click();
        digit8.click();
        equals.click();
        Thread.sleep(2000);

        String expected = "123";
        Assert.assertEquals(expected,result.getText());




/*
For getting appPackage and appActivity
1.      Adb devices
2.      Adb shell
3.      Now run this command: dumpsys window windows | grep -E 'mCurrentFocus'
 */
    }
}

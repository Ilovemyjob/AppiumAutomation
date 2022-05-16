package com.automation;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.ElementOption;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class Contextual {

    @Test
    public void longPress() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion", "7.0");
        desiredCapabilities.setCapability("deviceName", "Pixel_2");
//yuklu degil ilk once install ediyor sonra test
        desiredCapabilities.setCapability("automationName", "UiAutomator2");
        desiredCapabilities.setCapability("app", "C:\\Users\\Administrator\\IdeaProjects\\AppiumAutomation\\apidemos.apk");

        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http:localhost:4723/wd/hub"), desiredCapabilities);
        Thread.sleep(5000);

        WebElement View = driver.findElementByAccessibilityId("Views");
       View.click();
       Thread.sleep(4000);

        WebElement Expandable = driver.findElementByAccessibilityId("Expandable Lists");
        Expandable.click();
        Thread.sleep(4000);

        WebElement Custom = driver.findElementByAccessibilityId("1. Custom Adapter");
        Custom.click();
        Thread.sleep(4000);

        WebElement peopleNames = driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
        //action class in Appium
       TouchAction touchAction = new TouchAction(driver);
        touchAction.longPress(LongPressOptions.longPressOptions().withElement(ElementOption.element(peopleNames)).withDuration(Duration.ofSeconds(3))).perform();


        WebElement sampleAction = driver.findElement(By.xpath("//android.widget.TextView[@text='Sample action']"));
        sampleAction.click();
        Thread.sleep(3000);
    }
    @Test
    public void scroll() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion", "7.0");
        desiredCapabilities.setCapability("deviceName", "Pixel_2");
        desiredCapabilities.setCapability("automationName", "UiAutomator2");
        desiredCapabilities.setCapability("app", "C:\\Users\\Administrator\\IdeaProjects\\AppiumAutomation\\apidemos.apk");
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http:localhost:4723/wd/hub"), desiredCapabilities);
        Thread.sleep(5000);
        WebElement views = driver.findElementByAccessibilityId("Views");
        views.click();

        //to scroll down till "Tabs" use this
        driver.findElementsByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Tabs\"));");
    }
}
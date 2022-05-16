package com.automation;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class ApiDemo {

    @Test
    public void apidemo() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName","Android");
        desiredCapabilities.setCapability("platformVersion","7.0");
        desiredCapabilities.setCapability("deviceName","Pixel_2");
        desiredCapabilities.setCapability("automationName","UiAutomator2");

        // we make Dynamic
        //desiredCapabilities.setCapability("app","C:\\Users\\Administrator\\IdeaProjects\\AppiumAutomation\\apidemos.apk");
        desiredCapabilities.setCapability("app",System.getProperty("user.dir")+"/apidemos.apk");

        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http:localhost:4723/wd/hub"),desiredCapabilities);
        Thread.sleep(5000);
       //we find sortly path
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("user.home"));


        WebElement preference = driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Preference\"]");
        preference.click();

        Thread.sleep(3000);
        WebElement preferenceDependencies = driver.findElementByXPath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]");
        preferenceDependencies.click();

        Thread.sleep(2000);

        WebElement checkbox = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.RelativeLayout");
        checkbox.click();

        Thread.sleep(2000);

        WebElement wifiSetting = driver.findElement(By.xpath("(//*[@class='android.widget.RelativeLayout'])[2]"));
        wifiSetting.click();
        Thread.sleep(4000);

        WebElement inputBox = driver.findElementById("android:id/edit");
        inputBox.sendKeys("appiumTest");

        WebElement okButton = driver.findElementById("android:id/button1");

        Assert.assertEquals("appiumTest",inputBox.getText());
        okButton.click();

        driver.closeApp();


}
}

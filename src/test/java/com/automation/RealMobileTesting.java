package com.automation;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class RealMobileTesting {

    @Test
    public void real() throws InterruptedException, MalformedURLException {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability("platformName", "Android");
        caps.setCapability("platformVersion","11");
        caps.setCapability("deviceName","Redmi Note 8 Pro");
        caps.setCapability("udid","buamlnjf49rgeuyl");
        caps.setCapability("appPackage", "com.miui.calculator");
        caps.setCapability("appActivity", "com.miui.calculator.cal.CalculatorActivity");



        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),caps);

        WebElement digit1 = driver.findElementById("com.sec.android.app.popupcalculator:id/bt_01");
//        WebElement digit2 = driver.findElement(By.xpath("com.sec.android.app.popupcalculator:id/bt_02"));
//        WebElement digit3 = driver.findElement(By.xpath("com.sec.android.app.popupcalculator:id/bt_03"));
//        WebElement digit8 = driver.findElement(By.xpath("com.sec.android.app.popupcalculator:id/bt_08"));
//        WebElement digit9 = driver.findElement(By.xpath("com.sec.android.app.popupcalculator:id/bt_09"));
//        WebElement multiple = driver.findElement(By.xpath("//*[@index='7']"));
//        WebElement equals = driver.findElement(By.xpath("//*[@index='19']"));
//        WebElement result = driver.findElement(By.xpath("//*[@index='0']"));

        digit1.click();
//        digit2.click();
//        digit3.click();
//        multiple.click();
//        digit8.click();
//        digit9.click();
//        equals.click();

        Thread.sleep(3000);

//        System.out.println(result.getText());
//    }
    }
}

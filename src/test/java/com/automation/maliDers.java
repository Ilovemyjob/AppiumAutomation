package com.automation;


import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class maliDers {

    @Test
    public void test() throws MalformedURLException, InterruptedException {

            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_NAME ,"Android");
            desiredCapabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"7.0");
            desiredCapabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"AndroidEmulator");
            desiredCapabilities.setCapability(MobileCapabilityType.APP,"C:\\Users\\Administrator\\Desktop\\Gesture Tool_v1.3_apkpure.com.apk");

            URL url = new URL("http://127.0.0.1:4723/wd/hub"); //http://localhost:4723/wd/hub

            AndroidDriver<WebElement> driver = new AndroidDriver<>(url,desiredCapabilities);//

        //driver.findElementById("com.davemac327.gesture.tool:id/reloadButton").click();

      //  driver.findElementById("com.davemac327.gesture.tool:id/addButton").click();

        Thread.sleep(1000);

       // driver.findElementById("com.davemac327.gesture.tool:id/gesture_name").click();
        Thread.sleep(1000);


        //driver.findElementById("com.davemac327.gesture.tool:id/gesture_name").sendKeys("emrah");

            Thread.sleep(1000);

            
       // for (:) {

       // }


        }

}

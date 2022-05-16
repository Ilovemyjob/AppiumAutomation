package com.automation;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.springframework.objenesis.instantiator.android.Android10Instantiator;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserStackTestGalaxy {

    public static final String AUTOMATE_USERNAME = "emrealp1";
    public static final String AUTOMATE_ACCESS_KEY = "zhsfQuUYdroL8F2SwkTs";
    public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
    @Test
    public void galaxyS10e() throws MalformedURLException, InterruptedException {

        DesiredCapabilities caps = new DesiredCapabilities();

//        caps.setCapability("browserName", "android");
//        caps.setCapability("device", "Samsung Galaxy S10e");
//        caps.setCapability("realMobile", "true");
//        caps.setCapability("os_version", "9.0");
//        caps.setCapability("build", "emrealp1's First Test");// we can see name
//        caps.setCapability("project", "apidemo");
      //  caps.setCapability("app", "bs://4ece3c4230436fabe8c955b205a41386a0252ae0");


       // ustteki calismadi alttakini browserstacten aldim
        caps.setCapability("os_version", "9.0");
        caps.setCapability("device", "Samsung Galaxy S10e");
        caps.setCapability("real_mobile", "true");
        caps.setCapability("project", "apidemo");
        caps.setCapability("build", "emrealp1's second Test");
        caps.setCapability("name", "emrah");
        caps.setCapability("browserstack.local", "false");
        caps.setCapability("browserstack.debug", "true");
        caps.setCapability("app", "bs://4ece3c4230436fabe8c955b205a41386a0252ae0");

        // Add these capabilities to your test script
       AndroidDriver<AndroidElement> driver =new AndroidDriver<AndroidElement>(new URL(URL),caps);
     //   final WebDriver driver = new RemoteWebDriver(new URL(URL), caps);


        Thread.sleep(2000);



        //curl -u "emrealp1:zhsfQuUYdroL8F2SwkTs" -X POST "https://api-cloud.browserstack.com/app-automate/upload"  -F "file=@C:\\Users\\Administrator\\IdeaProjects\\AppiumAutomation\\apidemos.apk"

        WebElement preference = driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Preference\"]");
        preference.click();
        Thread.sleep(2000);

        WebElement preferenceDependencies = driver.findElementByXPath("//android.widget.TextView[@content-desc=\"3. Preference dependencies\"]");
        preferenceDependencies.click();
        Thread.sleep(2000);

        WebElement checkbox = driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[1]/android.widget.RelativeLayout");
        checkbox.click();
        Thread.sleep(2000);
//BUNU CALSTAN KENDI YAZDI
        WebElement wifiSetting = driver.findElement(By.xpath("(//*[@class='android.widget.RelativeLayout'])[2]"));
        wifiSetting.click();
        Thread.sleep(2000);

        WebElement inputBox = driver.findElementById("android:id/edit");
        inputBox.sendKeys("appiumTest");

        WebElement okButton = driver.findElementById("android:id/button1");

        Assert.assertEquals("appiumTest",inputBox.getText());
        okButton.click();

        driver.closeApp();
//Adb devices
//2.      Adb shell
//3.      Now run this command: dumpsys window windows | grep -E ‘mCurrentFocus
//
   }
}

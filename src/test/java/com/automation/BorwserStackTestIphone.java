package com.automation;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class BorwserStackTestIphone {
    public static final String AUTOMATE_USERNAME = "emrealp1";
    public static final String AUTOMATE_ACCESS_KEY = "zhsfQuUYdroL8F2SwkTs";
    public static final String URL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
    @Test
    public void iphone11Pro() throws MalformedURLException, InterruptedException {

//        DesiredCapabilities caps = new DesiredCapabilities();
//
//        caps.setCapability("browserName", "iPhone");
//        caps.setCapability("device", "iPhone 11 Pro");
//        caps.setCapability("realMobile", "true");
//        caps.setCapability("os_version", "13");
//        caps.setCapability("build", "First Iphone Test");
//        caps.setCapability("name", "emrealp1's First Test");
//        caps.setCapability("app", "bs://4ece3c4230436fabe8c955b205a41386a0252ae0");

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("browserName", "iPhone");
        caps.setCapability("device", "iPhone 11 Pro");
        caps.setCapability("realMobile", "true");
        caps.setCapability("os_version", "15");
        caps.setCapability("name", "BStack-[Java] Sample Test"); // test name
        caps.setCapability("build", "BStack Build Number 1"); // CI/CD job or build name

          //   caps.setCapability("app", "bs://4ece3c4230436fabe8c955b205a41386a0252ae0");
      caps.setCapability("app", "bs://3157a3f0a0567fe75b57876ff9b8a986af3b5894");


        IOSDriver<IOSElement> driver =new IOSDriver<IOSElement>(new URL(URL),caps);
        //final WebDriver driver = new RemoteWebDriver(new URL(URL), caps);


        Thread.sleep(2000);

//curl -u "emrealp1:zhsfQuUYdroL8F2SwkTs" \
//-X POST "https://api-cloud.browserstack.com/app-automate/upload" \
//-F "file=@/path/to/app/file/Application-debug.apk"

    //    curl -u "emrealp1:zhsfQuUYdroL8F2SwkTs" -X POST "https://api-cloud.browserstack.com/app-automate/upload"  -F "file=@C:\Users\Administrator\IdeaProjects\AppiumAutomation\BStackSampleApp.ipa"
       // curl -u "emrealp1:zhsfQuUYdroL8F2SwkTs" -X POST "https://api-cloud.browserstack.com/app-automate/upload"  -F "file=@C:\Users\Administrator\IdeaProjects\AppiumAutomation\bitbar-ios-sample.ipa"

    }
}

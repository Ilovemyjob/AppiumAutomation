package com.automation;

import io.appium.java_client.remote.AndroidMobileCapabilityType;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserChrome {

//https://github.com/appium/appium/issues
    //https://chromedriver.storage.googleapis.com/index.html?path=2.23/
    @Test
    public void chromeTest() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities= new DesiredCapabilities();

        desiredCapabilities.setCapability("platformName", "Android");
        desiredCapabilities.setCapability("platformVersion", "7.0");
        desiredCapabilities.setCapability("deviceName", "Pixel_2");
        desiredCapabilities.setCapability("automationName", "UiAutomator2");
        desiredCapabilities.setCapability("browserName", "chrome");

        //kisa yol chrome version prb cozmek
    //        WebDriverManager .chromedriver().version("2.23").setup();
//        desiredCapabilities.setCapability(AndroidMobileCapabilityType.CHROMEDRIVER_EXECUTABLE,WebDriverManager.chromedriver().getBinaryPath());

        RemoteWebDriver driver = new RemoteWebDriver(new URL("http:localhost:4723/wd/hub"),desiredCapabilities);
        //to update and run chrome driver after dowlanding


        //to eliminate problem in chrome
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setAcceptInsecureCerts(true);
        desiredCapabilities.setCapability(AndroidMobileCapabilityType.CHROME_OPTIONS,chromeOptions);
        driver.get("http://zero.webappsecurity.com/");

        WebElement userName = driver.findElement(By.id("user_login"));
        WebElement password = driver.findElement(By.id("user_password"));
        WebElement submit = driver.findElement(By.name("submit"));

        userName.sendKeys("username");
        password.sendKeys("password");
        submit.click();
    }


}

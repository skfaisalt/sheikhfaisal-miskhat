package com.faisal.tests;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import java.io.IOException;
import java.net.URL;

public class BaseTest {

    public WebDriverWait wait;

    @BeforeMethod
    @Parameters({"deviceName", "platformVersion"})
    public void setup (String deviceName, String platformVersion) throws IOException {
        System.out.println("TestNG Before");

        //Unlock the device if it is locked.
        final Runtime rt = Runtime.getRuntime();
        rt.exec("adb shell input keyevent 224");

        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability("deviceName", deviceName);
        caps.setCapability("platformVersion", platformVersion);
        caps.setCapability("platformName", "Android");
        caps.setCapability("appPackage", "org.gnucash.android");
        caps.setCapability("appActivity","org.gnucash.android.ui.account.AccountsActivity");
        caps.setCapability("noReset","true");

        ThreadLocalDriver.setTLDriver(new AndroidDriver (new URL("http://127.0.0.1:4723/wd/hub"),caps));
        wait = new WebDriverWait(ThreadLocalDriver.getTLDriver(), 10);

    }

    @AfterMethod
    public synchronized void teardown(){
        ThreadLocalDriver.getTLDriver().quit();
    }

}

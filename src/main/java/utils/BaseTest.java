package utils;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeMethod;
import pages.LoginPage;
import pages.SignUpPage;
import pages.YourPersonalDataPage;

import java.net.MalformedURLException;
import java.net.URL;

import static utils.PropertyLoader.returnConfigValue;

public abstract class BaseTest {
    protected static AppiumDriver<MobileElement> driver;
    protected LoginPage loginPage;
    protected SignUpPage signUpPage;
    protected YourPersonalDataPage yourPersonalDataPage;

    @BeforeMethod
    public void preCondition() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, returnConfigValue("automation.name"));
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, returnConfigValue("devices.name"));
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, returnConfigValue("platform.name"));
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, returnConfigValue("platform.version"));
        cap.setCapability(MobileCapabilityType.UDID, returnConfigValue("udid"));
        cap.setCapability("ignoreUnimportantViews", true);
        cap.setCapability("appPackage", returnConfigValue("app.package"));
        cap.setCapability("appActivity", returnConfigValue("app.activity"));
        URL url = new URL(returnConfigValue("url.base"));
        driver = new AppiumDriver<>(url, cap);

        loginPage = new LoginPage(driver);
        signUpPage = new SignUpPage(driver);
        yourPersonalDataPage = new YourPersonalDataPage(driver);
    }
}
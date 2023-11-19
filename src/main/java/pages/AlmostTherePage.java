package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlmostTherePage {
    private final AppiumDriver<MobileElement> driver;
    private final WebDriverWait wait;
    private static final int EXPLICIT_WAIT = 60;

    public AlmostTherePage(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, EXPLICIT_WAIT);
    }

    private final By FundAccountButton = By.xpath("//android.widget.TextView[contains(@text,'Fund Your Account')]");

    public String getFundAccountButtonText() throws InterruptedException {
        Thread.sleep(2000);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(FundAccountButton));
        return element.getText();
    }
}

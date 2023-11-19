package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TermsAndConditionsPage {
    private final AppiumDriver<MobileElement> driver;
    private final WebDriverWait wait;
    private static final int EXPLICIT_WAIT = 60;

    public TermsAndConditionsPage(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, EXPLICIT_WAIT);
    }

    private final By acceptTermsTogglePath = By.xpath("//android.widget.ToggleButton[@resource-id='question-2_21']");
    private final By finishButtonPath = By.xpath("//android.widget.Button[@text='Finish']");


    public void clickRadioButton() throws InterruptedException {
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(acceptTermsTogglePath))).click();
    }

    public void clickFinishButton() throws InterruptedException {
        Thread.sleep(800);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(finishButtonPath))).click();

    }
}

package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignUpPage {
    private final AppiumDriver<MobileElement> driver;
    private final WebDriverWait wait;
    private static final int EXPLICIT_WAIT = 60;

    public SignUpPage(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, EXPLICIT_WAIT);
    }

    private final By countryInputPath = By.xpath("//android.view.View[contains(@resource-id, 'question-5')]//android.widget.EditText");
    private final By emailInputPath = By.xpath("//android.view.View[contains(@resource-id, 'question-6')]//android.widget.EditText");
    private final By passwordInputPath = By.xpath("//android.view.View[contains(@resource-id, 'question-7')]//android.widget.EditText");

    public void setMailInput(String text) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(emailInputPath));
        wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(text);
    }

    public void setCountryInput() {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(countryInputPath));
        wait.until(ExpectedConditions.visibilityOf(element)).click();
    }

    public void setPasswordInput(String text) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(passwordInputPath));
        wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(text);
    }
}

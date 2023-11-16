package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
    private final AppiumDriver<MobileElement> driver;
    private final WebDriverWait wait;
    private static final int EXPLICIT_WAIT = 60;

    public LoginPage(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, EXPLICIT_WAIT);
    }

    private final By registerButtonPath = By.xpath("//android.widget.Button");

    public void clickRegisterButton() {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(registerButtonPath));
        wait.until(ExpectedConditions.visibilityOf(element)).click();
    }
}

package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YourPersonalDetailsPage {
    private final AppiumDriver<MobileElement> driver;
    private final WebDriverWait wait;
    private static final int EXPLICIT_WAIT = 60;

    public YourPersonalDetailsPage(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, EXPLICIT_WAIT);
    }

    private final By cityInputPath = By.xpath("//android.widget.EditText[@resource-id='question-3_3']");
    private final By streetNameInputPath = By.xpath("//android.widget.EditText[@resource-id='question-4_94']");
    private final By numberInputPath = By.xpath("//android.widget.EditText[@resource-id='question-5_95']");
    private final By apartmentInputPath = By.xpath("//android.widget.EditText[@resource-id='question-6_96']");
    private final By postalCodeInputPath = By.xpath("//android.widget.EditText[@resource-id='question-7_5']");

    public void setCityInput(String text) throws InterruptedException {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(cityInputPath));
        wait.until(ExpectedConditions.visibilityOf(element)).click();
        Thread.sleep(500);
        driver.hideKeyboard();
        wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(text);
    }

    public void setStreetNameInput(String text) throws InterruptedException {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(streetNameInputPath));
        wait.until(ExpectedConditions.visibilityOf(element)).click();
        Thread.sleep(500);
        driver.hideKeyboard();
        wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(text);
    }

    public void setNumberInput(String text) throws InterruptedException {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(numberInputPath));
        wait.until(ExpectedConditions.visibilityOf(element)).click();
        Thread.sleep(500);
        driver.hideKeyboard();
        wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(text);
    }

    public void setApartmentInput(String text) throws InterruptedException {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(apartmentInputPath));
        wait.until(ExpectedConditions.visibilityOf(element)).click();
        Thread.sleep(500);
        driver.hideKeyboard();
        wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(text);
    }

    public void setPostalCodeInput(String text) throws InterruptedException {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(postalCodeInputPath));
        wait.until(ExpectedConditions.visibilityOf(element)).click();
        Thread.sleep(500);
        driver.hideKeyboard();
        wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(text);
    }

}

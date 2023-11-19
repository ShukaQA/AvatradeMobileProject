package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.*;

import static utils.Utils.typeText;

public class YourPersonalDataPage {
    private final AppiumDriver<MobileElement> driver;
    private final WebDriverWait wait;
    private static final int EXPLICIT_WAIT = 60;

    public YourPersonalDataPage(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, EXPLICIT_WAIT);
    }

    private final By firstNameInputPath = By.xpath("//android.widget.EditText[@resource-id='question-1_247']");
    private final By lastNameInputPath = By.xpath("//android.widget.EditText[@resource-id='question-2_248']");
    private final By dayInputPath = By.xpath("//android.widget.EditText[@resource-id='date-day']");
    private final By phoneNumberInputPath = By.xpath("//android.view.View[@resource-id='question-4_245']//android.view.View[@text='Phone Number']/following-sibling::android.widget.EditText");
    private final By continueButtonPath = By.xpath("//android.widget.Button[@text='Continue']");

    public void setFirstNameInput(String text) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(firstNameInputPath));
        wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(text);
    }

    public void setLastNameInput(String text) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(lastNameInputPath));
        wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(text);
    }

    public void setDateInput(String date)  {
        WebElement day = wait.until(ExpectedConditions.elementToBeClickable(dayInputPath));

        day.click();
        try {
            typeText(new Robot(), date);
        } catch (AWTException e) {
            e.printStackTrace();
        }

        driver.hideKeyboard();
    }

    public void setPhoneNumberInput(String text) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(phoneNumberInputPath));
        wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(text);
    }

    public void clickContinueButton() {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(continueButtonPath));
        wait.until(ExpectedConditions.visibilityOf(element)).click();
    }

}

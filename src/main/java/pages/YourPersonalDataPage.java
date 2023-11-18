package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class YourPersonalDataPage {
    private final AppiumDriver<MobileElement> driver;
    private final WebDriverWait wait;
    private static final int EXPLICIT_WAIT = 60;

    public YourPersonalDataPage(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, EXPLICIT_WAIT);
    }

    private final By firstNameInputPath = By.xpath("//android.widget.EditText[@resource-id='question-1_247']");
    public final By lastNameInputPath = By.xpath("//android.widget.EditText[@resource-id='question-2_248']");
    public final By dayInputPath = By.xpath("//android.widget.EditText[@resource-id='date-day']");
    public final By monthInputPath = By.xpath("//android.widget.EditText[@resource-id='date-month']");
    public final By yearInputPath = By.xpath("//android.widget.EditText[@resource-id='date-year']");
    public final By phoneNumberInputPath = By.xpath("//android.view.View[@resource-id='question-4_245']//android.view.View[@text='Phone Number']/following-sibling::android.widget.EditText");
    public final By continueButtonPath = By.xpath("//android.widget.Button[@text='Continue']");

    public void setFirstNameInput(String text) throws InterruptedException {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(firstNameInputPath));
        wait.until(ExpectedConditions.visibilityOf(element)).click();
        Thread.sleep(500);
        driver.hideKeyboard();
        wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(text);
    }

    public void setLastNameInput(String text) throws InterruptedException {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(lastNameInputPath));
        wait.until(ExpectedConditions.visibilityOf(element)).click();
        Thread.sleep(500);
        driver.hideKeyboard();
        wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(text);
    }

    public void setDateInput(String birthdate) throws InterruptedException {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        LocalDate date = LocalDate.parse(birthdate, formatter);

        WebElement day = wait.until(ExpectedConditions.elementToBeClickable(dayInputPath));
        WebElement month = wait.until(ExpectedConditions.elementToBeClickable(monthInputPath));
        WebElement year = wait.until(ExpectedConditions.elementToBeClickable(yearInputPath));

        Thread.sleep(800);
        wait.until(ExpectedConditions.visibilityOf(day)).click();
        day.sendKeys((String.valueOf(date.getDayOfMonth())));
        wait.until(ExpectedConditions.visibilityOf(month)).click();
        month.sendKeys(String.valueOf(date.getMonthValue()));
        wait.until(ExpectedConditions.visibilityOf(year)).click();
        year.sendKeys(String.valueOf(date.getYear()));

        Thread.sleep(800);
        driver.hideKeyboard();
    }

    public void setPhoneNumberInput(String text) throws InterruptedException {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(phoneNumberInputPath));
        wait.until(ExpectedConditions.visibilityOf(element)).click();
        Thread.sleep(500);
        driver.hideKeyboard();
        wait.until(ExpectedConditions.visibilityOf(element)).sendKeys(text);
    }

    public void clickContinueButton() {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(continueButtonPath));
        wait.until(ExpectedConditions.visibilityOf(element)).click();
    }

}

package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YourFinancialDetailsPage {
    private final AppiumDriver<MobileElement> driver;
    private final WebDriverWait wait;
    private static final int EXPLICIT_WAIT = 60;

    public YourFinancialDetailsPage(AppiumDriver<MobileElement> driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, EXPLICIT_WAIT);
    }

    private final By primaryOccupationDropdownPath = By.xpath("//android.widget.EditText[@resource-id='question-1_15']");
    private final By employmentStatusDropdownPath = By.xpath("//android.widget.EditText[@resource-id='question-2_91']");
    private final By fundsSourceDropdownPath = By.xpath("//android.widget.EditText[@resource-id='question-3_18']");
    private final By estimatedIncomeDropdownPath = By.xpath("//android.widget.EditText[@resource-id='question-4_16']");

    private final By estimatedValueDropdownPath = By.xpath("//android.widget.EditText[@resource-id='question-1_89']");
    private final By investAmountDropdownPath = By.xpath("//android.widget.EditText[@resource-id='question-2_90']");

    public void setPrimaryOccupationDropdown(String text) throws InterruptedException {
        Thread.sleep(800);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(primaryOccupationDropdownPath))).click();
        Thread.sleep(800);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//android.widget.ListView//android.view.View[contains(@text, '" + text + "')]")))).click();

    }

    public void setEmploymentStatusDropdown(String text) throws InterruptedException {
        Thread.sleep(800);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(employmentStatusDropdownPath))).click();
        Thread.sleep(800);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//android.widget.ListView//android.view.View[contains(@text, '" + text + "')]")))).click();
    }


    public void setFundsSourceDropdown(String text) throws InterruptedException {
        Thread.sleep(800);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(fundsSourceDropdownPath))).click();
        Thread.sleep(800);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//android.widget.ListView//android.view.View[contains(@text, '" + text + "')]")))).click();
    }

    public void setEstimatedIncomeDropdown(String text) throws InterruptedException {
        Thread.sleep(800);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(estimatedIncomeDropdownPath))).click();
        Thread.sleep(800);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//android.widget.ListView//android.view.View[contains(@text, '" + text + "')]")))).click();
    }

    public void setEstimatedValueDropdown(String text) throws InterruptedException {
        Thread.sleep(2000);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(estimatedValueDropdownPath))).click();
        Thread.sleep(800);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//android.widget.ListView//android.view.View[contains(@text, '" + text + "')]")))).click();
    }

    public void setInvestAmountDropdownPath(String text) throws InterruptedException {
        Thread.sleep(800);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(investAmountDropdownPath))).click();
        Thread.sleep(800);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//android.widget.ListView//android.view.View[contains(@text, '" + text + "')]")))).click();
    }

}

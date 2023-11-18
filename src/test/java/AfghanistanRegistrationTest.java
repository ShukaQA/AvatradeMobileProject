import com.github.javafaker.Faker;
import models.DataPojo;
import models.ScenarioPojo;
import models.ScenariosPojo;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utils.BaseTest;
import utils.Utils;

import java.util.List;

import static utils.PropertyLoader.returnConfigValue;

public class AfghanistanRegistrationTest extends BaseTest {
    @DataProvider(name = "registrationScenarios")
    public Object[][] registrationScenarios() {
        ScenariosPojo data
                = Utils.readJsonFile(returnConfigValue("test.data.path"), ScenariosPojo.class);
        assert data != null;
        List<ScenarioPojo> scenarios = data.getScenarios();
        Object[][] testData = new Object[scenarios.size()][1];
        for (int i = 0; i < scenarios.size(); i++) {
            testData[i][0] = scenarios.get(i);
        }
        return testData;
    }

    @Test(dataProvider = "registrationScenarios")
    public void registrationTest(ScenarioPojo data) throws InterruptedException {
        if (data.getScenarioName().equals("Afghanistan Registration")) {
            fillRegistrationFormForAfghanistan(data.getData());
        }
    }

    public void fillRegistrationFormForAfghanistan(DataPojo data) throws InterruptedException {
        loginPage.clickRegisterButton();
        signUpPage.setCountryInput("Afghanistan");
        signUpPage.setMailInput(new Faker().internet().emailAddress());
        signUpPage.setPasswordInput(data.getRegistration().getPassword());
        signUpPage.clickCreateMyAccount();

        yourPersonalDataPage.setFirstNameInput(data.getPersonalDetails().getLastName());
        yourPersonalDataPage.setLastNameInput(data.getPersonalDetails().getLastName());
        yourPersonalDataPage.setDateInput("11-11-1996");
        yourPersonalDataPage.setPhoneNumberInput(data.getPersonalDetails().getPhoneNumber());
        yourPersonalDataPage.clickContinueButton();

    }
}

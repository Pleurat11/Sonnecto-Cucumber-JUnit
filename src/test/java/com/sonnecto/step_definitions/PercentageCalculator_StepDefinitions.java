package com.sonnecto.step_definitions;

import com.sonnecto.pages.PercentageCalculatorPage;
import com.sonnecto.utilities.BrowserUtils;
import com.sonnecto.utilities.ConfigurationReader;
import com.sonnecto.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import java.util.Map;

public class PercentageCalculator_StepDefinitions {
    @Given("User is on percentage calculator page")
    public void user_is_on_percentage_calculator_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("percentage.url"));
    }
    @Then("User should see following calculations:")
    public void user_should_see_following_calculations(Map<Integer, Integer> values) {
        System.out.println("values = " + values);
        PercentageCalculatorPage calculatorPage = new PercentageCalculatorPage();
        calculatorPage.percent.sendKeys("5");

        //loop through keys in the map
        for (Integer inputKey : values.keySet()) {
            calculatorPage.of.clear();
            calculatorPage.of.sendKeys(inputKey+"" + Keys.ENTER);
            BrowserUtils.sleep(1);

            System.out.println("input value = " + inputKey);
            System.out.println("EXPECTED 5% VALUE = " + values.get(inputKey));
            System.out.println("ACTUAL 5% CALCULATED VALUE = " + calculatorPage.result.getAttribute("value"));
            System.out.println("================================");

            // assert that expected 5% value matches the actual value.
            Assert.assertEquals(values.get(inputKey), Integer.valueOf(calculatorPage.result.getAttribute("value")));

        }
    }
}

package com.sonnecto.step_definitions;

import com.sonnecto.pages.DiceDashboardPage;
import com.sonnecto.utilities.ConfigurationReader;
import com.sonnecto.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.security.auth.login.Configuration;

public class Dice_StepDefinitions {
    @Given("User is on dice homepage.")
    public void user_is_on_dice_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("dice.url"));
    }
    @When("User enters keyword and zipcode.")
    public void user_enters_keyword_and_zipcode() {
        DiceDashboardPage dashboardPage = new DiceDashboardPage();
        dashboardPage.keyword.sendKeys("QA Engineer");
        dashboardPage.zipCode.sendKeys("22102" + Keys.ENTER);
    }
    @Then("User should see search results.")
    public void user_should_see_search_results() {
        WebElement results = Driver.getDriver().findElement(By.xpath("//span[@data-cy='search-count-mobile']"));
        System.out.println("results = " + results.getText());
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Search Jobs | Dice.com"));
    }
}

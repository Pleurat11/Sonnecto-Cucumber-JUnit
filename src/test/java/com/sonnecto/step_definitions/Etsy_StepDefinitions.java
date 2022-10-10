package com.sonnecto.step_definitions;

import com.sonnecto.pages.EtsyDashboardPage;
import com.sonnecto.utilities.ConfigurationReader;
import com.sonnecto.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class Etsy_StepDefinitions {
    @Given("User is on etsy homepage")
    public void user_is_on_etsy_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("etsy.url"));
    }
    @Then("Page title should be as expected")
    public void page_title_should_be_as_expected() {
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Shop for handmade, vintage, custom"));
    }
    @When("User searches for wooden spoon")
    public void user_searches_for_wooden_spoon() {
        EtsyDashboardPage dashboardPage = new EtsyDashboardPage();
        dashboardPage.searchFor("wooden spoon" + Keys.ENTER);
    }
    @Then("Page title should start with Wooden spoon")
    public void page_title_should_start_with_wooden_spoon() {
        Assert.assertEquals(Driver.getDriver().getTitle(), ("Wooden spoon | Etsy"));
    }
    @When("User makes an empty search")
    public void user_maes_an_empty_search(){
        EtsyDashboardPage dashboardPage = new EtsyDashboardPage();
        dashboardPage.searchFor(""+Keys.ENTER);
    }
    @Then("All categories should be displayed")
    public void all_categories_should_be_displayed(){
        EtsyDashboardPage dashboardPage = new EtsyDashboardPage();
        Assert.assertEquals("All categories | Etsy",Driver.getDriver().getTitle());
    }
}

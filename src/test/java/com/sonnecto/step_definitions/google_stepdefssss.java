package com.sonnecto.step_definitions;

import com.sonnecto.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class google_stepdefssss {
    @Given("user is on google homepage")
    public void user_is_on_google_homepage() {
        Driver.getDriver().get("https://google.com");
    }
    @When("user searches for something")
    public void user_searches_for_something() {
        Driver.getDriver().findElement(By.name("q")).sendKeys("shkas" + Keys.ENTER) ;
    }
    @Then("user should see results")
    public void user_should_see_results() {
        Assert.assertEquals(Driver.getDriver().getTitle(), "Peja");
    }
}

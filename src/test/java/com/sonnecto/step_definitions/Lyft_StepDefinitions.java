package com.sonnecto.step_definitions;

import com.sonnecto.pages.LyftEstimatePage;
import com.sonnecto.utilities.BrowserUtils;
import com.sonnecto.utilities.ConfigurationReader;
import com.sonnecto.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import jdk.nashorn.internal.runtime.regexp.joni.Config;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;


public class Lyft_StepDefinitions {
    //declare the object here so we can use it everywhere
    LyftEstimatePage estimatePage = new LyftEstimatePage();

    @Given("User is on lyft fare estimate page")
    public void user_is_on_lyft_fare_estimate_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("lyft.fare.estimate.url"));
        Assert.assertTrue(Driver.getDriver().getTitle().contains("Lyft Price Estimate"));
    }
    @When("User enters {string} as pickup address")
    public void user_enters_as_pickup_address(String pickUpLocation) {
       // estimatePage.pickUpLocation.sendKeys(pickUpLocation);

        estimatePage.enterPickUpLocation(pickUpLocation);
    }
    @When("User enters {string} as drop address")
    public void user_enters_as_drop_address(String dropOffLocation) {
       // estimatePage.dropOffLocation.sendKeys(dropOffLocation);

        estimatePage.enterDropOffLocation(dropOffLocation);

    }
    @When("User clicks on get estimate button")
    public void user_clicks_on_get_estimate_button() {
        estimatePage.getEstimateButton.click();
        BrowserUtils.sleep(1);
        estimatePage.getEstimateButton.click();
    }
    @Then("User should see estimated prices")
    public void user_should_see_estimated_prices() {

        String actualResult = Driver.getDriver().findElement(By.xpath("//div[@class='wee03o-0 eDUQJR _169vVLnWYjhXq86neb9LEo']")).getText();
        String expectedResult = "There are currently no rides for this route\n" +
                "Lyft may not be available in this area.";
        Assert.assertEquals(actualResult, expectedResult);

    }
}

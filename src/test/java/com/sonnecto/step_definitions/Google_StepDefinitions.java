package com.sonnecto.step_definitions;

import com.sonnecto.pages.GoogleSearchPage;
import com.sonnecto.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class Google_StepDefinitions {
    GoogleSearchPage searchPage = new GoogleSearchPage();

    @Given("User is on Google HomePage")
    public void user_is_on_google_home_page() {
        Driver.getDriver().get("https://google.com");
    }
    @When("User searches for apple")
    public void user_searches_for_apple() {
        GoogleSearchPage searchPage = new GoogleSearchPage();
        searchPage.searchBox.sendKeys("apple"+ Keys.ENTER);
    }
    @Then("User should see apple in the title")
    public void user_should_see_apple_in_the_title() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedInTitle = "apple";
        Assert.assertTrue(actualTitle.contains(expectedInTitle));
    }

    @Then("User should be able to search for following:")
    public void userShouldBeAbleToSearchForFollowing(List<String> items){
        System.out.println("items = " + items);
        //We can loop and search for each item on google
        GoogleSearchPage searchPage = new GoogleSearchPage();
        for (String eachItem : items) {
            searchPage.searchBox.sendKeys(eachItem + Keys.ENTER);
            searchPage.searchBox.clear();
        }
    }

    @When("User searches for {string} capital")
    public void userSearchesForCapital(String countryName) {
        System.out.println("Searching for capital city of " + countryName);
        searchPage.searchBox.sendKeys("What is the capital city of " + countryName + Keys.ENTER);
    }

    @Then("User should see {string} in the result")
    public void userShouldSeeInTheResult(String capitalCity) {
        System.out.println("Expected capital city name: " + capitalCity);
        Assert.assertEquals(capitalCity, searchPage.searchResultCityName.getText());
    }
}

package com.sonnecto.step_definitions;

import com.sonnecto.pages.GoogleSearchPage;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;

import java.util.List;

public class list_stepdefinitions {

    GoogleSearchPage googleSearchPage = new GoogleSearchPage();
    @Then("User should be able to search for this:")
    public void user_should_be_able_to_search_for_this(List<String> myList) {
        for (int i = 0; i < myList.size(); i++) {
            googleSearchPage.searchBox.sendKeys(myList.get(i) + Keys.ENTER);
            googleSearchPage.searchBox.clear();
        }
    }
}

package com.sonnecto.step_definitions;

import com.sonnecto.pages.CloudTablesPage;
import com.sonnecto.utilities.ConfigurationReader;
import com.sonnecto.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class CloudTables_StepDefinitions {

    CloudTablesPage tablesPage = new CloudTablesPage();

    @Given("User is on cloudtables homepage")
    public void user_is_on_cloudtables_homepage() {
        Driver.getDriver().get(ConfigurationReader.getProperty("cloudtables.url"));
        String expectedTitle = "Editor | Editing for DataTables";
        Assert.assertTrue(Driver.getDriver().getTitle().equalsIgnoreCase(expectedTitle));
    }
    @When("User clicks on New button")
    public void user_clicks_on_new_button() {
        tablesPage.clickNewButton();
    }
    @When("User enters {string} to firstname field")
    public void user_enters_to_firstname_field(String firstName) {
        tablesPage.firstName.sendKeys(firstName);
    }

    @When("User enters {string} to lastname field")
    public void user_enters_to_lastname_field(String lastName) {
        tablesPage.lastName.sendKeys(lastName);
    }

    @When("User enters {string} to position field")
    public void user_enters_to_position_field(String position) {
        tablesPage.position.sendKeys(position);
    }

    @When("User enters {string} to salary field")
    public void user_enters_to_salary_field(String salary) {
        tablesPage.salary.sendKeys(salary);
    }

    @And("User clicks on create button")
    public void user_clicks_on_create_button() {
        tablesPage.clickCreateButton();
    }
}

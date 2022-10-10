package com.sonnecto.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class RerunDemo_StepDefinitions {
    @Given("User adds two numbers")
    public void user_adds_two_numbers() {
        System.out.println("User adds two numbers");

    }
    @Then("Result should be as expected")
    public void result_should_be_as_expected() {
        System.out.println("Result should be as expected");
    }

    @Given("User adds three numbers")
    public void user_adds_three_numbers() {
        System.out.println("User adds three numbers");
    }

    @Then("Result should sum of three numbers")
    public void result_should_sum_of_three_numbers() {
        System.out.println("Result should sum of three numbers");
        Assert.assertEquals(10,5); // intentionally failing
    }

    @Given("User divides two numbers")
    public void user_divides_two_numbers() {
        System.out.println("User divides two numbers");
    }
    @Then("Result should be division result")
    public void result_should_be_division_result() {
        System.out.println("Result should be division result");
    }


    @Given("User multiples two numbers")
    public void user_multiples_two_numbers() {
        System.out.println("User multiples two numbers");
    }
    @Then("Result should be multiplied")
    public void result_should_be_multiplied() {
        System.out.println("Result should be multiplied");
        Assert.assertEquals(10,2);
    }
}

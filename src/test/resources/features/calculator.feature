@all
@calculator
Feature: Calculator Tests
  Background: Given User is on Calculator Page
    Scenario: Adding
      Given User clicks "5" on calculator
      And User clicks on "+" sign
      And User clicks on "3" on calculator
      Then result should be "8"

  Scenario: Subtracting
    Given User clicks "9" on calculator
    And User clicks on "-" sign
    And User clicks on "5" on calculator
    Then result should be "4"

  Scenario: Multiplying
    Given User clicks "8" on calculator
    And User clicks on "*" sign
    And User clicks on "7" on calculator
    Then result should be "56"

  Scenario: Dividing
    Given User clicks "10" on calculator
    And User clicks on "/" sign
    And User clicks on "2" on calculator
    Then result should be "5"
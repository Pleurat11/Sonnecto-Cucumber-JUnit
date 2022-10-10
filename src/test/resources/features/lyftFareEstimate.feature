@lyft
@all
Feature: Searching Lyft fare details

  Scenario: Fare estimate using City
    Given User is on lyft fare estimate page
    When User enters "McLean, VA, United States" as pickup address
    And User enters "Woodbridge, VA, United States" as drop address
    And User clicks on get estimate button
    Then User should see estimated prices

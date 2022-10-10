@all
@etsy #this is a tag
Feature: User etsy search

    As a User when I search for an item I should see the results
  Scenario:User Search for wooden spoon
    Given User is on etsy homepage
    Then Page title should be as expected
    When User searches for wooden spoon
    Then Page title should start with Wooden spoon

    Scenario: Users empty search
      Given User is on etsy homepage
      Then Page title should be as expected
      When User makes an empty search
      Then All categories should be displayed
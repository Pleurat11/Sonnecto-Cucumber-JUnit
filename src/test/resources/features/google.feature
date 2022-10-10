@all
Feature: User searches on google
  @googless
  Scenario: As a user I want to search on google
    Given user is on google homepage
    When user searches for something
    Then user should see results
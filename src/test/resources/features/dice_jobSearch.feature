@all
Feature: Dice job Search
  As a user, I should be able to search for jobs using a keyword and zipcode, then see results.
  Scenario: User searches for a job.

    Given User is on dice homepage.
    When User enters keyword and zipcode.
    Then User should see search results.
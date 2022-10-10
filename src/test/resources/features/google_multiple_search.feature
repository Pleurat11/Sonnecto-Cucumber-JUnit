@all
@google
Feature: Passing multiple parameters to the step

  Scenario: User searches for list of items
    Given User is on Google HomePage
    Then User should be able to search for following:
    |java|
    |selenium|
    |cucumber bdd|
    |QA automation|
    |wooden spoon|

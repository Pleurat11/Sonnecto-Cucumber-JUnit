@all
@rerun
Feature: Failed Scenarios Re-run

  Scenario: one
    Given User adds two numbers
    Then Result should be as expected

  Scenario: two
    Given User adds three numbers
    Then Result should sum of three numbers

  Scenario: three
    Given User divides two numbers
    Then Result should be division result

  Scenario: four
    Given User multiples two numbers
    Then Result should be multiplied
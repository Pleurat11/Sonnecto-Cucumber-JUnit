@all
@google_scenario_outline
Feature: Data driven testing using Scenario Outline with Examples table

  Scenario Outline: Google capital cities search
    Given User is on Google HomePage
    When User searches for "<country>" capital
    Then User should see "<capital>" in the result
    Examples:
    |country|capital|
    |USA|Washington, D.C.|
    |Turkey|Ankara|
    |Kosovo|Pristina|
    |Ukraine|Kyiv|
    |France|Paris|
    |England|London|
    |Albania|Tirana|

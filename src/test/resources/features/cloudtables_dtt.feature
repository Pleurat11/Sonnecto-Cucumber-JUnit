@all
@cloudtables
Feature: DDT example with Cloudtable

  Scenario Outline: Adding multiple users to the table
    Given User is on cloudtables homepage
    When User clicks on New button
    And User enters "<firstName>" to firstname field
    And User enters "<lastName>" to lastname field
    And User enters "<position>" to position field
    And User enters "<salary>" to salary field
    And User clicks on create button
    Examples:
    |firstName|lastName|position|salary|
    |Frodo|Baggins  |QAEngineer   |150000|
    |Samwise  |Gamgee|PHPDEV       |120000|
    |Gandalf |TheGray  |Lawyer/Dealer|300000|
    |Merry  |Pippin    |Architect    |110000|
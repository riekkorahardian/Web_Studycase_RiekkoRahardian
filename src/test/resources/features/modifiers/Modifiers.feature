@Web @Modifiers
Feature: Modifiers

  Scenario: Create modifier
    Given User open moka backoffice login page
    And User input email "riekkorahardn29@gmail.com" on backoffice login page
    And User input password "123456r" on backoffice login page
    And User click Sign in on backoffice login page
    And User successfully login on backoffice
    When User go to menu modifiers on backoffice
    And User click create modifier button
    And User input random modifier name on modifier name text field
    And User click add or manage option button
    And User click add option button
    And User input option name "Bubble" on name text field
    And User input option price on price text field
    And User click save button on add option page
    And User click save button on create modifier page
    Then User see the modifier has been created

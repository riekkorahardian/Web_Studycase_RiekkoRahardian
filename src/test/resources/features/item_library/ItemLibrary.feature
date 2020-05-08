@Web @ItemLibrary
Feature: Item Library

  Scenario: Create Item
    Given User open moka backoffice login page
    And User input email "riekkorahardn29@gmail.com" on backoffice login page
    And User input password "123456r" on backoffice login page
    And User click Sign in on backoffice login page
    And User successfully login on backoffice
    When User go to menu item library on backoffice
    And User click create item button on item library page
    And User input random item name on item name text field
    And User click add variant button
    And User input variant name "Medium" on name text field
    And User input random price on price text field
    And User input random SKU on SKU text field
    And User click confirm button
    And User click modifier name "Topping"
    And User input random item description
    And User click save button on create item page
    Then User see the item has been created

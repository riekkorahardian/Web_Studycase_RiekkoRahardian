@Web @Categories
Feature: Categories

  Scenario: Create Categories
    Given User open moka backoffice login page
    And User input email "riekkorahardn29@gmail.com" on backoffice login page
    And User input password "123456r" on backoffice login page
    And User click Sign in on backoffice login page
    And User successfully login on backoffice
    When User go to menu categories on backoffice
    And User click create category button on categories page
    And User input random category name on category name text field
    And User clik save buton
    Then User see that category has been created

  Scenario: Search Categories
    Given User open moka backoffice login page
    And User input email "riekkorahardn29@gmail.com" on backoffice login page
    And User input password "123456r" on backoffice login page
    And User click Sign in on backoffice login page
    And User successfully login on backoffice
    When User go to menu categories on backoffice
    And User click create category button on categories page
    And User input random category name on category name text field
    And User clik save buton
    And User input random category name on search text field
    Then User see that category is displayed
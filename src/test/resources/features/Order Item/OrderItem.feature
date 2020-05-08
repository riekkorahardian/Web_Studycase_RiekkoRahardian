@Web @ItemLibrary
Feature: Create order

  Scenario: Create item on backoffice and create order on mokapos
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
And User is on moka start page
And User click sign in button on moka start page
And User input email "riekkorahardn29@gmail.com" on username text field
And User input password "123456r" on password text field
And User click sign in button on sign in page
And User is on moka favourite page
And User add item "Korean Bulgogi" with quantity "1" on favourite page
And User click charge button
And The user select the total payment that equal to the total price
And User click charge button on checkout PopUp
Then User see receipt page with "No Change" information
Then User click charge back button

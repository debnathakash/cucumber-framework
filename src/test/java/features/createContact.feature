@tag
Feature: Create new contact

Background:
Given user opens correct browser
When user gives proper URL
Then user gives username and password
Then User clicks on login button
Then user is logged in successfully


  @Regression
  Scenario: user should be able to create new contact
    
    When user click on contact
    Then new button should be displayed
    Then user enters all the required fields
    
    |Elston |Desa |Diago |elston.diago@corp.com |Co-Operator|
    When user clicks on save button
    Then contact should be saved successfully

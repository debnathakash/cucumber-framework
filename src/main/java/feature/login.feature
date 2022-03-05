Feature: Login Feature

Background: 
Given User opens correct browser
When User navigates to correct url
Then Validate user is on correct url

@smoke
Scenario: User logs into the application successfully
Given User is on login page
When User enters the username and password
|Elstone|password1|
|Angelo|password2|
And User enters the "Test@123"
When User clicks on Login button
Then User logs into the application successfully

@regression
Scenario Outline: User logs into the application successfully
Given User is on login page
When User enters the following details <usernamedetails> and <password>
And User enters the "Test@123"
When User clicks on Login button
Then User logs into the application successfully
Examples:
|usernamedetails|password|
|user1          |pass1   |
|user2          |pass2   |
|user3          |pass3   |
|user4					|pass4	 |
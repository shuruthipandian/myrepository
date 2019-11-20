Feature: demo on use of tags in cucumber

@First
Scenario: regression testing
Given user is testing for login functionality
Then user logged in successfully

@Second
Scenario: system testing
Given user is testing the search functionality
Then search works successfully

@Demo
Scenario: display the name of the tester
Then "shuruthi" is tester on testme app


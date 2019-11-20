Feature: demo on scenario outline example
Scenario Outline: login for testme application

Given user must be in login page
When user enters "<username>" and "<password>"
And performs login
Then user directed to homepage

Examples: 
|username||password|
|abc||abc|
|xyz||xyz|
|123||123|
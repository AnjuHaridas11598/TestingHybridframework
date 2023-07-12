Feature: To validate the Facebook Application

#Scenario: To validate the Login functionality
#Given Launch the facebook applicaiton
#When Enter the username and password
#And Click on the login button
#Then It should navigate to the home page

Scenario Outline: To validate the Login functionality
Given Launch the facebook applicaiton
When Enter the "<username>" and "<password>"
And Click on the login button
Then It should navigate to the home page

Examples:
|username|password|
|9789936839|Sivajish1104|
|9790905143|Sivajish1105|

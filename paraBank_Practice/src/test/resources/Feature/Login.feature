Feature: Login to the paraBank Website

Background: 
Given User launches the Website

Scenario: Login to the paraBank Website

@ValidCredentials
Scenario Outline: Login to Website using valid credentials
When User enters the valid username"<username>"
And User enters the valid password "<password>"
Then Clicking on the login button page

@InvalidCredentials
Scenario Outline: Login to Website using invalid  credentials
When User enters the Invalid username"<username>"
And User enters the Invalid password "<password>"
Then Clicking on the login button pageawhyukp[

 

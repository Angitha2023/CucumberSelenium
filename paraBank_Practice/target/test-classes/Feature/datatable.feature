Feature: Login to HRM WebApplication

@ValidCredentials
Scenario: Login with valid credentials

Given User is on HRM Login Web Application
When User provides valid credentials
    | Username | Password |
    | Admin    | admin123 |
    
   
 Then User should be able to login successfully and see homepage
 
 
@InValidCredentials

Scenario: Login with Invalid credentials

  Given User is on HRM Login Web Application
  When User provides valid credentials
      | Username  | Password |
      | Admin1    | admin123 |
      | Admin     | admin1231|
  Then User should be able to see unsuccessfull with error message 
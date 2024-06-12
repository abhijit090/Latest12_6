Feature: Free CTT login Test

Scenario: Verify login functionality with valid credentials
    Given User is on the CTT login page
    When User enters valid username and password
    And User clicks on the Login button
    Then User should be logged in successfully
    And User should be redirected to the home page


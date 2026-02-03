Feature: Login Page Automation Of Scaucedemo App

  Scenario Outline: Check login is successful with the valid credentials
    Given User is on login page
    When User enters valid "<username>" and "<password>"
    And Click on login button
    Then User is navigated to home page
    And close the browser

  Examples:
|username|password|
|standard_user|secret_sauce|


Feature: This is backgrounddemo

  Background: User is logged in to saucedemo app
    Given User is accesing saucedemo login page
    When User enter valid username and password
    Then User should be able to navigate to home page

  Scenario: Test Menu Items
    And Click on breadcrumb icon
    Then User should be able to see the menu items

  Scenario: verify add to cart functionality
    And Click on login button
    Then Item should be added to the cart

@homepage
Feature: Homepage
  As a user
  I want to go on product
  So that I can see all product

  Scenario: As user, I can see all product
    And I click login button
    Then I can see all product

  Scenario: As user, I can see all category product
    And I click login button
    And I click icon triangle
    Then I can see category product

  Scenario: As user, I can see product by category
    And I click login button
    And I click icon triangle
    Then I can see product by category

  Scenario: As user, Add items to cart
    And I click login button
    And I click buy button
    Then I can add item to cart

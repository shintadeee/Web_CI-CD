@login
Feature: Login
  As a user
  I want to login in my account
  So that I can login with my account

  Scenario: Successfully login
    Given I am on the login page
    When I enter email "shintadewi@gmail.com"
    And I enter password
    And I click login button
    Then I am on the home page

  Scenario: Login with invalid email
    Given I am on the login page
    When I enter invalid email "shinta12345@gmail.com"
    And I enter password
    And I click login button
    Then I see error message "record not found"

@register
Feature: Register
  As a user
  I want to register
  So that I can login with my account

  Scenario: Successfully register
    Given I am on the register page
    When I input full name
    And I input email "shintadewi@gmail.com"
    And I input password
    And I click register button
    Then I am direct on the login page

  Scenario: Register without email
    Given I am on the register page
    When I input full name
    And I input password
    And I click register button
    Then I can see error message "email is required"

  Scenario: Register with already account
    Given I am on the register page
    When I input full name
    And I input email "shintadewi@gmail.com"
    And I input password
    And I click register button
    Then I can see error message "duplicate key value violates unique constraint users_email_key (SQLSTATE 23505)"
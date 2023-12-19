@regression
Feature: Register
  As a user I want to check Register functionality

  @author_Mary  @regression @smoke @sanity
  Scenario: Verify UserShould Navigate To Register Page Successfully
    Given I am on homepage
    When  Click on Register Link
    Then  Verify "Register" text

  @author_Mary @smoke @regression
  Scenario:Verify That First Name Last Name Email Password And ConfirmPassword Fields Are Mandatory
    Given I am on homepage
    When Click on Register Link
    And  I Click on "REGISTER" button
    And  I Verify the error message "First name is required."
    And  I Verify the error message "Last name is required."
    And  I Verify the error message "Email is required."
    And  I Verify the error message "Password is required."
    Then I Verify the error message "Password is required."

  @author_Mary @regression
  Scenario: Verify that user should create account successfully
    Given I am on homepage
    When Click on Register Link
    And I Select gender "Female"
    And I Enter firstname
    And I Enter lastname
    And I Select day
    And I Select month
    And I Select year
    And I Enter email
    And I Enter password
    And I Enter Confirm Password
    And I Click on "REGISTER" button
    Then I Verify message "Your registration completed"
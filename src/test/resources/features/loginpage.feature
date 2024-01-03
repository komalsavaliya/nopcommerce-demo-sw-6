@regression
Feature: Login Feature
  As a user I want to check Login Page functionality

  @author_Mary @regression @smoke @sanity
  Scenario: User should navigate to login page successfully
    Given I am on homepage
    When I click on login link
    Then I should navigate to login page successfully

  @author_Mary @smoke @regression
  Scenario: Verify the error message with Invalid credentials.
    Given I am on homepage
    When I click on login link
    And  Enter EmailId
    And  Enter Password
    And  Click on Login Button
    Then Verify that the Error message

  @author_Mary @regression
  Scenario: Verify that user should LogIn successfully with valid credentials.
    Given I am on homepage
    When I click on login link
    And Enter ValidEmailId
    And Enter Password
    And Click on Login Button
    Then Verify that LogOut link is display

  @author_Mary  @regression
  Scenario: Verify that User should LogOut successFully with valid credentials.
    Given I am on homepage
    When I click on login link
    And Enter ValidEmailId
    And Enter Password
    And Click on Login Button
    And Click on LogOut Link
    And Verify that LogIn Link Display
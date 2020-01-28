#Author: kedar.londhe

@tag
Feature: Automate login validation
  I want to use this template for my cucumber poc

  @tag1 @test
  Scenario: Login as admin to orangeHRM
    Given OrangeHRM login page is opened
#    And some other precondition
    When I enter Username
    And I enter password
    And I click on Login button
    Then I validate the Login Successful
    And Dashboard is displayed
    And I click on logout button
#    Then I take screenshot12
    And I see something
    Then I close new window



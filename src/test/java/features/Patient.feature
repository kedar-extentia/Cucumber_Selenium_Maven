#Author: kedar.londhe

@tag
Feature: Automate Patient Account related scenarios
  Create Account, Care Plan, Tasks, Events Scheduling etc.

  @smoke
  Scenario: Nurse should be able to create patient account
    Given I open the URL "https://test.salesforce.com"
    When I login as Nurse
    Then I verify the Login Successful
#    And I navigate to Accounts
    And I click on New Account
    And I select Account Type
    And I click Next button
    And I enter FirstName LastName
    And I select Birth date 05 - 05 - 2002
    #And Dashboard is displayed
    Then I click Save button
    Then verify account created successfully






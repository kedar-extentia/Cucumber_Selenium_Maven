#Author: kedar.londhe

@tag
Feature: Automate SF scenarios
  I want to use this template for my cucumber poc

@tag1
Scenario: Login as admin to SalesforceIQVIA
#Given SalesforceIQVIA login page is opened
Given I open the URL "https://test.salesforce.com"
When I login as admin
Then I verify the Login Successful
#And Dashboard is displayed
And I logout from Salesforce

  @tag
  Scenario: Create Patient Account
    Given SalesforceIQVIA login page is opened
#    Given I open the URL "https://test.salesforce.com"
    When I login as admin
#    And I go to Accounts Tab
    And I click on New Account
    And I select Account Type
    And I click Next button
    And I select date 05 - 05 - 2022


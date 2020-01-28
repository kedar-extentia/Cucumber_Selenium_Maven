$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/features/Patient.feature");
formatter.feature({
  "name": "Automate Patient Account related scenarios",
  "description": "  Create Account, Care Plan, Tasks, Events Scheduling etc.",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "name": "Nurse should be able to create patient account",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "I open the URL \"https://test.salesforce.com\"",
  "keyword": "Given "
});
formatter.match({
  "location": "SF.iOpenURL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I login as Nurse",
  "keyword": "When "
});
formatter.match({
  "location": "SF.iLoginAsNurse()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the Login Successful",
  "keyword": "Then "
});
formatter.match({
  "location": "SF.iVerifyTheLoginSuccessful()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on New Account",
  "keyword": "And "
});
formatter.match({
  "location": "SF.iClickOnNewAccount()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select Account Type",
  "keyword": "And "
});
formatter.match({
  "location": "SF.iSelectAccountType()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click Next button",
  "keyword": "And "
});
formatter.match({
  "location": "SF.iClickNextButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter FirstName LastName",
  "keyword": "And "
});
formatter.match({
  "location": "SF.iEnterFirstNameLastName()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I select Birth date 05 - 05 - 2002",
  "keyword": "And "
});
formatter.match({
  "location": "SF.iSelectDate(int,int,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I logout from Salesforce",
  "keyword": "And "
});
formatter.match({
  "location": "SF.iLogoutFromSalesforce()"
});
formatter.result({
  "status": "passed"
});
});
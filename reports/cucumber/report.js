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
  "name": "I click Save button",
  "keyword": "Then "
});
formatter.match({
  "location": "SF.iClickSaveButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify account created successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "SF.verifyAccountCreatedSuccessfully()"
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
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//a[@class\u003d\u0027profile-link-label logout uiOutputURL\u0027]\"}\n  (Session info: chrome\u003d79.0.3945.130)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027EEEPC0636\u0027, ip: \u0027172.16.10.71\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002711.0.5\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 79.0.3945.130, chrome: {chromedriverVersion: 79.0.3945.36 (3582db32b3389..., userDataDir: C:\\Users\\KEDAR~1.LON\\AppDat...}, goog:chromeOptions: {debuggerAddress: localhost:50159}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 2af758e9d90e18ce2bc039510fdc1f54\n*** Element info: {Using\u003dxpath, value\u003d//a[@class\u003d\u0027profile-link-label logout uiOutputURL\u0027]}\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:490)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat stepdefinition.SF.iLogoutFromSalesforce(SF.java:61)\r\n\tat ✽.I logout from Salesforce(file:src/test/java/features/Patient.feature:21)\r\n",
  "status": "failed"
});
});
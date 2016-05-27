$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Simple.feature");
formatter.feature({
  "line": 1,
  "name": "Login Functionality",
  "description": "",
  "id": "login-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "User should be able login to app",
  "description": "",
  "id": "login-functionality;user-should-be-able-login-to-app",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@Reg"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "The application is launched and available",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "User login to the app with username and password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Verify the user login with failed",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.the_application_is_launched_and_available()"
});
formatter.result({
  "duration": 7060591463,
  "status": "passed"
});
formatter.match({
  "location": "Steps.user_login_to_the_app_with_username_and_password()"
});
formatter.result({
  "duration": 1135888156,
  "status": "passed"
});
formatter.match({
  "location": "Steps.verify_the_user_login_failed()"
});
formatter.result({
  "duration": 634818851,
  "status": "passed"
});
});
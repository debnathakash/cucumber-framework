$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("createContact.feature");
formatter.feature({
  "line": 2,
  "name": "Create new contact",
  "description": "",
  "id": "create-new-contact",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@tag"
    }
  ]
});
formatter.background({
  "line": 4,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 5,
  "name": "user opens correct browser",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user gives proper URL",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user gives username and password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "user is logged in successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateNewContact.user_opens_correct_browser()"
});
formatter.result({
  "duration": 5094010500,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewContact.user_gives_proper_URL()"
});
formatter.result({
  "duration": 4817427300,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewContact.user_gives_username_and_password()"
});
formatter.result({
  "duration": 6099273100,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewContact.User_clicks_on_login_button()"
});
formatter.result({
  "duration": 2110983300,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewContact.user_is_logged_in_successfully()"
});
formatter.result({
  "duration": 2208972200,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "user should be able to create new contact",
  "description": "",
  "id": "create-new-contact;user-should-be-able-to-create-new-contact",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 15,
  "name": "user click on contact",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "new button should be displayed",
  "keyword": "Then "
});
formatter.step({
  "line": 17,
  "name": "user enters all the required fields",
  "rows": [
    {
      "cells": [
        "Elston",
        "Desa",
        "Diago",
        "elston.diago@corp.com",
        "Co-Operator"
      ],
      "line": 19
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 20,
  "name": "user clicks on save button",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "contact should be saved successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "CreateNewContact.user_click_on_contact()"
});
formatter.result({
  "duration": 163078200,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewContact.new_button_should_be_displayed()"
});
formatter.result({
  "duration": 5604131500,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewContact.user_enters_all_the_required_fields(DataTable)"
});
formatter.result({
  "duration": 12946479200,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewContact.user_clicks_on_save_button()"
});
formatter.result({
  "duration": 3527826500,
  "status": "passed"
});
formatter.match({
  "location": "CreateNewContact.contact_should_be_saved_successfully()"
});
formatter.result({
  "duration": 121256600,
  "status": "passed"
});
formatter.after({
  "duration": 672688900,
  "status": "passed"
});
});
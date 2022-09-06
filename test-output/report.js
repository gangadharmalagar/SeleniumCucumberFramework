$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/OrangeHRM.feature");
formatter.feature({
  "name": "OrangeHRM Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login to OrangeHRM homepage",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I launch chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "OrangeHRMsteps.i_launch_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I open orange hrm homepage",
  "keyword": "When "
});
formatter.match({
  "location": "OrangeHRMsteps.i_open_orange_hrm_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter username as \"Admin\"",
  "keyword": "Then "
});
formatter.match({
  "location": "OrangeHRMsteps.enter_username_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Enter password as \"admin123\"",
  "keyword": "Then "
});
formatter.match({
  "location": "OrangeHRMsteps.enter_password_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "OrangeHRMsteps.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify homepage title as \"OrangeHRM\"",
  "keyword": "Then "
});
formatter.match({
  "location": "OrangeHRMsteps.verify_homepage_title_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close browser",
  "keyword": "And "
});
formatter.match({
  "location": "OrangeHRMsteps.close_browser()"
});
formatter.result({
  "status": "passed"
});
});
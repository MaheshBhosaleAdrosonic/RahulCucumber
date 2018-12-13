$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("feature/MultiplePassing.feature");
formatter.feature({
  "line": 1,
  "name": "Shopping Homepage",
  "description": "This feature verifies the functionality on Shopping Homepage",
  "id": "shopping-homepage",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "Login to application",
  "description": "",
  "id": "shopping-homepage;login-to-application",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I open my application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I login with the following data",
  "rows": [
    {
      "cells": [
        "UserName",
        "Password"
      ],
      "line": 7
    },
    {
      "cells": [
        "btest@gmail.com",
        "Btest@123"
      ],
      "line": 8
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "Check home page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefAutomationPractice.i_open_my_application()"
});
formatter.result({
  "duration": 15542008920,
  "status": "passed"
});
formatter.match({
  "location": "StepDefAutomationPractice.i_login_with_the_following_data(DataTable)"
});
formatter.result({
  "duration": 9510058792,
  "status": "passed"
});
formatter.match({
  "location": "StepDefAutomationPractice.check_home_page_is_displayed()"
});
formatter.result({
  "duration": 94586,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "",
  "description": "",
  "id": "shopping-homepage;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "product Is Displayed",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "product Add Into Cart as \"Printed Dress\"",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "Check Product Added Into Cart",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefAutomationPractice.product_Is_Displayed()"
});
formatter.result({
  "duration": 103840,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Printed Dress",
      "offset": 26
    }
  ],
  "location": "StepDefAutomationPractice.product_Add_Into_Cart_as(String)"
});
formatter.result({
  "duration": 24435332000,
  "status": "passed"
});
formatter.match({
  "location": "StepDefAutomationPractice.check_Product_Added_Into_Cart()"
});
formatter.result({
  "duration": 14877180690,
  "status": "passed"
});
});
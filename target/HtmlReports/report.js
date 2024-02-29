$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/01_AccountCreation.feature");
formatter.feature({
  "name": "To validate Account Creation Feature in Facebook",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Feature1"
    }
  ]
});
formatter.scenario({
  "name": "To create account with email in Fb application",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Feature1"
    },
    {
      "name": "@Sanity"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To launch Url in browser",
  "keyword": "When "
});
formatter.match({
  "location": "AccountCreation.to_launch_Url_in_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click Create New Account Button",
  "keyword": "And "
});
formatter.match({
  "location": "AccountCreation.to_click_Create_New_Account_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass first name in Firstname field",
  "rows": [
    {
      "cells": [
        "Java",
        "Selenium",
        "Cucumber"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "AccountCreation.to_pass_first_name_in_Firstname_field(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass last name in Surname field",
  "rows": [
    {
      "cells": [
        "java@123",
        "5676543",
        "Cucumber@846"
      ]
    },
    {
      "cells": [
        "876545",
        "sql9346",
        "3456776"
      ]
    },
    {
      "cells": [
        "Framework@466",
        "8765423",
        "Maven@645"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "AccountCreation.to_pass_last_name_in_Surname_field(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass email in email or mobile field",
  "keyword": "And "
});
formatter.match({
  "location": "AccountCreation.to_pass_email_in_email_or_mobile_field()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To Select your Date of bearth",
  "keyword": "And "
});
formatter.match({
  "location": "AccountCreation.to_Select_your_Date_of_bearth()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To create account with phone number in Fb application",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Feature1"
    },
    {
      "name": "@Scenario2"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To launch Fb url in Chrome",
  "keyword": "When "
});
formatter.match({
  "location": "AccCreUsingPhone.to_launch_Fb_url_in_Chrome()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click Cre New Acc Button",
  "keyword": "And "
});
formatter.match({
  "location": "AccCreUsingPhone.to_click_Cre_New_Acc_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass first name in Firstname text box",
  "rows": [
    {
      "cells": [
        "Firstname One",
        "Sathish"
      ]
    },
    {
      "cells": [
        "Firstname Two",
        "Kumaresh"
      ]
    },
    {
      "cells": [
        "Firstname Three",
        "Java"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "AccCreUsingPhone.to_pass_first_name_in_Firstname_text_box(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass last name in Surname text box",
  "rows": [
    {
      "cells": [
        "Lastname One",
        "Lastname Two",
        "Lastname Three"
      ]
    },
    {
      "cells": [
        "S",
        "K",
        "B"
      ]
    },
    {
      "cells": [
        "B",
        "R",
        "Y"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({
  "location": "AccCreUsingPhone.to_pass_last_name_in_Surname_text_box(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass phone number in email or mobile field",
  "keyword": "And "
});
formatter.match({
  "location": "AccCreUsingPhone.to_pass_phone_number_in_email_or_mobile_field()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:src/test/resources/02_FacebookLogin.feature");
formatter.feature({
  "name": "To validate login feature in FB application",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Feature2"
    }
  ]
});
formatter.scenario({
  "name": "To validate login feature with valid username valid password",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Feature2"
    },
    {
      "name": "@Smoke"
    },
    {
      "name": "@Scenario3"
    },
    {
      "name": "@Login"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To launch FB application in edge browser",
  "keyword": "When "
});
formatter.match({
  "location": "FBLoginFunctionality.to_launch_FB_application_in_edge_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass valid email into email text box",
  "keyword": "And "
});
formatter.match({
  "location": "FBLoginFunctionality.to_pass_valid_email_into_email_text_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass valid password into password text box",
  "keyword": "And "
});
formatter.match({
  "location": "FBLoginFunctionality.to_pass_valid_password_into_password_text_box()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To click login button",
  "keyword": "And "
});
formatter.match({
  "location": "FBLoginFunctionality.to_click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To verify it should navigate to home page or error page",
  "keyword": "And "
});
formatter.match({
  "location": "FBLoginFunctionality.to_verify_it_should_navigate_to_home_page_or_error_page()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "To validate positive and negative comibation TestCase",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Regression"
    },
    {
      "name": "@Scenario4"
    },
    {
      "name": "@Sanity"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.step({
  "name": "To launch url of the application",
  "keyword": "When "
});
formatter.step({
  "name": "To pass positive and negative \"\u003cemaildata\u003e\" data to email field",
  "keyword": "When "
});
formatter.step({
  "name": "To pass positive \"\u003cpassworddata\u003e\" and negative data to password field",
  "keyword": "And "
});
formatter.step({
  "name": "Click login button",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "emaildata",
        "passworddata"
      ]
    },
    {
      "cells": [
        "java@gmail.com",
        "Java@123"
      ]
    },
    {
      "cells": [
        "cucumber@gmail.com",
        "Cucumber@123"
      ]
    },
    {
      "cells": [
        "selenium@gmail.com",
        "Selenium@123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To validate positive and negative comibation TestCase",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Feature2"
    },
    {
      "name": "@Regression"
    },
    {
      "name": "@Scenario4"
    },
    {
      "name": "@Sanity"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To launch url of the application",
  "keyword": "When "
});
formatter.match({
  "location": "PositiveAndNegativeTestCase.to_launch_url_of_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass positive and negative \"java@gmail.com\" data to email field",
  "keyword": "When "
});
formatter.match({
  "location": "PositiveAndNegativeTestCase.to_pass_positive_and_negative_data_to_email_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass positive \"Java@123\" and negative data to password field",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegativeTestCase.to_pass_positive_and_negative_data_to_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click login button",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegativeTestCase.click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate positive and negative comibation TestCase",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Feature2"
    },
    {
      "name": "@Regression"
    },
    {
      "name": "@Scenario4"
    },
    {
      "name": "@Sanity"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To launch url of the application",
  "keyword": "When "
});
formatter.match({
  "location": "PositiveAndNegativeTestCase.to_launch_url_of_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass positive and negative \"cucumber@gmail.com\" data to email field",
  "keyword": "When "
});
formatter.match({
  "location": "PositiveAndNegativeTestCase.to_pass_positive_and_negative_data_to_email_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass positive \"Cucumber@123\" and negative data to password field",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegativeTestCase.to_pass_positive_and_negative_data_to_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click login button",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegativeTestCase.click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "To validate positive and negative comibation TestCase",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Feature2"
    },
    {
      "name": "@Regression"
    },
    {
      "name": "@Scenario4"
    },
    {
      "name": "@Sanity"
    },
    {
      "name": "@Smoke"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "To launch url of the application",
  "keyword": "When "
});
formatter.match({
  "location": "PositiveAndNegativeTestCase.to_launch_url_of_the_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass positive and negative \"selenium@gmail.com\" data to email field",
  "keyword": "When "
});
formatter.match({
  "location": "PositiveAndNegativeTestCase.to_pass_positive_and_negative_data_to_email_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "To pass positive \"Selenium@123\" and negative data to password field",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegativeTestCase.to_pass_positive_and_negative_data_to_password_field(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click login button",
  "keyword": "And "
});
formatter.match({
  "location": "PositiveAndNegativeTestCase.click_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});
@Feature1
Feature: To validate Account Creation Feature in Facebook

	@Sanity
  Scenario: To create account with email in Fb application
    When To launch Url in browser
    And To click Create New Account Button
    
    # One Dimentional List Data
    And To pass first name in Firstname field
      | Java | Selenium | Cucumber |
      
    # Two Dimentional List Data
    And To pass last name in Surname field
      | java@123      | 5676543 | Cucumber@846 |
      |        876545 | sql9346 |      3456776 |
      | Framework@466 | 8765423 | Maven@645    |
      
    And To pass email in email or mobile field
    And To Select your Date of bearth




	@Scenario2
  Scenario: To create account with phone number in Fb application
    When To launch Fb url in Chrome
    And To click Cre New Acc Button
    
    # One Dimentional List Map
    And To pass first name in Firstname text box
      | Firstname One   | Sathish  |
      | Firstname Two   | Kumaresh |
      | Firstname Three | Java     |
      
    # Two Dimentional List Map
    And To pass last name in Surname text box
      | Lastname One | Lastname Two | Lastname Three |
      | S            | K            | B              |
      | B            | R            | Y              |
      
    And To pass phone number in email or mobile field

    
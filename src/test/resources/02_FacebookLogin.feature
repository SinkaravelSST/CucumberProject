@Feature2
Feature: To validate login feature in FB application

	@Smoke @Scenario3 @Login
  Scenario: To validate login feature with valid username valid password
    When To launch FB application in edge browser
    And To pass valid email into email text box
    And To pass valid password into password text box
    And To click login button
    And To verify it should navigate to home page or error page
    
  @Regression @Scenario4 @Sanity @Smoke
  Scenario Outline: To validate positive and negative comibation TestCase
    When To launch url of the application
    When To pass positive and negative "<emaildata>" data to email field 
    And To pass positive "<passworddata>" and negative data to password field
    And Click login button

    Examples: 
      | emaildata          | passworddata |
      | java@gmail.com     | Java@123     |
      | cucumber@gmail.com | Cucumber@123 |
      | selenium@gmail.com | Selenium@123 |
      
      

      
      
      

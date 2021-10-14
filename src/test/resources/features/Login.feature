Feature: Login into Amazon.com

  @smoke
  Scenario: user login
    When user goes to a login page by clicking Sign-In
    And user enters valid e-mail or phone number
    And user clicks on Continue button
    And user enters correct password
    And user clicks on login button
    Then user is successfully logged in
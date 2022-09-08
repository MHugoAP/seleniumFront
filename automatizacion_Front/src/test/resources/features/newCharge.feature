Feature: Enter position
  As QA Automation
  I want to enter a charge
  To update the profile

  Background: Login with the correct data
    Given enter the portal Linkedin
    When enter the username and password
      | user                | password   |
      | qacuenta0@GMAIL.COM | mentorship |


  Scenario: Register a new charge
    When Add the new job
    Then I should see in the profile
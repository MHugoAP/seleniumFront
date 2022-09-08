Feature: Login
  As AQ Automation
  I want to login
  To validate the web response

  Scenario: Successful Login

    Given enter the portal Linkedin
    When enter the username and password
      | user                | password   |
      | qacuenta0@GMAIL.COM | mentorship |
    Then will enter the web already with the user Welcome, cuenta!
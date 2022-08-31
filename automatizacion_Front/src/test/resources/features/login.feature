Feature: Login
  As AQ Automation
  I want to login
  To validate the web response

  Scenario: Successful Login

    Given enter the portal Linkedin
    When enter the data
      | user             | password |
      | miguel@gmail.com | 123123   |
    Then will enter the web already with the user
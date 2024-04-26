Feature: Use background and rules

  Rule: rule 1
  Background:
    Given открыть браузер
    * страница логина открыта

  Scenario: scenarion 1
    When user "standard_user" with password "secret_sauce" log in
    Then title is "Products"
    And all elemnts "are not" visible


  Scenario: scenarion 2
    When user "standard_user" with password "secret_sauce" log in
    Then title is "Products"
    And all elemnts "are not" visible
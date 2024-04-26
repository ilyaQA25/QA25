Feature: Validation login funct-ty

  Scenario: Successful
    Given open browser
    * open login page
    When user "standard_user" with password "secret_sauce" log in
    * user clicks login button
    Then inventory page is displayed

  Scenario: Wrong username
    Given open browser
    * open login page
    When user "standard_user" with password "sadase" log in
    * user clicks login button
    Then error "wrong psw" is displayed

  Scenario: Wrong password
    Given open browser
    * open login page
    When user "standard_user" with password "sadase" log in
    * user clicks login button
    Then error "wrong psw" is displayed



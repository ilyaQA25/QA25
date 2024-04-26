Feature: Параметризированные тесты

  Scenario: Параметризация степов
    Given открыть браузер
    * страница логина открыта
    When user "standard_user" with password "secret_sauce" log in
    Then title is "Products"
    And all elemnts "are not" visible


  Scenario Outline: Параметризация степов при помощи таблицы значений
    Given открыть браузер
    * страница логина открыта
    When user "<username>" with password "<password>" log in
    Then title is "Products"
    Examples:
      | username | password |
      | standard_user | secret_sauce |
      | visual_user | secret_sauce |


  Scenario: Параметризация шага с большим количеством данных
    Given открыть браузер
    * страница логина открыта
    When user log in with
      | username | password |
      | standard_user | secret_sauce |
      | visual_user | secret_sauce |
    Then title is "Products"
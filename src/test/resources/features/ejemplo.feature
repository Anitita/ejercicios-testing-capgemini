Feature: Calculadora
  Pruebas con una calculadora

  Background: User is Logged In
    Given I navigate to the login page
    When I submit username and password
    Then I should be logged in

  Scenario:
    Given Tengo un objeto de la calcuradora
    When hago una suma de 2 y 3
    Then el resultado es 5
  Scenario:
    Given Tengo un objeto de la calcuradora
    When hago una suma de 1 y 1
    Then el resultado es 2

  Scenario Outline:
    Given Tengo un objeto de la calcuradora
    When hago una suma de <num1> y <num2>
    Then el resultado es <total>


    Examples:
      | num1 | num2 | total |
      | -2   | 3    | 1     |
      | 10   | 15   | 25    |
      | 99   | -99  | 0     |
      | -1   | -10  | -11   |
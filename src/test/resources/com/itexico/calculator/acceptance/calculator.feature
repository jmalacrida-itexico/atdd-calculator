Feature: Sum functionality
  As a user
  I want to sum two numbers
  in order to know the result

  Scenario: sum two positive numbers
    Given: a basic calculator
    When: the user sums 4 plus 5
    Then: the result is 9

  Scenario: sum two negative numbers
    Given: a basic calculator
    When: the user sums -3 plus -2
    Then: the result is -1

  Scenario: sum one positive number and zero
    Given: a basic calculator
    When: the sums 8 plus 0
    Then: the result is 8
Feature: Addition functionality
  As a user
  I want to sum two numbers
  in order to know the result
# Gherkin
  Scenario: sum two positive numbers
    Given a basic calculator
    When the user sums 4 plus 5
    Then the result is 9

  Scenario: sum two negative numbers
    Given a basic calculator
    When the user sums -3 plus -2
    Then the result is -5

  Scenario: sum one positive number and zero
    Given a basic calculator
    When the user sums 8 plus 0
    Then the result is 8
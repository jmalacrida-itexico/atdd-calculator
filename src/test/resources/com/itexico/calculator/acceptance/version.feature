Feature: the version can be retrieved
  Scenario: user makes call to GET /version
    When the user calls "/version"
    Then the user receives status code of 200
    And the user receives server version 1.1

  Scenario: user makes call to GET /adadf
    When the user calls "/adadf"
    Then the user receives status code of 404
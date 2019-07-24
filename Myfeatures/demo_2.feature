Feature: Test me parameterizartion

  Scenario Outline: Test me login for mulitiple user
    Given I am launching the test me application
    And I click on sign in link
    When I provide username "<Uname>"
    And I provide password "<Pass>"
    Then I click on login and verify login status

    Examples: 
      | Uname   | Pass        |
      | Lalitha | password123 |
			| kilam10 | kilam10     |
			| elina69 | elina69     |

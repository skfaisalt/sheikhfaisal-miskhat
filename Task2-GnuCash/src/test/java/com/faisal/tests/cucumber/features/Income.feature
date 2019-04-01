Feature: Account of Incomes

  @medium-prio
  Scenario: User can view the Income account
    Given I am in the Accounts view
    When I tap on the Income account
    Then I should reach the Income account view

  @high-prio
  Scenario: User can add an income
    Given I have launched the GnuCash app
    When I tap on the Income account
    And I add a Bonus amount income of 10 euros for Year 2019
    And I save the record
    Then I should see the Bonus amount updated under the Income view


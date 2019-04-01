Feature: Account of Expenses

  @medium-prio
  Scenario: User can view the Expenses account
    Given I am in the Accounts view
    When I tap on the Expenses account
    Then I should reach the Expenses account view

  @high-prio
  Scenario: User can add an Expense
    Given I tap on the Expenses account
    When I add an Expense amount of 5 euros on Auto fuel
    And I save the record
    Then I should see the Expense acccount updated on Auto
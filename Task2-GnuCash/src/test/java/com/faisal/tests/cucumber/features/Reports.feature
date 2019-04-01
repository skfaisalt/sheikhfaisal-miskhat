Feature: View report on existing transactions.

  @high-prio
  Scenario: User can view an accurate report
    Given I tap on the Expenses account
    When I add an Expense amount of 100 euros on Auto fuel
    And I save the record
    When I launch the Reports view
    Then I should see the report fields
    And the expense report values should be accurate

#  @high-prio
#  Scenario: User Expense Report is calculated accurately
#    When I launch the Reports view
#    Then the expense report values should be accurate
Feature: Accounts - Basic Operations


  @medium-prio
  Scenario: User is presented with the Accounts view after app configuration
    When I launch the GnuCash app
    Then the Accounts view is shown

  @medium-prio
  Scenario: User can view all default accounts in the Accounts page
    Given I have launched the GnuCash app
    When I am in the Accounts view
    Then the Accounts view should list all the default accounts

  @high-prio
  Scenario: User can add an account
    Given I am in the Accounts view
    When I add an account titled Personal with description My Personal Account
    Then the account titled Personal should be added under Accounts

  @medium-prio
  Scenario: User can search an account
    Given I am in the Accounts view
    When I search for the Liabilities account via Search
    Then I should see the account titled Liabilities listed under the search result

  @high-prio
  Scenario: User can navigate to an account
    Given I am in the Accounts view
    When I tap on the Expenses account
    Then I should reach the Expenses account view






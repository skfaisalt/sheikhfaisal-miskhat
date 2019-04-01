Feature: Fresh Launch of Application

  @fresh-launch
  Scenario: Finish app configuration wizard on fresh launch
    When I finish the app configuration wizard
    Then I should see the What's new dialog
    And I can dismiss the What's new dialog

  @fresh-launch
  Scenario: Dismiss What's New Dialog upon finishing configuration wizard.
    Given I can dismiss the What's new dialog
    When I dismiss the What's new dialog
    Then I can see that the app is launched

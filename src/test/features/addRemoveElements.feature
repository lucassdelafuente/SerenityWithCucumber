Feature: "Add Remove elements"

  Scenario: "Add Elements"
    Given I'm guest user
    When I go to the add elements page
    And I add an element
    Then I should see a new Delete button

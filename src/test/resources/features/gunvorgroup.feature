@wip
Feature: Gunvor Group main page

  Background:
    Given user is on the main page

  Scenario Outline: Navigating through the navigation bar
    When user hovers over "<Header>"
    And user clicks "<Subheader>"
    Then user verifies that they are on the "<Subheader>"

    Examples:
      | Header       | Subheader         |
      | Who We Are   | A Global Business |
      | Trading      | Bulk Materials    |
      | Our Approach | Compliance        |
      | Our Assets   | Refineries        |
      | Who We Are   | Leadership        |

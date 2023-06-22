Feature: Choosing different font sizes
  As a user, I can edit font size and write a text

  @wip
  Scenario: The minimum font size verification

    Given user is on the dashboard
    When user clicks "texte"
    And user clicks the font size and chooses 8
    Then user types "text" on the page and verifies that the font size 8


  Scenario: The minimum font size verification

    Given user is on the dashboard
    When user clicks "texte"
    Then user clicks the font size and chooses the number and types "text" on the page and verifies the font size
      | 8  |
      | 72 |





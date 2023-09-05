Feature: Opening wikipedia



  Scenario: Wikipedia research

    Given user is on google main page
    When user types "wikipedia" on search bar and presses enter
    And user clicks the first link
    And user types "Steve Jobs" in search bar
    Then user verifies the title of the page is "Steve Jobs"








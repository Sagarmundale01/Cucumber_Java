Feature: feature to test google search functionality

  Scenario: validate google seearch is working
    Given browser is open
    And user is on google search page
    When user enters a text in search box
    And hit enter
    Then user is navigate to search results

Feature: validate the google search engine
  Scenario: Search in google
    Given the user open the URL "https://www.google.com/"
    When the user search "Home" in google
    Then the user should see "Home" in the result
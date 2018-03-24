Feature: Search
  Google search

  Scenario: Search for www.seleniumhq.org website
    Given I go to www.google.com
    When I type "Seleniumhq" in the searchbox
    And I press ENTER in the searchbox
    And I click on Selenium HQ link
    Then I'm on Selenium HQ Page
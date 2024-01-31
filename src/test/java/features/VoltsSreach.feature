Feature: Search Functionality on Voltas Application Homepage

  Scenario Outline: Searching for a Assert Profile using the search bar
    Given I am on the Voltas application homepage
    When I enter "<EnterValues>" in the search bar and press Enter
    Then I should see search results related to "<EnterValues>"
    Examples:
    |EnterValues|
    |Printer Cum Scanner|
    |111|
    |new|
    |45ght|
    

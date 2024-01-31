
Feature: Homepage Dropdown Functionality
  As a user
  I want to interact with the dropdown menu
  So that I can select different options

  Scenario: Dropdown displays correct options
    Given I am on the homepage
    When I view the dropdown menu
    Then the dropdown should contain the following options:
    
      |  10 |
      |  25 |
      |  50 |
      |  100|

  Scenario: Selecting an option from the dropdown
    Given I am on the homepage
    When I select "25" from the dropdown menu
   # Then the page should display content related to "<25>"






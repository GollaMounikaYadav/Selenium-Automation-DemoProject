Feature: Search of various product categories should be possible along with product search



Scenario: User should be able to sreach for the products under books categary
 Given I visit the website as a guest user
 When I select the books option from the search dropdown
 And I click on search icon option
 Then I should see the page having heading as Amazon Best Reads is getting displayed
 But I should not see the other category products
 
 Scenario: User should be able to sreach for the products under baby categary
 Given I visit the website as a guest user
 When I select the baby option from the search dropdown
 And I click on search icon option
 Then I should see the page having heading as offers on baby products is getting displayed
 But I should not see the other category products
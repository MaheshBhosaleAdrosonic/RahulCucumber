Feature: Data Driven Tests
This feature covers different examples of data driven testing in Cucumber
 
Scenario: Perform search operation on Google Homepage
Given I launch Chrome browser
When I open Google Homepage
Then I search for "weather tomorrow" on Google
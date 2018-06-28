Feature: Bulk Customer Upload
This feature verifies current customers data upload using excel

Scenario: Upload customers from valid excel
Given I have valid excel
When I upload in customer onboarding application
Then I verify all customers are uploaded successfully

Scenario: Upload customers from malformed excel
Given I have malformed excel
When I upload in customer onboarding application
Then I verify that error message displayed
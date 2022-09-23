#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: TC001
  

  @tag1
  Scenario: TC001_filling_form
    Given Open the browser and enter the ANZurl
    When Click on single button in application type 
    And Select zero in Number of dependants dropdown
    And Click on  Home to live button in Property you would like to buy
    And Enter anual income as 80000
    And enter the anual other income 10000
    And Enter monthly living expenses 500
    And Enter Current home loan monthly repayments as 0
    And Enter Other loan monthly repayments as 100
    And Enter Other monthly commitments as 0
    And Enter Total credit card limits as 10000 
    And Click on Work out how much i could borrow button 
    And Verify the outcomes estimate as $479000

 		When Click on start over Button 
 		And verify the form is cleared
 		
 		When Enter the Monthly living expenses as 1 and all the field as zero
 		And Click on the Work out how much i could borrow button 
 		Then verify the Message
 		

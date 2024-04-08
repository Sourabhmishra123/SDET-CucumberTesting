
@tag
Feature: Practice Feature 
  @Smoke
  Scenario: To validate checkboxes functionalities
    Given user open the browser and enters url
    And textbox should be enabled	
    When user enters text in firstname,lastname,email,contact,message
    And user clicks on submit button
    Then An alert should be displayed
    And click on alert
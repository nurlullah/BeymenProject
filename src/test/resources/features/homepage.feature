Feature: HomePage related features
  Background:
    Given user goes to URL
    Then verify the page title contains BEYMEN


  @us01_tc01
  Scenario: TC01 User_is_looking_for_a_clothe
    When user click on searchbox
    And user types sort on searchbox
    And user delete the word on the searchbox
    And user types gomlek on searchbox
    And user do enter for the research
    And user choose a random product from selection
    Then user verify that he is on the product page
    When user select a size
    And user store informations on a file
    And user clicks on add to bag button
    Then user verify that process is successful
    When user clicks on the bag
    Then user verify the price of the product in the bag
    When user upgrade the count of product
    Then verify if there are two items in the bag
    When clear the items on the bag
    Then verify that the bag is empty
Feature: HomePage related features
  Background:
    Given user goes to URL
    Then verify the page title contains BEYMEN


  @us01_tc01
  Scenario: TC01 User_is_looking_for_a_clothe
    And user click on searchbox
    Then user types sort on searchbox
    Then user delete the word on the searchbox
    Then user types gomlek on searchbox
    Then user do enter for the research
    Then user choose a random product from selection
    And user verify that he is on the product page
    And user select a size
    And user store informations on a file
    Then user clicks on add to bag button
    Then user verify that process is successful
    Then user clicks on the bag
    Then user verify the price of the product in the bag
    Then user upgrade the count of product
    Then verify if there are two items in the bag
    And clear the items on the bag
    Then verify that the bag is empty
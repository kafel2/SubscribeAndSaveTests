Feature: Best Sellers in Subscribe

  @smoke
  Scenario: Best Sellers in Subscribe & Save configuration during shopping
    When user logged in the system
    And user goes to catalog and chooses some product
    Then subscription is available in a price section

  @smoke
  Scenario: Best Sellers in Subscribe & Save (Set up) Shopping Cart verification
    When user logged in the system
    And user goes to catalog and chooses some product
    Then user clicks on subscribe and save in a price section
    And user clicks on set up now
    And user goes to cart
    And qty of ordered product is correct
    And delivery frequency is correct










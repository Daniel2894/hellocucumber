Feature: Buy a T-Shirt
  The user wants to know if a T-Shirt was successfully buyed.

  Scenario: Buy a T-Shirt
    Given that the user is on T-Shirt catalogue
    When the user adds a T-Shirt to the cart
    And the user pays for the T-Shirt
    Then the user should see the message "Your order on My Store is complete."

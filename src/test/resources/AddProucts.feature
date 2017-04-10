Feature: Add Products

  @test
  Scenario: User should be able to add products
    Given I am able to login to etsy
    When I add required values
    Then I should be able to add products

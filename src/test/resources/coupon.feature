Feature: Coupon Center

  Scenario Outline: Login into Payback and Activate Coupon
    #Given login into app using username as <userid> and password as <password>
    Given launch existing login app
    Then User should navigate to the home page
    When User click on coupon
    Then User should navigate to coupon filter page
    And User click on filter button
    Then User should see all available coupons
    And User filter coupon by REWE
    Then User should see that coupon with activate button
    And User click on activate coupon button
    Then User should see that coupon is activated

    Examples:
      |       userid       |   password    |
      |XXXXXXXXXX          |XXXXXXXXXXXXXX |

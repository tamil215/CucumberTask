#Author: your.email@your.domain.com
@Tv @smoke
Feature: Tv Validation

  Background: 
    Given User launches flipkart application
    And User handles login
    
     Scenario: Tv Validation scenario
      When User search Tv 
      And User select the Tv and click add to cart
      And User doing the payment
      Then User receive the confirmation message

    Scenario: Tv Validation scenario by using list
    When User search mobile by using oneD list
      | realme |  | LG |  | SAMSUNG |
    And User select the mobile and click add to cart
    And User doing the payment
    Then User receive the confirmation message

  Scenario: Tv Validation scenario by using map
    When User search mobile by using oneD map
      | A | realme  |
      | B | LG  |
      | C | SAMSUNG |
    And User select the Tv and click add to cart
    And User doing the payment
    Then User receive the confirmation message

  Scenario Outline: 
    When User search Tv "<tv>"
    And User select the Tv and click add to cart
    And User doing the payment
    Then User receive the confirmation message

    Examples: 
      | tv   |
      | realme  |
      | LG |
      | SAMSUNG |
    

  
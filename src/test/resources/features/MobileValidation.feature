#Author: your.email@your.domain.com
@Mobile @smoke
Feature: Mobile Validation

  Background: 
    Given User launches flipkart application
    And User handles login

  Scenario: Mobile Validation scenario
    When User search mobile 
    And User select the mobile and click add to cart
    And User doing the payment
    Then User receive the confirmation message

  Scenario: Mobile Validation scenario by using list
    When User search mobile by using oneD list
      | realme |  | iPhone |  | SAMSUNG |
    And User select the mobile and click add to cart
    And User doing the payment
    Then User receive the confirmation message

  Scenario: Mobile Validation scenario by using map
    When User search mobile by using oneD map
      | A | realme  |
      | B | iPhone  |
      | C | SAMSUNG |
    And User select the mobile and click add to cart
    And User doing the payment
    Then User receive the confirmation message

  Scenario Outline: 
    When User search mobile "<Phone>"
    And User select the mobile and click add to cart
    And User doing the payment
    Then User receive the confirmation message

    Examples: 
      | Phone   |
      | realme  |
      | iPhone  |
      | SAMSUNG |

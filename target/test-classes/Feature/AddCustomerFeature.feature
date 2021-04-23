#Author: your.email@your.domain.com
Feature: Add customer

  Scenario: validate add customer unit
    Given user launches telecom application
    And user click on Add customer
    When user filles up the required field
    And user click submit
    Then user verifies customer ID generation

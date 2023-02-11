
@test
Feature:Testing Register | guests could create new account

  Scenario: user could create new account with valid data
    Given user go to register page
    When user enter data "mohamed"&"ahmed" first and last name
    And user enter email and confirm email
    And user enter userName
    And user could check validation
    And user select country and time zone
    And user could enter password and confirm pass "test2025" pass
    And user could enter account detail
    And user click on register button
    Then account register successfully
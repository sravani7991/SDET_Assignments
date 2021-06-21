Feature: We have to register and check the mailverse and need to send a mail

  Scenario Outline: We have to register and check the mailverse and need to send a mail
    Given URL
    When Click on Sign Up
    And Provide details for FirstName "<FirstName>"
    And LastName "<LastName>"
    And Email "<Email>"
    And UserName "<UserName>"
    And Password "<Password>"
    And ConfirmPassword "<Password>"
    Then Register
    When Click on dropdown
    Then Click on Inbox
    And click on Compose
    And Provide the details for Sendto "<Gmail>"
    And Subject "<Subject>"
    And Message "<Message>"
    Then SendMessage
    Then Verify the acknowledgement

    Examples: 
      | FirstName | LastName | Email          | UserName      | Password  | CofirmPassword | Gmail  | Subject | Message |
      | Chinna11  | Varma    | Lasi@gmail.com | Chinna11Vrama | LKJH@1234 | LKJH@1234      | naveen | Test    | Hello   |

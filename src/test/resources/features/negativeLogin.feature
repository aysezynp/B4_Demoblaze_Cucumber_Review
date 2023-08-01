Feature: Login Test-The user should NOT be able to login with invalid credentials

  @nlt
  Scenario Outline:NLT 1
    Given The user is on the login page
    When The user logs in using "<invalidUserName>" and "<invalidPassword>"
    Then Validate that warning message is "<message>"
    Examples:
      | invalidUserName | invalidPassword | message                                |
      | invalidUserName | Test1234        | User does not exist.                   |
      | miky            | invalidPassword | Wrong password.                        |
      | invalidUserName | invalidPassword | User does not exist.                   |
      |                 | Test1234        | Please fill out Username and Password. |
      | miky            |                 | Please fill out Username and Password. |
      |                 |                 | Please fill out Username and Password. |


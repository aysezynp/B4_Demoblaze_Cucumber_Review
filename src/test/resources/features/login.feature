
  Feature: Login Test-The user should be able to login with valid credentials

    @plt1
    Scenario:PLT 1
      Given The user is on the login page
      When The user enters valid credentials
      Then The user verifies welcome miky

    @plt2
    Scenario:PLT 2
      Given The user is on the login page
      When The user logs in using "miky" and "Test1234"
      Then The user verifies "Welcome miky"

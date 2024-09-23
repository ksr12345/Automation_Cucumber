
  Feature: LoggedIn User View

    Scenario: User is able to view after login
      Given User navigates to the login page
      When User successfully enters the login details
      Then User should be able to view the product category page
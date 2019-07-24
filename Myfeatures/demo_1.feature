Feature: My standard chartered bank account

Background: Launching of bank Landing page
Given Sumran is done with browser configs
Then she launches the application in her favourite chrome browser 

Scenario: Sign in for sumran
Given She clicks on sign in link
Then She enters the valid credentials
And She clicks on submit button

Scenario: Signup for guest user
Given guest user clicks on signup link
When She provides all the mandatory data
Then She clicks on submit and id is generated

Scenario: Sumran wants to reset her password
Given she clicks on forgot password link
Then she enters the mobile number
And she receives an otp and the same she provides


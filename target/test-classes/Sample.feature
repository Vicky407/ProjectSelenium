Feature: To validate the login functionality of flipkart application

Scenario: To validate login with valid mailid
Given To launch the chrome browser and maximise window
When To launch the url of the flipkart application
And To pass valid mailid in login feild
And To click the request otp button
And To check whether navigate to the home page or not
Then To close the browser

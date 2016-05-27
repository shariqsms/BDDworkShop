Feature: Login Functionality

@Smoke
Scenario Outline: User should be able login to app
Given The application is launched and available
When User login to the app with <username> and <password>  
Then Verify the user login with <status>

Examples:
    | username  	| password     | status  |
    | Demo 				| kumar.vastav | failed  |
    | kumar.vastav| testing 		 | failed  |
    | kumarvastav | Turtle.12 	 | success |

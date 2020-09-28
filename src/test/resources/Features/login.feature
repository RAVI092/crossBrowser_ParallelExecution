Feature: FlipKart login validation 
Background: 
	Given User is at login page 

Scenario Outline: login with valid data 
	When he enters the valid user name <"u_name"> and password <"pass"> 
	And click the sign-in button 
	Then Verify that he is logged in 
	
	Examples: 
		|u_name|pass|
		|62656|322665|
		
		
		Scenario: login with in-valid data 
			When he enters the in-valid user name <"u-name"> and password <"pass"> 
			And click the sign-in button 
			Then Verify that he is logged in 

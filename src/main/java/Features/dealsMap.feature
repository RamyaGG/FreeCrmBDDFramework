Feature: Deal data creation 

Scenario: Free CRM create a new deal scenario 

	Given user is already on login Page 
	When title of the login Page is Free CRM 
	Then user enters username and password 
		| username | password |
		| RamyaGG  |Framya28! |
	Then user clicks on login button 
	Then user is on home page 
	Then user moves to new deal page 
	Then user enters deal details 
		| title      | amount | probability | commission |
		| test deal1 | 100   | 50 | 10 |
		| test deal2 | 200   | 60 | 20 |
		| test deal3 | 300   | 70 | 30 |
	Then close the browser 

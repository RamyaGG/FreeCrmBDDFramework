Feature: Free CRM Create Contacts Feature 

Scenario Outline: Free CRM create a new Contact scenario 

	Given user is already on login Page 
	When title of the login Page is Free CRM 
	Then user enters "<username>" and "<password>" 
	Then user clicks on login button 
	Then user is on home page 
	Then user moves to new contact page 
	Then user enters contact details "<firstname>" and "<lastname>" and "<position>" 
	Then close the browser 
	
	Examples: 
		| username | password | firstname | lastname | position |
		| naveenk  | test@123 | Tom       | peter    | Manager  |
		| naveenk  | test@123 | David     | Dsouza   | Diractor |

		
		
		
		
		
		
		
		
		
		
		
		
		

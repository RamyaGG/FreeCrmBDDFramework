Feature: Test Tagged Hooks 
#Tagged hooks : if we want execute any pre condition for the specific scenario we can use like @Before("@First") 

@First 
Scenario: This is First test
	Given this is the first step 
	When this is the second step 
	Then this is the third step 
	
@Second 
Scenario: This is Second test
	Given this is the first step 
	When this is the second step 
	Then this is the third step 
	
@Third 
Scenario: This is Third test
	Given this is the first step 
	When this is the second step 
	Then this is the third step 
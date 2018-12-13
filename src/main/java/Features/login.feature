Feature: Free CRM Login Feature

# How to achieve data driven approach Without Examples Keyword

#Scenario: Free CRM login Test Scenario
#
#Given user is already on login Page 
#When title of the login Page is Free CRM
#Then user enters "naveenk" and "test@123" 
#Then user clicks on login button
#Then user is on home page 
#Then close the browser



# How to achieve data driven approach With Examples Keyword
# With Examples keyword we have to use Scenario Outline. Without Examples we have to use Scenario
# INT diffe b/w Scenario and Scenario Outline
# Whenever we have to use Data driven approach with examples keyword our scenario will become scenario outline
# Then user enters "<username>" and "<password>" this line is parameterized. with two sets of data so it will execute two times

Scenario Outline: Free CRM login Test Scenario

Given user is already on login Page 
When title of the login Page is Free CRM
Then user enters "<username>" and "<password>"  
Then user clicks on login button
Then user is on home page 
Then close the browser

Examples: 
      | username | password |
      | naveenk  | test@123 |
      | tom      | test@456 |









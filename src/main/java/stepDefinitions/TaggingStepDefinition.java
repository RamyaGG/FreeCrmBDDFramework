package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;

/*How to run Cucumber Tests in Groups with Cucumber Tags
How to ignore Cucumber Tests
Logically ANDing and ORing Tags

Cucumber has already provided a way to organize your scenario execution by using tags in feature file. We can define each scenario with a useful tag. Later, in the runner file, we can decide which specific tag (and so as the scenario(s)) we want Cucumber to execute. 

Tag starts with “@”. After “@” you can have any relevant text to define your tag like @SmokeTests just above the scenarios you like to mark. Then to target these tagged scenarios just specify the tags names in the CucumberOptions as tags = {“@SmokeTests”}.

Tagging not just specifically works with Scenarios, it also works with Features. Means you can also tag your features files. Any tag that exists on a Feature will be inherited by Scenario, Scenario Outline or Examples.
*/

public class TaggingStepDefinition {
	

		@Given("^This is a valid login test$")
		public void this_is_a_valid_login_test()  {
		    
		}

		@Given("^This is a invalid login test$")
		public void this_is_a_invalid_login_test()  {
		  
		}

		@Given("^This is a contact test case$")
		public void this_is_a_contact_test_case()  {
		   
		}

		@Given("^This is a deal test case$")
		public void this_is_a_deal_test_case()  {
		    
		}

		@Given("^This is a tasks test case$")
		public void this_is_a_tasks_test_case()  {
		    
		}

		@Given("^This is a case test case$")
		public void this_is_a_case_test_case(){
		    
		}

		@Given("^clicking on left panel links$")
		public void clicking_on_left_panel_links()  {
		 
		}

		@Given("^This is a search deal test$")
		public void this_is_a_search_deal_test()  {
		   
		}

		@Given("^This is a search contact test$")
		public void this_is_a_search_contact_test()  {
		    
		}

		@Given("^This is a search case test$")
		public void this_is_a_search_case_test()  {
		
		}

		@Given("^This is a search task test$")
		public void this_is_a_search_task_test()  {
		   
		}

		@Given("^This is a search call test$")
		public void this_is_a_search_call_test() {
		  
		}

		@Given("^This is a search email test$")
		public void this_is_a_search_email_test()  {
		    
		}

		@Given("^This is a search docs test$")
		public void this_is_a_search_docs_test()  {
		    
		}

		@Given("^This is a search forms test$")
		public void this_is_a_search_forms_test()  {
		   
		}

		@Given("^This is a report test$")
		public void this_is_a_report_test()  {
		    
		}

		@Given("^This is a logout test$")
		public void this_is_a_logout_test()  {
		    
		}

		@Given("^This is a close broswer test$")
		public void this_is_a_close_broswer_test()  {
		   
		}

}

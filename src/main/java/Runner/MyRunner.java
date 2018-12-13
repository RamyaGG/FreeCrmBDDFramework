package Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/* INT: what are the cucumber options available @CucumberOptions(
   features = the path of the feature files
   glue=the path of the step definition files
   tags -- This we have to define in feature file . Rest all Options we will be defining in the Runner class
   format= to generate different types of reporting
   monochrome = display the console output in a proper readable format
   strict = it will check if any step is not defined in step definition file
   dryRun = to check the mapping is proper between feature file and step def file
   )
   
   2. What are the types of reports we can generate using cucumber. 
      We can generate html, json and xml report
      
    What are the different Cucumber Options are available?
	How to use Cucumber Options?
	Benefits of Cucumber Options
	Interview Questions on Cucumber Options   
	
	Data driven approach
	1. using Examples
	2. using tables
	3. without using examples
*/

@RunWith(Cucumber.class)
@CucumberOptions(features = "H:\\Edureka\\Selenium\\WorkSpace\\FreeCrmBDDFramework\\src\\main\\java\\Features\\taggedhooks.feature", // the path of the feature files
																																
		glue = { "stepDefinitions" }, // the path of the step definition files
		
		format = { "pretty", "html:test-output", "json:json-output/cucumber.jason", "junit:junit-xml/cucumber.xml" }, // to generate different types of reporting. Eg to genearate json file report then use json:json-output/cucumber.jason 
		
		monochrome = true, //if it is true then it will generate pretty output in a proper readabe format
		
		strict = true, //it will check if any step is not defined in step definition files
					   // true means it will fail the execution if there are any undefined or pending steps are there
		               // if true and steps are missing the we will get PendingException: todo implement me
		
		dryRun = false // to check the mapping is proper between feature file and step def file. 
						// True means we will get to know which method is missing and it will not execute the test case
						// In order to execute the test case we should make dryRun as false
     //   tags = {"~@SmokeTest" , "~@RegressionTest","~@End2End"}
)

public class MyRunner {

}

     //ORed : tags = {"@SmokeTest , @RegressionTest"} -- execute all tests tagged as @SmokeTest OR @RegressionTest
	//ANDed : tags = {"@SmokeTest" , "@RegressionTest"} -- execute all tests tagged as @SmokeTest AND @RegressionTest

//How to ignore a specific test case
// ~@SmokeTest -- this will ignore the @SmokeTest 







//package stepDefinitions;
//
//import java.util.List;
//import java.util.Map;
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import cucumber.api.DataTable;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import junit.framework.Assert;
//
///*
//Maps in Data Tables:
//
//Maps in Data Tables can be used in different ways. Headers/Columns can also be defined for the test data. A same step definition can be executed multiple times with different set of test data using Maps.
//
//Maps in Data Tables with Header:
//
//In the previous tutorial video of Data Tables in Cucumber,  we pass Username & Password without Header, due to which the test was not much readable. What if there will be many columns. The basic concept of BDD test is to make the Test in Business readable format, so that business users can understand it easily. 
//
//Learn:
//+Test Data Tables in Cucumber using Maps
//+How to parametrize test cases using Data Table - Maps
//
//Scenario Outline:
//
//--This uses Example keyword to define the test data for the Scenario
//--This works for the whole test.
//--Cucumber automatically run the complete test the number of times equal to the number of data in the Test Set.
//
//================================================
//*/
//
////data table with maps : for parameterization of test cases
//
//public class DealStepWithMapDefinition {
//
//	WebDriver driver;
//
//	@Given("^user is already on login Page$")
//	public void user_is_already_on_login_Page() {
//
//		System.setProperty("webdriver.chrome.driver", "H:\\Edureka\\Selenium\\chromedriver_win32\\chromedriver.exe");
//		driver = new ChromeDriver();
//		  driver.manage().window().maximize();
//		  driver.manage().deleteAllCookies();
//		  
//		  driver.manage().timeouts().pageLoadTimeout(150, TimeUnit.SECONDS);
//		  driver.manage().timeouts().implicitlyWait(150, TimeUnit.SECONDS);
//		  
//		driver.get("https://www.freecrm.com");
//	}
//
//	@When("^title of the login Page is Free CRM$")
//	public void title_of_login_page_is_Free_CRM() {
//		String title = driver.getTitle();
//		Assert.assertEquals("#1 Free CRM software in the cloud for sales and service", title);
//	}
//	
//	@Then("^user enters username and password$") 
//	public void user_enters_username_and_password(DataTable credentials) {
//		for(Map<String, String>  data : credentials.asMaps(String.class, String.class)) {
//			
//		driver.findElement(By.name("username")).sendKeys(data.get("username")); 
//		driver.findElement(By.name("password")).sendKeys(data.get("password"));
//
//		}
//	}
//	
//	@Then("^user clicks on login button$")
//	public void user_clicks_on_login_button() {
//		WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", loginBtn);
//	}
//
//	@Then("^user is on home page$")
//	public void user_is_on_home_page() {
//		String title = driver.getTitle();
//		System.out.println("Home Page title ::" + title);
//		Assert.assertEquals("CRMPRO", title);
//
//	}
//	
//	@Then("^user moves to new deal page$")
//	public void user_moves_to_new_deal_page() {
//		 driver.switchTo().frame("mainpanel");
//			Actions action = new Actions(driver);
//			action.moveToElement(driver.findElement(By.xpath("//a[contains(., 'Deals')]"))).build().perform();
//		//	driver.findElement(By.xpath("//a[contains(., 'New Contact')]")).click();
//			JavascriptExecutor js = (JavascriptExecutor) driver;
//			js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//a[contains(., 'New Deal')]")));
//	}
//
//	@Then("^user enters deal details$")
//	public void user_enters_contacts_details(DataTable dealData) {
//
//		for (Map<String, String> data : dealData.asMaps(String.class, String.class)) {
//
//			driver.findElement(By.id("title")).sendKeys(data.get("title"));
//			driver.findElement(By.id("amount")).sendKeys(data.get("amount"));
//			driver.findElement(By.id("probability")).sendKeys(data.get("probability"));
//			driver.findElement(By.id("commission")).sendKeys(data.get("commission"));
//			
//			driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click(); //save button
//			
//			//move to new deal page:
//			Actions action = new Actions(driver);
//			action.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Deals')]"))).build().perform();
//			driver.findElement(By.xpath("//a[contains(text(),'New Deal')]")).click();
//
//		}
//
//		
//	}
//
//	
//
//	@Then("^close the browser$")
//	public void close_the_browser() {
//	    driver.quit();
//	}
//
//}

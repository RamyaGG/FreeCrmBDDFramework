//package stepDefinitions;
//
//import java.util.List;
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
//Scenario Outline:
//
//--This uses Example keyword to define the test data for the Scenario
//--This works for the whole test.
//--Cucumber automatically run the complete test the number of times equal to the number of data in the Test Set.
//
//Test Data:
//
//--No keyword is used to define the test data.
//--This works only for the single step, below which it is defined.
//--A separate code is need to understand the test data and then it can be run single or multiple times but again just for the single step, not for the complete test.
//*/
//
//public class DealStepDefinition {
//
//	WebDriver driver;
//
//	@Given("^user is already on login Page$")
//	public void user_is_already_on_login_Page() {
//
//		System.setProperty("webdriver.chrome.driver", "H:\\Edureka\\Selenium\\chromedriver_win32\\chromedriver.exe");
//		  driver = new ChromeDriver();
//		  driver.manage().window().maximize();
//		  driver.manage().deleteAllCookies();
//		  
//		  driver.manage().timeouts().pageLoadTimeout(90, TimeUnit.SECONDS);
//		  driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
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
//		List<List<String>>  data = credentials.raw();
//		driver.findElement(By.name("username")).sendKeys(data.get(0).get(0)); // first get(0) represents row and next get(0) repre naveenk
//		driver.findElement(By.name("password")).sendKeys(data.get(0).get(1));
//
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
//	public void user_enters_deal_details(DataTable dealData)  {
//		List<List<String>> dealValues =	dealData.raw();
//		driver.findElement(By.id("title")).sendKeys(dealValues.get(0).get(0)); // 0th row and 0th value
//		driver.findElement(By.id("amount")).sendKeys(dealValues.get(0).get(1));
//		driver.findElement(By.id("probability")).sendKeys(dealValues.get(0).get(2));
//		driver.findElement(By.id("commission")).sendKeys(dealValues.get(0).get(3));
//	}
//	
//
//	@Then("^close the browser$")
//	public void close_the_browser() {
//	    driver.quit();
//	}
//
//}

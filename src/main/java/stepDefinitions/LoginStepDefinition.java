//package stepDefinitions;
//
//import java.util.concurrent.TimeUnit;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import junit.framework.Assert;
//
///*How to create:
//1. Feature File using Gherkin Language
//2. Step Definition file using cucumber jerking annotations
//3. Test Runner class using Junit and Cucumber Options
//
//Running in Eclipse or IntelliJ:
//
//If you use the open-source Eclipse Java IDE, you should consider installing the free Cucumber-Eclipse plugin. It provides syntax coloring, and the best part is that you can 'right-click' and run Karate test scripts without needing to write a single line of Java code.
//
//If you use IntelliJ, Cucumber support is built-in and you can even select a single Scenario within a Feature to run at a time.*/
//
////INT : What are the depencies you have added for Cucumber
////project Github: https://github.com/naveenanimation20/CucumberSeleniumFramework 
//
//public class LoginStepDefinition { // also called test class
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
//	// 1. \"([^\"]*)\"
//	// 2. \"(.*)\"    -- oth are regular exp . We Can use either of them
//	@Then("^user enters \"(.*)\" and \"(.*)\"$") // data driven without examples key word . in feature file we have to pass like this Then user enters "naveenk" and "test@123" 
//	public void user_enters_username_and_password(String username, String password) {
//		driver.findElement(By.name("username")).sendKeys(username);
//		driver.findElement(By.name("password")).sendKeys(password);
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
//	@Then("^user moves to new contact page$")
//	public void user_moves_to_new_contact_page() {
//	    driver.switchTo().frame("mainpanel");
//		Actions action = new Actions(driver);
//		action.moveToElement(driver.findElement(By.xpath("//a[contains(., 'Contacts')]"))).build().perform();
//	//	driver.findElement(By.xpath("//a[contains(., 'New Contact')]")).click();
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//a[contains(., 'New Contact')]")));
//		
//	}
//	
//	@Then("^user enters contact details \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$") // data driven without examples key word . in feature file we have to pass like this Then user enters "naveenk" and "test@123" 
//	public void user_enters_contacts_details(String firstname, String lastname, String position) {
//		driver.findElement(By.id("first_name")).sendKeys(firstname);
//		driver.findElement(By.id("surname")).sendKeys(lastname);
//		driver.findElement(By.id("company_position")).sendKeys(position);
//		driver.findElement(By.xpath("//input[@type='submit' and @value='Save']")).click();
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

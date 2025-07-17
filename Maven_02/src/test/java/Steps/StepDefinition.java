package Steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.JobsPage;
import pages.LoginPage;
import pages.LogoutPage;

public class StepDefinition {
	
	WebDriver driver;
	
	LoginPage LP;
	JobsPage JP;
	LogoutPage LP1;
		
	
	@Given("User open browser")
	public void user_open_browser() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	    
	}
	@Then("user enters URL as {string}")
	public void user_enters_url_as(String TestURL) {
		
		LP =new LoginPage();
		LP.LoginPageDriver(driver);
		LP.user_enters_url_as(TestURL);
		   
	}
	@Then("user enters username as {string} and password as {string} and click login btn")
	public void user_enters_username_as_and_password_as_and_click_login_btn(String USERNAME, String PASSWORD) throws InterruptedException {
		
		LP.LoginPageDriver(driver);
		LP.user_enters_username_as_and_password_as_and_click_login_btn(USERNAME, PASSWORD);
		
	    
	}
	@Then("go to jobs page")
	public void go_to_jobs_page() throws InterruptedException {
		
		JP = new JobsPage();
		JP.JobsPageDriver(driver);
		JP.go_to_jobs_page();	
		
	}
	@Then("user enters jobtitle as {string} and job desc as {string} and jobnote as {string}")
	public void user_enters_jobtitle_as_and_job_desc_as_and_jobnote_as(String JOBName, String JOBDescription, String JOBNote) throws InterruptedException {
		
		JP.JobsPageDriver(driver);
		JP.user_enters_jobtitle_as_and_job_desc_as_and_jobnote_as(JOBName, JOBDescription, JOBNote);
		
		
	}
	@When("user clicks logout")
	public void user_clicks_logout() throws InterruptedException {
		
		
		LP1 = new LogoutPage();
		LP1.LogoutPageDriver(driver);
//		LP1.user_clicks_logout();
	   
	}
	@Then("close browser")
	public void close_browser() {
		
	LP1.LogoutPageDriver(driver);
	    
	}


}

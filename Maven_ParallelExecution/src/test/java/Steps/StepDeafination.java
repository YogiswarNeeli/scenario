package Steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDeafination 
   
{
	WebDriver driver;
	
	// Skills Record
	
	@Given("user launch browser")
	public void user_launch_browser() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		   
	}
	@Then("enters URL as {string}")
	public void enters_url_as(String TestURL) {
		
		driver.get(TestURL);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  
	}
	@Then("user enters username as {string} and password as {string} clicks login")
	public void user_enters_username_as_and_password_as_clicks_login(String Username, String Password) throws InterruptedException {
		
		driver.findElement(By.name("username")).sendKeys(Username);
		driver.findElement(By.name("password")).sendKeys(Password);
		Thread.sleep(2000);
	     
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
	    
	  
	}
	@Then("go to skills page")
	public void go_to_skills_page() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Qualifications ']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		   
	}
	@Then("user enters skillname as {string} and skill description as {string}")
	public void user_enters_skillname_as_and_skill_description_as(String SkillName, String SkillDec) throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
		Thread.sleep(2000);
			
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys(SkillName);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys(SkillDec);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();


	}
	
	//Jobs Record
	
	@Then("user enters username as {string} and password as {string} and click login btn")
	public void user_enters_username_as_and_password_as_and_click_login_btn(String Username, String Password) throws InterruptedException {
		
		driver.findElement(By.name("username")).sendKeys(Username);
		driver.findElement(By.name("password")).sendKeys(Password);
		Thread.sleep(2000);
	     
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
	    
	}
	@Then("go to jobs page")
	public void go_to_jobs_page() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		
		  
	}
	@Then("user enters jobtitle as {string} and job desc as {string} and jobnote as {string}")
	public void user_enters_jobtitle_as_and_job_desc_as_and_jobnote_as(String JobName, String JobDec, String JobNote) throws InterruptedException {
	   
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys(JobName);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys(JobDec);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div[2]/textarea")).sendKeys(JobNote);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[5]/button[2]")).click();
			
	}	
	
	//Nationality Record
	
	@Then("go to Nationality page")
	public void go_to_nationality_page() throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[5]/a")).click();
		Thread.sleep(2000);
		
	}
	@Then("user enters Nationalityname as {string}")
	public void user_enters_nationalityname_as(String NationalityName) throws InterruptedException {
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys(NationalityName);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]")).click();		
	   
	}
	@When("clicks logout")
	public void clicks_logout() {
	   
	}
	@Then("Close the browser")
	public void close_the_browser() {
	    
	}	

}

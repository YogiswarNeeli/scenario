package Steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {
	
	WebDriver driver;
	
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
	public void user_enters_username_as_and_password_as_clicks_login(String USERNAME, String PASSWORD) throws InterruptedException {
	    
		driver.findElement(By.name("username")).sendKeys(USERNAME);
		driver.findElement(By.name("password")).sendKeys(PASSWORD);
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
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[4]/ul/li[1]")).click();
		Thread.sleep(2000);
		
	}
	@Then("user enters skillname as {string} and skill description as {string}")
	public void user_enters_skillname_as_and_skill_description_as(String SkillName, String SkillDesc) throws InterruptedException {
		
		driver.findElement(By.xpath(" //*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys(SkillName);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys(SkillDesc);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[3]/button[2]")).click();
		
		
	}
	@When("clicks logout")
	public void clicks_logout() throws InterruptedException {
		
		driver.findElement(By.xpath("//span[@class='oxd-userdropdown-tab']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		
	}
	@Then("Close the browser")
	public void close_the_browser() {
		
		driver.close();
		driver.quit();
		
	
	   
		
	}

}

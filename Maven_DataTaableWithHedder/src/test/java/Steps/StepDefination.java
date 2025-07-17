package Steps;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefination {
	
	WebDriver driver;

	@Given("User open browser")
	public void user_open_browser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	@Then("user enters URL as {string}")
	public void user_enters_url_as(String TestURL) {

		driver.get(TestURL);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@Then("user enters credentials")
	public void user_enters_credentials(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {

		List<Map<String,String>> Login = dataTable.asMaps(String.class,String.class);
		
		String username = Login.get(0).get("USERNAME");
		String password = Login.get(0).get("PASSWORD");
		
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
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

	@Then("user enters job details")
	public void user_enters_job_details(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {

		List<Map<String,String>> JobRecord = dataTable.asMaps(String.class,String.class);
		
		for(int i=0;i<4;i++) {
			
		String jobtitle = JobRecord.get(i).get("JOBTITLE");
		String jobdesc = JobRecord.get(i).get("JOBDESC");
		String jobnote = JobRecord.get(i).get("JOBNOTE");
		
		
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")).sendKeys(jobtitle);
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")).sendKeys(jobdesc);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div[2]/textarea")).sendKeys(jobnote);
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[5]/button[2]")).click();
		Thread.sleep(2000);
	}
	}
	@When("user clicks logout")
	public void user_clicks_logout() {

	}

	@Then("close browser")
	public void close_browser() {

	}

}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class JobsPage {
	
	WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a/span")
	WebElement ADMIN;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/span")
	WebElement JOBS;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]/ul/li[1]/a")
	WebElement JOBTITLES;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div[1]/div/button/i")
	WebElement ADD;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")
	WebElement jobname;

	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/div/div[2]/textarea")
	WebElement jobescription;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[4]/div/div[2]/textarea")
	WebElement jobnote;
	
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[5]/button[2]")
	WebElement SAVE;
	
	
    public void JobsPageDriver(WebDriver driver1) {
		
		this.driver = driver1;
		PageFactory.initElements(driver, this);
		
	}

	public void go_to_jobs_page() throws InterruptedException {

		ADMIN.click();
		Thread.sleep(2000);

		JOBS.click();
		Thread.sleep(2000);

		JOBTITLES.click();
		Thread.sleep(2000);

	}

    public void user_enters_jobtitle_as_and_job_desc_as_and_jobnote_as(String JOBName, String JOBDescription, String JOBNote) throws InterruptedException {
	
	ADD.click();
	Thread.sleep(2000);
	
	jobname.sendKeys(JOBName);
	jobescription.sendKeys(JOBDescription);
	
	jobnote.sendKeys(JOBNote);
	Thread.sleep(2000);
	
	SAVE.click();
	Thread.sleep(2000);
	
    }
}

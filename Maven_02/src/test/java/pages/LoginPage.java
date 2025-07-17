package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	@FindBy(name="username")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	WebElement LOGINBTN;
	
	
	public void LoginPageDriver(WebDriver driver1) {
		
		this.driver = driver1;
		PageFactory.initElements(driver, this);
		
	}

	public void user_enters_url_as(String TestURL) {

		driver.get(TestURL);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

    public void user_enters_username_as_and_password_as_and_click_login_btn(String USERNAME, String PASSWORD) throws InterruptedException {
	
    username.sendKeys(USERNAME);
    password.sendKeys(PASSWORD);
	Thread.sleep(2000);
     
	LOGINBTN.click();
	Thread.sleep(2000);
    }   

}

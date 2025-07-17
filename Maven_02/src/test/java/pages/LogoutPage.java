package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	WebDriver driver;
	
	
    public void LogoutPageDriver(WebDriver driver1) {
		
		this.driver = driver1;
		PageFactory.initElements(driver, this);
		
	}

	public void user_clicks_logout() throws InterruptedException {

//		driver.findElement(By.xpath("//p[text()='manda user']")).click();
//		Thread.sleep(2000);
//
//		driver.findElement(By.xpath("//a[text()='Logout']")).click();
//
//		Thread.sleep(2000);

	}

	public void close_browser() {

//		driver.quit();

	}
}

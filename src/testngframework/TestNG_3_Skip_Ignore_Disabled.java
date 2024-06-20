package testngframework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_3_Skip_Ignore_Disabled {
	WebDriver driver;

	@Test(priority=2,enabled=false)
	public void twitter() {
		driver.get("https://www.x.com");
	}
	
	@Test(enabled=false,priority=0)
	public void google() {
		driver.get("https://www.google.com");
	}
	
	@Test(priority=5)
	public void facebook() {
		driver.get("https://www.facebook.com");
	}
	
	@Test(enabled=false)
	public void gmail() {
		driver.get("https://www.gmail.com");
	}
	
	@Test(priority=4)
	public void selenium() {
		driver.get("https://www.selenium.dev");
	}
	
	@Test(priority=3,enabled=true)
	public void redmine() {
		driver.get("https://www.redmine.org");
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}

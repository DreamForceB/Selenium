package log4j;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Log4jTutorial {
	WebDriver driver;

	@Test
	public void googlesearch() throws InterruptedException {
		
		  Logger log= Logger.getLogger("Google Search");
		  PropertyConfigurator.configure("Log4j.properties");
		  
		  driver = new ChromeDriver();
		  log.info("Chrome browser launched");
		  
		  driver.manage().window().maximize();
		  log.info("Browser window maximized");
		  
		  driver.get("https://www.google.com");
		  log.info("Launch the google application");
		  
		  driver.findElement(By.name("q")).sendKeys("Log4j");
		  log.info("Log4j text enter in google search field");
		  
		  Thread.sleep(3000);
		  log.info("Wait for 3 seconds");
		  
		  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		  log.info("Enter button pressed google search");
		  
	}
}

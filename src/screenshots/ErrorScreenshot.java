package screenshots;

import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class ErrorScreenshot {
	WebDriver driver;
	
	@Test
	public void googlesearch() throws Exception {
		driver.get("https://www.google.com/");		
		
		try 
		{
			driver.get("https://www.google.com");		
					
			driver.findElement(By.name("q")).sendKeys("techlearn.in");
					
			driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
							
			driver.findElement(By.xpath("//div[@id='hdtb-tools']")).click();
						
			driver.findElement(By.xpath("//span[@class='KTBKoe']")).click();
		
		}
		
		catch (Exception e) 
		{
			IssueScreenshot();
			System.out.println("==========Error due to========="+e);
		}
	}
	
public void IssueScreenshot() throws Exception {	
		
		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("D:\\Selenium\\Screenshots\\BugScreenshot.png"));
	}
	

	@BeforeTest
	public void beforeTest() throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().window().fullscreen();
		Thread.sleep(7000);
	}


}

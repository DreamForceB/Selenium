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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class SelectedWebElementScreenshot {
	WebDriver driver;
	
	@Test
	public void google() throws IOException, InterruptedException {
		driver.get("https://www.google.com");		
		
		Thread.sleep(3000);
		
		
		
		WebElement gm = driver.findElement(By.xpath("//a[@aria-label='Gmail ']"));

		File f = gm.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("D:\\Selenium\\Screenshots\\Gmail.png")); 	
		
	//	WebElement gm = driver.findElement(By.xpath("//*[@name=\"q\"]"));
	//	gm.sendKeys("Ramkee");
		
		
		
	
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}

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

public class TimeFormateScreenshot {
	WebDriver driver;
	
	
	public void GetScreenshot() throws IOException {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy_MMM_dd HH_mm_ss");
		Date date = new Date();
		String time = dateFormat.format(date);

		File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("D:\\Selenium\\Screenshots\\Google_" + time + ".png"));
	}	

	@Test
	public void google() throws IOException {
		driver.get("https://www.google.com");		
		GetScreenshot();
		
		driver.findElement(By.name("q")).sendKeys("techlearn.in");
		GetScreenshot();
		
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		GetScreenshot();
				
		driver.findElement(By.xpath("//div[@id='hdtb-tls']")).click();
		GetScreenshot();
		
		driver.findElement(By.xpath("//span[@class='KTBKoe']")).click();
		GetScreenshot();
		
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}

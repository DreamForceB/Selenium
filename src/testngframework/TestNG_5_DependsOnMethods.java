package testngframework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_5_DependsOnMethods {
	WebDriver driver;

	@Test(dependsOnMethods="method2")
	public void method1() {
		driver.findElement(By.name("q")).sendKeys("Tirupati");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		
    //	driver.findElement(By.name("q")).sendKeys("Tirupati"+Keys.ENTER);
	}
	
	@Test
	public void method2() {
		driver.get("https://www.google.com");
	}
	
	

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	}

	@AfterTest
	public void afterTest() {
	//	driver.quit();
	}

}

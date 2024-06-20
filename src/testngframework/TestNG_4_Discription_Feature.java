package testngframework;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class TestNG_4_Discription_Feature {
	WebDriver driver;

	@Test(description="Verify top menu bar")
	public void testcase1() {
		driver.findElement(By.xpath("//a[@class='home']")).click();
	}
	
	@Test(description="Verify Signin module")
	public void testcase2() {
		driver.findElement(By.xpath("//a[@class='login']")).click();
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ramkee");
	}
	
	/*@Test(description="Verify Forumes in main menu bar")
	public void testcase3() {
		driver.findElement(By.xpath("//a[@class='boards']")).click();
	}
	
	@Test(description="Verify Search functionality")
	public void testcase4() {
		driver.findElement(By.xpath("//input[@id='q']")).sendKeys("Java");
	}
	
	@Test(description="Registration")
	public void testcase5() {
		driver.findElement(By.xpath("//a[@class='register']")).click();
	}
	
	@Test(description="Verify Logo")
	public void testcase6() {
		driver.findElement(By.xpath("//span[@class='current-project']")).click();
	}*/

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redmine.org");
	}

	@AfterTest
	public void afterTest() {
		driver.quit();
	}

}

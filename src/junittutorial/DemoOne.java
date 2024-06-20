package junittutorial;

import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class DemoOne {
	
	static WebDriver driver;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	

	@Test
	void test6() {
		driver.get("https://www.selenium.dev");
		driver.findElement(By.name("q")).sendKeys("Hello");
	}
	
	@Test
	void test1() {
		driver.get("https://www.facebook.com");

	}
	
	@Test
	void test3() {
		driver.get("https://www.seleniumlearn.com");

	}
	
	@Test
	void test() {
		driver.get("https://www.google.com");

	}
	
	@Test
	void test5() {
		driver.get("https://www.redmine.org");

	}
	

}

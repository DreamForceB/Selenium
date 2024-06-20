package junittutorial;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Ignore;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class DemoTwo {

	static WebDriver driver;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Disabled  // This is only skip the Junit 5
	@Test
	void selenium() {
		driver.get("https://www.selenium.dev");
	}
	
	@Test
	void facebook() {
		driver.get("https://www.facebook.com");

	}
	
	@Disabled  
	@Test
	void seleniumlearn() {
		driver.get("https://www.seleniumlearn.com");

	}
	
	@Test
	void google() {
		driver.get("https://www.google.com");

	}
	
	@Ignore  // This is only skip the Junit 3 and 4
	@Test
	void redmine() {
		driver.get("https://www.redmine.org");

	}

}

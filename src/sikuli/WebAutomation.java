package sikuli;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeTest;

public class WebAutomation {
	WebDriver driver;
	Screen s = new Screen();

	@Test
	public void seleniumlearn() throws InterruptedException, FindFailed {
		driver.get("https://www.seleniumlearn.com");
		Thread.sleep(4000);
		s.click("D:\\Selenium\\Sikuli\\Testing.PNG");
		Thread.sleep(4000);
		s.type("D:\\Selenium\\Sikuli\\Search.PNG", "Controlpanel");
	//	s.doubleClick("");
		
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}

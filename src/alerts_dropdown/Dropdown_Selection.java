package alerts_dropdown;



import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;

public class Dropdown_Selection {
	WebDriver driver;

		@Test
		public void dropdown() throws InterruptedException {
			Thread.sleep(4000);
			driver.get("http://baalabharathi.com/upload-story/");
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"field-5vlVJGcSKva7av0\"]")).sendKeys("517640");
			Thread.sleep(4000);
			
			Select co = new Select(driver.findElement(By.xpath("//*[@id=\"field-5gVECDat8HE4BHW\"]")));
		    co.selectByVisibleText("India");
			          //or
			
			new Select(driver.findElement(By.xpath("//*[@id=\"field-5gVECDat8HE4BHW\"]"))).selectByIndex(7);
			Thread.sleep(2000);
			new Select(driver.findElement(By.xpath("//*[@id=\"field-5gVECDat8HE4BHW\"]"))).selectByValue("PK");
			Thread.sleep(2000);
			new Select(driver.findElement(By.xpath("//*[@id=\"field-5gVECDat8HE4BHW\"]"))).selectByVisibleText("United States (US)");
			Thread.sleep(2000);
			}

		@BeforeTest
		public void beforeTest() {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}

	}
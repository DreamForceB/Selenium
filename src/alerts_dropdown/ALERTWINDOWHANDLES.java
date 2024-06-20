package alerts_dropdown;


import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class ALERTWINDOWHANDLES {
	WebDriver driver;
	
       @Test
		public void alertokbutton() throws InterruptedException {
			driver.get("https://seleniumlearn.com/confirmation-dialog-box");
			Thread.sleep(4000);
			driver.findElement(By.xpath("//*[@id=\"node-102\"]/div/div[1]/div/div/button")).click();
			Thread.sleep(4000);
			driver.switchTo().alert().accept();
		}
		
		@Test
		public void alertcancelbutton() throws InterruptedException {
			driver.get("https://seleniumlearn.com/confirmation-dialog-box");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//*[@id=\"node-102\"]/div/div[1]/div/div/button")).click();
			Thread.sleep(4000);
			driver.switchTo().alert().dismiss();
		}
		
		
		@Test
		public void alertsendtextokbutton() throws InterruptedException {
			driver.get("https://www.seleniumlearn.com/prompt-dialog-box");
			Thread.sleep(5000);
			driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
			Thread.sleep(4000);
			
			Alert a = driver.switchTo().alert();
			a.sendKeys("Techlearn");
			a.accept();
			
			driver.switchTo().alert().sendKeys("Ramkee");
	    	driver.switchTo().alert().accept();
			
		}

		@BeforeTest
		public void beforeTest() {
			driver = new ChromeDriver();
			driver.manage().window().maximize();
		}

	}
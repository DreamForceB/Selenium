package isDisplayedisEnabledisSelected;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class VerificationMethods {
	WebDriver driver;

	@Test
	public void isDispalyedMetthod() throws InterruptedException {
		driver.get("https://www.redmine.org");
		Thread.sleep(3000);
		
		boolean pro = driver.findElement(By.xpath("//a[@class='projects']")).isDisplayed();
		
		if(pro==true)
		{
			System.out.println("Projects menu item is Available in top menu bar");
			driver.findElement(By.xpath("//a[@class='projects']")).click();
		}
		
		else
		{
			System.out.println("Projects menu item is Not Available in top menu bar");
	
		}
		
	}
	
	@Test
	public void isEnabledMetthod() throws InterruptedException {
		driver.get("https://www.redmine.org");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='login']")).click();
		Thread.sleep(3000);
		boolean log = driver.findElement(By.xpath("//input[@id='username']")).isEnabled();
		
		if(log==true)
		{
			System.out.println("Login textfield is enabled to enter the username");
			driver.findElement(By.xpath("//input[@id='username']")).sendKeys("ramkee");
		}
		
		else
		{
			System.out.println("Login textfield is Not enabled to enter the username");	
		}
		
		
	}
	
	
	@Test
	public void isSelectedMetthod() throws InterruptedException {
		driver.get("https://www.redmine.org");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@class='login']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='autologin']")).click();

		
		boolean checkbox = driver.findElement(By.xpath("//input[@id='autologin']")).isSelected();
		Thread.sleep(3000);

		if(checkbox==true)
		{
			System.out.println("Stay logged in checkbox is Selected");
		}
		
		else
		{
			System.out.println("Stay logged in checkbox is NOT Selected");

		}
		
		
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}

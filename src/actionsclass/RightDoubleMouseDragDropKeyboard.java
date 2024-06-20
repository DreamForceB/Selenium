package actionsclass;

import org.testng.annotations.Test;
import org.junit.jupiter.api.Disabled;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;

public class RightDoubleMouseDragDropKeyboard {
	WebDriver driver;
													
	@Test
	public void rightclick() throws InterruptedException {
		driver.get("https://seleniumlearn.com/");
		Thread.sleep(3000);
		Actions act = new Actions(driver);
		act.contextClick(driver.findElement(By.xpath("//a[normalize-space()='MySQL']"))).build().perform();
	}

		
	@Test
	public void doubleclick() throws InterruptedException {
		driver.get("https://seleniumlearn.com/double-click");
		Thread.sleep(3000);
		 JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 300)");
        
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//button[normalize-space()='Techlearn.in']"))).doubleClick().build().perform();
		
	}
	
	
	@Test
	public void Mosueover() throws InterruptedException {
		driver.get("https://seleniumlearn.com/");
		Thread.sleep(5000);
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu-336-1\"]/a"))).build().perform();
		Thread.sleep(3000);
		act.moveToElement(driver.findElement(By.xpath("//*[@id=\"menu-367-1\"]/a"))).click().build().perform();		
	}
	
	@Test
	public void draganddrop() throws InterruptedException {
		driver.get("https://www.seleniumlearn.com/drag-and-drop-html");
		Thread.sleep(5000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0, 300)");
		Actions act = new Actions(driver);
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
		act.dragAndDrop(source, target).build().perform();
		
		}
	
	@Test
	public void keyboardfuncation() throws InterruptedException {
		driver.get("https://www.redmine.org/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[@class='login']")).click();
		Thread.sleep(3000);

		Actions act = new Actions(driver);
		act.sendKeys(Keys.TAB).build().perform();
		
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("ABC");
		Thread.sleep(3000);

		act.sendKeys(Keys.ENTER).build().perform();

		
		}


	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}

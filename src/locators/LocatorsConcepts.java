package locators;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

class LocatorsConcepts {
	
	static WebDriver driver;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	@Disabled
	@Test
	void idnameclassnamecssselector() throws Exception {
		driver.get("http://hyderabadreport.com/user");
		Thread.sleep(3000);		
		driver.findElement(By.id("edit-name")).sendKeys("ramkee");
		Thread.sleep(3000);	
		driver.findElement(By.name("pass")).sendKeys("abc");
		Thread.sleep(3000);
		
	/*	driver.findElement(By.className("form-submit")).click();
		Thread.sleep(3000);		
		driver.findElement(By.id("edit-name")).clear();
		Thread.sleep(3000);	
		driver.findElement(By.id("edit-name")).sendKeys("Bharanisri"); */
		
		driver.findElement(By.cssSelector("input#edit-submit")).click();
		driver.findElement(By.cssSelector("#edit-submit")).click();
		
		driver.findElement(By.cssSelector("input.form-submit")).click();
		driver.findElement(By.cssSelector(".form-submit")).click(); 
		
	} 
	
	@Disabled
	@Test
	void linkpartiallinktext() throws Exception {
		driver.get("http://hyderabadreport.com/user");
		Thread.sleep(3000);		
		driver.findElement(By.linkText("Photos")).click();
		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("News")).click();
	}


	@Test
	void tagname() throws Exception {
		driver.get("https://www.ndtv.com/");
		Thread.sleep(3000);	
		
	List<WebElement> tl = driver.findElements(By.tagName("a"));
     System.out.println(tl.size());
	
	System.out.println("Total number of links in NDTV Application: "+tl.size());
		
	}
	@Disabled                      
	@Test
	void xpath() throws Exception {
		driver.get("http://hyderabadreport.com/user");
		Thread.sleep(3000);	
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/main/div/section/div/div[1]/form/div/div[1]/input")).sendKeys("bharansri");
		Thread.sleep(3000);	
		driver.findElement(By.xpath("//*[@id=\"edit-pass\"]")).sendKeys("abc");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/main/div/section/div/div[1]/form/div/div[3]/input")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"menu-375-3\"]/a")).click();
		
		
	}

	
		
	}



    

package iframes;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class Iframes {
	WebDriver driver;
  @Test
  public void frames() throws Exception {
	  driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	  Thread.sleep(3000);
	  
	//  WebElement frm = driver.findElement(By.id("iframeResult"));
	//  driver.switchTo().frame(frm);
	//  Thread.sleep(3000);
	  
	  driver.switchTo().frame("iframeResult");
	  
	//  driver.switchTo().frame(6);

	  driver.findElement(By.xpath("/html/body/button")).click();
	  Thread.sleep(3000);
	  driver.switchTo().alert().accept();
	  Thread.sleep(3000);
	  driver.switchTo().defaultContent();
	  Thread.sleep(3000);
	  driver.findElement(By.xpath("//*[@id=\"getwebsitebtn\"]")).click();
	  }
  @BeforeTest
  public void beforeTest() {
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
  }

  @AfterTest
  public void afterTest() {
  }

}

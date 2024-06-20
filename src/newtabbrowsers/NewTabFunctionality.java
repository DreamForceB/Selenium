package newtabbrowsers;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;

public class NewTabFunctionality {
	WebDriver driver;
  @Test
  public void newtab() throws Exception {
	  driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
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
	  Thread.sleep(3000);
	  
	  ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	  driver.switchTo().window(tabs.get(1));
	  Thread.sleep(3000);
	  
	  driver.findElement(By.xpath("//*[@id=\"subtopnav\"]/a[5]")).click();
	  Thread.sleep(3000);
	  driver.switchTo().window(tabs.get(0));

	  }
  
  
  @Test
  public void newtabwindow() throws Exception {
	  driver.get("https://www.google.com");
	  Thread.sleep(3000);
	  driver.switchTo().newWindow(WindowType.TAB);
	//  driver.switchTo().newWindow(WindowType.WINDOW);

	  Thread.sleep(3000);

	  driver.navigate().to("https://www.facebook.com");
	  
	  Thread.sleep(3000);

	  driver.close();
	

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

package tabtitleappurlapptext;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;

public class VerifyTabtitleURLAppText {
	WebDriver driver;

	@Test(enabled = false)
	public void verifyTabTitle() {
		driver.get("https://www.google.com");

		String exptabtitle = "Google";
		System.out.println("Expected tab title is :" + exptabtitle);

		String acttabtitle = driver.getTitle();
		System.out.println("Actual tab title is :" + acttabtitle);

		Assert.assertEquals(acttabtitle, exptabtitle);     
	}

	@Test(enabled = false)
	public void verifyURL() {
		driver.get("https://www.google.com");

		String expurl = "https://www.google.com/";

		String acturl = driver.getCurrentUrl();

		Assert.assertEquals(acturl, expurl);
	}

	@Test
	public void verifyapplicationtext() {
		driver.get("https://www.google.com");

		String expgtext = "Gmail";

		String actgtext = driver.findElement(By.xpath("//a[contains(@aria-label,'Gmail')]")).getText();

		Assert.assertEquals(actgtext, expgtext);

		String expimgtext = "Images";

		String actimgtext = driver.findElement(By.xpath("//a[contains(@aria-label,'Images')]")).getText();

		Assert.assertEquals(actimgtext, expimgtext);
	}

	@BeforeTest
	public void beforeTest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

}

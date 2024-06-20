package sikuli;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class DesktopAutomation {
	Screen s = new Screen();

	@Test
	public void desktop() throws FindFailed, InterruptedException {
		Thread.sleep(5000);
		s.click("D:\\Selenium\\Sikuli\\Windows.PNG");
		Thread.sleep(3000);
		s.click("D:\\Selenium\\Sikuli\\Wi.PNG");
		Thread.sleep(7000);
		s.dragDrop("D:\\Selenium\\Sikuli\\VLC.PNG", "D:\\Selenium\\Sikuli\\Ramkee.PNG");
		
	}
}

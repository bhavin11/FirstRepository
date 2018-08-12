package TestPackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class AutoITPrintPopUp extends BaseClass {
	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		chrome.quit();
		firefox.get("http://localhost/login.do");
		Thread.sleep(3000);
		Robot rob = new Robot();
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_P);
		rob.keyRelease(KeyEvent.VK_P);
		rob.keyRelease(KeyEvent.VK_CONTROL);

		Runtime run = Runtime.getRuntime();
		run.exec(
				"C:\\Users\\Hulk\\eclipse-workspace\\WeekendSeleniumFIFA\\AutoITScripts\\ActiTimePrintPopUpCancel.exe");
		Thread.sleep(3000);
		// firefox.quit();
	}
}

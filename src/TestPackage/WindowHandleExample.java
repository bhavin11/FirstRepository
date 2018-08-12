package TestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleExample {
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
		WebDriver chrome = new ChromeDriver();
		chrome.get("https://www.naukri.com");
		// Printing Parent Page ID
		String parentPage = chrome.getWindowHandle();
		System.out.println("Parent Window ID : " + parentPage);

		// Printing All Window ID Present
		java.util.Set<String> allWindows = chrome.getWindowHandles();

		for (String winHan : allWindows) {
			System.out.println("Window ID : " + winHan);
			chrome.switchTo().window(winHan);
			// System.out.println("Window Title : " + winTitle);
		}

		// Closing only the Parent
		for (String winHan : allWindows) {
			if (winHan.equals(parentPage)) {
				chrome.close();
			}
		}

		// Closing all Window
		for (String winHan : allWindows) {
			chrome.close();
		}
	}
}

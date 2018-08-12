package TestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumScript {

	public static void main(String[] args) {
		// set path of geckodrive.exe file
		
		System.setProperty("webdriver.gecko.driver",
				".\\Drivers\\geckodriver.exe");

		// Launch Firefox Browser
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		System.out.println(driver.getTitle());
		
	}
}

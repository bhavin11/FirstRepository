package TestPackage;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	static {
		System.setProperty("webdriver.gecko.driver", ".\\Drivers\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver", ".\\Drivers\\chromedriver.exe");
	}

	static WebDriver firefox = new FirefoxDriver();
	static WebDriver chrome = new ChromeDriver();
	static Navigation fireNav = firefox.navigate();
	static Navigation chromeNav = chrome.navigate();
	static TakesScreenshot chromeSS = (TakesScreenshot) chrome;
	static TakesScreenshot fireSS = (TakesScreenshot) firefox;
}

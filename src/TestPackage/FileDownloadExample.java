package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FileDownloadExample extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		chrome.quit();
		firefox.quit();
		// Setting Download Profile
		FirefoxProfile profile = new FirefoxProfile();
		String key = "browser.helperApps.neverAsk.saveToDisk";
		String value = "application/zip";
		profile.setPreference(key, value);
		FirefoxOptions option = new FirefoxOptions();
		option.setProfile(profile);
		WebDriver firefox1 = new FirefoxDriver(option);

		firefox1.get("https://www.seleniumhq.org/download/");
		String downloadWeb = "//td[text()='Java']/../td/a[text()='Download']";
		firefox1.findElement(By.xpath(downloadWeb)).click();
		Thread.sleep(3000);
		firefox1.quit();
	}
}

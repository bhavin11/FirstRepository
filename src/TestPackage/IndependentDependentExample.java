package TestPackage;

import org.openqa.selenium.By;

public class IndependentDependentExample extends BaseClass {

	public static void main(String[] args) {
		chrome.get("https://www.seleniumhq.org/download/");
		String VersionElement = "//td[text()='Java']/../td[2]";
		String version = chrome.findElement(By.xpath(VersionElement)).getText();
		String downloadWeb = "//td[text()='Java']/../td/a[text()='Download']";
		chrome.findElement(By.xpath(downloadWeb)).click();
		System.out.println("Version : " + version);
		chrome.quit();

		// Path of Independent Element : //td[text()='Java']
		// Traverse to common parent : /..
		// Traverse to the Dependent Element : //td[text()='Java']/../td[2]
	}
}

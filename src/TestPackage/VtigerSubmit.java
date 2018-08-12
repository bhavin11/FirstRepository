package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class VtigerSubmit extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		chrome.get("https://demo.vtiger.com/");
		WebElement submitButton = chrome.findElement(By.xpath("//button"));
		submitButton.submit();
		Thread.sleep(5000);
		chrome.quit();
	}

}

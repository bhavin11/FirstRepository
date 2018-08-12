package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FileUploadExample extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		firefox.quit();
		chrome.get("https://www.pdfonline.com/pdf-to-word-converter/");
		WebElement browseExample = chrome.findElement(By.xpath("/html/body/div[1]/form/input"));
		browseExample.sendKeys("C:\\Users\\Hulk\\Downloads\\Bhavin_Resume");
		Thread.sleep(3000);
		chrome.quit();
	}
}

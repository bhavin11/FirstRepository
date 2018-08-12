package TestPackage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AutoITFileUpload extends BaseClass {
	public static void main(String[] args) throws IOException, InterruptedException {
		firefox.quit();
		chrome.manage().window().maximize();
		chrome.get("https://pdf2doc.com/");
		WebElement fileUpload = chrome.findElement(By.xpath("//*[@id=\"pick-files\"]/span[2]"));
		fileUpload.click();
		Thread.sleep(3000);
		Runtime run = Runtime.getRuntime();
		run.exec("C:\\Users\\Hulk\\eclipse-workspace\\WeekendSeleniumFIFA\\AutoITScripts\\FileUpload.exe");
		Thread.sleep(10000);
		chrome.quit();
	}
}

package TestPackage;

import org.openqa.selenium.By;

public class AmazonProduct extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		chrome.manage().window().maximize();
		chrome.get("http://www.amazon.in");
		chrome.findElement(By.id("twotabsearchtextbox")).sendKeys("amazon fire stick");
		chrome.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
		Thread.sleep(5000);
		chrome.quit();
	}
}

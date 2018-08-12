package TestPackage;

import org.openqa.selenium.By;

public class GmailNewMail extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		chrome.manage().window().maximize();
		chrome.get("http://www.gmail.com");
		chrome.findElement(By.cssSelector("#identifierId")).sendKeys("bhavin.mistry13");
		chrome.findElement(By.xpath("//*[@id=\"identifierNext\"]/content/span")).click();
		Thread.sleep(5000);
		chrome.findElement(By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input")).sendKeys("mistry_11");
		chrome.findElement(By.xpath("//*[@id=\"passwordNext\"]/content/span")).click();
		Thread.sleep(5000);
		chrome.findElement(By.xpath("//*[@id=\":3v\"]/div/div")).click();
		chrome.findElement(By.xpath("//*[@id=\":9e\"]")).sendKeys("saha.chandanetc@gmail.com");
		chrome.findElement(By.xpath("//*[@id=\":8w\"]")).sendKeys("Automated Trial Email");
		chrome.findElement(By.xpath("//*[@id=\":a1\"]")).sendKeys("Hi Chandan");
		chrome.findElement(By.xpath("//*[@id=\":8m\"]")).click();
		chrome.quit();
	}
}
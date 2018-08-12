package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class IstqbMouseHovering extends BaseClass {
	public static void main(String[] args) throws InterruptedException {

		// Identifying Web Elements
		chrome.get("http://www.istqb.in/");
		WebElement Home = chrome.findElement(By.xpath("//*[@id=\"tmMainMenu\"]/nav/div/div[3]/ul/li[1]/a"));
		WebElement AboutUs = chrome.findElement(By.xpath("//*[@id=\"tmMainMenu\"]/nav/div/div[3]/ul/li[2]/a"));
		WebElement Foundation = chrome.findElement(By.xpath("//*[@id=\"tmMainMenu\"]/nav/div/div[3]/ul/li[3]/a"));
		WebElement Advanced = chrome.findElement(By.xpath("//*[@id=\"tmMainMenu\"]/nav/div/div[3]/ul/li[4]/a"));
		WebElement AgileExt = chrome.findElement(By.xpath("//*[@id=\"tmMainMenu\"]/nav/div/div[3]/ul/li[5]/a"));
		WebElement MobileBasedTester = chrome
				.findElement(By.xpath("//*[@id=\"tmMainMenu\"]/nav/div/div[3]/ul/li[6]/a"));
		WebElement CertifiedTester = chrome.findElement(By.xpath("//*[@id=\"tmMainMenu\"]/nav/div/div[3]/ul/li[7]/a"));
		WebElement CmapMobile = chrome.findElement(By.xpath("//*[@id=\"tmMainMenu\"]/nav/div/div[3]/ul/li[8]/a"));
		WebElement About = chrome.findElement(By.xpath("//*[@id=\"tmMainMenu\"]/nav/div/div[3]/ul/li[9]/a"));
		Actions a = new Actions(chrome);

		// Mouse Hovering
		a.moveToElement(Home).perform();
		Thread.sleep(3000);
		a.moveToElement(AboutUs).perform();
		Thread.sleep(3000);
		a.moveToElement(Foundation).perform();
		Thread.sleep(3000);
		a.moveToElement(Advanced).perform();
		Thread.sleep(3000);
		a.moveToElement(AgileExt).perform();
		Thread.sleep(3000);
		a.moveToElement(MobileBasedTester).perform();
		Thread.sleep(3000);
		a.moveToElement(CertifiedTester).perform();
		Thread.sleep(3000);
		a.moveToElement(CmapMobile).perform();
		Thread.sleep(3000);
		a.moveToElement(About).perform();
		Thread.sleep(3000);
		chrome.quit();
	}
}

package TestPackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertExample extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		firefox.quit();
		chrome.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		WebElement AlertPop = chrome
				.findElement(By.xpath("/html/body/table[3]/tbody/tr[1]/td[2]/table/tbody/tr/td/div[4]/form/input"));
		AlertPop.click();
		Thread.sleep(2000);
		Alert alert = chrome.switchTo().alert();
		System.out.println("Alert Text : " + alert.getText());
		Thread.sleep(2000);
		alert.accept();
		Thread.sleep(2000);
		chrome.quit();
	}
}

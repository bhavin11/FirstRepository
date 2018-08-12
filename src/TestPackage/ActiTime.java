package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ActiTime extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		// Web Element address
		chrome.get("http://localhost/login.do");
		WebElement unObj = chrome.findElement(By.xpath("//input[@name='username']"));
		WebElement pwdObj = chrome.findElement(By.cssSelector("[type='password']"));
		WebElement loginObj = chrome.findElement(By.cssSelector("#loginButton"));
		WebElement cbObj = chrome.findElement(By.cssSelector("#keepLoggedInCheckBox"));
		WebElement actiTimeImageObj = chrome.findElement(By.xpath("//*[@id=\"logoContainer\"]/div[2]/div/img"));
		WebElement versionObj = chrome.findElement(By.xpath("//nobr[contains(text(),'actiTIME')]"));

		// Is Displayed Function
		boolean unDisplayed = unObj.isDisplayed();
		System.out.println("Username Object is displayed : " + unDisplayed);

		// Is Enabled Function
		boolean unEnabled = unObj.isEnabled();
		if (unEnabled) {
			System.out.println("Username Object is Enabled");
		} else {
			System.out.println("Username Object is Disabled");
		}

		// Check X , Y Coordinate
		int unXCor = unObj.getLocation().getX();
		int pwdXCor = pwdObj.getLocation().getX();
		int unYCor = unObj.getLocation().getY();
		int pwdYCor = pwdObj.getLocation().getY();
		System.out.println("Username X Cor : " + unXCor);
		System.out.println("Username Y Cor : " + unYCor);
		System.out.println("Password X Cor : " + pwdXCor);
		System.out.println("Password Y Cor : " + pwdYCor);

		// Check Width , Height of UserName & Password
		int unWidth = unObj.getSize().getHeight();
		int unHeight = unObj.getSize().getWidth();
		int pwdWidth = pwdObj.getSize().getHeight();
		int pwdHeight = pwdObj.getSize().getWidth();
		System.out.println("Username Widht : " + unWidth);
		System.out.println("Username Height : " + unHeight);
		System.out.println("Password Width : " + pwdWidth);
		System.out.println("Password Height : " + pwdHeight);

		// Send Keys Function
		unObj.sendKeys("bhavin.mistry13);");
		pwdObj.sendKeys("mistry_11");

		// Clear Function
		unObj.clear();
		pwdObj.clear();

		// Is Selected Function
		boolean cbIsSelected = cbObj.isSelected();
		System.out.println("Keep me signed in check box is selected : " + cbIsSelected);

		// Get Attribute Function
		String cbToolTip = cbObj.getAttribute("title");
		System.out.println("Check Box Tool Tip : " + cbToolTip);

		// Get Tag Name
		System.out.println("ActiTime Image Tag Name : " + actiTimeImageObj.getTagName());

		// Get Text Function
		System.out.println("Version of ActiTIME : " + versionObj.getText());

		// Send Keys Function
		unObj.sendKeys("admin");
		pwdObj.sendKeys("manager");

		// Click Function
		loginObj.click();
		Thread.sleep(5000);
		chrome.close();
		Thread.sleep(5000);
		chrome.quit();

	}
}

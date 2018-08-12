package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JavaScriptExecutor extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		chrome.get("http://localhost/login.do");
		WebElement loginObj = chrome.findElement(By.xpath("//*[@id=\'loginButton\']/div"));
		WebElement usernameObj = chrome.findElement(By.xpath("//*[@id=\'username\']"));
		WebElement pwdObj = chrome
				.findElement(By.xpath("//*[@id=\'loginFormContainer\']/tbody/tr[1]/td/table/tbody/tr[2]/td/input"));
		JavascriptExecutor jse = (JavascriptExecutor) chrome;
		jse.executeScript("document.getElementById('username').value='admin'");
		Thread.sleep(2000);
		jse.executeScript("argument[0].value='admin11'", usernameObj);
		Thread.sleep(2000);
		jse.executeScript("document.getElementsByName('pwd')[0].value='manager'");
		Thread.sleep(2000);
		jse.executeScript("argument[0].value='manager123'", pwdObj);
		Thread.sleep(2000);
		jse.executeScript("argument[0].click()", loginObj);
		Thread.sleep(2000);
		firefox.quit();
		chrome.quit();

	}
}

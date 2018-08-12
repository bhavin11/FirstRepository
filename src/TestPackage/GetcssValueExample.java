package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;

public class GetcssValueExample extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		chrome.get("http://localhost/login.do");
		chrome.findElement(By.xpath("//*[@id=\"loginButton\"]/div")).click();
		WebElement errorObj = chrome.findElement(By.xpath("//span[contains(text(),'invalid')]"));
		System.out.println("Error Message is displayed : " + errorObj.isDisplayed());
		// Checking correct error message
		String errorText = errorObj.getText();
		if (errorText.equals("Username or Password is invalid. Please try again.")) {
			System.out.println("Error Message is Valid.");
		} else {
			System.out.println("Error Message is not Valid");
		}
		// Checking Color of Error
		String colorValue = errorObj.getCssValue("color");
		System.out.println("Color of Error Message : " + colorValue);
		String colorHex = Color.fromString(colorValue).asHex();
		if (colorValue.equals(colorHex)) {
			System.out.println("Valid Error Message Color = Red");
		} else {
			System.out.println("Invalid Error Message Color");
		}
		Thread.sleep(3000);
		chrome.quit();
	}

}

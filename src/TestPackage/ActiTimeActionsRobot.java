package TestPackage;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ActiTimeActionsRobot extends BaseClass {
	public static void main(String[] args) throws AWTException, InterruptedException {
		// Identifying WebElements
		firefox.get("http://localhost/login.do");
		WebElement unObj = firefox.findElement(By.xpath("//input[@name='username']"));
		WebElement pwdObj = firefox.findElement(By.cssSelector("[type='password']"));
		WebElement actiTimeInc = firefox.findElement(By.xpath("//*[@id=\"copyRight\"]/nobr/a"));
		Actions a = new Actions(firefox);
		Robot r = new Robot();

		// Performing Right Click and Pressing P
		Thread.sleep(2000);
		a.contextClick(actiTimeInc).perform();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_P);

		// Performing Double Click and Pressing BackSpace
		Thread.sleep(2000);
		unObj.sendKeys("trial_manager");
		Thread.sleep(2000);
		a.doubleClick(unObj).perform();
		Thread.sleep(2000);
		unObj.sendKeys(Keys.DELETE);
		// r.keyPress(KeyEvent.VK_BACK_SPACE);
		Thread.sleep(2000);
		pwdObj.sendKeys("mistry");
		Thread.sleep(2000);
		a.doubleClick(pwdObj).perform();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DELETE);
		Thread.sleep(2000);
		firefox.quit();
	}
}

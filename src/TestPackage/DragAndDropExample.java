package TestPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExample extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		chrome.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");

		Actions action = new Actions(chrome);
		WebElement Block1 = chrome.findElement(By.xpath("//h1[text()='Block 1']"));
		WebElement Block3 = chrome.findElement(By.xpath("//h1[text()='Block 3']"));
		Thread.sleep(2000);
		action.dragAndDrop(Block1, Block3).perform();
		Thread.sleep(2000);
		chrome.quit();
		firefox.quit();

	}
}

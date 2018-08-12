package TestPackage;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectExample extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		chrome.get("file:///C:/Users/Hulk/Documents/Java%20Class/Selenium/MultipleSelect.html");
		chrome.manage().window().maximize();
		WebElement listCar = chrome.findElement(By.id("car"));
		Select sel = new Select(listCar);
		System.out.println("Is List Multiple : " + sel.isMultiple());
		List<WebElement> allCars = sel.getOptions();
		for (WebElement options : allCars) {
			String text = options.getText();
			System.out.println("Car Name : " + text);
		}
		int size = allCars.size();
		System.out.println("Size of List : " + size);
		sel.selectByIndex(1);
		Thread.sleep(2000);
		sel.selectByValue("bmw");
		Thread.sleep(2000);
		sel.selectByVisibleText("Volvo");
		List<WebElement> selectedCars = sel.getAllSelectedOptions();
		int selectedSize = sel.getAllSelectedOptions().size();
		System.out.println("Selection Options : " + selectedSize);
		for (WebElement selOptions : selectedCars) {
			String selText = selOptions.getText();
			System.out.println("Selected Cars : " + selText);
		}
		WebElement firstSelected = sel.getFirstSelectedOption();
		System.out.println("First Selected Option : " + firstSelected.getText());
		Thread.sleep(2000);
		sel.deselectByIndex(1);
		Thread.sleep(2000);
		sel.deselectByValue("bmw");
		Thread.sleep(2000);
		sel.deselectByVisibleText("Volvo");
		Thread.sleep(2000);
		sel.selectByIndex(3);
		Thread.sleep(2000);
		sel.selectByIndex(4);
		Thread.sleep(2000);
		sel.deselectAll();
		Thread.sleep(2000);
		chrome.quit();
	}
}

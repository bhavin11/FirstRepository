package TestPackage;

public class ActiveElementExample extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		firefox.quit();
		chrome.get("http://localhost/login.do");
		chrome.manage().window().maximize();
		chrome.switchTo().activeElement().sendKeys("bhavin");
		Thread.sleep(3000);
		chrome.quit();
	}
}

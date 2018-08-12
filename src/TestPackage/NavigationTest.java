package TestPackage;

public class NavigationTest extends BaseClass {

	public static void main(String[] args) {
		chrome.get("http://www.google.co.in");
		chromeNav.to("http://www.gmail.com");
		chromeNav.back();
		chromeNav.forward();
		chromeNav.refresh();
		chrome.close();

	}
}

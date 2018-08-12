package TestPackage;

public class TestLoginPagePOM extends BaseClass {
	public static void main(String[] args) throws InterruptedException {
		chrome.get("http://localhost/login.do");
		firefox.quit();
		chrome.manage().window().maximize();
		LoginPage lp = new LoginPage(chrome);
		lp.setUsername("bhavin");
		lp.setPassword("mistry");
		lp.clickLogin();
		Thread.sleep(3000);
		lp.setUsername("admin");
		lp.setPassword("manager");
		lp.clickLogin();
	}
}

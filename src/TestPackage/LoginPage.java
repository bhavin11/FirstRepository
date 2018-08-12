package TestPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	// Declare Elements
	@FindBy(id = "username")
	WebElement unTB;

	@FindBy(css = "[name='pwd']")
	WebElement pwdTB;

	@FindBy(xpath = "//*[@id=\'loginButton\']/div")
	WebElement loginBtn;

	// Initialize Elements
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// Utilize Elements
	public void setUsername(String un) {
		unTB.sendKeys(un);
	}

	public void setPassword(String pwd) {
		pwdTB.sendKeys(pwd);
	}

	public void clickLogin() {
		loginBtn.click();
	}
}
package vouchrpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import framework.BaseTest;
import framework.MouseActions;

public class LoginPage extends BaseTest {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver= driver;
}
	private WebElement getusername() {
		return driver.findElement(By.id("email"));
	}
	private WebElement getpassword() {
		return driver.findElement(By.id("password"));
	}
	private WebElement loginbutton() {
		return driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
	}
	public void login(String username, String password) {
		enterText(getusername(), username);
		enterText(getpassword(), password);
		click(loginbutton());
	}
	
}


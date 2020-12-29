package vouchrpages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import framework.BaseTest;

public class ApplicationSelection extends BaseTest {
	WebDriver driver;
	public ApplicationSelection(WebDriver driver) {
		this.driver= driver;
}
	private By getAddTemplate = By.id("addTemplate");
	private String applicationElement = "//div[text()='<application name>']/..";
	public void selectApplication(String applicationName) {
		WebElement element=driver.findElement(By.xpath(applicationElement.replace("<application name>", applicationName)));
		click(element);
	}
	public void navigateToTemplatePage() {
		WebDriverWait expWait=new WebDriverWait(driver,30);
		expWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(getAddTemplate));
		click(driver.findElement(getAddTemplate));
	}
}


package vouchrpages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import framework.BaseTest;

public class PreviewPage extends BaseTest {
	WebDriver driver;
	public PreviewPage(WebDriver driver) {
		this.driver= driver;
	}
	private WebElement getPreviewButton() {
		return driver.findElement(By.xpath("//button[contains(text(),'Preview')]"));
	}
	private WebElement getOpenButton() {
		return driver.findElement(By.xpath("//body/div[4]/div[1]/div[1]/iframe[1]"));
	}
public void ValidatePreview() throws InterruptedException {
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0]. click();",driver.findElement(By.xpath("//button[contains(text(),'Preview')]")));
	Thread.sleep(2000);
	//click(getPreviewButton());
}
	public void validatePreviewpage() throws InterruptedException {
		Thread.sleep(2000);
		Assert.assertTrue(getOpenButton().isDisplayed(), "Preview is not broken");
		//Assert.assertEquals(getOpenButton().getSize(), expectedNumber,"Preview is broken");
	}
}


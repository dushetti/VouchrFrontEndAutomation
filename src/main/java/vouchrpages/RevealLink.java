package vouchrpages;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import framework.BaseTest;

public class RevealLink extends BaseTest{
	WebDriver driver;
	public RevealLink(WebDriver driver) {
		this.driver= driver;
	}
	
	private WebElement GetNextButton() {
		return driver.findElement(By.xpath("//button[contains(text(),'Next')]"));
	}
	private WebElement GetSendButton() {
		return driver.findElement(By.xpath("//button[contains(text(),'Send Now')]"));
	}
	private WebElement GetRevealURL(){
		return driver.findElement(By.xpath("//input[@aria-label='Copy link to clipboard']"));
	}
	
	
	public String GetReveallink() throws InterruptedException {
		Thread.sleep(1000);
		click(GetNextButton());
		Thread.sleep(2000);
		click(GetSendButton());
		Thread.sleep(3000);
		String Reveal = GetRevealURL().getAttribute("value");
		System.out.println(GetRevealURL().getAttribute("value"));
		return Reveal;
	}
}

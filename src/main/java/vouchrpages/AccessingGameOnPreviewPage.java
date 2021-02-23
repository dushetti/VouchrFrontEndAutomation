package vouchrpages;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import framework.BaseTest;

public class AccessingGameOnPreviewPage extends BaseTest {
	WebDriver driver;
	public AccessingGameOnPreviewPage(WebDriver driver) {
		this.driver= driver;
	}
	private WebElement Openreveal1() {
		return driver.findElement(By.xpath("//button[contains(text(),'OPEN')]"));
	}
	private WebElement SkipButton() {
		return driver.findElement(By.xpath("//button[contains(text(),'SKIP')]"));
	}
	private WebElement GamePlayButton() {
		return driver.findElement(By.xpath("//button[contains(text(),'PLAY GAME')]"));
	}
	private WebElement PlayButton() {
		return driver.findElement(By.xpath("//button[contains(text(),'PLAY')]"));
	}
	private WebElement GameCloseButton() {
		return driver.findElement(By.xpath("//i[@class='icon icon-close']"));
	}
	private WebElement Audiomute() {
		return driver.findElement(By.cssSelector("i[class*='icon-volumn']"));
	}
	
	public void playthegame() throws InterruptedException {
		Thread.sleep(7000);
		driver.switchTo().frame(0);
		//click(Audiomute());
		//JavascriptExecutor jse=(JavascriptExecutor)driver;
		//jse.executeScript("arguments[0]. click();",Openreveal());
		
		click(Openreveal1());
		Thread.sleep(1000);
		if(GamePlayButton().isEnabled()) {
			click(GamePlayButton());
		}
		Thread.sleep(2000);
		click(PlayButton());
		Thread.sleep(2000);
		click(GameCloseButton());
	}
}

package vouchrpages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import framework.BaseTest;

public class RevealPage extends BaseTest{
	WebDriver driver;
	
	public RevealPage(WebDriver driver) {
		this.driver= driver;
	}
	private WebElement Openreveal() {
		return driver.findElement(By.xpath("//button[contains(text(),'OPEN')]"));
	}
	private WebElement Audiomute() {
		return driver.findElement(By.cssSelector("i[class*='icon-volumn']"));
	}
	private WebElement Audiounmute() {
		return driver.findElement(By.cssSelector("i[class*='icon-mute2']"));
	}
	private WebElement Replaybutton() {
		return driver.findElement(By.xpath("//span[contains(text(),'Replay')]"));
	}
	private WebElement sharebutton() {
		return driver.findElement(By.cssSelector("i[class*='icon-share']"));
	}
	private WebElement Gratitudebutton() {
		return driver.findElement(By.xpath("//button[contains(text(),'Say thanks')]"));
	}
	private WebElement Gratitudecancelbutton() {
		return driver.findElement(By.xpath("//button[contains(text(),'Cancel')]"));
	}
	private WebElement GratitudeFirstmessage() {
		return driver.findElement(By.cssSelector("div[class*='GratitudeList_Item']"));
	}
	private List<WebElement> AudioIsPresent() {
		return (driver.findElements(By.cssSelector("div[class*='Reveal_MuteButtonContainer']")));
	}
	private List<WebElement>ReplaybuttonIsPresent(){
		return driver.findElements(By.xpath("//span[contains(text(),'Replay')]"));
	}
	private WebElement SkipButton() {
		return driver.findElement(By.xpath("//button[contains(text(),'SKIP')]"));
	}
	private WebElement GamePlayButton() {
		return driver.findElement(By.xpath("//button[contains(text(),'PLAY GAME')]"));
	}
	private WebElement GratitudeEmailButton() {
		return driver.findElement(By.cssSelector("a[class*='EmailButtonDesktop']"));
	}
	private WebElement GratitudeCopyButton() {
		return driver.findElement(By.cssSelector("button[class*='CopyButton']"));
	}

public void AccessReveal() throws InterruptedException {
	Thread.sleep(3000);
	click(Openreveal());
	Thread.sleep(1000);
	if(GamePlayButton().isEnabled()) {
		click(SkipButton());
	}
	Thread.sleep(2000);
	JavascriptExecutor js = (JavascriptExecutor)driver;
	WebElement Element = Replaybutton();
	Thread.sleep(1000);
	js.executeScript("arguments[0].scrollIntoView();", Element);
	Thread.sleep(3000);
	click(Gratitudebutton());
	Thread.sleep(2000);
	click(Gratitudecancelbutton());
	
}
public void validateaudiobutton(int expectednumber) {
	Assert.assertEquals(AudioIsPresent().size(), expectednumber,"Audio Button is missing on reveal");
}
public void validatereplaybutton(int expectednumber) {
	Assert.assertEquals(ReplaybuttonIsPresent().size(), expectednumber, "Replay button is missing on reveal");
}
public void AccessGratitudeContent() throws InterruptedException {
	JavascriptExecutor js = (JavascriptExecutor)driver;
	WebElement Element = Replaybutton();
	Thread.sleep(1000);
	js.executeScript("arguments[0].scrollIntoView();", Element);
	Thread.sleep(3000);
	click(Gratitudebutton());
	Thread.sleep(3000);
	JavascriptExecutor jse1=(JavascriptExecutor)driver;
	jse1.executeScript("arguments[0]. click();",driver.findElement(By.cssSelector("div[class*='GratitudeList_Item']")));
	Thread.sleep(2000);
	//click(GratitudeFirstmessage());
	Assert.assertEquals(GratitudeEmailButton().isEnabled(), true, "Email button is missing");
	Assert.assertEquals(GratitudeCopyButton().isEnabled(), true, "Email button is missing");
	
}
}


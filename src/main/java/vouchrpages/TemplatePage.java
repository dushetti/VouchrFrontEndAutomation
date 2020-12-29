package vouchrpages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import framework.BaseTest;


public class TemplatePage extends BaseTest {
	WebDriver driver;
	public TemplatePage(WebDriver driver) {
		this.driver= driver;
}
	private By getTitle = By.name("headerText");
	private WebElement getForeGoundTitleColor() {
		return driver.findElement(By.id("headerTextColor"));
	}
	private WebElement getForeGrounduploadButton() {
		return driver.findElement(By.xpath("(//div[@class='upload align-bottom-container']//input)[1]"));
	}
	
	private WebElement getForeGroundAltText() {
		return driver.findElement(By.name("foregroundImageAlt"));
	}
	private WebElement getBackGoundTitleColor() {
		return driver.findElement(By.id("backgroundColor"));
	}
	private WebElement getBackGroundAltText() {
		return driver.findElement(By.name("backgroundImageAlt"));
	}
	private WebElement getBackgroundUploadButton() {
		return driver.findElement(By.xpath("(//div[@class='upload align-bottom-container']//input)[2]"));
	}
	private WebElement getDescriptionText() {
		return driver.findElement(By.name("description"));
	}
	private WebElement getCategoriesList() {
		return driver.findElement(By.xpath("//label[contains(text(),'Categories')]/..//ul"));
	}
	String categoriesOption="//li[text()='<categories Option>']";
	private WebElement getRevealMessageText() {
		return driver.findElement(By.id("revealMessage"));
	}
	private WebElement getRevealBackgroundEnabledToggleSwitch() {
		return driver.findElement(By.id("revealBackgroundEnabled"));
	}
	private WebElement getRevealBackGoundTitleColor() {
		return driver.findElement(By.id("revealBackgroundColor"));
	}
	private WebElement getRevealBackgroundUploadButton() {
		return driver.findElement(By.xpath("//input[@id='revealBackgroundImage']"));
	}
	private WebElement getImageSettingsButton() {
		return driver.findElement(By.xpath("//label[text()='Image Settings']/.."));
	}
	private WebElement getRevealScrollType() {
		return driver.findElement(By.id("revealBackgroundScrollType"));
	}
	private WebElement getRevealBackgroundImageScale() {
		return driver.findElement(By.id("revealBackgroundImageScale"));
	}
	private WebElement getTitleText() {
		return driver.findElement(By.name("title_0_titleText"));
	}
	private WebElement getTitleStyle() {
		return driver.findElement(By.name("title_0_titleId"));
	}
	private WebElement getClosedCheckBox() {
		return driver.findElement(By.id("togglePreviewCheckbox"));
	}
	private WebElement getRevealPreviewFrameBox() {
		return driver.findElement(By.xpath("//iframe[@id='iframe']"));
	}
	private WebElement getReplayButton() {
		return driver.findElement(By.xpath("//a[@aria-label='replay']"));
	}
	private WebElement getPreviewFrameHeader() {
		return driver.findElement(By.xpath("//h1"));
	}
	private WebElement getSaveButton() {
		return driver.findElement(By.xpath("//button[text()='save changes']"));
	}
	public void completeTemplatePage(String templateTitle, String foreGroundTitleColor, String foregroundImagePath, String foreGroundAltText,
			String backgroundImagePath,String backGroundAltText,String backGroundTitleColor,String description,String categoryOption,
			String revealMessage,String revealBackGroundColor,String revealBackGroundImagePath,String revealScrollType,String revealImageScale,
			String titleText,String titleId) {
		WebDriverWait expWait=new WebDriverWait(driver,30);
		expWait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(getTitle));
		enterText(driver.findElement(getTitle),templateTitle);
		enterText(getForeGoundTitleColor(),foreGroundTitleColor);
		enterText(getForeGrounduploadButton(),foregroundImagePath);
		enterText(getForeGroundAltText(), foreGroundAltText);
		enterText(getBackgroundUploadButton(),backgroundImagePath);
		enterText(getBackGroundAltText(), backGroundAltText);
		enterText(getBackGoundTitleColor(), backGroundTitleColor);
		enterText(getDescriptionText(), description);
		enterText(getRevealMessageText(), revealMessage);
		click(getCategoriesList());
		click(driver.findElement(By.xpath(categoriesOption.replace("<categories Option>", categoryOption))));
		click(getBackGroundAltText());
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", getRevealBackgroundEnabledToggleSwitch());
		expWait.until(ExpectedConditions.elementToBeClickable(getRevealBackGoundTitleColor()));
		enterText(getRevealBackGoundTitleColor(), revealBackGroundColor);
		enterText(getRevealBackgroundUploadButton(),revealBackGroundImagePath);
		jse.executeScript("arguments[0].click();", getImageSettingsButton());
		selectByVisibleText(getRevealScrollType(), revealScrollType);
		selectByVisibleText(getRevealBackgroundImageScale(), revealImageScale);
		enterText(getTitleText(), titleText);
		selectByVisibleText(getTitleStyle(), titleId);
		jse.executeScript("arguments[0].click();", getClosedCheckBox());
		jse.executeScript("arguments[0].click();", getClosedCheckBox());
		wait(5.0);
		driver.switchTo().frame(getRevealPreviewFrameBox());
		Assert.assertTrue(getReplayButton().isDisplayed());
		Assert.assertEquals(getPreviewFrameHeader().getText(), titleText,"Incorrect preview Page Header");
		driver.switchTo().defaultContent();
		click(getSaveButton());
		
	}
}

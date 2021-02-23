package vouchrpages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import framework.BaseTest;


public class DiscoverPage extends BaseTest{
	WebDriver driver;
	public DiscoverPage(WebDriver driver) {
		this.driver= driver;
	}
	
	private WebElement addMediaButton() {
		return driver.findElement(By.xpath("//a[@aria-label='Add Media']"));
	}
	private WebElement addYoutubeVideo() {
		return driver.findElement(By.xpath("//div[text()='YouTube']/.."));
	}
	private WebElement addGif() {
		return driver.findElement(By.xpath("//i[@aria-label='add gif']"));
	}
	private WebElement addNote() {
		return driver.findElement(By.xpath("//i[@aria-label='add note']"));
	}
	private WebElement addQuote() {
		return driver.findElement(By.xpath("//i[@aria-label='add quote']"));
	}
	private WebElement addTitle() {
		return driver.findElement(By.xpath("//i[@aria-label='add title']"));
	}
	private WebElement searchGif() {
		return driver.findElement(By.xpath("//input[@placeholder='Search Tenor']"));
	}
	private WebElement youtubeSearchBar() {
		return driver.findElement(By.xpath("//input[@type='search']"));
	}
	private WebElement youtubeFirstOption() {
		return driver.findElement(By.xpath("//div[contains(@class,'Youtube_SearchResults')]/div/div"));
	}
	private WebElement youtubeAddButton() {
		return driver.findElement(By.xpath("//button[text()='ADD']"));
	}
	private List<WebElement> youtubeAddIsPresent() {
		return (driver.findElements(By.xpath("//div[@data-testid='testid-video-player']")));
	}
	private WebElement gifFirstOption() {
		return driver.findElement(By.xpath("//img[contains(@class,'ResultsPage_result')]"));
	}
	private WebElement gifAddButton() {
		return driver.findElement(By.xpath("//button[text()='ADD']"));
	}
	private WebElement titletextcontainer() {
		return driver.findElement(By.xpath("//input[@placeholder='Enter title here']"));
	}
	private WebElement activeTitleOption() {
		return driver.findElement(By.xpath("//div[@class='slick-slide slick-active slick-center slick-current']//img"));
	}
	private WebElement titlePreview() {
		return driver.findElement(By.xpath("//iframe[@title='titleFrame']"));
	}
	private WebElement getNotextextarea() {
		return driver.findElement(By.xpath("//textarea[contains(@class,'WritingSpace_TextArea')]"));
	}
	private WebElement NoteDoneButton() {
		return driver.findElement(By.xpath("//button[contains(text(),'DONE')]"));
	}
	private WebElement getQuoteSearch() {
		return driver.findElement(By.xpath("//input[@type='text']"));
	}
	private WebElement getFirstQuoteresult() {
		return driver.findElement(By.xpath("//div[contains(@class,'QuoteEditor_PageContainer')]/div/div/div/div[1]"));
	}
	
	private WebElement doneButton() {
		return driver.findElement(By.xpath("//button[@data-testid='testid-title-editor-save-button']"));
	}
	
public void selectTemplateandAddMedia(String templateId) {
	WebDriverWait expwait= new WebDriverWait(driver, 30);
	expwait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id(templateId)));
	elementClickable(driver.findElement(By.id(templateId)), 30);
	try {
		Thread.sleep(10000);
	} catch (InterruptedException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	JavascriptExecutor jse=(JavascriptExecutor)driver;
	jse.executeScript("arguments[0]. click();",driver.findElement(By.id(templateId)));
	//click(driver.findElement(By.id(templateId)));
	//expwait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//input[@type='search']")));
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	click(addMediaButton());
}
public void clickmediabutton() {
	click(addMediaButton());
}
public void selectMedia(String mediaType, String data) throws InterruptedException {
	if(mediaType.equalsIgnoreCase("youtube")){
		WebDriverWait expwait2= new WebDriverWait(driver, 30);
		expwait2.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[text()='YouTube']/..")));
		elementClickable(addYoutubeVideo(), 30);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(addYoutubeVideo());
		enterText(youtubeSearchBar(), data);
		expwait2.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//div[contains(@class,'Youtube_SearchResults')]/div/div")));
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(youtubeFirstOption());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(youtubeAddButton());
	}
	else if(mediaType.equalsIgnoreCase("gif")) {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(addGif());
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		enterText(searchGif(), data);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(gifFirstOption());
		click(gifAddButton());
	}
	else if(mediaType.equalsIgnoreCase("Note")) {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(addNote());
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(getNotextextarea());
		enterText(getNotextextarea(), data);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(NoteDoneButton());
		
	}
	else if(mediaType.equalsIgnoreCase("Quote")) {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(addQuote());
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(getQuoteSearch());
		enterText(getQuoteSearch(), data);
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(getFirstQuoteresult());
		click(NoteDoneButton());
		
	}
	else {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		click(addTitle());
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		enterText(titletextcontainer(), data);
		System.out.println(titlePreview().getAttribute("src"));
		System.out.println(activeTitleOption().getAttribute("alt"));
		Assert.assertEquals(titlePreview().getAttribute("src").contains(activeTitleOption().getAttribute("alt").toLowerCase()), false,"Incorrect font types");
		click(doneButton());
		
	}
}
public void validateNoOfRecords(int expectedNumber) {
	Assert.assertEquals(youtubeAddIsPresent().size(), expectedNumber,"Incorrect no of youtube videos added");
	
}
}

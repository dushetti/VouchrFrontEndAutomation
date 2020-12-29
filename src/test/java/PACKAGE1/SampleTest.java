package PACKAGE1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.LocalFileDetector;
import org.testng.annotations.Test;

import framework.BaseTest;

public class SampleTest extends BaseTest{
	
@Test
public void test1() throws InterruptedException {
	driver.get("https://stage.vouchrsdk.com/dashboard/templates/addTemplate");
	driver.findElement(By.id("email")).sendKeys("abhinav@vouchrapp.co");
	driver.findElement(By.id("password")).sendKeys("Testing123456!");
	driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
	driver.findElement(By.xpath("//div[text()='aaron']/..")).click();
	Thread.sleep(30000);
	driver.findElement(By.id("addTemplate")).click();
	Thread.sleep(30000);
	WebElement x = driver.findElement(By.xpath("(//div[@class='upload align-bottom-container']//input)[1]"));
	//x.click();
	x.sendKeys(System.getProperty("user.dir")+"//cricket.jpeg");
	driver.findElement(By.xpath("//div[text()='aaron']/..")).click();
	
	
}
}


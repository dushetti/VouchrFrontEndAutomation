package PACKAGE1;

import org.testng.annotations.Test;

import framework.BaseTest;
import vouchrpages.DiscoverPage;
import vouchrpages.PreviewPage;

public class TemplatePreview extends BaseTest {
	@Test
	public void templatepreview() throws InterruptedException {
		driver.get("https://static.vouchrsdk.com/eq/stage/discover/");
		DiscoverPage discoverpage = new DiscoverPage(driver);
		discoverpage.selectTemplateandAddMedia("slide-5633889397637120-4850061615824896");
		discoverpage.selectMedia("title", "New title adding");
		Thread.sleep(2000);
		PreviewPage previewpage = new PreviewPage(driver);
		previewpage.ValidatePreview();
		previewpage.validatePreviewpage();
		Thread.sleep(3000);
		//driver.quit();
		
		
	}
	

}
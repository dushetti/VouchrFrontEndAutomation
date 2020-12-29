package PACKAGE1;
import org.testng.annotations.Test;

import framework.BaseTest;
import vouchrpages.AccessingGameOnPreviewPage;
import vouchrpages.DiscoverPage;
import vouchrpages.PreviewPage;

public class TemplateGameOnPreviewAccess extends BaseTest{
	@Test
	public void templategameonpreviewaccess() throws InterruptedException {
		driver.get("https://static.vouchrsdk.com/eq/stage/discover/");
		DiscoverPage discoverpage = new DiscoverPage(driver);
		discoverpage.selectTemplateandAddMedia("slide-5633889397637120-4850061615824896");
		PreviewPage previewpage = new PreviewPage(driver);
		previewpage.ValidatePreview();
		Thread.sleep(1000);
		AccessingGameOnPreviewPage accessinggameonpreview = new AccessingGameOnPreviewPage(driver);
		accessinggameonpreview.playthegame();
		
		
	}
}

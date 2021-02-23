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
		discoverpage.selectTemplateandAddMedia("slide-6008016857989120-5687933321347072");
		PreviewPage previewpage = new PreviewPage(driver);
		previewpage.ValidatePreview();
		Thread.sleep(3000);
		AccessingGameOnPreviewPage accessinggameonpreview = new AccessingGameOnPreviewPage(driver);
		accessinggameonpreview.playthegame();
		
		
	}
}

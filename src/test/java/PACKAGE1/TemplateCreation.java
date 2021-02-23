package PACKAGE1;

import org.testng.annotations.Test;

import framework.BaseTest;
import vouchrpages.DiscoverPage;

public class TemplateCreation extends BaseTest {
	@Test
	public void Templatecreation() throws InterruptedException {
		String template="";
		String mediaDrawer="";
		String mediaOptions="";
		driver.get("https://static.vouchrsdk.com/eq/stage/discover/");
		DiscoverPage discoverpage = new DiscoverPage(driver);
		discoverpage.selectTemplateandAddMedia("slide-6008016857989120-5687933321347072");
		discoverpage.selectMedia("gif", "oops");
		discoverpage.clickmediabutton();
		discoverpage.selectMedia("youtube", "zelle");
		discoverpage.clickmediabutton();
		discoverpage.selectMedia("title", "New title adding");
		discoverpage.clickmediabutton();
		discoverpage.selectMedia("Note","writing an automated script");
		discoverpage.clickmediabutton();
		discoverpage.selectMedia("Quote", "funny");
		Thread.sleep(1000);
		driver.quit();
		
		
	}
	

}

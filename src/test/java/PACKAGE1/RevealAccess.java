package PACKAGE1;
import org.testng.annotations.Test;

import framework.BaseTest;
import vouchrpages.DiscoverPage;
import vouchrpages.RevealLink;
import vouchrpages.RevealPage;


public class RevealAccess extends BaseTest {
	@Test
	public void revealaccess() throws InterruptedException {
		driver.get("https://static.vouchrsdk.com/eq/stage/discover/");
		DiscoverPage discoverpage = new DiscoverPage(driver);
		discoverpage.selectTemplateandAddMedia("slide-5633889397637120-4850061615824896");
		discoverpage.selectMedia("gif", "oops");
		RevealLink reveallink = new RevealLink(driver);
		String Reveal = reveallink.GetReveallink();
		driver.get(Reveal);
		Thread.sleep(4000);
		RevealPage revealpage = new RevealPage(driver);
		revealpage.AccessReveal();
		revealpage.validateaudiobutton(1);
		revealpage.validatereplaybutton(1);
		revealpage.AccessGratitudeContent();
		driver.quit();
	}
	
}

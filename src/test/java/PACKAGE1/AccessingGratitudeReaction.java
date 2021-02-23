package PACKAGE1;

import org.testng.annotations.Test;

import framework.BaseTest;
import vouchrpages.DiscoverPage;
import vouchrpages.GetGratitudeLink;
import vouchrpages.RevealLink;
import vouchrpages.RevealPage;

public class AccessingGratitudeReaction extends BaseTest {
	@Test
	public void accessinggratitudereaction() throws InterruptedException {
		driver.get("https://static.vouchrsdk.com/eq/stage/discover/");
		DiscoverPage discoverpage = new DiscoverPage(driver);
		discoverpage.selectTemplateandAddMedia("slide-6008016857989120-5687933321347072");
		discoverpage.selectMedia("gif", "oops");
		RevealLink reveallink = new RevealLink(driver);
		String Reveal = reveallink.GetReveallink();
		driver.get(Reveal);
		Thread.sleep(4000);
		GetGratitudeLink GetGratitudeLink = new GetGratitudeLink(driver);
		GetGratitudeLink.AccessReveal();
		GetGratitudeLink.AccessGratitudeContent();
		GetGratitudeLink.GetGratitudeLink();
		
}
}
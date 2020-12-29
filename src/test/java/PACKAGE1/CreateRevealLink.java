package PACKAGE1;
import org.testng.annotations.Test;

import framework.BaseTest;
import vouchrpages.DiscoverPage;
import vouchrpages.RevealLink;
import vouchrpages.RevealPage;


public class CreateRevealLink extends BaseTest {
	@Test
	public void createreveallink() throws InterruptedException {
		driver.get("https://static.vouchrsdk.com/eq/stage/discover/");
		DiscoverPage discoverpage = new DiscoverPage(driver);
		discoverpage.selectTemplateandAddMedia("slide-5633889397637120-4850061615824896");
		discoverpage.selectMedia("gif", "oops");
		RevealLink reveallink = new RevealLink(driver);
		reveallink.GetReveallink();
		driver.quit();
	}
}

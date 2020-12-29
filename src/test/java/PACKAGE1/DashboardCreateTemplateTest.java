package PACKAGE1;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.testng.annotations.Test;

import framework.BaseTest;
import vouchrpages.ApplicationSelection;
import vouchrpages.LoginPage;
import vouchrpages.TemplatePage;

public class DashboardCreateTemplateTest extends BaseTest {
	@Test
	public void createTemplate() {
		driver.get("https://stage.vouchrsdk.com/dashboard/templates/addTemplate");
		LoginPage login = new LoginPage(driver);
		login.login("abhinav@vouchrapp.co", "Testing123456!");
		ApplicationSelection applicationselect = new ApplicationSelection(driver);
		applicationselect.selectApplication("aaron");
		applicationselect.navigateToTemplatePage();
		TemplatePage templatepage = new TemplatePage(driver);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss");  
		LocalDateTime localDateTime = LocalDateTime.now();  
		templatepage.completeTemplatePage("Template"+dtf.format(localDateTime), "#e31c1c", System.getProperty("user.dir")+"//cricket.jpg","man with bat", System.getProperty("user.dir")+"//sachin.jpg", "Man glancing off","#b4a69c", "adding automation","Happy Hour",
				"Cricket Template","#181616", System.getProperty("user.dir")+"//cricket.jpg","None","Original Size","Batting","Shadow Half Tone");
	}
}

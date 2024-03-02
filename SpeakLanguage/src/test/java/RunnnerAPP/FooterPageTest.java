package RunnnerAPP;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import PageObjectModels.FooterPage;
import PageObjectModels.base;


public class FooterPageTest {

	public static WebDriver driver;
	
	public static FooterPage FP;
	
	public static void main(String[] args) throws IOException, InterruptedException {
		driver = base.getdriver();
		base.ScrollFunction();
		base.TakeScreenshot("Footer Page");
		
		FP = new FooterPage (driver);
		FP.PrivacyPolicy();
		FP.TermsOfUse();
		FP.ContactUs();
		
		
	}
	
	
	

		

}

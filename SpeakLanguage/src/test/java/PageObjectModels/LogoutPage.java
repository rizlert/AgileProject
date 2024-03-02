package PageObjectModels;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	
	@FindBy(xpath = "//img[@alt='Settings']")
	WebElement SettingButton;
	@FindBy(xpath = "//li[@id='logout_button']")
	WebElement LogoutButton;
	
	WebDriver driver;
	
	public LogoutPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void SettingButton () throws InterruptedException {
		SettingButton.click();
		Thread.sleep(2000);
	}
	public void LogoutButton () throws InterruptedException {
		LogoutButton.click();
		Thread.sleep(1000);
	}
	
}

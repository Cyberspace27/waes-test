package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import generic.BasePage;

public class ProfilePage extends BasePage {
	
	
	public By hrfDetailPage = By.id("details_link");
	public WebElement getHrfDetailPage() {
		return driver.findElement(hrfDetailPage);
	}
	
	public ProfilePage(WebDriver driver) {
		super(driver);
	}
	
	
	public DetailPage goToDetailPage() {
		clickElement(getHrfDetailPage());
		return new DetailPage(driver);
	}
	
	
	
	
			
			

}

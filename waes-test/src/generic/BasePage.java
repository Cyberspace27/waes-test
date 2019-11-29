package generic;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class BasePage {

	public WebDriver driver = null;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	public WebDriver chromeDriverConnection() {
		System.setProperty("webdriver.chrome.driver", "C://chromedriver.exe");
		 driver = new ChromeDriver();
		return driver;
	}
	
	public WebElement findElement(By locator) {
		
		return driver.findElement(locator);
	}
	
	public String getText(WebElement element) {
		return element.getText();
	}
	
	
	public String getText(By locator) {
		return driver.findElement(locator).getText();
	}
	
	public void type(WebElement element, String inputText) {
		element.sendKeys(inputText);
		
	}
	public void clickElement(WebElement element){
		 element.click();
	}
	public void clickElement(By locator){
		driver.findElement(locator).click();
	}
	
	
	public Boolean isElementPresent(WebElement element) {
		try {
			return element.isDisplayed();
		}catch(org.openqa.selenium.NoSuchElementException e) {
			return false;
		}
	}
	
	public void goTo(String url) {
		driver.get(url);
	}
	
	
	
	
	public void selectdropDownValue(WebElement dropdownElement,String optionValue) {
	//	Select dropdown = new Select(driver.findElement(By.id("testingDropdown"))); 
		Select dropdown = new Select(dropdownElement);
		 dropdown.selectByVisibleText(optionValue);  
	}
	
  
	    // Close the Browser  
	     //   driver.close();  
	
}

package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import generic.BasePage;

public class LoginPage extends BasePage {

	public By txtUserName = By.id("username_input");
	public WebElement getUserName() {
		return driver.findElement(txtUserName);
	}

	public By txtPassword = By.id("password_input");
	public WebElement getPassword() {
		return driver.findElement(txtPassword);
	}

	public By hrfSignUp = By.id("signup_link");
	public WebElement getSignUpLink() {
		return driver.findElement(hrfSignUp);
	}
	
	@FindBy(id = "login_button")
	public WebElement btnLogin;

	@FindBy(how = How.XPATH, using = "//a[@id='login_link']")
	public WebElement testLink;
	
	public By lblSingIn = By.xpath("//section[contains(@class,'view-module')]/h1[text()='Log In']");
	public WebElement getSingIn() {
		return driver.findElement(lblSingIn);
	}
	
	public By lblLoggedStatus = By.xpath("//div[@id='status']/p[contains(.,'Logged in as Amazing Admin')]");
	public WebElement getLoggedStatus() {
		return driver.findElement(lblLoggedStatus);
	}
	
	
	
	

	public LoginPage(WebDriver driver) {
		super(driver);

	}

	/**
	 * Method to types credentials for login
	 * 
	 * @param user   String variable to enter username
	 * @param pass   String variable to enter password 
	 * 
	 * @author ariel vc
	 */
	public void typeUserPassword(String user, String pass) {
		type(getUserName(), user);
		type(getPassword(), pass);
	}

	/**
	 * Method to performs the action of login
	 * 
	 * @return ProfilePage
	 * @author ariel vc
	 */
	public ProfilePage login() {
		clickElement(By.xpath("//*[@id='login_button']"));
		return new ProfilePage(driver);
	}

	/**
	 * Method to performs the action of go to login page
	 * 
	 * @author ariel vc
	 */
	public void goToLogin() {
		clickElement(By.xpath("//a[@id='login_link']"));

	}
	
	/**
	 * Method that performs the action of go to signUp page
	 * 
	 * @author ariel vc
	 */
	public SignUpPage goToSignUp() {
		clickElement(getSignUpLink());
		return new SignUpPage(driver);
	}

}

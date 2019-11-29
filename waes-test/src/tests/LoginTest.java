package tests;

import org.testng.annotations.Test;

import generic.BaseTest;
import pages.LoginPage;
import pages.ProfilePage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;

public class LoginTest extends BaseTest {

	LoginPage loginPage;
	ProfilePage profilePage;
	
	@BeforeClass
	public void beforeClass() {
		loginPage = new LoginPage(driver);
	}


	@Test(description = "logIn with invalid data", groups = { "login" })
	public void signInFailed() {
		loginPage.goToLogin();
		waitTime(3000);
		loginPage.typeUserPassword("admin", "invalid");
		loginPage.login();
		scrollUp(300);
		Assert.assertTrue(loginPage.isElementPresent(loginPage.getSingIn()),"The SignIn was not performe as expected");

	}

	@Test(description = "logIn with correct data", groups = { "login" })
	public void signInSuccess() {
		//loginPage.goToLogin();
		waitTime(3000);
		loginPage.typeUserPassword("admin", "hero");
		loginPage.login();
		Assert.assertTrue(loginPage.isElementPresent(loginPage.getLoggedStatus()),"The SignIn was performe as expected");

	}

}

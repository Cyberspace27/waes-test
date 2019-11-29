package tests;

import org.testng.annotations.Test;

import generic.BaseTest;
import pages.LoginPage;
import pages.ProfilePage;

import org.testng.annotations.BeforeClass;
public class ProfileTest extends BaseTest {

	LoginPage loginPage;
	ProfilePage profilePage;
	
	@BeforeClass
	public void beforeClass() {
		
		loginPage.goToLogin();
		waitTime(3000);
		loginPage.typeUserPassword("dev", "wizard");
		loginPage.login();
	}
  
	@Test
  public void ValidateProfileData() {
	  
	//  Your Profile
  }

  

}

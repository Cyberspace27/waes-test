package tests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class ProfileTest {

	LoginPage loginPage;
	ProfilePage profilePage;
	
	@BeforeClass
	public void beforeClass() {
		
		loginPage.goToLogin();
		waitTime(3000);
		loginPage.typeUserPassword("dev", "wizard");
		loginPage.login();
	}

	@AfterClass
	  public void afterClass() {
		  
		  
	@Test
  public void ValidateProfileData() {
	  
	//  Your Profile
  }

  }

}

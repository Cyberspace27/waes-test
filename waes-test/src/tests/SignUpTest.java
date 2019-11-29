package tests;

import org.testng.annotations.Test;

import generic.BaseTest;
import pages.LoginPage;
import pages.SignUpPage;

import org.testng.annotations.BeforeClass;
import org.testng.Assert;

public class SignUpTest extends BaseTest {
	
	LoginPage loginPage;
	SignUpPage signUpPage;
	
  @BeforeClass
  public void beforeTests() {
	  loginPage = new LoginPage(driver);
	  signUpPage = loginPage.goToSignUp();
	 	
  }

  @Test(priority=1)
  public void fillSingUpMissingData() {
	  signUpPage.enterSignUpData("","naruto","","testWAES@com",11,"June",1988);
	 scrollDown(350);
	 waitTime(500);
	 signUpPage.clickSignUpBtn();
	 scrollUp(350);
	 Assert.assertTrue(signUpPage.isElementPresent(signUpPage.getlblSingUp()),"The SignUp was not performe as expected");
	//add 1 more assert try to catch the message error		
  }
  
  @Test(priority=2)
  public void fillSingUpInvalidUserName() {
	  signUpPage.clearSignUpData();
	  signUpPage.enterSignUpData("","3435465&%$%*","Carmen","testWAES@com",11,"March",1988);
	 scrollDown(350);
	 signUpPage.clickSignUpBtn();
	 scrollUp(350);
	 Assert.assertTrue(signUpPage.isElementPresent(signUpPage.getlblSingUp()),"The SignUp was not performe as expected");
	//add 1 more assert try to catch the message error		
  }
  
  @Test(priority=3)
  public void fillSingUpInvalidName() {
	  
	  signUpPage.clearSignUpData();
	  signUpPage.enterSignUpData("Superman","abc123","9857","testWAES@com",10,"March",1988);
	 scrollDown(350);
	 signUpPage.clickSignUpBtn();
	 scrollUp(350);
	 Assert.assertTrue(signUpPage.isElementPresent(signUpPage.getlblSingUp()),"The BirthDay is not correct");
	//add 1 more assert try to catch the message error		
  }
  
  
  @Test(priority=4)
  public void fillSingUpInvalidEmail() {
	  
	  signUpPage.clearSignUpData();
	  signUpPage.enterSignUpData("Batman","123abc","Bruce","*2.$testWA@ES@com&%",11,"June",1988);
	 scrollDown(350);
	 signUpPage.clickSignUpBtn();
	 scrollUp(350);
	 Assert.assertTrue(signUpPage.isElementPresent(signUpPage.getlblSingUp()),"The SignUp was not complete");
	//add 1 more assert try to catch the message error	
  }
  
  @Test(priority=5)
  public void fillSingUpSuccessful() {
	  
	  signUpPage.clearSignUpData();
	  signUpPage.enterSignUpData("arielVC","naruto","ariel","testWAES@com",11,"June",1988);
	 scrollDown(350);
	 signUpPage.clickSignUpBtn();
	 Assert.assertTrue(signUpPage.isElementPresent(signUpPage.getWelcomeNewProfile()),"The SignUp was not successful");
		
  }

}

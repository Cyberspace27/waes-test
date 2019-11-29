package tests;

import org.testng.annotations.Test;

import generic.BaseTest;
import pages.LoginPage;
import pages.SignUpPage;

import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class SignUpTest extends BaseTest {
	
	LoginPage loginPage;
	SignUpPage signUpPage;
	
  @BeforeClass
  public void beforeTests() {
	  loginPage = new LoginPage(driver);
	  signUpPage = loginPage.goToSignUp();
	  waitTime(3000);	
  }

  
  
  
  @Test
  public void fillSingUpMissingData() {
	  signUpPage.enterSignUpData("","naruto","","testWAES@com",11,"June",1988);
	 scrollDown(350);
	 waitTime(3000);
	 signUpPage.clickSignUpBtn();
	 Assert.assertTrue(signUpPage.isElementPresent(signUpPage.getlblSingUp()),"The SignUp was not performe as expected");
	//add 1 more assert try to catch the message error		
  }
  
  @Test
  public void fillSingUpInvalidUserName() {
	  signUpPage.enterSignUpData("superman","3435465&%$%*","Carmen","testWAES@com",11,"March",1988);
	 scrollDown(350);
	 waitTime(3000);
	 signUpPage.clickSignUpBtn();
	 Assert.assertTrue(signUpPage.isElementPresent(signUpPage.getlblSingUp()),"The SignUp was not performe as expected");
	//add 1 more assert try to catch the message error		
  }
  
  @Test
  public void fillSingUpWrongDay() {
	  signUpPage.enterSignUpData("Superman","abc123","Clark","testWAES@com",55,"March",1988);
	 scrollDown(350);
	 waitTime(3000);
	 signUpPage.clickSignUpBtn();
	 Assert.assertTrue(signUpPage.isElementPresent(signUpPage.getlblSingUp()),"The BirthDay is not correct");
	//add 1 more assert try to catch the message error		
  }
  
  
  @Test
  public void fillSingUpInvalidEmail() {
	  signUpPage.enterSignUpData("Batman","123abc","Bruce","*2.$testWA@ES@com&%",11,"June",1988);
	 scrollDown(350);
	 waitTime(3000);
	 signUpPage.clickSignUpBtn();
	 Assert.assertTrue(signUpPage.isElementPresent(signUpPage.getlblSingUp()),"The SignUp was not complete");
	//add 1 more assert try to catch the message error	
  }
  
  @Test
  public void fillSingUpSuccessful() {
	  signUpPage.enterSignUpData("arielVC","naruto","ariel","testWAES@com",11,"June",1988);
	 scrollDown(350);
	 waitTime(3000);
	 signUpPage.clickSignUpBtn();
	 Assert.assertTrue(signUpPage.isElementPresent(signUpPage.getWelcomeNewProfile()),"The SignUp was not successful");
		
  }

}

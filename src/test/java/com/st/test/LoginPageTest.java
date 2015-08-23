package com.nk.tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.nk.pages.ForgotPasswordPage;
import com.nk.pages.HomePage;
import com.nk.pages.JobAlertCreatedPage;
import com.nk.pages.JobSeekerLoginPage;
import com.nk.pages.LoginPage;
import com.nk.pages.MyNaukriPage;
import com.nk.util.BaseTestObject;

public class LoginPageTest extends BaseTestObject {

	/*WebDriver uiDriver;
	String BASE_URL="http://www.naukri.com/";*/
	HomePage objHomePage;
	LoginPage objLoginPage;
	MyNaukriPage objMyNaukriPage;
	JobAlertCreatedPage objjoJobAlertCreatedPage;
	ForgotPasswordPage objForgotPasswordPage;
	
	
	
	
	
		 @Test(priority=0,enabled=true)
		public void verifyLoginlink() throws Exception{
			objHomePage=new HomePage(uiDriver);
			objHomePage.verifyLogin();
			objLoginPage= objHomePage.clickOnLoginbutton();
			objLoginPage.verifyJobseekerPopup();
			objLoginPage.closeMethod();
			 }
		 
		 @Test(priority=1,enabled=true)
		public void verifyLoginContent() throws Exception{
			objHomePage=new HomePage(uiDriver);
			objHomePage.verifyLogin();
			objLoginPage=objHomePage.clickOnLoginbutton();
			objLoginPage.verifyJobseekerPopup();
			objLoginPage.verifyingUsernameField();
			objLoginPage.verifyingPasswordField();
			objLoginPage.verifyingRegisterButton();
			objLoginPage.verifyingForgotPassword();
			objLoginPage.closeMethod();
			}
		 
		 @Test(priority=2,enabled=true)
		public void UserLogin() throws Exception{
			objHomePage=new HomePage(uiDriver);
			objLoginPage=objHomePage.clickOnLoginbutton();
			objLoginPage.username("uthkarsh.venkat@gmail.com");
			objLoginPage.password("Udisandi2368769@");
			objMyNaukriPage = objLoginPage.loginButton();
			Thread.sleep(6000);
			objMyNaukriPage.verifyingUsernameLoginPage();
			objjoJobAlertCreatedPage=new JobAlertCreatedPage(uiDriver);
			objjoJobAlertCreatedPage.clickOnLogoutLink();
			objHomePage.clickOnSiteLogo();
			}
		 
		 @Test(priority=3,enabled=true)
		public void forgotPass() throws Exception{
			objHomePage=new HomePage(uiDriver);
			objLoginPage=objHomePage.clickOnLoginbutton();
			objLoginPage.username("uthkarsh.venkat@gmail.com");
			objLoginPage.password("Ukjkf");
			objForgotPasswordPage=objLoginPage.ClickingOnForgotPasswordLink();
			objForgotPasswordPage.resetPasswordTitle();
			objHomePage.clickOnSiteLogo();
			}
		 @Test(priority=4,enabled=false)
		public void resetPassword() throws Exception{
			objHomePage=new HomePage(uiDriver);
			objLoginPage=objHomePage.clickOnLoginbutton();
			objLoginPage.username("uthkarsh.venkat@gmail.com");
			objLoginPage.password("kfldf");
			objForgotPasswordPage=objLoginPage.ClickingOnForgotPasswordLink();
			objForgotPasswordPage.rememberUserNamePage();
			Thread.sleep(30000);
			objForgotPasswordPage.passingUserName("uthkarsh.venkat@gmail.com");
			objHomePage.clickOnSiteLogo();
			}
		 
			
		}


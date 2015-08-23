package com.st.pages;

import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.st.common.NKConstants;
import com.st.util.BasePageObject;



public class LoginPage extends BasePageObject {

	/*WebDriver  uiDriver;*/
	private static Logger log=Logger.getLogger(Logger.class.getName());
	By Login=By.id("login_Layer");
	By User=By.id("eLogin");
	By Pass=By.id("pLogin");
	By Button=By.xpath("//form[@id='lgnFrm']//div[7]//button");
	By Regi=By.xpath(".//*[@id='lgnFrm']/div[8]/a");
	By Jobtitle=By.xpath("//div[@class='headGNBWrap']//li//a[@title='Jobseeker Login']");
	By expected=By.xpath(".//*[@id='loginLB']/div[1]/div");
	By Close=By.id("closeLB");
	By Forgot=By.xpath("//form[@id='lgnFrm']//div[@class='row forgot']/a");
	boolean flag=false;
	String text=null;
	//Constructor
	public LoginPage(WebDriver driver) {
		super(driver);
	}
	/**
	 * @author Shailesh kumar
	 * @return boolean
	 * @throws Exception
	 **This method is help us to verify Login icon
	 */
	 
	public boolean verifyLogin() throws Exception {
		log.info(">>>Verifying Login is present or not>>>>>>>>");
		try {
			flag=uiDriver.findElement(Login).isDisplayed();
			Assert.assertTrue(flag, "Login is present");
			
		} catch (Exception e) {
		 throw new Exception("Failed while verifying Login"+e.getLocalizedMessage());
			// TODO: handle exception
		}
		return flag;
	}
	
public void JobSeekerLogin() throws InterruptedException{
		
		uiDriver.findElement(expected).isDisplayed();
		
		}
	public void loginPopup() throws Exception
	{
		log.info(">>>>>Verifying User Login<<<<<");
		try {
			uiDriver.findElement(Login).click();
			
			
			
		} catch (Exception e) {
			throw new Exception("Failed to Click Loginbutton"+"\n"+e.getLocalizedMessage());
			// TODO: handle exception
		}
	}
	
	public void username(String Username) throws Exception{
		log.info(">>>Passing the Username>>>>>");
		try {
			uiDriver.findElement(User).sendKeys(Username);
		} catch (Exception e) {
			throw new Exception("Failed to Pass User Name"+"\n"+e.getLocalizedMessage());
			// TODO: handle exception
		}
		}
	public void password(String Password) throws Exception{
		log.info(">>>>Passing the Password<<<<");
		try {
			
			uiDriver.findElement(Pass).sendKeys(Password);
		} catch (Exception e) {
			throw new Exception("Passes Password is incorrect"+"\n"+e.getLocalizedMessage());
			// TODO: handle exception
			}
	}
	/**
	 * @return void
	 * @author Shailesh kumar
	 * @param loginbutton
	 **This method is help us to click on the Login button
	 *@throws Exception;
	 */
	public MyNaukriPage loginButton() throws Exception{
		log.info(">>>Verifying User Login>>>");
		try {
			uiDriver.findElement(Button).click();
			uiDriver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		} catch (Exception e) {
			throw new Exception("User is failed to Login"+"\n"+e.getLocalizedMessage());
			// TODO: handle exception
			}
		return new MyNaukriPage(uiDriver);
		}
	public void Register() throws Exception{
		log.info(">>>>clicking register>>>>");
		try {
			uiDriver.findElement(Regi).click();
		
		} catch (Exception e) {
			throw new Exception("Register is failed to click"+"\n"+e.getLocalizedMessage());
			// TODO: handle exception
		}
	}
	
	///Verify JobSeeker Login Title
	
	public void verifyJobseekerPopup(){
	text=uiDriver.findElement(expected).getText().toLowerCase();
	Assert.assertEquals(text, NKConstants.PAGETITLE_JOBSEEKER, "JobSeekerpop up title is not present");
		}
	
	public void closeMethod()
	{
		uiDriver.findElement(Close).click();
	}
	
	public void verifyingUsernameField(){
	boolean Email=uiDriver.findElement(User).isDisplayed();
		Assert.assertTrue(Email, "email field in not present");
	}
	public void verifyingPasswordField(){
	boolean Password=uiDriver.findElement(Pass).isDisplayed();
		Assert.assertTrue(Password,"Password is not displayed");
	}
	public void verifyingRegisterButton() {
	boolean regtrue=uiDriver.findElement(Regi).isDisplayed();
	Assert.assertTrue(regtrue,"Register button is not displayed");
		}
	public void verifyingForgotPassword(){
	boolean forgottrue=uiDriver.findElement(Forgot).isDisplayed();
	Assert.assertTrue(forgottrue, "Forgot Password is not displayed");
	
	}
	
	public ForgotPasswordPage ClickingOnForgotPasswordLink(){
		/*String parent_window=uiDriver.getWindowHandle();*/
		uiDriver.findElement(Forgot).click();
		/*for (String childwindow :uiDriver.getWindowHandles()) {
		 	
		}*/
		return new ForgotPasswordPage(uiDriver);
	}
	
}




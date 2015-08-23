package com.nk.pages;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.nk.common.NKConstants;
import com.nk.util.BasePageObject;

public class CreateYourJobAlertsPage extends BasePageObject{
	
	private static Logger Log = Logger.getLogger(Logger.class.getName());
	
	
	/* UI Element Initialization*/
	
	By createJobAlertButton = By.xpath("//button[@id='cjaSubmit']");
	By errorKeySkills = By.xpath("//i[(@id='Sug_kwdsugg_err') and contains(.,'Keyskills should not be blank')]");
	By skillsAutoBox = By.xpath("//div[@id='kwdsugg']//input[@id='Sug_kwdsugg']");
	By errorjobAlertName = By.xpath("//i[(@id='nyja_err') and contains(.,'Please give a name to your Job Alert')]");
	By nameYourJobAlertBox = By.xpath("//input[@id='nyja']");
	
	public CreateYourJobAlertsPage(WebDriver driver){
		super(driver);
	}
	
	
	/*Variable Initialization*/
	boolean flag = false;
	
	/**This method will help us to verify Job Alert Button
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyCreateJobAlertButton(){
		flag = isElementPresent(createJobAlertButton);
		Assert.assertTrue(flag, "Job Alert Button is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Key Skills Error
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyKeySkillsError(){
		flag = isElementPresent(errorKeySkills);
		Assert.assertTrue(flag, "Key Skills Error is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Key Skills Error Displayed
	 * @author Senthil
	 * @return flag
	 */
	public void verifyKeySkillsErrorDisplayed(){
		verifyKeySkillsError();
		String skillError = getText(errorKeySkills);
		Assert.assertEquals(skillError, NKConstants.ERROR_KEYSKILLS, "ExpectedKey Skills Error doesnot match with the error displayed");
	}
	
	/**This method will help us to verify Skills AutoBox
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifySkillsAutoBox(){
		flag = isElementPresent(skillsAutoBox);
		Assert.assertTrue(flag, "Skills AutoBox is not displayed");
		return flag;
	}
	
	/**This method will help us to verify JobAlert Name Error
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyJobAlertNameError(){
		flag = isElementPresent(errorjobAlertName);
		Assert.assertTrue(flag, "JobAlert Name Error is not displayed");
		return flag;
	}
	
	/**This method will help us to verify JobAlert Name Error Displayed
	 * @author Senthil
	 * @return flag
	 */
	public void verifyJobAlertNameErrorDisplayed(){
		verifyJobAlertNameError();
		String jobAlertError = getText(errorjobAlertName);
		Assert.assertEquals(jobAlertError, NKConstants.ERROR_NAMEYOURJOBALERT, "Expected JobAlert Name Error doesnot match with the error displayed");
	}
	
	/**This method will help us to verify Name Your JobAlert textbox
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyNameYourJobAlertBox(){
		flag = isElementPresent(nameYourJobAlertBox);
		Assert.assertTrue(flag, "Name Your JobAlert textbox is not displayed");
		return flag;
	}
	
	
	/**This method will help us to Enter Skills
	 * @author Senthil
	 * @param skill "selenium"
	 * @return - void
	 * @throws Exception 
	 * 
	 * 
	 */
	public void enterSkills(String skill) throws Exception{
		Log.info("Before entering Skills");
		try{
			verifySkillsAutoBox();
			uiDriver.findElement(skillsAutoBox).sendKeys(skill);
			uiDriver.findElement(skillsAutoBox).sendKeys(Keys.ARROW_DOWN);
			uiDriver.findElement(skillsAutoBox).sendKeys(Keys.ENTER);
			Log.info("After entering Skills");
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE ENTERING SKILLS:::"+"\n enterSkills(String skill)"+e.getLocalizedMessage());
		}
	}
	
	/**This method will help us to click on Create JobAlert button
	 * @author Senthil
	 * @return - void
	 * @throws Exception 
	 * 
	 * 
	 */
	public void clickOnCreateJobAlertButton() throws Exception{
		Log.info("Before Clicking On Create JobAlert Button");
		try{
			verifyCreateJobAlertButton();
			javaScriptClick(createJobAlertButton);
			Log.info("After Clicking On Create JobAlert Button");
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE CLICKING ON CREATE JOB ALERT BUTTON:::"+"\n clickOnCreateJobAlertButton()"+e.getLocalizedMessage());
		}
		
	}
	
	/**This method will help us to Enter Job Alert Name
	 * @author Senthil
	 * @param alertName "MyJobAlert"
	 * @return - void
	 * @throws Exception 
	 * 
	 * 
	 */
	public void enterJobAlertName(String alertName) throws Exception{
		Log.info("Before Entering Job Alert Name");
		try{
			verifyNameYourJobAlertBox();
			uiDriver.findElement(nameYourJobAlertBox).clear();
			uiDriver.findElement(nameYourJobAlertBox).sendKeys(alertName);
			Log.info("After Entering Job Alert Name");
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE ENTERING Job Alert Name:::"+"\n  enterJobAlertName(String alertName)"+e.getLocalizedMessage());
		}
	}

	public void verifyCreateYourJobAlertsPageTitle() {
		String createYourJobAlertsPageTitle = getPageTitle();
		Assert.assertEquals(createYourJobAlertsPageTitle, NKConstants.PAGETITLE_CREATEJOBALERT, "Failed to navigate to Create Your JobAlerts Page");
	}
}

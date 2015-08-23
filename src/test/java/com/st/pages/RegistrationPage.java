package com.st.pages;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.st.common.NKConstants;
import com.st.util.BasePageObject;


public class RegistrationPage extends BasePageObject {
	
	
	private static Logger Log = Logger.getLogger(Logger.class.getName());
	
	/*UI Element Initialization*/
	By curRegMsg = By.tagName("h1");
	By createLoginDetails = By.xpath("//div[@id='lftcont']/div[contains(.,'Create Login Details')]");
	By yourContactInformationSection = By.xpath("//div[@id='lftcont']/div[contains(.,'Your Contact Information')]");
	By yourCurrentEmploymentDetailsSection = By.xpath("//div[@id='lftcont']/div[contains(.,'Your Current Employment Details')]");
	By yourEducationBackgroundSection = By.xpath("//div[@id='lftcont']/div[contains(.,'Your Education Background')]");
	By uploadYourDetailedResumeSection = By.xpath("//div[@class='cls padLR10']/div[contains(.,'Upload your detailed resume')]");
	By mailerAndPrivacySettingsSection = By.xpath("//div[@class='cls padLR10']/div[contains(.,'Mailer and Privacy Settings')]");
	By iAgreeCheckBox = By.xpath("//input[@id='agreetnc']");
	By termsConditionslnk  = By.xpath("//div[@class='cls padLR10']//a[contains(.,'Terms and Conditions')]");
	By joinNaukriButton = By.xpath("//input[@value='Join Naukri.com']");
	By email = By.id("email");//By.xpath("//input[@id='email']");
	By password = By.id("password");
	By emailError = By.xpath("//div[@id='error_email']");
	By confirmPassword = By.id("cpassword");
	By errorAlert = By.xpath("//div[@id='forGotPassword']");
	By alreadyRegisteredMsg = By.xpath("//div[@id='forGotPassword']/div[contains(.,'is already registered with us')]");
	By close = By.xpath("//div[@id='forGotPassword']//a[@title='Close']");
	By passwordError = By.xpath("//div[(@id='error_password')]");
	By confirmPasswordError = By.xpath("//div[(@id='error_cpassword')]");
	By fullName = By.id("cname");
	By curLocationDropdown = By.xpath("//input[@id='inpcityContainerDD']");
	By mobile = By.id("mphone");
	By landlineLink = By.xpath("//a[contains(.,'Landline no.')]");
	By countryCode = By.xpath("//input[@id='countrycode']");
	By areaCode = By.xpath("//input[@id='areacode']");
	By landLine = By.xpath("//input[@id='landline']");
	By mobileError = By.xpath("//div[(@id='error_mphone')]");
	By basicEducationError = By.xpath("//div[(@id='error_ugcourse')]");
	By experienceDropDown = By.xpath("//select[@id='expyear']");
	By skillsAutoSuggest = By.id("keywords1");
	By experienceError = By.xpath("//div[(@id='error_experience')]");
	By designation = By.id("Desig_0");
	By basicEducationDropDown = By.xpath("//select[@id='ugcourse']");
	By browseButton = By.id("inpFile");
	By nonSupportedFileError = By.xpath("//i[@id='atchResErr']");
	By pasteResumeLnk = By.xpath("//a[@id='copy_p']");
	By resumetextArea = By.xpath("//textarea[@id='txtcv']");
	By jobAlertsCheckBox = By.xpath("//div[@class='fleft cls w260']/div[contains(.,'Job Alerts')]");
	By fastforwardEmailsCheckBox = By.xpath("//div[@class='fleft cls w260']/div[contains(.,'Naukri FastForward E-Mails')]");
	By fastforwardSMSCheckBox = By.xpath("//div[@class='fleft cls w260']/div[contains(.,'Naukri FastForward Calls/SMS ')]");
	By notificationsCheckBox = By.xpath("//div[@class='fright w265']/div[contains(.,'Important Notifications from Naukri.com ')]");
	By communicationCheckBox = By.xpath("//div[@class='fright w265']/div[contains(.,'Communication from Clients(Voice/Calls/SMS')]");
	By promoCheckBox = By.xpath("//div[@class='fright w265']/div[contains(.,'Other Promotions/ Special Offers')]");
	By iAgreeError = By.xpath("//span[@id='error_agreetnc']");
	By LocationBangalore = By.linkText("Bengaluru / Bangalore");
	By locationDDError = By.xpath("//div[@id='error_location']");
	By skillsError = By.xpath("//div[@id='error_keywords']");
	
	
	public RegistrationPage(WebDriver driver){
		super(driver);
		
	}
	
	
	
	
	/*Variable Initialization*/
	boolean flag = false;
	
	
	/**This method will help us to verify Registration Page Message
	 * @author Senthil
	 * @return flag
	 */
	public void verifyRegistrationPageMessage(){
		String regMessage = getText(curRegMsg);
		Assert.assertEquals(regMessage, NKConstants.MESSAGE_REGISTRATIONPAGE, "Expected Registration Page Message is not displayed");
		
		
	}
	
	
	/**This method will help us to verify Create Login Details Section
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyCreateLoginDetailsSection(){
		flag = isElementPresent(createLoginDetails);
		Assert.assertTrue(flag, "Create Login Details Section is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Your Contact Information section
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyYourContactInformationSection(){
		flag = isElementPresent(yourContactInformationSection);
		Assert.assertTrue(flag, "Your Contact Information section is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Your Current Employment Details Section
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyYourCurrentEmploymentDetailsSection(){
		flag = isElementPresent(yourCurrentEmploymentDetailsSection);
		Assert.assertTrue(flag, "Your Current Employment Details section is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Your Education Background section
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyYourEducationBackgroundSection(){
		flag = isElementPresent(yourEducationBackgroundSection);
		Assert.assertTrue(flag, "Your Education Background section is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Upload Your Detailed Resume section
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyUploadYourDetailedResumeSection(){
		flag = isElementPresent(uploadYourDetailedResumeSection);
		Assert.assertTrue(flag, "Upload Your Detailed Resume section is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Mailer And Privacy Settings Section
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyMailerAndPrivacySettingsSection(){
		flag = isElementPresent(mailerAndPrivacySettingsSection);
		Assert.assertTrue(flag, "Mailer And Privacy Settings Section is not displayed");
		return flag;
	}
	
	/**This method will help us to verify I Agree Checkbox
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyIAgreeCheckbox(){
		flag = isElementPresent(iAgreeCheckBox);
		Assert.assertTrue(flag, "I Agree Checkbox is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Terms And Conditions link
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyTermsConditionslink(){
		flag = isElementPresent(termsConditionslnk);
		Assert.assertTrue(flag, "Terms And Conditions link is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Join Naukri Button
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyJoinNaukriButton(){
		flag = isElementPresent(joinNaukriButton);
		Assert.assertTrue(flag, "Join Naukri Button is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Email Field
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyEmailField(){
		flag = isElementPresent(email);
		Assert.assertTrue(flag, "Email Field is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Password Field
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyPasswordField(){
		flag = isElementPresent(password);
		Assert.assertTrue(flag, "Password Field is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Email Error
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyEmailError(){
		flag = isElementPresent(emailError);
		Assert.assertTrue(flag, "Email Error is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Email Error
	 * @author Senthil
	 * @return flag
	 */
	public void verifyEmailErrorDisplayed(){
		verifyEmailError();
		String emailErrorDisplayed = getText(emailError);
		Assert.assertEquals(emailErrorDisplayed, NKConstants.ERROR_EMAIL, "Email Error doesnot match with the expected error ");
		
	}
	
	/**This method will help us to verify Password Error
	 * @author Senthil
	 * @return flag
	 */
	public void verifyPasswordErrorDisplayed(){
		verifyPasswordError();
		String passwordErrorDisplayed = getText(passwordError);
		Assert.assertEquals(passwordErrorDisplayed, NKConstants.ERROR_PASSWORD, "Password Error doesnot match with the expected error ");
		
	}
	
	/**This method will help us to verify Confirm Password Field
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyConfirmPassword(){
		flag = isElementPresent(confirmPassword);
		Assert.assertTrue(flag, "Confirm Password Field is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Error Alert
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyErrorAlert(){
		flag = isElementPresent(errorAlert);
		Assert.assertTrue(flag, "Error Alert is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Already Registered Message
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyAlreadyRegisteredMsg(){
		flag = isElementPresent(alreadyRegisteredMsg);
		Assert.assertTrue(flag, "Already Registered Message is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Close(X)
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyClose(){
		flag = isElementPresent(close);
		Assert.assertTrue(flag, "Close(X) is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Password Error
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyPasswordError(){
		flag = isElementPresent(passwordError);
		Assert.assertTrue(flag, "Password Error is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Confirm Password Error
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyConfirmPasswordError(){
		flag = isElementPresent(confirmPasswordError);
		Assert.assertTrue(flag, "Confirm Password Error is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Confirm Password Error displayed
	 * @author Senthil
	 * @return flag
	 */
	public void verifyConfirmPasswordErrorDisplayed(){
		verifyConfirmPasswordError();
		String cPwdError = getText(confirmPasswordError);
		Assert.assertEquals(cPwdError, NKConstants.ERROR_CONFIRMPASSWORD, "Expected Confirm Password Error doesnot match with the error displayed");
	}
	
	/**This method will help us to verify Full Name Field
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyFullNameField(){
		flag = isElementPresent(fullName);
		Assert.assertTrue(flag, "Full Name Field is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Current Location Dropdown
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyCurrentLocationDropdown(){
		flag = isElementPresent(curLocationDropdown);
		Assert.assertTrue(flag, "Current Location Dropdown is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Location Dropdown Error
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyLocationDropdownError(){
		flag = isElementPresent(locationDDError);
		Assert.assertTrue(flag, "Location Dropdown Error is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Location Dropdown Error Displayed
	 * @author Senthil
	 * @return flag
	 */
	public void verifyLocationDDErrorDisplayed(){
		verifyLocationDropdownError();
		String locError = getText(locationDDError);
		Assert.assertEquals(locError, NKConstants.ERROR_CURRENTLOCATION, "Expected Location Dropdown Error doesnot match with the displayed error");
	}
	
	/**This method will help us to verify Mobile Number field
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyMobileNumberField(){
		flag = isElementPresent(mobile);
		Assert.assertTrue(flag, "Mobile Number field is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Landline link
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyLandlineLink(){
		flag = isElementPresent(landlineLink);
		Assert.assertTrue(flag, "Landline link is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Country Code field
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyCountryCode(){
		flag = isElementPresent(countryCode);
		Assert.assertTrue(flag, "Country Code field is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Area Code field
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyAreaCode(){
		flag = isElementPresent(areaCode);
		Assert.assertTrue(flag, "Area Code field is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Land line field
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyLandLine(){
		flag = isElementPresent(landLine);
		Assert.assertTrue(flag, "Land line field is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Mobile number Error
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyMobileNumberError(){
		flag = isElementPresent(mobileError);
		Assert.assertTrue(flag, "Mobile number Error is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Mobile number Error
	 * @author Senthil
	 * @param errorExpectedmobilenumber 
	 * @return flag
	 */
	public void verifyMobileNumberErrorDisplayed(String errorExpectedmobilenumber){
		verifyMobileNumberError();
		String mobileErr = getText(mobileError);
		Assert.assertEquals(mobileErr, errorExpectedmobilenumber, "Expected Mobile number Error doesnot match with the displayed error");
	}
	
	/**This method will help us to verify Skills Error 
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifySkillsError(){
		flag = isElementPresent(skillsError);
		Assert.assertTrue(flag, "Skills Error is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Skills Error Displayed
	 * @author Senthil
	 * @param Skills 
	 * @return flag
	 */
	public void verifySkillsErrorDisplayed(String errorskills){
		verifySkillsError();
		String skillerr = getText(skillsError);
		Assert.assertEquals(skillerr, errorskills, "Expected skills Error doesnot match with the displayed error");
	}
	
	
	/**This method will help us to verify Basic Education Error
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyBasicEducationError(){
		flag = isElementPresent(basicEducationError);
		Assert.assertTrue(flag, "Basic Education Error is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Basic Education Error Displayed
	 * @author Senthil
	 * @return flag
	 */
	public void verifyBasicEducationErrorDisplayed(){
		verifyBasicEducationError();
		String eduError = getText(basicEducationError);
		Assert.assertEquals(eduError, NKConstants.ERROR_BASICEDUCATION, "Basic Education Error is not displayed");
		
	}
	
	/**This method will help us to verify Experience DropDown
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyExperienceDropDown(){
		flag = isElementPresent(experienceDropDown);
		Assert.assertTrue(flag, "Experience DropDown is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Skills AutoSuggest box
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifySkillsAutoSuggest(){
		flag = isElementPresent(skillsAutoSuggest);
		Assert.assertTrue(flag, "skills AutoSuggest box is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Experience Error
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyExperienceError(){
		flag = isElementPresent(experienceError);
		Assert.assertTrue(flag, "Experience Error is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Experience Error displayed
	 * @author Senthil
	 * @return flag
	 */
	public void verifyExperienceErrorDisplayed(){
		verifyExperienceError();
		String expError = getText(experienceError);
		Assert.assertEquals(expError, NKConstants.ERROR_EXPERIENCE, "Experience Error is not displayed");
	}
	
	/**This method will help us to verify Designation field
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyDesignationField(){
		flag = isElementPresent(designation);
		Assert.assertTrue(flag, "Designation field is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Basic Education DropDown
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyBasicEducationDropDown(){
		flag = isElementPresent(basicEducationDropDown);
		Assert.assertTrue(flag, "Basic Education DropDown is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Browse Button
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyBrowseButton(){
		flag = isElementPresent(browseButton);
		Assert.assertTrue(flag, "Browse Button is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Non-Supported File Error
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyNonSupportedFileError(){
		flag = isElementPresent(nonSupportedFileError);
		Assert.assertTrue(flag, "Non-Supported File Error is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Non-Supported File Error Displayed
	 * @author Senthil
	 * @return flag
	 */
	public void verifyNonSupportedFileErrorDisplayed(){
		verifyNonSupportedFileError();
		String fileError = getText(nonSupportedFileError);
		Assert.assertEquals(fileError, NKConstants.ERROR_INVALIDFILEPATH, "Expected Non-Supported File Error doesnot match wjth the displayed error");
			
	}
	
	/**This method will help us to verify Paste Resume Link
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyPasteResumeLnk(){
		flag = isElementPresent(pasteResumeLnk);
		Assert.assertTrue(flag, "Paste Resume Link is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Resume Text Area
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyTextArea(){
		flag = isElementPresent(resumetextArea);
		Assert.assertTrue(flag, "Resume Text Area is not displayed");
		return flag;
	}
	
	/**This method will help us to verify JobAlerts CheckBox
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyJobAlertsCheckBox(){
		flag = isElementPresent(jobAlertsCheckBox);
		Assert.assertTrue(flag, "JobAlerts CheckBox is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Fastforward Emails CheckBox
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyFastforwardEmailsCheckBox(){
		flag = isElementPresent(fastforwardEmailsCheckBox);
		Assert.assertTrue(flag, "Fastforward Emails CheckBox is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Fastforward SMS CheckBox
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyFastforwardSMSCheckBox(){
		flag = isElementPresent(fastforwardSMSCheckBox);
		Assert.assertTrue(flag, "Fastforward SMS CheckBox is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Notifications CheckBox
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyNotificationsCheckBox(){
		flag = isElementPresent(notificationsCheckBox);
		Assert.assertTrue(flag, "Notifications CheckBox is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Communication CheckBox
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyCommunicationCheckBox(){
		flag = isElementPresent(communicationCheckBox);
		Assert.assertTrue(flag, "Communication CheckBox is not displayed");
		return flag;
	}
	
	/**This method will help us to verify Promo CheckBox
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyPromoCheckBox(){
		flag = isElementPresent(promoCheckBox);
		Assert.assertTrue(flag, "Promo CheckBox is not displayed");
		return flag;
	}
	
	/**This method will help us to verify I Agree Error
	 * @author Senthil
	 * @return flag
	 */
	public boolean verifyIAgreeError(){
		flag = isElementPresent(iAgreeError);
		Assert.assertTrue(flag, "I Agree Error is not displayed");
		return flag;
	}
	
	/**This method will help us to verify I Agree Error displayed
	 * @author Senthil
	 * @return flag
	 */
	public void verifyIAgreeErrorDisplayed(){
		verifyIAgreeError();
		String errorIAgree = getText(iAgreeError);
		Assert.assertEquals(errorIAgree, NKConstants.ERROR_IAGREE, "Expected I Agree Error doesnot match with the error displayed");
	}
	
	/**This method will help us to verify RegistrationPage Title
	 * @author Senthil
	 * @return flag
	 */
	public void verifyRegistrationPageTitle(){
		String pageTitle = getPageTitle();
		compareTwoStrings(pageTitle, NKConstants.PAGETITLE_REGISTRATION, "Failed to load Registration page");
		//Assert.assertEquals(pageTitle, NKConstants.PAGETITLE_REGISTRATION, "Failed to load Registration page");
		
	}
	
	/**This method will help us to Click on Email Field
	 * @author Senthil
	 * @throws Exception 
	 */	
	public void clickOnEmailfield() throws Exception{
		Log.info("Before Clicking on Email Field");
		try{
		verifyEmailField();
		uiDriver.findElement(email).click();
		uiDriver.findElement(email).clear();
		Log.info("After Clicking on Email Field");
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE CLICKING ON EMAIL FIELD:::"+"\n clickOnEmailfield()"+e.getLocalizedMessage());
			
		}
		
	}
	
	/**This method will help us to Click on Password Field
	 * @author Senthil
	 * @throws Exception 
	 */	
	public void clickOnPasswordfield() throws Exception{
		Log.info("Before Clicking on Password Field");
		try{
		verifyPasswordField();
		uiDriver.findElement(password).click();
		uiDriver.findElement(password).clear();
		Log.info("After Clicking on Password Field");
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE CLICKING ON PASSWORD FIELD"+"\n clickOnPasswordfield()"+e.getLocalizedMessage());
			
		}
		
	}
	
	/**This method will help us to Click on Close(X)
	 * @author Senthil
	 * @throws Exception 
	 */	
	public void clickOnClose() throws Exception{
		Log.info("Before Clicking on Close(X)");
		try{
		verifyClose();
		javaScriptClick(close);
		Log.info("After Clicking on Close(X)");
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE CLICKING ON CLOSE(x):::"+"\n clickOnClose()"+e.getLocalizedMessage());
		}
				
	}
	
	/**This method will help us to Click on ConfirmPassword field
	 * @author Senthil
	 * @throws Exception 
	 */	
	public void clickOnConfirmPasswordField() throws Exception{
		Log.info("Before Clicking on ConfirmPassword field");
		try{
		verifyConfirmPassword();
		uiDriver.findElement(confirmPassword).click();
		uiDriver.findElement(confirmPassword).clear();
		Log.info("After Clicking on ConfirmPassword field");
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE CLICKING ON CONFIRM PASSWORD FIELD:::"+"\n clickOnConfirmPasswordField()"+e.getLocalizedMessage());
		}
				
	}
	
	/**This method will help us to Click on Full Name field
	 * @author Senthil
	 * @throws Exception 
	 */	
	public void clickOnNameField() throws Exception{
		Log.info("Before Clicking on Name field");
		try{
		verifyFullNameField();
		uiDriver.findElement(fullName).click();
		Log.info("After Clicking on Name field");
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE CLICKING ON NAME FIELD:::"+"\n clickOnNameField()"+e.getLocalizedMessage());
		}
	}
	
	/**This method will help us to Click on Currrent Location Dropdown
	 * @author Senthil
	 * @throws Exception 
	 */	
	public void clickOnCurrrentLocationDropdown() throws Exception{
		Log.info("Before Clicking on Location Dropdown");
		try{
		verifyCurrentLocationDropdown();
		uiDriver.findElement(curLocationDropdown).click();
		Log.info("After Clicking on Location Dropdown");
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE CLICKING ON CURRENT LOCATION DROPDOWN:::"+"\n clickOnCurrrentLocationDropdown()"+e.getLocalizedMessage());
		}
				
	}
	
	/**This method will help us to Click on Landline field
	 * @author Senthil
	 * @throws Exception 
	 */	
	public void clickOnLandlineLink() throws Exception{
		Log.info("Before Clicking on Landline Link");
		try{
		verifyLandlineLink();
		uiDriver.findElement(landlineLink).click();
		Log.info("After Clicking on Landline Link");
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE CLICKING ON LANDLINE LINK:::"+"\n clickOnLandlineLink()"+e.getLocalizedMessage());
		}
		
				
	}
	
	/**This method will help us to Click on Join Naukri Button
	 * @author Senthil
	 * @throws Exception 
	 */	
	public void clickOnJoinNaukriButton() throws Exception{
		Log.info("Before Clicking on Join Naukri Button");
		try{
		verifyJoinNaukriButton();
		javaScriptClick(joinNaukriButton);
		Log.info("After Clicking on Join Naukri Button");
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE CLICKING ON JOIN NAUKRI BUTTON:::"+"\n clickOnJoinNaukriButton()"+e.getLocalizedMessage());
		}
				
	}
	
	
	
	/**This method will help us to Click on Skills field
	 * @author Senthil
	 * @throws Exception 
	 */	
	public void clickOnSkillsField() throws Exception{
		Log.info("Before Clicking on Skills field");
		try{
		verifySkillsAutoSuggest();
		javaScriptClick(skillsAutoSuggest);
		Log.info("After Clicking on Skills field");
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE CLICKING ON SKILLS AUTOSUGGEST FIELD"+"\n clickOnSkillsField()"+e.getLocalizedMessage());
		}
				
	}
	
	/**This method will help us to Click on Mobile field
	 * @author Senthil
	 * @throws Exception 
	 */	
	public void clickOnMobilefield() throws Exception{
		Log.info("Before Clicking on Mobile field");
		try{
		verifyMobileNumberField();
		uiDriver.findElement(mobile).click();
		Log.info("After Clicking on Mobile field");
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE CLICKING ON MOBILE FILED:::"+"\n clickOnMobilefield()"+e.getLocalizedMessage());
		}
				
	}
	
	/**This method will help us to Click on Paste Resume Link
	 * @author Senthil
	 * @throws Exception 
	 */	
	public void clickOnPasteResumeLink() throws Exception{
		Log.info("Before Clicking on Paste Resume Link");
		try{
		verifyPasteResumeLnk();
		uiDriver.findElement(pasteResumeLnk).click();
		Log.info("After Clicking on Paste Resume Link");
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE CLICKING ON PASTE RESUME LINK:::"+"\n clickOnPasteResumeLink()"+e.getLocalizedMessage());
		}
	}
	
	/**This method will help us to Click on I Agree CheckBox
	 * @author Senthil
	 * @throws Exception 
	 */	
	public void clickOnIAgreeCheckBox() throws Exception{
		Log.info("Before Clicking on I Agree CheckBox");
		try{
		verifyIAgreeCheckbox();
		uiDriver.findElement(iAgreeCheckBox).click();
		Log.info("After Clicking on I Agree CheckBox");
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE CLICKING ON I AGREE CHECKBOX:::"+"\n clickOnIAgreeCheckBox()"+e.getLocalizedMessage());
		}
				
	}
	
	/**This method will help us to Select Bangalore from Location Dropdown
	 * @author Senthil
	 * @throws Exception 
	 */	
	public void selectBangalore() throws Exception{
		Log.info("Before Selecting Bangalore from Location Dropdown");
		try{
		uiDriver.findElement(LocationBangalore).click();
		Log.info("After Selecting Bangalore from Location Dropdown");		
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE SELECTING BANGALORE FROM LOCATION DROPDOWN:::"+"\n clickOnBlore()"+e.getLocalizedMessage());	
			
		}
	}
	
	/**This method will help us to Enter text in Email Field
	 * @author Senthil
	 * @param emailId
	 * @throws Exception 
	 */	
	public void enterEmail(String emailID) throws Exception{
		Log.info("Before entering emailId");
		try{
			verifyEmailField();
			uiDriver.findElement(email).clear();
			uiDriver.findElement(email).sendKeys(emailID);
			Log.info("After entering emailId");
			Thread.sleep(2000);
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE ENTERING EMAIL ID:::"+"\n enterEmail()"+e.getLocalizedMessage());
		}
	}
	
	/**This method will help us to Enter text in Email Field
	 * @author Senthil
	 * @param emailId
	 * @throws Exception 
	 *//*	
	public void enterEmail(String emailID) throws Exception{		
		clearAndEnterValueInTextBox(email, emailID);
		}*/
	
	/**This method will help us to Enter text in Password Field
	 * @author Senthil
	 * @param pwd
	 * @throws Exception 
	 */	
	public void enterPassword(String pwd) throws Exception{
		Log.info("Before entering password");
		try{
			verifyPasswordField();
			uiDriver.findElement(password).clear();
			uiDriver.findElement(password).sendKeys(pwd);
			Log.info("After entering password");
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE ENTERING PASSWORD:::"+"\n enterPassword(pwd)"+e.getLocalizedMessage());
		}
	}
	
	/**This method will help us to Enter text in Confirm Password Field
	 * @author Senthil
	 * @param cpwd
	 * @throws Exception 
	 */	
	public void enterConfirmPassword(String cpwd) throws Exception{
		Log.info("Before entering confirm password");
		try{
			verifyConfirmPassword();
			uiDriver.findElement(confirmPassword).clear();
			uiDriver.findElement(confirmPassword).sendKeys(cpwd);
			Log.info("After entering confirm password");
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE ENTERING CONFIRM PASSWORD:::"+"\n enterConfirmPassword(cpwd)"+e.getLocalizedMessage());
		}
	}
	
	/**This method will help us to Enter text in Full name Field
	 * @author Senthil
	 * @param emailId
	 * @throws Exception 
	 */	
	public void enterFullName(String name) throws Exception{
		Log.info("Before entering Full name");
		try{
			verifyFullNameField();
			uiDriver.findElement(fullName).sendKeys(name);
			Log.info("After entering Full name");
			Thread.sleep(2000);
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE ENTERING FULL NAME:::"+"\n enterFullName()"+e.getLocalizedMessage());
		}
	}
	
	/**This method will help us to Enter Mobile number
	 * @author Senthil
	 * @param mobNum
	 * @throws Exception 
	 */	
	public void enterMobileNumber(String mobNum) throws Exception{
		Log.info("Before entering Mobile number");
		try{
			verifyMobileNumberField();
			uiDriver.findElement(mobile).clear();
			uiDriver.findElement(mobile).sendKeys(mobNum);
			Log.info("After entering Mobile number");
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE ENTERING MOBILE NUMBER:::"+"\n enterMobileNumber(mobNum)"+e.getLocalizedMessage());
		}
	}
	
	/**This method will help us to Select Experience from Experience Dropdown
	 * @author Senthil
	 * @param exp
	 * @throws Exception 
	 */	
	public void selectExperience(String exp) throws Exception{
		Log.info("Before Selecting Experience");
		try{
			verifyExperienceDropDown();
			new Select(uiDriver.findElement(experienceDropDown)).selectByVisibleText(exp);
	    	Log.info("After Selecting Experience");
			
			}
		catch(Exception e){
			throw new Exception("FAILED WHILE SELECTING EXPERIENCE:::"+"\n selectExperience(exp)"+e.getLocalizedMessage());
		}
	}
	
	/**This method will help us to enter Designation
	 * @author Senthil
	 * @param design
	 * @throws Exception 
	 */	
	public void enterDesignation(String design) throws Exception{
		Log.info("Before Entering Designation");
		try{
			verifyDesignationField();
			uiDriver.findElement(designation).sendKeys(design);
			Log.info("After Entering Designation");
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE ENTERING DESIGNATION:::"+"\n enterDesignation(design)"+e.getLocalizedMessage());
		}
	}
	
	/**This method will help us to enter Skills
	 * @author Senthil
	 * @param skill
	 * @throws Exception 
	 */	
	public void enterSkills(String skill) throws Exception{
		Log.info("Before Entering Skills");
		try{
			clickOnSkillsField();
			uiDriver.findElement(skillsAutoSuggest).sendKeys(skill);
			Log.info("After Entering Skills");
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE ENTERING SKILLS:::"+"\n enterSkills(skill)"+e.getLocalizedMessage());
		}
	}
	
	/**This method will help us to select Basic Education
	 * @author Senthil
	 * @param  bedu
	 * @throws Exception 
	 */	
	public void selectBasicEducation(String bedu) throws Exception{
		Log.info("Before Selecting Basic Education");
		try{
			verifyBasicEducationDropDown();
			new Select(uiDriver.findElement(basicEducationDropDown)).selectByVisibleText(bedu);
			Log.info("After Selecting Basic Education");
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE SELECTING BASIC EDUCATION:::"+"\n selectBasicEducation(bedu)"+e.getLocalizedMessage());
		}
	}
	
	/**This method will help us to choose file path using browse button
	 * @author Senthil
	 * @param fPath
	 * @throws Exception 
	 */	
	public void chooseFilepath(String fPath) throws Exception{
		Log.info("Before Choosing file path");
		try{
			verifyBrowseButton();
			uiDriver.findElement(browseButton).sendKeys(fPath);
			Log.info("After Choosing file path");
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE CHOOSING FILE PATH:::"+"\n chooseFilepath(fPath)"+e.getLocalizedMessage());
		}
	}
	
	/**This method will help us to Enter text in Resume text area
	 * @author Senthil
	 * @param  rText
	 * @throws Exception 
	 */	
	public void enterResumeText(String rText) throws Exception{
		Log.info("Before Entering text in Resume text area");
		try{
			verifyTextArea();
			uiDriver.findElement(resumetextArea).sendKeys(rText);
			Log.info("After Entering text in Resume text area");
		}
		catch(Exception e){
			throw new Exception("FAILED WHILE ENTERING TEXT IN RESUME TEXT AREA:::"+"\n enterResumeText(rText)"+e.getLocalizedMessage());
		}
	}


	public void verifyUploadedFile() {
		verifyBrowseButton();
		String docName = uiDriver.findElement(browseButton).getAttribute("value").trim();
		Assert.assertEquals(docName, NKConstants.UPLOADEDFILENAME, "The uploaded file names doesnot match with the displayed file name");
  	}
	
}

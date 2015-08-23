package com.nk.pages;

import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.nk.common.NKConstants;
import com.nk.util.BasePageObject;

public class SaveMyProfilePage extends BasePageObject {
	
		
	private static Logger Log = Logger.getLogger(Logger.class.getName());
	
	/*UI Element Initialization*/
	
	By registrationSuccessfulMsg = By.xpath("//div[(@class='grnbor fleft') and contains(.,'Congratulations') and contains(.,'Your account has been created.')]");
	By headerWelcome = By.xpath("//div[contains(@class,'fright')]");
	By headerLogoutLink = By.xpath("//a[contains(.,'Logout')]");
	By reportAProblemLink = By.xpath("//div[contains(@class,'fright')]/a[contains(.,'Report a Problem')]");
	By profileInformation = By.xpath("//div[@id='lftcont']/div[contains(.,'Profile Information')]");
	By educationDetails = By.xpath("//div[(@class='cls padLR10') and contains(.,'Education Details')]");
	By workExperience = By.xpath("//div[(@class='cls padLR10') and (contains(.,'Work Experience'))]");
	By currentPosition = By.xpath("//div[(@class='cls padLR10') and (contains(.,'Current Position/Employer'))]");
	By saveMyProfileButton = By.xpath("//input[@value='Save my Profile']");
	By resumeHeadline = By.xpath("//input[@id='resumeheadline']");
	By currentIndustryDropdown = By.xpath("//select[@id='industry']");
	By functionalAreaDropdown = By.xpath("//select[@id='farea']");
	By roledropdown = By.xpath("//select[@id='role']");
	By industryError = By.xpath("//div[@id='error_industry']");
	By functionalAreaError = By.xpath("//div[(@id='error_farea')]");
	By roleError = By.xpath("//div[@id='error_role']");
	By companyName = By.id("Orgn_0");
	By designation = By.id("Desig_0");
	By salLacsDD = By.xpath("//select[@id='ctclacs']");
	By salThousandsDD = By.xpath("//select[@id='ctcthousands']");
	By salError = By.xpath("//div[(@id='error_ctc') and contains(.,'Please select your current annual salary')]");
	By rupeesRadioButton = By.xpath("//input[@id='ctctype_i']");
	By dollorsRadioButton = By.xpath("//input[@id='ctctype_u']");
	By fromMonthDD = By.xpath("//div[4]//select[@id='fromMM[]']");
	By fromYearDD = By.xpath("//div[4]//select[@id='fromYYYY[]']");
	By toMonthDD = By.xpath("//div[4]//select[@id='toMM[]']");
	By toYearDD = By.xpath("//div[4]//select[@id='toYYYY[]']");
	By noticePeriodDD = By.xpath("//select[@id='NOTICEPERIOD']");
	By jobProfile = By.xpath("//div[6]/textarea[@id='profile[]']");
	By specializationError = By.xpath("//div[@id='error_ugspec']");
	By institutionError = By.xpath("//div[@id='error_uginst']");
	By yearOfCompletionError = By.xpath("//div[@id='error_ugyear']");
	By specializationDropdown = By.xpath("//select[@id='ugspec']");
	By institutionDropdown = By.xpath("//select[@id='uginst']");
	By yearOfCompletionDropdown = By.xpath("//select[@id='ugyear']");
	
	public SaveMyProfilePage(WebDriver driver){
		super(driver);
	}
		
	
	/*Variable Initialization*/
	 boolean flag = false;
	 
	 /**This method will help us to verify Save MyProfile Page Title
		 * @author Senthil
		 * @return flag
		 */
		public void verifySaveMyProfilePageTitle(){
			String pageTitle = getPageTitle();
			Assert.assertEquals(pageTitle, NKConstants.PAGETITLE_SAVEMYPROFILEPAGE, "Failed to load Complete MyProfile page");
			
	}		
		
	 /**This method will help us to verify Registration Successful Message
		 * @author Senthil
		 * @return flag
		 */
	 public boolean verifyRegistrationSuccessfulMsg(){
		  flag = isElementPresent(registrationSuccessfulMsg);
		 Assert.assertTrue(flag, "Registration Successful Message is not displayed");
		 return flag;
		 
	 }
	 
	 /**This method will help us to verify Header Welcome section
		 * @author Senthil
		 * @return flag
		 */
	 public boolean verifyHeaderWelcomeSection(){
		 flag = isElementPresent(headerWelcome);
		 Assert.assertTrue(flag, "Header Welcome section is not displayed");
		 return flag;
		 
	 }
	 
	 /**This method will help us to verify Header Logout link
		 * @author Senthil
		 * @return flag
		 */
	 public boolean verifyHeaderLogoutlink(){
		 flag = isElementPresent(headerLogoutLink);
		 Assert.assertTrue(flag, "Header Logout link is not displayed");
		 return flag;
		 
	 }
	 
	 /**This method will help us to verify Report A Problem Link
		 * @author Senthil
		 * @return flag
		 */
	 public boolean verifyReportAProblemLink(){
		 flag = isElementPresent(reportAProblemLink);
		 Assert.assertTrue(flag, "Report A Problem Link is not displayed");
		 return flag;
	 }
	 
	 /**This method will help us to verify Profile Information
		 * @author Senthil
		 * @return flag
		 */
	 public boolean verifyProfileInformationSection(){
		 flag = isElementPresent(profileInformation);
		 Assert.assertTrue(flag, "Profile Information Section is not displayed");
		 return flag;
	 }
	 
	 /**This method will help us to verify Education Details
		 * @author Senthil
		 * @return flag
		 */
	 public boolean verifyEducationDetailsSection(){
		 flag = isElementPresent(educationDetails);
		 Assert.assertTrue(flag, "Education Details Section is not displayed");
		 return flag;
	 }
	 
	 /**This method will help us to verify Work Experience
		 * @author Senthil
		 * @return flag
		 */
	 public boolean verifyWorkExperienceSection(){
		 flag = isElementPresent(workExperience);
		 Assert.assertTrue(flag, "Work Experience Section is not displayed");
		 return flag;
	 }
	 
	 /**This method will help us to verify Current Position
		 * @author Senthil
		 * @return flag
		 */
	 public boolean verifyCurrentPositionSection(){
		 flag = isElementPresent(currentPosition);
		 Assert.assertTrue(flag, "Current Position Section is not displayed");
		 return flag;
	 }
	 
	 /**This method will help us to verify Save MyProfile Button
		 * @author Senthil
		 * @return flag
		 */
	 public boolean verifySaveMyProfileButton(){
		 flag = isElementPresent(saveMyProfileButton);
		 Assert.assertTrue(flag, "Save MyProfile Button is not displayed");
		 return flag;
	 }
	 
	 /**This method will help us to verify Resume Headline
		 * @author Senthil
		 * @return flag
		 */
	 public boolean verifyResumeHeadlineSection(){
		 flag = isElementPresent(resumeHeadline);
		 Assert.assertTrue(flag, "Resume Headline is not displayed");
		 return flag;
	 }
	 
	 /**This method will help us to verify Specialization Dropdown
		 * @author Senthil
		 * @return flag
		 */
	 public boolean verifySpecializationDropdown(){
		 flag = isElementPresent(specializationDropdown);
		 Assert.assertTrue(flag, "Specialization Dropdown is not displayed");
		 return flag;
	 }
	 
	 /**This method will help us to verify Institution Dropdown
		 * @author Senthil
		 * @return flag
		 */
	 public boolean verifyInstitutionDropdown(){
		 flag = isElementPresent(institutionDropdown);
		 Assert.assertTrue(flag, "Institution Dropdown is not displayed");
		 return flag;
	 }
	 
	 /**This method will help us to verify Year Of Completion Dropdown
		 * @author Senthil
		 * @return flag
		 */
	 public boolean verifyYearOfCompletionDropdown(){
		 flag = isElementPresent(yearOfCompletionDropdown);
		 Assert.assertTrue(flag, "Year Of Completion Dropdown is not displayed");
		 return flag;
	 }
	 
	 
	 /**This method will help us to verify Current Industry Dropdown
		 * @author Senthil
		 * @return flag
		 */
	 public boolean verifyCurrentIndustryDropdown(){
		 flag = isElementPresent(currentIndustryDropdown);
		 Assert.assertTrue(flag, "Current Industry Dropdown is not displayed");
		 return flag;
	 }
	 
	 
	 /**This method will help us to verify Functional Area Dropdown
		 * @author Senthil
		 * @return flag
		 */
	 public boolean verifyFunctionalAreaDropdown(){
		 flag = isElementPresent(functionalAreaDropdown);
		 Assert.assertTrue(flag, "Functional Area Dropdown is not displayed");
		 return flag;
	 }
	 
	 /**This method will help us to verify Role Dropdown
		 * @author Senthil
		 * @return flag
		 */
	 public boolean verifyRoleDropdown(){
		 flag = isElementPresent(roledropdown);
		 Assert.assertTrue(flag, "RoleDropdown is not displayed");
		 return flag;
	 }
	 
	 /**This method will help us to verify Error on Not Selecting Industry
		 * @author Senthil
		 * @return flag
		 */
	 public boolean verifyIndustryError(){
		 flag = isElementPresent(industryError);
		 Assert.assertTrue(flag, "Error on Not Selecting Industry is not displayed");
		 return flag;
	 }
	 
	 /**This method will help us to verify Error Displayed on Not Selecting Industry
		 * @author Senthil
		 * @return flag
		 */
	 public void verifyIndustryErrorDisplayed(){
		 verifyIndustryError();
		 String indError = getText(industryError);
		 Assert.assertEquals(indError, NKConstants.ERROR_INDUSTRY, "Expected Error on Not Selecting Industry doesnot match eith the displayed error");
	 }
	 
	 /**This method will help us to verify Error on Not Selecting Functional area
		 * @author Senthil
		 * @return flag
		 */
	 public boolean verifyFunctionalAreaError(){
		 flag = isElementPresent(functionalAreaError);
		 Assert.assertTrue(flag, "Error on Not Selecting Functional area is not displayed");
		 return flag;
	 }
	 
	 /**This method will help us to verify Error Displayed on Not Selecting Functional area
		 * @author Senthil
		 * @return flag
		 */
	 public void verifyFunctionalAreaErrorDisplayed(){
		 verifyFunctionalAreaError();
		 String funError = getText(functionalAreaError);
		 Assert.assertEquals(funError, NKConstants.ERROR_FUNCTIONALAREA, "Expected Error on Not Selecting Functional area doesnot match eith the displayed error");
	 }
	 
	 /**This method will help us to verify Error on Not Selecting Role
		 * @author Senthil
		 * @return flag
		 */
	 public boolean verifyRoleError(){
		 flag = isElementPresent(roleError);
		 Assert.assertTrue(flag, "Error on Not Selecting Role is not displayed");
		 return flag;
	 }
	 
	 /**This method will help us to verify Error Displayed on Not Selecting Role
		 * @author Senthil
		 * @return flag
		 */
	 public void verifyRoleErrorDisplayed(){
		 verifyRoleError();
		 String rolError = getText(roleError);
		 Assert.assertEquals(rolError, NKConstants.ERROR_ROLE, "Expected Error on Not Selecting Role doesnot match eith the displayed error");
	 }
	 
	 /**This method will help us to verify Company Name field
		 * @author Senthil
		 * @return flag
		 */
	 public boolean verifyCompany(){
		 flag = isElementPresent(companyName);
		 Assert.assertTrue(flag, "Company Name field is not displayed");
		 return flag;
	 }
	 
	 /**This method will help us to verify Designation field
		 * @author Senthil
		 * @return flag
		 */
	 public boolean verifyDesignation(){
		 flag = isElementPresent(designation);
		 Assert.assertTrue(flag, "Designation field is not displayed");
		 return flag;
	 }
	 
	 /**This method will help us to verify Salary in Lacs Dropdown
		 * @author Senthil
		 * @return flag
		 */
	 public boolean verifySalLacsDD(){
		 flag = isElementPresent(salLacsDD);
		 Assert.assertTrue(flag, "Salary in Lacs Dropdown is not displayed");
		 return flag;
	 }
	 
	 /**This method will help us to verify Salary in Thousands Dropdown
		 * @author Senthil
		 * @return flag
		 */
	 public boolean verifySalThousandsDD(){
		 flag = isElementPresent(salThousandsDD);
		 Assert.assertTrue(flag, "Salary in Thousands Dropdown is not displayed");
		 return flag;
	 }
	 
	 /**This method will help us to verify Error when Salary is not selected
		 * @author Senthil
		 * @return flag
		 */
	 public boolean verifySalaryError(){
		 flag = isElementPresent(salError);
		 Assert.assertTrue(flag, "Error when Salary is not selected is not displayed");
		 return flag;
	 }
	 
	 /**This method will help us to verify Error displayedwhen Salary is not selected
		 * @author Senthil
		 * @return flag
		 */
	 public void verifySalaryErrorDisplayed(){
		 verifySalaryError();
		 String salaryError = getText(salError);
		 Assert.assertEquals(salaryError, NKConstants.ERROR_SALARY, "Expected Error when Salary is not selected doesnot match with the displayed error");
	 }

	 
	 /**This method will help us to verify Rupees Radio Button
		 * @author Senthil
		 * @return flag
		 */
	 public boolean verifyRupeesRadioButton(){
		 flag = isElementPresent(rupeesRadioButton);
		 Assert.assertTrue(flag, "Rupees Radio Button is not displayed");
		 return flag;
	 }
	 
	 /**This method will help us to verify Dollors Radio Button
		 * @author Senthil
		 * @return flag
		 */
	 public boolean verifyDollorsRadioButton(){
		 flag = isElementPresent(dollorsRadioButton);
		 Assert.assertTrue(flag, "Dollors Radio Button is not displayed");
		 return flag;
	 }
	 
	 /**This method will help us to verify FromMonth Dropdown
		 * @author Senthil
		 * @return flag
		 */
	 public boolean verifyFromMonthDD(){
		 flag = isElementPresent(fromMonthDD);
		 Assert.assertTrue(flag, "From Month Dropdown is not displayed");
		 return flag;
	 }
	 
	 /**This method will help us to verify FromYear Dropdown
		 * @author Senthil
		 * @return flag
		 */
	 public boolean verifyFromYearDD(){
		 flag = isElementPresent(fromYearDD);
		 Assert.assertTrue(flag, "From Year Dropdown is not displayed");
		 return flag;
	 }
	 
	 /**This method will help us to verify ToMonth Dropdown
		 * @author Senthil
		 * @return flag
		 */
	 public boolean verifyToMonthDD(){
		 flag = isElementPresent(toMonthDD);
		 Assert.assertTrue(flag, "To Month Dropdown is not displayed");
		 return flag;
	 }
	 
	 /**This method will help us to verify ToYear Dropdown
		 * @author Senthil
		 * @return flag
		 */
	 public boolean verifyToYearDD(){
		 flag = isElementPresent(toYearDD);
		 Assert.assertTrue(flag, "To Year Dropdown is not displayed");
		 return flag;
	 }
	 
	 /**This method will help us to verify Notice Period Dropdown
		 * @author Senthil
		 * @return flag
		 */
	 public boolean verifyNoticePeriodDD(){
		 flag = isElementPresent(noticePeriodDD);
		 Assert.assertTrue(flag, "Notice Period Dropdown is not displayed");
		 return flag;
	 }
	 
	 /**This method will help us to verify JobProfile text area
		 * @author Senthil
		 * @return flag
		 */
	 public boolean verifyJobProfile(){
		 flag = isElementPresent(jobProfile);
		 Assert.assertTrue(flag, "JobProfile text area is not displayed");
		 return flag;
	 }
	  
	 /**This method will help us to verify Specialization Error
		 * @author Senthil
		 * @return flag
		 */
	 public boolean verifySpecializationError(){
		 flag = isElementPresent(specializationError);
		 Assert.assertTrue(flag, "Specialization Error is not displayed");
		 return flag;
	 }
	 
	 /**This method will help us to verify Specialization Error Displayed
		 * @author Senthil
		 * @return flag
		 */
	 public void verifySpecializationErrorDisplayed(){
		 verifySpecializationError();
		 String spError = getText(specializationError);
		 Assert.assertEquals(spError, NKConstants.ERROR_SPECIALIZATION, "Expected Specialization Error doesnot match with the displayed error");
	 }
	 
	 /**This method will help us to verify Institution Error
		 * @author Senthil
		 * @return flag
		 */
	 public boolean verifyInstitutionError(){
		 flag = isElementPresent(institutionError);
		 Assert.assertTrue(flag, "Institution Error is not displayed");
		 return flag;
	 }
	 
	 /**This method will help us to verify Institution Error Displayed
		 * @author Senthil
		 * @return flag
		 */
	 public void verifyInstitutionErrorDisplayed(){
		 verifyInstitutionError();
		 String instError = getText(institutionError);
		 Assert.assertEquals(instError, NKConstants.ERROR_INSTITUTION, "Expected Institution Error doesnot match with the displayed error");
	 }
	 
	 /**This method will help us to verify Year Of Completion Error
		 * @author Senthil
		 * @return flag
		 */
	 public boolean verifyYearOfCompletionError(){
		 flag = isElementPresent(yearOfCompletionError);
		 Assert.assertTrue(flag, "Year Of Completion Error is not displayed");
		 return flag;
	 }
	 
	 /**This method will help us to verify Year Of Completion Error Displayed
		 * @author Senthil
		 * @return flag
		 */
	 public void verifyYearOfCompletionErrorDisplayed(){
		 verifyYearOfCompletionError();
		 String yrcError = getText(yearOfCompletionError);
		 Assert.assertEquals(yrcError, NKConstants.ERROR_YEAROFCOMPLETION, "Expected Year Of Completion Error doesnot match with the displayed error");
	 }
	 
	 /**This method will help us to Select a value from Specialization Dropdown
		 * @author Senthil
		 * @param   
		 * @throws Exception 
		 * 
		 */	
	 
	 public void SelectSpecialization(String spec) throws Exception{
		 Log.info("Before Selecting Specialization");
		 try{
			 verifySpecializationDropdown();
			 new Select(uiDriver.findElement(specializationDropdown)).selectByVisibleText(spec);
			 Log.info("After Selecting Specialization");
			 
		 }
		 catch(Exception e){
			 throw new Exception("FAILED WHILE SELECTING SPECIALIZATION:::"+"\n selectSpecialization(spec)"+e.getLocalizedMessage());
		 }
	 }
	 
	 /**This method will help us to Select a value from Institution Dropdown
		 * @author Senthil
		 * @param   
		 * @throws Exception 
		 * 
		 */	
	 
	 public void SelectInstitution(String inst) throws Exception{
		 Log.info("Before Selecting Institution");
		 try{
			 verifyInstitutionDropdown();
			 new Select(uiDriver.findElement(institutionDropdown)).selectByVisibleText(inst);
			 Log.info("After Selecting Institution");
		 }
		 catch(Exception e){
			 throw new Exception("FAILED WHILE SELECTING INSTITUTION:::"+"\n selectInstitution(inst)"+e.getLocalizedMessage());
		 }
	 }
	 
	 /**This method will help us to Select a value from Year Of Completion Dropdown
		 * @author Senthil
		 * @param   
		 * @throws Exception 
		 * 
		 */	
	 
	 public void SelectYearOfCompletion(String ycom) throws Exception{
		 Log.info("Before Selecting Year Of Completion");
		 try{
			 verifyYearOfCompletionDropdown();
			 new Select(uiDriver.findElement(yearOfCompletionDropdown)).selectByVisibleText(ycom);
			 Log.info("After Selecting YearOfCompletion");
		 }
		 catch(Exception e){
			 throw new Exception("FAILED WHILE SELECTING YEAR OF COMPLETION:::"+"\n selectYearOfCompletion(ycom)"+e.getLocalizedMessage());
		 }
	 }
	 
	 
	 /**This method will help us to Select a value from Current Industry Dropdown
		 * @author Senthil
		 * @param  curInds  "IT-Software/Software Services" 
		 * @throws Exception 
		 * 
		 */	
	 
	 public void selectCurrentIndustry(String curInds) throws Exception{
		 Log.info("Before selecting Current Industry");
		 try{
			 verifyCurrentIndustryDropdown();
			 new Select(uiDriver.findElement(currentIndustryDropdown)).selectByVisibleText(curInds);
			 Log.info("After selecting Current Industry");
		 }
		 catch(Exception e){
			 throw new Exception("FAILED WHILE SELECTING CURRENT INDUSTRY:::"+"\n selectCurrentIndustry(curInds)"+e.getLocalizedMessage());
		 }
	 }
	 
	 
	 /**This method will help us to Select a value from Functional Area Dropdown
		 * @author Senthil
		 * @param  funArea  "IT Software - Application Programming / Maintenance" 
		 * @throws Exception 
		 * 
		 */	
	 
	 public void selectFunctionalArea(String funArea) throws Exception{
		 Log.info("Before selecting Functional Area");
		 try{
			 verifyFunctionalAreaDropdown();
			 new Select(uiDriver.findElement(functionalAreaDropdown)).selectByVisibleText(funArea);
			 Log.info("After selecting Functional Area");
		 }
		 catch(Exception e){
			 throw new Exception("FAILED WHILE SELECTING FUNCTIONAL AREA:::"+"\n selectFunctionalArea(funArea)"+e.getLocalizedMessage());
		 }
	 }
	 
	 /**This method will help us to Select a value from Role Dropdown
		 * @author Senthil
		 * @param  rol  "Testing Engnr" 
		 * @throws Exception 
		 * 
		 */	
	 
	 public void selectRole(String rol) throws Exception{
		 Log.info("Before selecting Role");
		 try{
			 verifyRoleDropdown();
			 new Select(uiDriver.findElement(roledropdown)).selectByVisibleText(rol);
			 Log.info("After selecting Role");
		 }
		 catch(Exception e){
			 throw new Exception("FAILED WHILE SELECTING ROLE:::"+"\n selectRole(rol)"+e.getLocalizedMessage());
		 }
	 }
	 
	 /**This method will help us to Select a value from Salary in Lacs Dropdown
		 * @author Senthil
		 * @param  salLac  "6" 
		 * @throws Exception 
		 * 
		 */	
	 
	 public void selectsalLacs(String salLac) throws Exception{
		 Log.info("Before selecting Salary in Lacs");
		 try{
			 verifySalLacsDD();
			 new Select(uiDriver.findElement(salLacsDD)).selectByVisibleText(salLac);
			 Log.info("After selecting Salary in Lacs");
		 }
		 catch(Exception e){
			 throw new Exception("FAILED WHILE SELECTING SALARY IN LACS:::"+"\n selectsalLacs(salLac)"+e.getLocalizedMessage());
		 }
	 }
	 
	 /**This method will help us to Select a value from Salary in Thousands Dropdown
		 * @author Senthil
		 * @param  salTho  "0" 
		 * @throws Exception 
		 * 
		 */	
	 
	 public void selectSalTho(String saltho) throws Exception{
		 Log.info("Before selecting Salary in Thousands");
		 try{
			 verifySalThousandsDD();
			 new Select((WebElement) salThousandsDD).selectByVisibleText(saltho);
			 Log.info("After selecting Salary in Thousands");
		 }
		 catch(Exception e){
			 throw new Exception("FAILED WHILE SELECTING SALARY IN THOUSANDS:::"+"\n selectSalTho(saltho)"+e.getLocalizedMessage());
		 }
	 }
	 
	 /**This method will help us to Click on Save MyProfile Button
		 * @author Senthil
		 * @throws Exception 
		 */	
	 
	 public void clickOnSaveMyProfileButton() throws Exception{
		 Log.info("Before Clicking on Save MyProfile Button");
		 try{
			 verifySaveMyProfileButton();
			 javaScriptClick(saveMyProfileButton);
			 Log.info("After Clicking on Save MyProfile Button");
		 }
		 catch(Exception e){
			 throw new Exception("FAILED WHILE CLICKING ON SAVE MY PROFILE BUTON"+"\n clickOnSaveMyProfileButton()"+e.getLocalizedMessage());
		 }
		 
	 }

}

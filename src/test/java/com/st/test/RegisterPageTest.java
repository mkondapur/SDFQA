package com.st.test;


import org.testng.annotations.Test;

import com.st.common.NKCommon;
import com.st.common.NKConstants;
import com.st.pages.CompleteMyProfilePage;
import com.st.pages.CreateYourJobAlertsPage;
import com.st.pages.HomePage;
import com.st.pages.JobAlertCreatedPage;
import com.st.pages.RegistrationPage;
import com.st.pages.SaveMyProfilePage;
import com.st.util.BaseTestObject;

public class RegisterPageTest extends BaseTestObject{
	
		
	HomePage objHomePage;
	RegistrationPage objRegistrationPage;
	SaveMyProfilePage objSaveMyProfilePage;
	CompleteMyProfilePage objCompleteMyProfilePage;
	CreateYourJobAlertsPage objCreateYourJobAlertsPage;
	JobAlertCreatedPage objJobAlertCreatedPage;
	NKCommon objNKCommon;	
	
				
		
	@Test(priority = -1)
	public void popUpClose() throws InterruptedException{
		objNKCommon = new NKCommon(uiDriver);
		objNKCommon.closepopUp();
	}
	
	@Test(priority = 0)
	public void verifyRegistrationPage() throws Exception{
		objHomePage = new HomePage(uiDriver);
		objHomePage.clickOnLoginbutton();
		Thread.sleep(1000);
		objHomePage.clickOnRegisterLink();
		Thread.sleep(2000);
		objRegistrationPage = new RegistrationPage(uiDriver);
		objRegistrationPage.verifyRegistrationPageTitle();
		objRegistrationPage.verifyRegistrationPageMessage();	
		objRegistrationPage.verifyCreateLoginDetailsSection();
		objRegistrationPage.verifyYourContactInformationSection();
		objRegistrationPage.verifyYourCurrentEmploymentDetailsSection();
		objRegistrationPage.verifyYourEducationBackgroundSection();
		objRegistrationPage.verifyUploadYourDetailedResumeSection();
		objRegistrationPage.verifyMailerAndPrivacySettingsSection();
		objRegistrationPage.verifyIAgreeCheckbox();
		objRegistrationPage.verifyTermsConditionslink();
		objRegistrationPage.verifyJoinNaukriButton();
		objHomePage = new HomePage(uiDriver);
		
	}
	
	@Test(priority = 1)
	public void verifyCreateLoginDetails() throws Exception{
		objRegistrationPage = new RegistrationPage(uiDriver);
		objRegistrationPage.verifyEmailField();
		objRegistrationPage.clickOnPasswordfield();
		objRegistrationPage.verifyEmailErrorDisplayed();
		objRegistrationPage.verifyConfirmPassword();
		objRegistrationPage.enterEmail(NKConstants.EMAILID_EXISTING);
		objRegistrationPage.clickOnPasswordfield();
		Thread.sleep(1000);
		objRegistrationPage.verifyErrorAlert();
		objRegistrationPage.verifyAlreadyRegisteredMsg();
		objRegistrationPage.clickOnClose();
		objRegistrationPage.enterEmail(NKConstants.EMAILID_UNIQUE );
		Thread.sleep(2000);
		objRegistrationPage.enterPassword(NKConstants.PASSWORD_INVALID);
		Thread.sleep(2000);
		objRegistrationPage.clickOnConfirmPasswordField();
		Thread.sleep(2000);
		objRegistrationPage.verifyPasswordErrorDisplayed();
		objRegistrationPage.clickOnPasswordfield();
		Thread.sleep(2000);
		objRegistrationPage.enterPassword(NKConstants.PASSWORD_VALID);
		Thread.sleep(2000);
		objRegistrationPage.enterConfirmPassword(NKConstants.PASSWORD_INVALID);
		objRegistrationPage.clickOnNameField();
		Thread.sleep(2000);
		objRegistrationPage.verifyConfirmPasswordErrorDisplayed();
		Thread.sleep(2000);
		objRegistrationPage.clickOnConfirmPasswordField();
		objRegistrationPage.enterConfirmPassword(NKConstants.PASSWORD_VALID);
		Thread.sleep(2000);
		objRegistrationPage.clickOnNameField();
		
	}	
	@Test(priority = 2)
	public void verifyYourContactInformation() throws Exception{
		objRegistrationPage.enterFullName(NKConstants.FULLNAME);
		objRegistrationPage.clickOnJoinNaukriButton();
		Thread.sleep(2000);
		objRegistrationPage.verifyLocationDDErrorDisplayed();
		objRegistrationPage.clickOnCurrrentLocationDropdown();
		objRegistrationPage.selectBangalore();
		objRegistrationPage.verifyMobileNumberErrorDisplayed(NKConstants.ERROR_EXPECTEDMOBILENUMBER);
		objRegistrationPage.enterMobileNumber(NKConstants.MOBILENUMBER_INVALID);
		objRegistrationPage.clickOnLandlineLink();
		Thread.sleep(2000);
		objRegistrationPage.verifyCountryCode();
		objRegistrationPage.verifyAreaCode();
		objRegistrationPage.verifyLandLine();
		objRegistrationPage.clickOnLandlineLink();
		objRegistrationPage.verifyMobileNumberErrorDisplayed(NKConstants.ERROR_INVALIDMOBILENUMBER);
		objRegistrationPage.enterMobileNumber(NKConstants.MOBILENUMBER_VALID);
		
	}
	
	@Test(priority = 3)
	public void verifyYourCurrentEmploymentDetails() throws Exception{
		objRegistrationPage = new RegistrationPage(uiDriver);
		objRegistrationPage.verifyExperienceErrorDisplayed();
		objRegistrationPage.selectExperience(NKConstants.EXPERIENCE);
		Thread.sleep(1000);
		objRegistrationPage.enterDesignation(NKConstants.DESIGNATION);
		objRegistrationPage.verifySkillsErrorDisplayed(NKConstants.ERROR_SKILLS);
		objRegistrationPage.enterSkills(NKConstants.SKILL);
		objRegistrationPage.verifyBasicEducationErrorDisplayed();
		objRegistrationPage.selectBasicEducation(NKConstants.BASICEDUCATION);
		Thread.sleep(2000);
		objRegistrationPage.chooseFilepath(NKConstants.FILEPATH_INVALID);
		Thread.sleep(1000);
		objRegistrationPage.verifyNonSupportedFileErrorDisplayed();
		Thread.sleep(1000);
		objRegistrationPage.chooseFilepath(NKConstants.FILEPATH_VALID);
		Thread.sleep(1000);
		objRegistrationPage.verifyUploadedFile();
		Thread.sleep(2000);
		objRegistrationPage.clickOnPasteResumeLink();
		Thread.sleep(2000);
		objRegistrationPage.enterResumeText(NKConstants.RESUMETEXT);
		objRegistrationPage.verifyJobAlertsCheckBox();
		objRegistrationPage.verifyNotificationsCheckBox();
		objRegistrationPage.verifyFastforwardEmailsCheckBox();
		objRegistrationPage.verifyFastforwardSMSCheckBox();
		objRegistrationPage.verifyCommunicationCheckBox();
		objRegistrationPage.verifyPromoCheckBox();
		objRegistrationPage.clickOnIAgreeCheckBox();
		Thread.sleep(2000);
		objRegistrationPage.clickOnJoinNaukriButton();
		Thread.sleep(2000);
		objRegistrationPage.verifyIAgreeErrorDisplayed();
		objRegistrationPage.clickOnIAgreeCheckBox();
		Thread.sleep(2000);
	   	objRegistrationPage.clickOnJoinNaukriButton();
		Thread.sleep(4000);
		
	}
	
	@Test(priority = 4)
	public void verifyCompleteMyProfilePage() throws Exception{
		objSaveMyProfilePage = new SaveMyProfilePage(uiDriver);
		objSaveMyProfilePage.verifySaveMyProfilePageTitle();
		objSaveMyProfilePage.verifyRegistrationSuccessfulMsg();
		objSaveMyProfilePage.verifyHeaderWelcomeSection();
		objSaveMyProfilePage.verifyResumeHeadlineSection();
		objSaveMyProfilePage.verifyHeaderLogoutlink();
		objSaveMyProfilePage.verifyReportAProblemLink();
		objSaveMyProfilePage.verifyProfileInformationSection();
		objSaveMyProfilePage.verifyEducationDetailsSection();
		objSaveMyProfilePage.verifyWorkExperienceSection();
		objSaveMyProfilePage.verifyCurrentPositionSection();
		objSaveMyProfilePage.verifySaveMyProfileButton();
		objSaveMyProfilePage.clickOnSaveMyProfileButton();
		Thread.sleep(2000);
	}
	
	@Test(priority = 5)
	public void verifyEducationDetails() throws Exception{
		objSaveMyProfilePage = new SaveMyProfilePage(uiDriver);
		objSaveMyProfilePage.verifySpecializationErrorDisplayed();
		objSaveMyProfilePage.verifyInstitutionErrorDisplayed();
		objSaveMyProfilePage.verifyYearOfCompletionErrorDisplayed();
		objSaveMyProfilePage.SelectSpecialization(NKConstants.SPECIALIZATION);
		Thread.sleep(1000);
		objSaveMyProfilePage.SelectInstitution(NKConstants.INSTITUTION);
		Thread.sleep(1000);
		objSaveMyProfilePage.SelectYearOfCompletion(NKConstants.YEAROFCOMPLETION);
		Thread.sleep(1000);
		objSaveMyProfilePage.verifyIndustryErrorDisplayed();
		objSaveMyProfilePage.verifyFunctionalAreaErrorDisplayed();
		objSaveMyProfilePage.verifyRoleErrorDisplayed();
		objSaveMyProfilePage.selectCurrentIndustry(NKConstants.CURRENTINDUSTRY);
		Thread.sleep(1000);
		objSaveMyProfilePage.selectFunctionalArea(NKConstants.FUNCTIONALAREA);
		Thread.sleep(1000);
		objSaveMyProfilePage.selectRole(NKConstants.ROLE);
		Thread.sleep(1000);
		objSaveMyProfilePage.verifySalaryErrorDisplayed();
		objSaveMyProfilePage.selectsalLacs(NKConstants.SALARYINLACS);
		Thread.sleep(1000);
		objSaveMyProfilePage.clickOnSaveMyProfileButton();
		Thread.sleep(4000);	
	}
	

	@Test(priority = 6)
	public void verifyCompleteMyProfile() throws Exception{
		objCompleteMyProfilePage = new CompleteMyProfilePage(uiDriver);
		objCompleteMyProfilePage.verifyBasicProfileSavedMessage();
		objCompleteMyProfilePage.verifyCompleteYourprofileMessage();
		objCompleteMyProfilePage.verifyUploadPhotoSection();
		objCompleteMyProfilePage.verifyDesiredJobSection();
		objCompleteMyProfilePage.verifyITSkillsSection();
		objCompleteMyProfilePage.verifyPersonalDetailsSection();
		objCompleteMyProfilePage.verifyWorkAuthorizationSection();
		objCompleteMyProfilePage.verifyLanguagesKnownSection();
		objCompleteMyProfilePage.verifyAffirmativeActionSection();
		objCompleteMyProfilePage.clickOnCompleteMyProfileButton();
		Thread.sleep(4000);
		
	}
	

	@Test(priority = 7)
	public void verifyCreateYourJobAlert() throws Exception{
		objCreateYourJobAlertsPage = new CreateYourJobAlertsPage(uiDriver);
		objCreateYourJobAlertsPage.verifyCreateYourJobAlertsPageTitle();
		objCreateYourJobAlertsPage.verifyNameYourJobAlertBox();
		objCreateYourJobAlertsPage.verifySkillsAutoBox();
		objCreateYourJobAlertsPage.clickOnCreateJobAlertButton();
		Thread.sleep(2000);
		objCreateYourJobAlertsPage.verifyKeySkillsErrorDisplayed();
		objCreateYourJobAlertsPage.verifyJobAlertNameErrorDisplayed();
		objCreateYourJobAlertsPage.enterSkills(NKConstants.SKILL);
		Thread.sleep(1000);
		objCreateYourJobAlertsPage.enterJobAlertName(NKConstants.JOBALERTNAME);
		Thread.sleep(1000);
		objCreateYourJobAlertsPage.clickOnCreateJobAlertButton();
		Thread.sleep(4000);
		objJobAlertCreatedPage = new JobAlertCreatedPage(uiDriver);
		objJobAlertCreatedPage.verifyAlertSuccessMessage();
		objJobAlertCreatedPage.verifyMyNaukriIcon();
		objJobAlertCreatedPage.verifyNaukriLogo();
		objJobAlertCreatedPage.verifyNotificationsIcon();
		objJobAlertCreatedPage.clickOnLogoutLink();
		
		
	}
	
	
}


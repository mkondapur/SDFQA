package com.st.pages;

import java.awt.image.BufferStrategy;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.st.common.NKConstants;
import com.st.util.BasePageObject;

import org.apache.bcel.verifier.exc.VerificationException;
import org.apache.log4j.Logger;
import org.eclipse.jetty.util.log.Log;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class HomePage extends BasePageObject
{
		public HomePage(WebDriver driver)
	{
		super(driver);
	}
	
	private static Logger Log = Logger.getLogger(Logger.class.getName());
	
	
	/* UI ELEMENTS */
	By jobsbydelhi=By.partialLinkText("Jobs in Delhi");
	By siteLogo= By.cssSelector(".nLogo.fl>img");
	By userName=By.id("eLogin");
	By HeaderLinksNames=By.xpath("//div[@class='headGNB cloneCont wrap']//ul[1]/li/a/div");
	By EmployerZone=By.linkText("Employer Zone");
	By Buyonline= By.xpath("//li/a[@title='Buy Online- RESDEX and Vacancy Listings']/div");
	By BuyonlineLinks=By.xpath("//li[2]/div[@class='subMenu']/ul/li/a");
	By Buyonlinesub=By.partialLinkText("Buy Online");
	By postinstajob=By.xpath("//ul/li[2]/a[@title='Post an Insta Job']");
	By AllJobsheadlinks=By.xpath("//div[@class='wrap']/ul/li/a");
	By SkillsTextbox=By.xpath("//div[@id='skill']/div/div[2]/input[1]");
	By locationTextbox=By.xpath("//div/div[2]/input[1]");
	By Experiencedropdown=By.xpath("//div[@id='exp_dd']/div/input[1]");
	By Salarydropdown=By.xpath("//div[@id='salary_dd']/div/input[1]");
	By Searchhomebutton=By.id("qsbFormBtn");
	By advancesearchlink=By.partialLinkText("Advanced Search");
	By EmailidText=By.id("emailId");
	By CreatePassword=By.id("pwd");
	By IagreeTermsConditions=By.xpath("//form[@id='formpZero']/div[3]");
	By TermsandConditionslink=By.linkText("Terms and Conditions");
	By PostyourCVbutton= By.id("p0submit");
	By getbestmactchedjobsPara= By.xpath("//div[@class='center_large_title']");
	By CreateJobAlertbutton= By.id("cjaMain");
	By naukriFastForwardlinkimage= By.xpath("//div/a/h3");
	By knowyourresumescorelink=By.partialLinkText("Know your resume score");
	By GetYourFreeText=By.xpath("//ul[@class='p0L10']/li[1]/p[contains(text(),'Get your FREE')]");
	By resumefeebackResport=By.partialLinkText("resume feedback report");
	By notGettingEnoughProfilesViews=By.partialLinkText("Not getting enough profile views?");
	By get3to4TimesMoreProfiles=By.xpath("//ul[@class='p0L10']/li[2]/p");
	By Tollfreetext=By.xpath("//div[contains(text(),'(Toll-Free)')]");
	By searchallcurrentandwalkinjobs=By.xpath("//div[@class='wgtCont']/h3");
	By searchwalkingjobsbutton=By.xpath("//div[@class='wgtCont']/a/button");
	By careernavigatiorimagelink=By.xpath("//div/h3[1][@class='cnLogo']");
	By Salarytrendstext=By.xpath("//div/h3[2][@class='noBorder_center_large_title']");
	By viewSalarybutton=By.xpath("//div/a[@title='View Salaries']/button");
	By connecttoRecruiterstext=By.xpath("//div[@class='viewRecruiter wgtCont']/p");
	By viewRecruitersbutton=By.xpath("//div/a[@title='View Recruiters']/button");
	By serviceforrecruiters=By.xpath("//div/h3[text()='Services for Recruiters']");
	By naukricallslink=By.partialLinkText("Naukri Calls");
	By FastestRecruitersvechileText=By.xpath("//div/ul/li[1]/p[text()='Fastest Recruiter Vehicle']");
	By searchcvforforfreelink=By.partialLinkText("Search CVs for Free now");
	By findtherightcandidatetext=By.xpath("//li[2]/p[text()='Find the right candidate']");
	By hrzonelink=By.partialLinkText("HR Zone");
	By getupdatedonthelatestHRnews=By.xpath("//li[3]/p[text()='Get updated on the latest HR news']");
	By compusHiringsolutionslink=By.partialLinkText("Campus Hiring Solutions");
	By optimizeyourfresherHiring=By.xpath("//li[4]/p[text()='Optimize your Fresher Hiring']");
	By naukriJobSpeakText=By.xpath("//div/h3[text()='Naukri JobSpeak']");
	By monthlyJobIndexText=By.xpath("//div/p[contains(text(),'A monthly Job Index that provides insight')]");
	By viewlatestadditionLink=By.partialLinkText("View the latest edition");
	By jobsbyLocationsText=By.xpath("//div[8]/h4");
	By jobsByLocationsLinksList=By.xpath(" //div[8]/ul/li/a[@target='_blank']");
	By viewalllocationslink=By.partialLinkText("View all Locations");
	By ExperiencedropdownValue=By.xpath("//div[@id='exp_dd']//ul/li[text()='3']");//By.xpath("//div[@id='exp_dd']/div/input[1]");
	By jobsbycategorytext=By.xpath("//div[9]/h5");
	By jobsbycategorylinsList=By.xpath("//div[9]/ul/li/a");
	By viewallcategorieslink=By.partialLinkText("View all Categories");
	By Foot_informationText=By.xpath("//div[1][@class='column ']/ul/li[@class='header']/a");
	By Foot_informationLinks=By.xpath("//div/div[@class='wrap']/div[1]/ul[1]/li/a[@title[contains(text(),*)]]");
	By Foot_jobseekerText=By.xpath("//div/div[@class='wrap']/div[2]/ul[1]/li[1][@class='header']/a");
	By foot_jobseekerlinks=By.xpath("//div/div[@class='wrap']/div[2]/ul[1]/li[position()<=8]/a[@title[contains(text(),*)]]");
	By foot_browsejostext=By.xpath("//div/div[@class='wrap']/div[3]/ul[1]/li[@class='header']/a");
	By foot_browsejobslink=By.xpath("//div/div[@class='wrap']/div[3]/ul[1]/li/a[@title[contains(text(),*)]]");
	By Foot_employersText=By.xpath("//div/div[@class='wrap']/div[4]/div/ul[1]/li[@class='header']/a");
	By Foot_employerslinks=By.xpath("//div/div[@class='wrap']/div[4]/div/ul[1]/li/a[@title[contains(text(),*)]]");
	By Foot_FastForwardText=By.xpath("//div/div[@class='wrap']/div[2]/ul[1]/li[9][@class='header']/a");
	By Foot_Fastforwardlinks=By.xpath("//div/div[@class='wrap']/div[2]/ul[1]/li[position()>9]/a[@title[contains(text(),*)]]");
	By Foot_followustext=By.xpath("//div[@class='fl column last-child']/div[2]/a[text()='Follow Us']");
	By Foot_followusLinks=By.xpath("//div[@class='fl column last-child']/div[2]/a[@title[contains(text(),*)]]");
	By loginlink=By.xpath("//a[contains(@title,'Jobseeker Login')]/div");
	
	By Foot_information_aboutus=By.xpath("//div/div[@class='wrap']/div[1]/ul[1]/li[2]/a[1][@title[contains(text(),*)]]");
	By Foot_information_TermsandConditions=By.xpath("//div/div[@class='wrap']/div[1]/ul[1]/li[3]/a[1][@title[contains(text(),*)]]");
	By Foot_information_PrivacyandPolicy=By.xpath("//div/div[@class='wrap']/div[1]/ul[1]/li[4]/a[1][@title[contains(text(),*)]]");
	By Foot_information_Resources=By.xpath("//div/div[@class='wrap']/div[1]/ul[1]/li[5]/a[1][@title[contains(text(),*)]]");
	By Foot_information_Carrrerswith=By.xpath("//div/div[@class='wrap']/div[1]/ul[1]/li[6]/a[1][@title[contains(text(),*)]]");
	By Foot_information_Sitemap=By.xpath("//div/div[@class='wrap']/div[1]/ul[1]/li[7]/a[1][@title[contains(text(),*)]]");
	By Foot_information_contactus=By.xpath("//div/div[@class='wrap']/div[1]/ul[1]/li[8]/a[1][@title[contains(text(),*)]]");
	By Foot_information_Faqs=By.xpath("//div/div[@class='wrap']/div[1]/ul[1]/li[9]/a[1][@title[contains(text(),*)]]");
	By Foot_information_summons=By.xpath("//div/div[@class='wrap']/div[1]/ul[1]/li[10]/a[1][@title[contains(text(),*)]]");
	By Foot_information_grievances=By.xpath("//div/div[@class='wrap']/div[1]/ul[1]/li[11]/a[1][@title[contains(text(),*)]]");
	By Foot_information_fraudalert=By.xpath("//div/div[@class='wrap']/div[1]/ul[1]/li[12]/a[1][@title[contains(text(),*)]]");
	
	
	By resumetext= By.xpath("//div[@id='scrolUp']/div/h2");
	By termsandcon=By.cssSelector(".hd3");
	By youeorder=By.xpath("//div[@class='greyBdrCrt']/span");
	
	By searchBlrLayer = By.xpath("//div[@class='blrLyr dspN']");
	By ddExperience = By.xpath("//div/div/div[1]/ul/li[contains(.,'5')]");
	By expArrow = By.xpath("//div[@id='exp_dd']//span[@class='smArw']");
	By registerLink = By.xpath("//div[@class='row txtC']/a[contains(.,'Register Now')]");
	By imgSIteLogo = By.cssSelector(".nLogo.fl>img");
	By lnkJobs = By.xpath("//a[contains(@title,'Search Jobs')]/div");
	By lnkLogin = By.xpath("//a[contains(@title,'Jobseeker Login')]/div");
	By lnkAdvancedSearch = By.linkText("Advanced Search");
	By txtSkill = By.xpath(".//*[@id='skill']//input[1]");
	By bestplacestoworklinks=By.xpath("//div[@id='tabs_job']/ul/li");
	
	By locationtextbox=By.xpath("//div/div[2]/input[@class='sugInp w135']");
	
	
	
	/* Veriables*/
	boolean flag=false;
	String BASE_URL="http://www.naukri.com/";
	String pageTitle=null;
	String Parent_window=null;
	String actual_Result=null;
	String expected_Result=null;
	
	public int exps;
	
	
	/******************************************************************************************************************************************/	
	/**
	 * @author manjunathr
	 * @throws Exception
	 * This method will get the Home Page Title and compare with Existing or saved Title and if both were equal method will Pass else fail.
	 */
	public HomePage verifyHomePageTitle() throws Exception
	{
		Log.info("getting the Home page title");
		try 
		{
			pageTitle=uiDriver.getTitle().trim();
			Assert.assertEquals(pageTitle, NKConstants.PAGETITLE_HOMEPAGE, "Home Page title is not matching or displayed as expected");
		} 
		catch (Exception e) {
			
			throw new Exception("FAILED GETING THE HOMEPAGE TITLE  " + "\n verifyHomePageTitle " +e.getLocalizedMessage());
		}
		return this;
	}
	/**********************************************************************************************************************/	
	/**
	 * @author manjunathr
	 * @return boolean
	 * This method will verify whether Site logo is displayed on the Page and Returns boolean Value
	 */
	public boolean verifySiteLogo() throws Exception
	{
	Log.info("Verifying Site Log of Home Page");
		try 
		{
			flag=isElementPresent(siteLogo);
			return flag;
			
		} catch (Exception e)
		{
			throw new Exception("FAILED VERIFYING THE SITE LOGO " + " \n verifySiteLogo " + e.getLocalizedMessage());
		}
		
	}
/*****************************************************************************************************************************************************/	

	/**
	 * @author manjunathr
	 * @return void
	 * This method will click on the Site Logo
	 */
	public HomePage clickOnSiteLogo() throws Exception
	{
		Log.info("Clicking on Sitelogo Image");
		try 
		{
			uiDriver.findElement(siteLogo).click();
		} 
		catch (Exception e) {
			
			throw new Exception("FAILED CLICKING ON SITE " + "\n clickOnSiteLogo " +e.getLocalizedMessage());
		}
		return this;
	}

	/*****************************************************************************************************************************************************/	
	/** 
	 * 2nd Testcase
	 * @author manjunathr
	 * @return ArrayList
	 * @throws Exception
	 * This method will get all the header list links and get the text of the links and stores in ArrayList
	 */

	public HomePage getHeaderLinksName() throws Exception
	{
		Log.info("Getting Header Links Text");
		try 
		{
			List<WebElement> HeadMenulinks= uiDriver.findElements(HeaderLinksNames);
			
			ArrayList<String> headermanual=new ArrayList<String>();
			headermanual.add("Jobs");
			headermanual.add("Recruiters");
			headermanual.add("Companies");
			headermanual.add("Services");
			headermanual.add("More");
			headermanual.add("Login");
			
			for (int i = 0; i < HeadMenulinks.size(); i++) 
			{
				actual_Result=HeadMenulinks.get(i).getText().trim();
				expected_Result=headermanual.get(i).toString();
				Assert.assertEquals(actual_Result, expected_Result, "Header Links are Not Macthing");
				waitImplicit();
				System.out.println(actual_Result);
			}
			
			/*for (WebElement Linksab : HeadMenulinks)
			{
				
			actual_Result=Linksab.getText().toString();
			System.out.println(Linksab.getText().toString());
			}*/
			
			return this;	
		}
		catch (Exception e)
		{
			throw new Exception("FAILED GET HEADER LINKS " + "\n getHeaderLinksName " +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @param uname
	 * @return void
	 * * This Method will Enter the Username
	 */
	public void enterUsername(String uname) throws Exception
	{
		Log.info("Entering User name " + uname);
		try 
		{
			uiDriver.findElement(userName).sendKeys(uname);
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED USERNAME VERIFYING THE OBJECT "  +  " \n enterUsername(String uname) "  + e.getLocalizedMessage());
		}
	}
	/*****************************************************************************************************************************************************/	
	public HomePage getJobsByLocations()
	{
		List<WebElement> li= uiDriver.findElements(By.xpath("ole"));
		
		List<String>arrlst= new ArrayList<String>();
		
		for (WebElement welist : li)
		{
			
			arrlst.add(welist.getText());
			System.out.println(arrlst);
		}
		
		
		return this;
	}
	
	/*****************************************************************************************************************************************************/		
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This Method will check Employerzone Element is displayed or not
	 */
	public boolean verifyEmplyerZone() throws Exception
	{
		Log.info("Verify the Employerzone link");
		try 
		{
			flag=isElementPresent(EmployerZone);
			
			return flag;
			
		}
		catch (Exception e) 
		{
			throw new Exception("FAILED VERIFYING THE EMPLOYERZONE LINK " + "\n verifyEmplyerZone " +e.getLocalizedMessage());
		}
	}
	/*****************************************************************************************************************************************************/	
	/**
	 * @author manjunathr
	 * @return void
	 * @throws Exception
	 * This Method will click on Employerzone Link
	 */
	public LoginRecruitNaukriPage clickEmployerZone() throws Exception
	{
		Log.info("employerZoneClick - USer is going to click on Employerzone Link");
		try 
		{
			
			uiDriver.findElement(EmployerZone).click();
			switchToNewWindow();
			Thread.sleep(5000);
		} catch (Exception e)
		{
			throw new Exception("FAILED WHILE CLICKING ON EMPLOYER LINK " + "\n clickEmployerZone " + e.getLocalizedMessage());
		}
		return new LoginRecruitNaukriPage(uiDriver);
	}
	/*****************************************************************************************************************************************************/	
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 */
	public boolean verifyBuyOnline() throws Exception
	{
		Log.info("Verifying Buyonline Text is displayed on the Screen");
		try 
		{
			flag=isElementPresent(Buyonline);
			return flag;
			
		} 
		catch (Exception e) 
		{
			throw new Exception(" FAILED WHILE VERIFYING THE BUYONLINE LINK " + " \n verifyBuyOnline " +e.getLocalizedMessage());
		}
	}
	
	
	/*****************************************************************************************************************************************************/	
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 */
	public boolean isBuyonlinePresent() throws Exception
	{
		Log.info("Verifying Buyonline Text is Present on the Screen");
		try 
		{
			flag=isElementPresent(Buyonline);
			Assert.assertTrue(flag, "BuyOnline Text is Missing");
			return flag;
			
		} 
		catch (Exception e) 
		{
			throw new Exception(" FAILED WHILE VERIFYING THE BUYONLINE LINK " + " \n verifyBuyOnline " +e.getLocalizedMessage());
		}
	}
	/*****************************************************************************************************************************************************/	
	/**
	 * @author manjunathr
	 * @return RecruitNaukriPage
	 * @throws Exception
	 * This method method will explain to user Verify the links are available and get the text of the links.
	 */
	
	public RecruitNaukriPage clickOnBuyOnLineSubMenu() throws Exception
	{
		Log.info("Clcik on Buyonline Links avialble");
		try 
		{
			Parent_window=uiDriver.getWindowHandle();
			//mouseover(Buyonline);
			Actions abt= new Actions(uiDriver);
			WebElement mySub=	uiDriver.findElement(Buyonline);
			abt.moveToElement(mySub);
			WebElement buyonlinesub= uiDriver.findElement(Buyonlinesub);
			abt.moveToElement(buyonlinesub).click().perform();
			switchToNewWindow();
			Thread.sleep(5000);
		
			return new RecruitNaukriPage(uiDriver);
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE ClICKING ON THE BUYONLINE SUBLINK " + "\n clickOnBuyOnLineSubMenu " +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return RecruitNaukriPage
	 * @throws Exception
	 * This method method will explain to user Verify the links are available and get the text of the links.
	 */
	
	public RecruitNaukriPage clickOnPostAnInstaJob() throws Exception
	{
		Log.info("Clicking on  the clickOnPostAnInstaJob avialble");
		try 
		{
			Parent_window=uiDriver.getWindowHandle();
			Actions act= new Actions(uiDriver);
			WebElement buyon= uiDriver.findElement(Buyonline);
			act.moveToElement(buyon);
			Thread.sleep(5000);
			WebElement postinsta= uiDriver.findElement(postinstajob);
			act.moveToElement(postinsta).click().perform();
			//postinsta.click();
			switchToNewWindow();
			Thread.sleep(5000);
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE Clicking on Post An Insta Job " + "\n clickOnPostAnInstaJob " +e.getLocalizedMessage());
		}
		return new RecruitNaukriPage(uiDriver);
	}
	
	/********************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return arrayJobsList
	 * @throws Exception
	 * This Method will Gets the all Links of JObs and get the Text of Each Link and Stores in Array
	 */
	
	public List<String> getallJobsLinks() throws Exception
	{
		Log.info("Verify all the Job Links are displayed");
		
		try 
		{
			
			List<WebElement> allJobsLinksList= uiDriver.findElements(AllJobsheadlinks);
			
			List<String> arrayJobsList= new ArrayList<String>();
			
			for (WebElement allJobsName : allJobsLinksList) 
			{
				arrayJobsList.add(allJobsName.getText());
			}
			return arrayJobsList;
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING ALL JOBS LINK " + "\n allJobsLinks " +e.getLocalizedMessage());
		}
	}

	
	/********************************************************************************************************************************************************/
	
	/********************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * this Method will check Skilltextbox is displayed on the page.
	 */
	public boolean verifySkillTextBox() throws Exception
	{
		Log.info("Verify the Skills textbox is Present");
		
		try 
		{
			flag= uiDriver.findElement(SkillsTextbox).isDisplayed();
			Assert.assertTrue(flag, "Skills Textbox is Missing");
			return flag;
		} 
		catch (Exception e)
		{
			throw new Exception("FAILED WHILE VERIFYING SKILLSTEXTBOX " + "\n verifySkillTextBox " + e.getLocalizedMessage());
		}
	}
	
	/********************************************************************************************************************************************************/
	/**@author manjunathr
	 * @return skil
	 * This method will enter the SkillText into the skilltext text box
	 */
	
	public void enterSkillEntry(String skil) throws Exception
	{
		Log.info("Entering the skill Text :" + skil);
		
		try 
		{
			verifySkillTextBox();
			uiDriver.findElement(SkillsTextbox).sendKeys(skil);
			
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE ENTERING THE SKILLL TEXT ENTRY " + " enterSkillEntry(String skil) " + e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will verify location Text box is displayed on Page.
	 */
	
	public boolean verifyLocationTextBox() throws Exception
	{
		Log.info("Verification of location textbox");
		try 
		{
			flag=uiDriver.findElement(locationTextbox).isDisplayed();
			Assert.assertTrue(flag, "Location Textbox is Not Dispalyed");
			return flag;
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE LOCATION TEXTBOX " + "\n verifyLocationTextBox " +e.getLocalizedMessage());
		}
	}

	/********************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @param Locat
	 * @throws Exception
	 * This method will enter the Location Text 
	 */
	public void enterLocation(String Locat) throws Exception
	{
		Log.info("Entering the Location Entry");
		try 
		{
			verifyLocationTextBox();
			uiDriver.findElement(locationTextbox).sendKeys(Locat);
			
		} catch (Exception e) 
		{
		throw new Exception("FAILED WHILE ENTERING THE LOCATION TEXT BOX "+ "\n enterLocation(String Locat) "+e.getLocalizedMessage());
		}
	}
	
	/********************************************************************************************************************************************************/
	
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will verify the Experiencedropdown get displayed on the Page.
	 */
	public boolean verifyExperiencedropdown() throws Exception
	{
		Log.info("Verification of Experiencedropsown");
		try 
		{
			flag= uiDriver.findElement(Experiencedropdown).isDisplayed();
			Assert.assertTrue(flag, "Experience Dropdown is missing");
			return flag;
			
		} catch (Exception e) 
		{
		throw new Exception("FAILED WHILE VERIFYING THE EXPERINECE DROPDOWN " + "\n verifyExperiencedropdown" + e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * This method is to select value from the Expecrience dropdown
	 * @param selectval
	 * @return
	 * @throws Exception
	 */
	public int selectExperienceDropdown() throws Exception
	{
		Log.info("Selecting the Value from dropdown");
		
		try 
		{
			verifyExperiencedropdown();
			uiDriver.findElement(Experiencedropdown).click();
			Thread.sleep(1000);
			uiDriver.findElement(ddExperience).click();
			Thread.sleep(1000);
			WebElement expp = uiDriver.findElement(Experiencedropdown);
			String expDetail = expp.getText();
			exps = Integer.parseInt(expDetail);
			return exps;
						
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE SELECTING THE EXPERIENCE DROPDOWN " + "\n selectExperienceDropdown " +e.getLocalizedMessage());
		}
		
	}
	
	public void SelectExperience() throws InterruptedException{
		uiDriver.findElement(Experiencedropdown).click();
		Thread.sleep(3000);
		 uiDriver.findElement(ExperiencedropdownValue).click();
		Thread.sleep(3000);
	}
	
	public int getSelectedYrsExp(){
		WebElement element = uiDriver.findElement(ExperiencedropdownValue);
		String value = element.getAttribute("value").trim();
		int val = Integer.parseInt(value);
		return val;
		
	}
	/********************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * this method will verify the Salary dropdown is displayed on the Page
	 */
	public boolean verifySalaryDropdown() throws Exception
	{
		Log.info("Verification of Salary dropdown");
		try {
			flag= uiDriver.findElement(Salarydropdown).isDisplayed();
			Assert.assertTrue(flag, "Salary Dropdown is Missing on the screen");
			
			return flag;
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE Verifying THE SALARY FROM THE DROPDOWN " +" \n verifySalaryDropdown " +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @param selValue
	 * @return saldrpdown
	 * @throws Exception
	 * This Method will Select the Value from the Salary Dropdown
	 */
	public Select selectSalaryDropDown(String selValue) throws Exception
	{
		Log.info("VSelection of salry dropdown");
		try {
			Select saldrpdown= new Select(uiDriver.findElement(Salarydropdown));
			saldrpdown.selectByVisibleText(selValue);
			return saldrpdown;
			
		} catch (Exception e)
		{
			throw new  Exception("FAILED WHILE SELECTING THE SALARY DROPDOWN " + "\n selectSalaryDropDown(String selValue)" +e.getLocalizedMessage());
		}
	}
	
	/********************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will verify the Searchbutton is existing on the Page
	 */
	public boolean verifySearchButton() throws Exception
	{
		Log.info("Verification of Search button");
		try 
		{
			flag=uiDriver.findElement(Searchhomebutton).isDisplayed();
			Assert.assertTrue(flag, "Search button is Missing on the Page");
			return flag;
		} catch (Exception e) 
		{
	
			throw new Exception("FAILED WHILE VERIFYING THE SEARCH BUTTON " + "\n verifySearchButton " +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	public SearchResultPage clickOnSearchButton() throws Exception
	{
		Log.info("Verifying the Click on Search button");
		try
		{ 
			verifySearchButton();
			uiDriver.findElement(Searchhomebutton).click();
						
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE CLICK ON SEARCH BUTTON " + "\n clickOnSearchButton" +e.getLocalizedMessage());
		}
		
		return new SearchResultPage(uiDriver);
	}
	/********************************************************************************************************************************************************/
	
	public boolean verifyAdvanceSearchLink() throws Exception
	{
		Log.info("Verifying the advance searchlink");
		
		try 
		{
			flag=uiDriver.findElement(advancesearchlink).isDisplayed();
			Assert.assertTrue(flag, "Advance Search button is Missing");
			return flag;
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIYING THE ADVANCE SEARCH LINK" + " \n verifyAdvanceSearchLink" +e.getLocalizedMessage());
		}
	}
	
	/********************************************************************************************************************************************************/
	
	public void clickOnAdvanceSearchLink() throws Exception
	{
		Log.info("Verifying the Advance Search Click option");
		
		try 
		{
			clickOnAdvanceSearchLink();
			uiDriver.findElement(advancesearchlink).click();
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE CLICKING ON ADVANCE SEARCH LINK " + "\n clickOnAdvanceSearchLink" +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check Emailtext box is Present on the Screen
	 */
	public boolean verifyEnterEmailIDTextBox() throws Exception
	{
		Log.info("Verifying the EmailText displayed");
		try 
		{
			flag=isElementPresent(EmailidText);
			Assert.assertTrue(flag, "Emailid Text box is Missing");
			return flag;
		} 
		catch (Exception e) 
		{

			throw new Exception("FAILED WHILE VERIFYING THE ENTER EMAILID TEXTBOX VERIFICATION " + " \n verifyEnterEmailText" +e.getLocalizedMessage());
		}
	}
	
	/********************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return emailid
	 * @throws Exception
	 * This method will helpus to enter Emailid on Emailid text box
	 */
	public void enterEmailIdText(String emailid) throws Exception
	{
		Log.info("Verification of Entering on Email Text");
		try
		{
			
			uiDriver.findElement(EmailidText).sendKeys(emailid);
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE ENTERING ON EMAILID TEXT BOX" +"\n enterEmailText(String emailid) " + e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check create Password Textbox is Present on the Screen
	 */
	public boolean verifyCreatePassword() throws Exception
	{
		Log.info("Verification of CreatePassword");
		try 
		{
			flag=isElementPresent(CreatePassword);
			Assert.assertTrue(flag, "Create Password Textbox is Missing");
			return flag;
			
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE CreatePassword Textbox " + " \n verifyCreatePassword " +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return password
	 * @throws Exception
	 * This method will helpus to enter Password on Create Password text box
	 */
	public void enterCreatePassword(String password) throws Exception
	{
		Log.info("Verification for Entering the Password on create Textbox");
		try 
		{
			
			uiDriver.findElement(CreatePassword).sendKeys(password);
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE ENTERING ON CREATE PASSWORD TEXTBOX " + "\n enterCreatePassword(String password) " +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This Method helps you to check the Terms and conditions Text is present
	 */
	
	public boolean verifyIagreeTermsAndConditionsPara() throws Exception
	{
		Log.info("Verification of Text of Iagree Terms and condition");
		try 
		{
			flag=isElementPresent(IagreeTermsConditions);
			Assert.assertTrue(flag, "I agree Terms and condition Links are Missing");
			return flag;
		} catch (Exception e)
		{
			throw new Exception("FAILED WHILE VERIFYING THE I AGREE TERMS AND CONDITIONS " +"\n verifyIagreeTermsAndConditionsPara " +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This Method helps you to check the Terms and conditions Link is present
	 */
	public boolean verifyTermsAndConditionsLink() throws Exception
	{
		Log.info("Verification Terms and Conditions Link");
		
		try
		{
			flag=isElementPresent(TermsandConditionslink);
			Assert.assertTrue(flag, "Terms And Conditions Link is Missing");
			return flag;
			
		} catch (Exception e)
		{
			throw new Exception("FAILED WHILE VERIFING THE TERMS AND CONDITIONS LINK "+ "\n verifyTermsAndConditionsLink" +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	/**
	 * @author manjunathr
	 * @return TermsAndConditions
	 * @throws Exception
	 * This Method user will clcik on Terms and conditions link and that will redirects to Terms and conditions Link.
	 */
	public JobSearchNaukriPage clickOnTermsAndConditionsLink() throws Exception
	{
		Log.info("Verification for click even on Terms and conditions Link");
		try 
		{
			Parent_window=uiDriver.getWindowHandle();
			uiDriver.findElement(TermsandConditionslink).click();
			switchToNewWindow();
			
		} 
		
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE CLICKING ON TERMS AND CONDITIONS LINK" + "\n clickOnTermsAndConditionsLink " +e.getLocalizedMessage());
		}
		return new JobSearchNaukriPage(uiDriver);
	}
	/********************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check create Postyour CV Button is Present on the Screen
	 */
	public boolean verifyPostYourCV() throws Exception
	{
		Log.info("Verification for Post Your CV Button");
		try 
		{
			flag=isElementPresent(PostyourCVbutton);
			Assert.assertTrue(flag, "Post Your CV Object is Missing");
			return flag;
		} catch (Exception e)
		{
			throw new Exception("FAILED WHILE VERIFING THE POST YOUR CV ELEMENT" + "\n verifyPostYourCV "+e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check create Postyour CV Button is Present on the Screen
	 */
	public MyNaukriPage clickOnPostYourCV() throws Exception
	{
		Log.info("Verification of Click operation for PostYour CV");
		
		try
		{
			
			uiDriver.findElement(PostyourCVbutton).click();
			
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE CLICKING ON POSTYOUR CV BUTTON "+ "\nclickOnPostYourCV " +e.getLocalizedMessage());
		}
		return new MyNaukriPage(uiDriver);
	}
	/********************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This method will check get Best Match Paragrapgh is displayied on the Home Page
	 */
	public boolean verifyGetMatchedJobsPara() throws Exception
	{
		Log.info("Verification of Getmatched jobs text");
		try 
		{
			flag=isElementPresent(getbestmactchedjobsPara);
			Assert.assertTrue(flag, "Get Matched Jobs Email id object is Missing");
			return flag;
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE GETMATCHEDHOBSPARAGRAPGH " + "\n VerifyGetMatchedJobsPara" + e.getLocalizedMessage());

		}
	}
	/********************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This Method will Helps to verify Create Job alert button is displayed on the Page
	 */
	
	public boolean verifyCreateJobAlertButton() throws Exception
	{
		Log.info("Verification of Create job alert button is displayed");
		try 
		{
			flag=isElementPresent(CreateJobAlertbutton);
			Assert.assertTrue(flag, "Create Job alert button is Missing");
			return flag;
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE CREATEJOBALERTBUTTON " + "\n verifyCreateJobAlertbutton " +e.getLocalizedMessage());

		}
	}
	/********************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return CreateJobalert
	 * @throws Exception
	 * This Method will click on Create Job alert Button and navigate to create jobs alert screen
	 */
	public CreateJobAlert clickonCreateJobAlertButton() throws Exception
	{
		Log.info("Clciking on the Create job alert button");
		
		try 
		{
			//Parent_window=uiDriver.getWindowHandle();
			uiDriver.findElement(CreateJobAlertbutton).click();
			waitImplicit();
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE CLICKING ON THE CREATE JOB ALERT BUTTON " + "clickonCreateJobAlertButton "+ e.getLocalizedMessage());
		}
		return new CreateJobAlert(uiDriver);
	}
	
	/********************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This Method will Help us to verify naukri Fast and Forward link is displaying on the Page
	 */
	public boolean verifyNaukriFastForwardImageLink() throws Exception
	{
		Log.info("Verification of Naukri Fast forward image Link");
		try
		{
			flag=isElementPresent(naukriFastForwardlinkimage);
			Assert.assertTrue(flag, "Naukri Fast Forward Image link is Missing");
			return flag;
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE NAUKRIFASTFORWARDIMAGE LINK " + "\n verifyNaukriFastForwardImage" +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return CreateJobalert
	 * @throws Exception
	 * This Method will click on Create Job alert Button and navigate to create jobs alert screen
	 */
	public ResumeNaukriPage clickOnNaukriFastForwardImageLink() throws Exception
	{
		Log.info("Verification of Click opertion for Fast forward Link");
		try 
		{
			Parent_window=uiDriver.getWindowHandle();
			uiDriver.findElement(naukriFastForwardlinkimage).click();
			switchToNewWindow();
			
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE CLICKING ON NAUKRI FAST FORWARD LINK IMAGE " + "\n clickOnNaukriFastForwardImageLink " +e.getLocalizedMessage());
		}
		return new ResumeNaukriPage(uiDriver);
	}
	/********************************************************************************************************************************************************/
	
	public boolean verifyKnowYourResumeScoreLink() throws Exception
	{
		Log.info("Verification of know your resume score link");
		try
		{
			flag= isElementPresent(knowyourresumescorelink);
			Assert.assertTrue(flag, "Know your Resume Score link object is missing");
			return flag;
			
		} catch (Exception e)
		{
			throw new Exception("FAILED WHILE VERIFYING THE KNOW YOUR SCORE LINK" + "\n verifyKnowYourResumeScoreLink " +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	/**
	 * @author manjunathr
	 * @return  ResumeNaukriPage
	 * @throws Exception
	 * This Method will redirect to Resume Naukri page after clicking on the Link
	 */
	
	public ResumeNaukriPage clickOnKnowYourResumeScoreLink() throws Exception
	{
		Log.info("clicking on know your resume Link");
		
		try 
		{
			uiDriver.findElement(knowyourresumescorelink).click();
			switchToNewWindow();
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE CLICKING ON THE KNOW YOUR RESUME SCORE LINK" + "\n clickOnKnowYourResumeScoreLink" +e.getLocalizedMessage());
		}
		return new ResumeNaukriPage(uiDriver);
	}
	/********************************************************************************************************************************************************/
	/**
	 * 
	 * @author manjunathr
	 * @return flag
	 * @throws Exception
	 * This Method will verify that Get Your Free Text is Present on the Screen
	 */
	public boolean verifyGetYourFreeText() throws Exception
	{
		Log.info("Verification of get your Free text ");
		
		try 
		{
			flag=isElementPresent(GetYourFreeText);
			Assert.assertTrue(flag, "Get your Free Text object is Missing");
			return flag;
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE GET FREE TEXT" + "\n verifyGetYourFreeText" + e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	/**
	 * 
	 * @return
	 * @throws Exception
	 */
	
	public boolean verifyResumeFeedbackReportLink() throws Exception
	{
		Log.info("Verification of Resume Feedback Report Link");
		try 
		{
			flag=isElementPresent(resumefeebackResport);
			Assert.assertTrue(flag, "Resume Feedback Report object is missing");
			return flag;
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFING THE RESUME FEEDBACK LINK " + "\n verifyResumeFeedbackReportLink " + e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	
	public ResumeNaukriPage clickOnResumeFeedbackReportLink() throws Exception
	{
		Log.info("Clicking on ResumeFeedbackReportLink");
		try 
		{
			verifyResumeFeedbackReportLink();
			uiDriver.findElement(resumefeebackResport).click();
			
		} catch (Exception e) 
		{
		throw new Exception("FAILED WHILE CLICKING ON RESUME FEEDBACK REPORT LINK " + "\n ResumeFeedbackReportLink "+e.getLocalizedMessage());
		}
		return new ResumeNaukriPage(uiDriver);
	}
	/********************************************************************************************************************************************************/
	
	
	public boolean verifyNotGettingEnoughProfilesLink() throws Exception
	{
		Log.info("Verification of not getting enough profile links");
		
		try 
		{
			flag=isElementPresent(notGettingEnoughProfilesViews);
			Assert.assertTrue(flag, "Not getting enough profiles links object is missing");
			return flag;
			
		} catch (Exception e)
		{
			throw new Exception("FAILED WHILE VERIFYING THE NOT GETTING ENOUGH PROFILES LINKS" + "\nverifyNotGettingEnoughProfilesLink " +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public ResumeNaukriPage clickOnNotGettingEnoughProfilesLink() throws Exception
	{
		Log.info("Clicking on not getting enough profiles link");
		
		try
		{
			uiDriver.findElement(notGettingEnoughProfilesViews).click();
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE CLICKING ON THE NOT GETTING ENOUGH PROFLIES LINKS " + "\nclickOnNotGettingEnoughProfilesLink " +e.getLocalizedMessage());
		}
		return new ResumeNaukriPage(uiDriver);
	}
	/********************************************************************************************************************************************************/
	
	public boolean verifyGet3to4MoreTimesProfilesText() throws Exception
	{
		Log.info("Verification of get 3- 4 more times profiles text");
		
		try
		{
			flag=isElementPresent(get3to4TimesMoreProfiles);
			Assert.assertTrue(flag, "get 3-4 more times profiles text is missing");
			return flag;
			
		} catch (Exception e) 
		{
			throw new Exception ("FAILED WHILE VERIFYING THE GET 3-4 TIMES PROFILES TEXT " + "\n verifyGet3to4MoreTimesProfilesText " + e.getLocalizedMessage());
		}
	}
	
	/********************************************************************************************************************************************************/
	
	public boolean verifyTollFreeNumber() throws Exception
	{
		Log.info("Verification for Tollfree number");
		
		try 
		{
			flag=isElementPresent(Tollfreetext);
			Assert.assertTrue(flag, "Verifcation of Toll free number");
			return flag;
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFING THE TOLLFREE NUMBER" + "\n verifyTollFreeNumber" +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public boolean VerifySearchForAllCurrentandWalkingjobs() throws Exception
	{
		Log.info("Verification of VerifySearchForAllCurrentandWalkingjobs");
		
		try 
		{
			flag= isElementPresent(searchallcurrentandwalkinjobs);
			Assert.assertTrue(flag, "VerifySearchForAllCurrentandWalkingjobs object is missing");
			return flag;
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE VERIFY SEARCH FOR ALL CURRENT AND WALKIN JOBS" + "\nVerifySearchForAllCurrentandWalkingjobs " +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public boolean verifySearchWalkinJobsButton() throws Exception
	{
		Log.info("Verifcation of search walkin jobs button");
		
		try 
		{
			flag= isElementPresent(searchwalkingjobsbutton);
			Assert.assertTrue(flag, "SearchWalkinJObsButton object is missing");
			return flag;
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE SEARCH WALKIN JOBS BUTTON " + "\n verifySearchWalkinJObsButton "+e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public void clickOnSearchWalkinJobsButton() throws Exception
	{
		Log.info("Verification of Click on Search walking jobs button");
		
		try
		{ 
			
		uiDriver.findElement(searchwalkingjobsbutton).click();
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE CLICK ON SEARCH JOBS BUTTON" + "\n clickOnSearchWalkinJobsButton " + e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public boolean verifyNaukriCareerNavigatorimageLink() throws Exception
	{
		Log.info("Verification of Career navigator image link");
		
		try
		{
			flag=isElementPresent(careernavigatiorimagelink);
			Assert.assertTrue(flag, "Career navigator image link is not displaying");
			return flag;
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE CAREER NAVIGATOR IMAGE LINK" + "\nverifyNaukriCareerNavigatorimageLink " +e.getLocalizedMessage());
		}
	}
	
	/********************************************************************************************************************************************************/
	
	public ResumeNaukriPage clickOnNaukriCareerNavigatorimageLink() throws Exception
	{
		Log.info("Verification of click opertaion of naukri career navigator image link");
		try 
		{
			verifyNaukriCareerNavigatorimageLink();
			
			
			uiDriver.findElement(careernavigatiorimagelink).click();
		
			
			
			for (String ChildResumeQuality : uiDriver.getWindowHandles()) 
			{
				uiDriver.switchTo().window(ChildResumeQuality);
				Thread.sleep(3000);
				String Actual_Result=uiDriver.getTitle();
				//Assert.assertEquals(Actual_Result, NKConstants.PAGETITLE_RESUMENAUKRIPAGE, "Resume Quality Title is Matching");
			}
			
			
			WebElement ele =uiDriver.findElement(resumetext);
			String actualResult= ele.getText();
			String exceptedresult="I need an impressive resume";
			Assert.assertEquals(actualResult, exceptedresult, "Both are not Matching");
			
			
			
		} 
		catch (Exception e)
		{
		throw new Exception("FAILED WHILE CLICKING ON CAREER NAVIGATOR IMAGE LINK" + "\n clickOnNaukriCareerNavigatorimageLink" +e.getLocalizedMessage());
		}
		return new ResumeNaukriPage(uiDriver);
	}
	/********************************************************************************************************************************************************/
	
	
	public boolean verifySalaryTrendText() throws Exception
	{
		Log.info("Verification of Salary Trend text or paragraph");
		
		try 
		{
			flag=uiDriver.findElement(Salarytrendstext).isDisplayed();
			Assert.assertTrue(flag, "Salary Trend Text is missing or not Matching");
			return flag;
			
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE SALARY TREND TEXT" + "\n verifySalaryTrendText" +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	
	public boolean verifyViewSalariesButton() throws Exception
	{
		Log.info("Verification of View salary button");
		
		try 
		{
			flag=uiDriver.findElement(viewSalarybutton).isDisplayed();
			Assert.assertTrue(flag, "View salary button is missing");
			return flag;
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE VERIFYING VIEW SALARY BUTTON" + "\n verifyViewSalariesButton" +e.getLocalizedMessage() );
		}
	}
	
	/********************************************************************************************************************************************************/
	public void clickOnViewSalaryButton() throws Exception
	{
		Log.info("click operation of View salary button" );
		
		try 
		{
			verifyViewSalariesButton();
			uiDriver.findElement(viewSalarybutton).click();
		} catch (Exception e)
		{
			throw new Exception("FAILED WHILE CLICKING ON VIEW SALARY BUTTON" +"\nclickOnViewSalaryButton " +e.getLocalizedMessage());
		}
	}
	
	/********************************************************************************************************************************************************/
	
	public boolean verifyConnectToRecruitersText() throws Exception
	{
		Log.info("Verification of connect to recruiters text");
		
		try
		{
			flag=uiDriver.findElement(connecttoRecruiterstext).isDisplayed();
			Assert.assertTrue(flag, "Connect to recruiters text is missing");
			return flag;
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE CONNECT TO RECRUITERS TEXT" +"\nverifyConnectToRecruitersText " +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public boolean verifyViewRecruitersButton() throws Exception
	{
		Log.info("verification of view recruiters link");
		
		try 
		{
			flag=uiDriver.findElement(viewRecruitersbutton).isDisplayed();
			Assert.assertTrue(flag, "Verification of view recruiters link");
			return flag;
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE VIEW RECRITERS LINK" + "\n verifyViewRecruiterkButton" +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public void clickOnViewRecruitersLinkButton() throws Exception
	{
		Log.info("Clicking on view recruiters link button");
		
		try 
		{
			verifyViewRecruitersButton();
			uiDriver.findElement(viewRecruitersbutton).click();
			
		} 
		catch (Exception e)
		{
			throw new Exception("FAILED WHILE CLICKING ON VIEW RECRUITERS LINK BUTTON");
		}
	}
	
	/********************************************************************************************************************************************************/
		
	public boolean verifyServicesForRecritersText() throws Exception
	{
		Log.info("Verification of verifyServicesForRecriters");
		
		try 
		{
			flag=uiDriver.findElement(serviceforrecruiters).isDisplayed();
			Assert.assertTrue(flag, "Service for recruiters text object is missing");
			return flag;
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERYFING THE SERVICE FOR RECRUITERS TEXT" + "\nverifyServicesForRecritersText " +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	
	public boolean verifyNaukriCallsLink() throws Exception
	{
		Log.info("Verification of Naukri links");
		try 
		{
			flag= uiDriver.findElement(naukricallslink).isDisplayed();
			Assert.assertTrue(flag, "Naukri links object is missing");
			return flag;
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE NAUKRI CALLS LINK" + "\n verifyNaukriCallsLink " + e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public RecruitNaukriPage clickOnNaukriCallsLink() throws Exception
	{
		Log.info("Clicking on naukri link");
		
		try 
		{
			verifyNaukriCallsLink();
			uiDriver.findElement(naukricallslink).click();
			
			for (String childNaukri : uiDriver.getWindowHandles()) 
			{
				uiDriver.switchTo().window(childNaukri);
			}
			
			
		/*	WebElement eld= uiDriver.findElement(youeorder);
			String actualresult= eld.getText();
			String ExpectedResult="Your Order Details";
			Assert.assertEquals(actualresult, ExpectedResult, "Your order is Not Matching");*/
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE CLICKING ON NAUKRI LINKS LINK "+ "\n clickOnNaukriCallsLink" +e.getLocalizedMessage());
		}
		
		return new RecruitNaukriPage(uiDriver);
		
	}
	/********************************************************************************************************************************************************/
	
	public boolean verifyFastestRecruitersVechileText() throws Exception
	{
		Log.info("Verification of fastest recruiters Vechile text");
		
		try 
		{
			flag=uiDriver.findElement(FastestRecruitersvechileText).isDisplayed();
			Assert.assertTrue(flag, "Fastest Recruiters Vechile object is missing");
			return flag;
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE FASTEST RECRUITERS VECHILE TEXT" + "\n verifyFastestRecruitersVechileText " +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public boolean verifySearchCVforFreeLink() throws Exception
	{
		Log.info("Verifcation for search CV for free link");
		try
		{
			flag=uiDriver.findElement(searchcvforforfreelink).isDisplayed();
			Assert.assertTrue(flag, "Search cv for free link is missning");
			return flag;
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE SEARCH CV FOR FREE " + "\n verifySearchCVforFreeLink" + e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public void clickOnSearchCVForFreeLink() throws Exception
	{
		Log.info("Clciking on search cv for free link");
		try 
		{
			verifySearchCVforFreeLink();
			uiDriver.findElement(searchcvforforfreelink).click();
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE CLICKING ON SEARCH CV FOR FREE LINK " + "\n clickOnSearchCVForFreeLink" + e.getLocalizedMessage());
		}
	}
	
	/********************************************************************************************************************************************************/
	
	public boolean verifyFindtheRightCandiText() throws Exception
	{
		Log.info("Verifcation  of verify Find the right candidate" );
		
		try 
		{
			flag=uiDriver.findElement(findtherightcandidatetext).isDisplayed();
			Assert.assertTrue(flag, "Find the Right Candidate Text is Missing");
			return flag;
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE FIND THE RIGHT CANDIDATE TEXT" + "\n verifyFindtheRightCandiText" + e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public boolean verifyHRZoneLink() throws Exception
	{
		Log.info("Verification HR Zone Link");
		try 
		{
			flag= uiDriver.findElement(hrzonelink).isDisplayed();
			Assert.assertTrue(flag, "HR ZONE OBJECT IS MISSING");
			return flag;
		} catch (Exception e) 
		{
		throw new Exception("FAILED WHILE VERIFYING THE HR ZONE LINK" + "\n verifyHRZoneLink" + e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public void ClickOnHRZoneLink() throws Exception
	{
		Log.info("Click on HR ZONE LINK");
		
		try 
		{
			verifyHRZoneLink();
			uiDriver.findElement(hrzonelink).click();
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE CLICKING ON THE HR ZONE LINK" + "\n ClickOnHRZoneLink " + e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public boolean verifyCampusHiringSolutionsLink() throws Exception
	{
		Log.info("Verifying the Compus Hiring Solutions Link");
		
		try 
		{
			flag=uiDriver.findElement(compusHiringsolutionslink).isDisplayed();
			Assert.assertTrue(flag, "Campuse Hiring Solutions Link is Missing");
			return flag;
			
		} catch (Exception e)
		{
			throw new Exception("FAILED WHILE VERIFYING THE CAMPUS HIRING SOLUTIONS LINK" + "\n verifyCampusHiringSolutionsLink" + e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public void clickOnCampusHiringSolutionsLink() throws Exception
	{
		Log.info("Clicking on the Campus hriring solutions Link");
		try 
		{
			verifyCampusHiringSolutionsLink();
			uiDriver.findElement(compusHiringsolutionslink).click();
			
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE CLICKING ON CAMPUSE HIRING SOLUTIONS LINK" + "\n clickOnCampusHiringSolutionsLink" + e.getLocalizedMessage());
		}
	}
	
	/********************************************************************************************************************************************************/
	
	public boolean verifyOptimizeYourFresherHiring() throws Exception
	{
		Log.info("Verifying the optimize your Fresher Hiring");
		
		try 
		{
			flag=uiDriver.findElement(optimizeyourfresherHiring).isDisplayed();
			Assert.assertTrue(flag, "Optimize your Freshers Hiring");
			return flag;
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERFYING THE OPTIMIZE YOUR FRESHER HIRING" + "\n verifyOptimizeYourFresherHiring" + e.getLocalizedMessage());
		}
	}
	
	/********************************************************************************************************************************************************/
	
	public boolean verifyNaukriJobSpeak() throws Exception
	{
		Log.info("Verification of Naukri Jobs Speak");
		
		try 
		{
			flag=uiDriver.findElement(naukriJobSpeakText).isDisplayed();
			Assert.assertTrue(flag, "Naukri job speak object is Missing");
			return flag;
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFING THE NAUKRI JOBS SPEAK TEXT" + "\n verifyNaukriJobSpeak" +e.getLocalizedMessage());
		}
	}
	
	/********************************************************************************************************************************************************/
	
	public boolean verifyMonthlyjobIndextext() throws Exception
	{
		Log.info("Verification of Monthly Job index Text");
		try 
		{
			flag=uiDriver.findElement(monthlyJobIndexText).isDisplayed();
			Assert.assertTrue(flag, "Monthly Job index Text objext is Missing");
			return flag;
			
		}
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE MONTHLY JOB INDEX TEXT" + "\n verifyMonthlyjobIndextext" +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public boolean verifyViewLatestEditionLink() throws Exception
	{
		Log.info("Verification of View Latest edition link");
		
		try 
		{
			flag=uiDriver.findElement(viewlatestadditionLink).isDisplayed();
			Assert.assertTrue(flag, "View Latest Edition Link is Missing");
			return flag;
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE VIEW LATEST EDITION LINK" + "\n verifyViewLatestEditionLink" +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public void clickOnViewLatestEditionLink() throws Exception
	{
		Log.info("Clicking on View lastest edition link");
		try 
		{
			verifyViewLatestEditionLink();
			uiDriver.findElement(viewlatestadditionLink).click();
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE CLICKING ON THE VIEW LATEST EDITION LINK" + "\nclickOnViewLatestEditionLink " +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public boolean verifyJobsByLocation() throws Exception
	{
		Log.info("Verification of jobs by location text");
		try
		{
			flag=isElementPresent(jobsbyLocationsText);
			Assert.assertTrue(flag, "Jobs by location text is missing");
			return flag;
		} 
		catch (Exception e) 
		{
		throw new Exception("FAILED WHILE VERIFYING THE JOBS BY LOCATION TEXT" + "\n verifyJobsByLocation" + e.getLocalizedMessage());
		}
	}
	
	/********************************************************************************************************************************************************/

	public JobSearchNaukriPage clickOnJobsBYLocationsName() throws Exception
	{
		Log.info("Getting the Locations Name");
		try 
		{
			Parent_window=uiDriver.getWindowHandle();
			List<WebElement> jobsbylocationsweblist=uiDriver.findElements(jobsByLocationsLinksList);
			
			List<String> arrayjobsbylocationslist= new ArrayList<String>();
			
			for (int i = 0; i < jobsbylocationsweblist.size(); i++) 
			{
				String linksname=jobsbylocationsweblist.get(i).getText();
				String actual_Result=linksname.substring(8);
				arrayjobsbylocationslist.add(actual_Result);
				jobsbylocationsweblist.get(i).click();
				System.out.println(actual_Result);
				switchToNewWindow();
				/*expected_Result=getAttributeValue(locationTextbox, "value");
				System.out.println("manju"+ expected_Result);*/
				Thread.sleep(4000);
				uiDriver.close();
				uiDriver.switchTo().window(Parent_window);
				
			}
			
		} 
	
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE GETTING THE LOCATIONS NAME" + "\n getLocationsName" +e.getLocalizedMessage());
		}
		return new JobSearchNaukriPage(uiDriver);
	}
	/********************************************************************************************************************************************************/
	
	
	public boolean verifyViewallLocationsLink() throws Exception
	{
		Log.info("Verification of View Location link");
		try 
		{
			flag=isElementPresent(viewalllocationslink);
			Assert.assertTrue(flag, "View Locations link is misssing");
			return flag;
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE VIEW ALL LOCATION LINK" + "\n verifyViewallLocationsLink" + e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	

	
	
	public JobSearchNaukriPage clickOnViewAllLocationsLink() throws Exception
	{
		Log.info("Clicking on View Location link");
		try 
		{
			Parent_window=uiDriver.getWindowHandle();
			uiDriver.findElement(viewalllocationslink).click();
			switchToNewWindow();
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE CLICKING ON VIEW LOCATION LINK"+ "\n clickOnViewLocationsLink" +e.getLocalizedMessage());
		}
		return new JobSearchNaukriPage(uiDriver);
	}
	/********************************************************************************************************************************************************/
	
	public boolean verifyJobsByCategoryText() throws Exception
	{
		Log.info("Verification of Jobs by Category Text");
		try
		{
			flag=uiDriver.findElement(jobsbycategorytext).isDisplayed();
			Assert.assertTrue(flag, "Jobs by Category Text is Missing");
			return flag;
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE JOBS BY CATEGORY TEXT" + "\n verifyJobsByCategoryText" +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	public JobSearchNaukriPage clickOnJobsByCategoryList() throws Exception
	{
		Log.info("Verifcation of Jobs by Categoryies list");
		try
		{
			Parent_window= uiDriver.getWindowHandle();
			
			List<WebElement> jobscategories= uiDriver.findElements(jobsbycategorylinsList);
			
			for (WebElement categ : jobscategories)
			{
				categ.click();
				actual_Result=categ.getText();
				//System.out.println(actual_Result);
				
				String splitx=actual_Result;
				String delim=" ";
				String catarr[]=splitx.split(delim);
				System.out.println(catarr[0]);
				Thread.sleep(4000);
				switchToNewWindow();
				uiDriver.close();
				uiDriver.switchTo().window(Parent_window);
			}
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE CLICKING ON THE CATEGORIES LIST " + "\n clickOnJobsByCategoryList " + e.getLocalizedMessage());
		}
		return new JobSearchNaukriPage(uiDriver);
	}
	
	/********************************************************************************************************************************************************/
	
	public boolean verifyViewAllCategoriesLink() throws Exception
	{
		Log.info("Verification of view all categories link");
		try
		{
			flag=isElementPresent(viewallcategorieslink);
			Assert.assertTrue(flag, "View all categories Link is Missing");
			return flag;
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFING THE VIEW ALL CATEGORIES LINK" + "\n verifyViewAllCategories"+ e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public JobSearchNaukriPage  clickONViewAllCategoriesLink() throws Exception
	{
		Log.info("Clicking on view all categories Link");
		
		try 
		{
			//verifyViewAllCategoriesLink();
			uiDriver.findElement(viewallcategorieslink).click();
			
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE CLICKING ON THE VIEW ALL CATEGORIES LINK" + "\n clickONViewAllCategoriesLink" + e.getLocalizedMessage());
		}
		return new JobSearchNaukriPage(uiDriver);
	}
	/********************************************************************************************************************************************************/
	
	public boolean verifyFootInformationText() throws Exception
	{
		Log.info("Verifcation of Information Text");
		try 
		{
			flag=isElementPresent(Foot_informationText);
			Assert.assertTrue(flag, "Foot information Text is missing");
			return flag;
		}
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE FOOT INFOPRMATION TEXT" + "\n verifyFootINformationText" + e.getLocalizedMessage());
		}
	}
	
	/********************************************************************************************************************************************************/
	
	public List<String> getFootInformationLinks() throws Exception
	{
		Log.info("Getting the links of inflomation");
		try
		{
			List<WebElement> informationwebList= uiDriver.findElements(Foot_informationLinks);
			List<String> arrayfootinformationlink= new ArrayList<String>();
			
			for (WebElement footarr : informationwebList) 
			{
				arrayfootinformationlink.add(footarr.getText());
			}
			return arrayfootinformationlink;
		}
		catch (Exception e)
		{
			throw new Exception("FAILED WHILE GETTING THE FOOT INFORMATION LINKS"+ "\n getFootInformationLinks " + e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public boolean verifyJobseekerText() throws Exception
	{
		Log.info("Verifcation of jobseeker text");
		try
		{
			flag=uiDriver.findElement(Foot_jobseekerText).isDisplayed();
			Assert.assertTrue(flag, "Jobseeker Text is missing");
			return flag;
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE JOBSEEKER TEXT" + "\n verifyJobseekerText" +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public List<String> getJobseekersLinks() throws Exception
	{
		Log.info("Verification for Jobseekers links");
		try 
		{
			List<WebElement> jobseekersweblist= uiDriver.findElements(foot_jobseekerlinks);
			List<String> Arrayjobseerkerlist= new ArrayList<String>();
			
			for (WebElement Arrjobseeker : jobseekersweblist) 
			{
				Arrayjobseerkerlist.add(Arrjobseeker.getText());
			}
			return Arrayjobseerkerlist;
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE GETTING JOBSEEKERS LINKS NAME" + "\n getJobseekersLinks " + e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public boolean verifyBrowseJobsText() throws Exception
	{
		Log.info("Verifcation of browse jobs text");
		
		try 
		{
			flag= uiDriver.findElement(foot_browsejostext).isDisplayed();
			Assert.assertTrue(flag, "Browse Jobs Text is Missing");
			return flag;
			
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE BROWSE JOBS TEXT " + "\n verifyBrowseJobsText" +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public List<String> getBrowseLinksList()  throws Exception
	{
		Log.info("getting all browse Links");
		
		try 
		{
			List<WebElement> webbrowselist= uiDriver.findElements(foot_browsejobslink);
			List<String> Arraybrowselist= new ArrayList<String>();
			
			for (WebElement arraybrowse : webbrowselist) 
			{
				Arraybrowselist.add(arraybrowse.getText());
			}
			return Arraybrowselist;
		} 
		catch (Exception e)
		{
			throw new Exception("FAILED WHILE GETTING THE LINKS OF BROWSE" + "\n getBrowseLinksList " +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public boolean verifyEmployersText() throws Exception
	{
		Log.info("Verifcation of Employer text");
		try 
		{
			flag=uiDriver.findElement(Foot_employersText).isDisplayed();
			Assert.assertTrue(flag, "Employers Text is Missing");
			return flag;
			
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE EMPLOYERS TEXT" + "\n verifyEmployersText" + e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public List<String> getEmployersLinksList() throws Exception
	{
		Log.info("Verification of getting the employers links name");
		try 
		{
			List<WebElement> employersweblist= uiDriver.findElements(Foot_employerslinks);
			List<String> arrayemployerlist= new ArrayList<String>();
			for (WebElement arremoloyer : employersweblist) 
			{
				arrayemployerlist.add(arremoloyer.getText());
			}
			return arrayemployerlist;
			
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE GETTING THE LINKS OF EMPLOYERS" + "\n getEmployersLinksList" + e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	public boolean verifyFastForwardText() throws Exception
	{
		Log.info("Verification of Fast forward Text");
		
		try 
		{
			flag=uiDriver.findElement(Foot_FastForwardText).isDisplayed();
			Assert.assertTrue(flag, "Fast and Forward Text is missing on the Page");
			return flag;
		} 
		catch (Exception e) 
		{
			throw new Exception("FAILED WHILE VERIFYING THE FAST FORWARD TEXT" + "\n verifyFastForwardText" + e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public List<String> getFastForwardLinksnames() throws Exception
	{
		Log.info("Verification of Fast and forward links names");
		
		try 
		{
			List<WebElement> webfastandforwordlinks=uiDriver.findElements(Foot_Fastforwardlinks);
			List<String> arrayfastandforwardlist= new ArrayList<String>();
			for (WebElement arrayfastandforward : webfastandforwordlinks) 
			{
				arrayfastandforwardlist.add(arrayfastandforward.getText());
			}
			return arrayfastandforwardlist;
		} catch (Exception e) 
		{
			throw new Exception("FAILED WHILE GETTING THE FAST AND FORWARD LINKS NAME" + "\n getFastForwardLinksnames" +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public boolean verifyFollowUsText() throws Exception
	{
		Log.info("Verification of follow us text");
		try 
		{
			flag=uiDriver.findElement(Foot_followustext).isDisplayed();
			Assert.assertTrue(flag, "Follow us Text is Missing:");
			return flag;
			
		} 
		catch (Exception e) 
		{
			throw new Exception(" FAILED WHILE VERIFYING THE FOLLOW US TEXT" + "\n verifyFollowUsText " +e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public List<String> getFollowUslinks() throws Exception
	{
		Log.info("Verification of follow us links");
		try 
		{
			List<WebElement> webfollowuslist= uiDriver.findElements(Foot_followusLinks);
			List<String> arrayfollowuslist= new ArrayList<String>();
			for (WebElement arrayfollowus : webfollowuslist) 
			{
				arrayfollowuslist.add(arrayfollowus.getText());
			}
			return arrayfollowuslist;
			
		} 
		catch (Exception e) 
		{
		throw new Exception("FAILED WHILE VERYFING THE FOLLOW US LINKS" + "\n getFollowUslinks" + e.getLocalizedMessage());
		}
	}
	/********************************************************************************************************************************************************/
	
	public LoginPage clickOnLoginbutton() throws Exception
	{
		Log.info("Clicking on loginbutton link button");
		
		try 
		{
			isElementPresent(loginlink);
			uiDriver.findElement(loginlink).click();
			Thread.sleep(4000);
			
		} 
		catch (Exception e)
		{
			throw new Exception("FAILED WHILE CLICKING ON login  LINK BUTTON" + e.getLocalizedMessage());
		}
		return new LoginPage(uiDriver);
	}
	/********************************************************************************************************************************************************/
	
	/********************************************************************************************************************************************************/
	public boolean verifyRegisterLink(){
		flag = uiDriver.findElement(registerLink).isDisplayed();
		Assert.assertTrue(flag, "RegisterLink is not displayed");
		return flag;
	}
	/********************************************************************************************************************************************************/

	public void clickOnRegisterLink() throws Exception
	{
		Log.info("Before Clicking on Register Link");
		
		try 
		{
			verifyRegisterLink();
			uiDriver.findElement(registerLink).click();
			Log.info("After Clicking on Register Link");
			
		} 
		catch (Exception e)
		{
			throw new Exception("FAILED WHILE CLICKING ON REGISTER LINK"+"clickOnRegisterLink()"+e.getLocalizedMessage());
		}
	}
	
	/********************************************************************************************************************************************************/
	
	/********************************************************************************************************************************************************/
	
	public boolean isSiteLogoDisplayed(){
		
		flag = isElementPresent(imgSIteLogo);
			//flag = uiDriver.findElement(imgSIteLogo).isDisplayed();
			return flag;
		}
		
		public boolean isLoginButtonDisplayed() {
			flag = uiDriver.findElement(lnkLogin).isDisplayed();
			
			return flag;
		}
		public JobseekerLoginPage clickOnLogin(){
			isLoginButtonDisplayed();
			uiDriver.findElement(lnkLogin).click();
			return new JobseekerLoginPage(uiDriver);
		}
		
		public AdvancedSearchPage clickOnAdvancedSearch(){
			WebElement element = uiDriver.findElement(lnkAdvancedSearch);
			flag = element.isDisplayed();
			Assert.assertTrue(flag, "Advanced search link is not displayed");
			element.click();
			return new AdvancedSearchPage(uiDriver);
		}
		
		public HomePage enterSkill(String skill){
			WebElement element = uiDriver.findElement(txtSkill);
			flag = element.isDisplayed();
			Assert.assertTrue(flag, "Advanced search link is not displayed");
			element.clear();
			element.sendKeys(skill);
			return this;
		}
		public boolean verifyLogin() throws Exception {
			Log.info(">>>Verifying Login is present or not>>>>>>>>");
			try {
				flag=uiDriver.findElement(siteLogo ).isDisplayed();
				Assert.assertTrue(flag, "Login is present");
				
			} catch (Exception e) {
			 throw new Exception("Failed while verifying Login"+e.getLocalizedMessage());
				// TODO: handle exception
			}
			return flag;
		
		}
			public JobSearchNaukriPage clickOndelhiJobsLink() throws Exception
			{
				Log.info("Clicking on naukri link");
				
				try 
				{
					uiDriver.findElement(jobsbydelhi).click();
					switchToNewWindow();
					
				} catch (Exception e) 
				{
					throw new Exception("FAILED WHILE CLICKING ON NAUKRI LINKS LINK "+ "\n clickOnNaukriCallsLink" +e.getLocalizedMessage());
				}
				
				return new JobSearchNaukriPage(uiDriver);
				
			}
			
			public void verifyBestPlaceToWorkTabs()
			{
				List<WebElement> bestplacetabs=uiDriver.findElements(bestplacestoworklinks);
			int counttabs=0;
			String bestarray[]={"All Sectors","Iformation Technology","Manufacturing","Services"};
			for (WebElement subtabs : bestplacetabs)
			{
				String tabsnames=subtabs.getText().trim();
				System.out.println(tabsnames);
				if(tabsnames.equals(bestarray[counttabs]))
{
					
					flag=true;	
}
				else
				{
					flag=false;
					System.out.println("Best Places to work tab is Not matching");
					break;
				}
				counttabs++;
			}
			Assert.assertTrue(flag, "Expected Tabs of Best Places to Work are not displayed");
			}
		
		

/*******************************************************************************************************************************************************/

public boolean verifyAboutusLink() throws Exception
{
Log.info("Verification of about us Link");	
try
{
	flag=isElementPresent(Foot_information_aboutus);
	Assert.assertTrue(flag, "About us Text is Missing on the Screen");
	return flag;
} catch (Exception e) 
{
	throw new Exception("FAILED WHILE VERIFYING THE ABOUT US TEXT" + "\n verifyAboutusLink" +e.getLocalizedMessage());
}
}
/*******************************************************************************************************************************************************/

public InfoEdgePage ClickOnAboutusLink() throws Exception
{
Log.info("Clicking on of about us Link");	
try
{
	Parent_window=uiDriver.getWindowHandle();
	uiDriver.findElement(Foot_information_aboutus).click();
	switchToNewWindow();
	
} 
catch (Exception e) 
{
	throw new Exception("FAILED WHILE VERIFYING THE ABOUT US TEXT" + "\n verifyAboutusText" +e.getLocalizedMessage());
}
return new InfoEdgePage(uiDriver);
}
/*******************************************************************************************************************************************************/

public boolean verifyFootTermsAndConditionLink() throws Exception
{
Log.info("Verification of verify FootTermsAnd ConditionLink");	
try
{
	flag=isElementPresent(Foot_information_TermsandConditions);
	Assert.assertTrue(flag, "Terms and Conditions  Text is Missing on the Footer Screen");
	return flag;
} catch (Exception e) 
{
	throw new Exception("FAILED WHILE VERIFYING THE TERMS AND CONDITION  TEXT ON FOOTER" + "\n verifyFootTermsAndConditionLink" +e.getLocalizedMessage());
}
}
/*******************************************************************************************************************************************************/

public TermsAndConditions ClickOnFootTermsAndConditionLink() throws Exception
{
Log.info("Clicking on FootTerms And ConditionLink");	
try
{
	Parent_window=uiDriver.getWindowHandle();
	uiDriver.findElement(Foot_information_TermsandConditions).click();
	switchToNewWindow();
	
} 
catch (Exception e) 
{
	throw new Exception("FAILED WHILE CLICKING ON THE FOOTER TERMS AND CONDITIONS LINK" + "\n ClickOnFootTermsAndConditionLink" +e.getLocalizedMessage());
}
return new TermsAndConditions(uiDriver);
}
/*******************************************************************************************************************************************************/

public boolean verifyPrivacyandPolicylink() throws Exception
{
Log.info("Verification of verify Privacy and PolicyLink");	
try
{
	flag=isElementPresent(Foot_information_PrivacyandPolicy);
	Assert.assertTrue(flag, "Privacy and Policy Text is Missing on the Footer Screen");
	return flag;
} catch (Exception e) 
{
	throw new Exception("FAILED WHILE VERIFYING THE Privacy and Policy  Link ON FOOTER" + "\n verifyPrivacyandPolicylink" +e.getLocalizedMessage());
}
}
/*******************************************************************************************************************************************************/

public JobSearchNaukriPage ClickOnPrivacyandPolicy() throws Exception
{
Log.info("Clicking on FootTerms And ConditionLink");	
try
{
	Parent_window=uiDriver.getWindowHandle();
	uiDriver.findElement(Foot_information_PrivacyandPolicy).click();
	switchToNewWindow();
	
} 
catch (Exception e) 
{
	throw new Exception("FAILED WHILE CLICKING ON THE PRIVACY AND POLICY LINK" + "\n ClickOnPrivacyandPolicy" +e.getLocalizedMessage());
}
return new JobSearchNaukriPage(uiDriver);
}
/*******************************************************************************************************************************************************/

public boolean verifyResourceslink() throws Exception
{
Log.info("Verification of verify ResourcesLink");	
try
{
	flag=isElementPresent(Foot_information_Resources);
	Assert.assertTrue(flag, "Resources Text is Missing on the Footer Screen");
	return flag;
} catch (Exception e) 
{
	throw new Exception("FAILED WHILE VERIFYING THE RESOURCES LINK ON FOOTER" + "\n verifyResourceslink" +e.getLocalizedMessage());
}
}
/*******************************************************************************************************************************************************/

public JobSearchNaukriPage ClickOnResourcesLink() throws Exception
{
Log.info("Clicking on Resources link");	
try
{
	//Parent_window=uiDriver.getWindowHandle();
	uiDriver.findElement(Foot_information_Resources).click();
	switchToNewWindow();
} 
catch (Exception e) 
{
	throw new Exception("FAILED WHILE CLICKING ON THE RESOURCES" + "\n ClickOnResourcesLink" +e.getLocalizedMessage());
}
return new JobSearchNaukriPage(uiDriver);
}
}

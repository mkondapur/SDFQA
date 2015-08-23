package com.st.test;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Parameters;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.st.common.NKConstants;
import com.st.pages.AdvancedSearchPage;
import com.st.pages.HomePage;
import com.st.pages.JobseekerLoginPage;
import com.st.util.BaseTestObject;
import com.st.util.ExcelutilObject;

import net.sourceforge.htmlunit.corejs.javascript.ast.ObjectProperty;
public class DemoHomePageTest extends BaseTestObject{
	
public  HomePage objHomePage;
public JobseekerLoginPage objJobseekerLoginPage;
public AdvancedSearchPage objAdvancedSearchPage;
Properties ObjProperty = getPropertyContents();

@Test
public void verifySiteLogo() throws Exception {
	String skill = getExcelTest(1,1);
	System.out.println("skill:"+skill);
	objHomePage = new HomePage(uiDriver);
	boolean isSiteLogoDisplayed = objHomePage.isSiteLogoDisplayed();
	Assert.assertTrue(isSiteLogoDisplayed, "Home page site logo is not displayed");
	objHomePage = objHomePage.clickOnSiteLogo();
	objHomePage.enterSkill(skill);
	objJobseekerLoginPage = objHomePage.clickOnLogin();
}
@Test
public void verifyAdvanced() throws Exception {
	String skill = getExcelTest(1,2);
	objHomePage = new HomePage(uiDriver);
	objAdvancedSearchPage = objHomePage.clickOnAdvancedSearch();
	System.out.println("test:"+skill);
}

public String getExcelTest(int row,int column) throws Exception {
	ExcelutilObject.setExcelFile(NKConstants.Path_TestData, "Search");
	return ExcelutilObject.getCellData(row, column);
	
}
}

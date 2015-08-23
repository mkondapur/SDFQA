package com.st.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.st.util.BasePageObject;



public class AdvancedSearchPage extends BasePageObject{

	public AdvancedSearchPage(WebDriver driver){
		super(driver);
	}
	
	By drpExpMinSalary = By.id("adv_workExp_year");
	By btnSearch = By.id("adv_submit");
	
}

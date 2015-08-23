package com.nk.common;

import java.util.Set;

import org.openqa.selenium.WebDriver;

public class NKCommon{
	
	WebDriver uiDriver;
	
	public NKCommon(WebDriver driver){
		this.uiDriver = driver;
	}	
	
    public void closepopUp(){
	
	    String mainWindow = uiDriver.getWindowHandle();
	    Set<String> allWindowHandles = uiDriver.getWindowHandles();
	    for (String currentWindowHandle : allWindowHandles) {
		if (!currentWindowHandle.equals(mainWindow)) {
			uiDriver.switchTo().window(currentWindowHandle);
			uiDriver.close();
		    }
	     }
	     uiDriver.switchTo().window(mainWindow);
       }
    }
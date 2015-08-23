package com.st.util;

import java.awt.Toolkit;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.UnhandledAlertException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import com.gargoylesoftware.htmlunit.javascript.host.Element;

public class BasePageObject {

	//protected static WebDriver uiDriver;
	public WebDriver uiDriver;
	public BasePageObject(WebDriver driver){
	this.uiDriver = driver;	
	//Sample test Viju
	}
	
	
	public void waitForAnElement(final By theElement,int timeoutInSeconds) {
		try {
			WebElement element = uiDriver.findElement(theElement);
			WebDriverWait wait = new WebDriverWait(uiDriver, timeoutInSeconds);
			wait.until(ExpectedConditions.visibilityOf(element));
		} catch (Exception e) {
			Reporter.log("There was an issue in finding the webelement, " + theElement.getClass() + e.getMessage());
			e.printStackTrace();
		}
	}
	
	public void javaScriptClick(By theElement) {
		WebElement element = uiDriver.findElement(theElement);
		((JavascriptExecutor) uiDriver).executeScript("arguments[0].click();", element);
	}
	
	public boolean isElementPresent(By by) {
        try {
            uiDriver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
	
	/**
	 * 
	 * @param locator
	 */
	public  String getText(By theElement) {
		
		WebElement element= uiDriver.findElement(theElement);
		return element.getText();
	}

    public  String getAttributeValue(By theElement,String attributeValue) {
		WebElement element= uiDriver.findElement(theElement);
		return element.getAttribute(attributeValue);
	}
	public  String getCurrentLocation() {
		return uiDriver.getCurrentUrl().trim();
	}
	
	public  void switchToDefaultFrame() {
		uiDriver.switchTo().defaultContent();
	}

	public  void switchToFrame(String id) {
		uiDriver.switchTo().frame(id);
	}

	public  void switchToFrame(By theElement) {
		WebElement element = uiDriver.findElement(theElement);
		uiDriver.switchTo().frame(element);
	}

	public  void refreshPage() {
		uiDriver.navigate().refresh();
	}
	
	public boolean isTextPresent(String textValue) {
		// Reporter.log("Looking for the element...: " + textValue);
		System.out.println("Looking for the element...: " + textValue);
		WebElement webElement = uiDriver.findElement(By.tagName("html"));
		if (webElement.getText().contains(textValue)) {
			return true;
		} else {
			System.out.println("Element not found : " + textValue);
			return false;
		}
	}
	
	public void selectWindow(int window) {
		Set<String> winNames = uiDriver.getWindowHandles();
		uiDriver.switchTo().window((String) winNames.toArray()[window - 1]);
	}
	
	public  void mouseover(By theElement) {
		new Actions(uiDriver).moveToElement((WebElement) theElement).build().perform();
	}

	
	public void selectDropDown(By theSelectElement, String valToSelect) {
		WebElement element = uiDriver.findElement(theSelectElement);
		Select select = new Select(element);
		// Get a list of the options
		List<WebElement> options = select.getOptions();
		// For each option in the list, verify if it's the one you want and then
		// click it
		for (WebElement we : options) {
			if (we.getText().equals(valToSelect)) {
				we.click();
				break;
			}
		}

	}

	public String selectedItem(By theSelectElement) {
		WebElement element = uiDriver.findElement(theSelectElement);
		Select select = new Select(element);
		WebElement anElement = select.getFirstSelectedOption();
		return anElement.getText();
	}

	/**
	 * This api can be used to verify if a UIElement like checkbox, radio button
	 * is checked or not
	 * 
	 * @param theElement
	 * @return
	 */
	public boolean isElementChecked(By theElement) {
		WebElement element = uiDriver.findElement(theElement);
		boolean retValue = false;
		if (element.isSelected()) {
			retValue = true;
		}
		return retValue;
	}

	public  void maxWindow() {

		Toolkit toolkit = Toolkit.getDefaultToolkit();
		Dimension screenResolution = new Dimension((int) toolkit.getScreenSize().getWidth(), (int) toolkit.getScreenSize().getHeight());
		uiDriver.manage().window().setSize(screenResolution);

	}

	public  void selectWindowCancel(int window) throws Exception {
		//Logger.info("Inside the select window cancel");
		String parentWindowHandle = uiDriver.getWindowHandle();
		Set<String> winNames = uiDriver.getWindowHandles();
		uiDriver.switchTo().alert().dismiss();
		Thread.sleep(3000);
		uiDriver.switchTo().window(parentWindowHandle); 
	}

	public void waitImplicit() {
		uiDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void dragDrop(By element, By target) {
		WebElement elementSource = uiDriver.findElement(element);
		WebElement elementDestination = uiDriver.findElement(target);
		(new Actions(uiDriver)).dragAndDrop(elementSource, elementDestination).perform();

	}
	
	public  void deleteCookies() {
		uiDriver.manage().deleteAllCookies();
	}

	public  void closeBrowser() {

		uiDriver.quit();
	}

	public  void alert() {
		Alert alert = uiDriver.switchTo().alert();
		alert.accept();

	}
	
	 /**
     * This method Verifies click on close button
     * 
     * @return
     * @throws Exception
     */
    public void closePresentWindow() throws Exception {
        try {
            uiDriver.close();
        } catch (Exception e) {
            throw new Exception(
                    "ISSUE IN CLOSING THE 'window'" + "\nMETHOD:clickOnCloseWindow\n" + e
                            .getLocalizedMessage());
        }
    }

	public void closePopUp() throws InterruptedException{
		String parent = uiDriver.getWindowHandle();
		Set<String>pops=uiDriver.getWindowHandles();
        {
        Iterator<String>it = pops.iterator();
        while (it.hasNext()) {
            String popupHandle=it.next().toString();
            if(!popupHandle.contains(parent))
            {
            uiDriver.switchTo().window(popupHandle);
            System.out.println("Popu Up Title: "+ uiDriver.switchTo().window(popupHandle).getTitle());
            uiDriver.close();
            Thread.sleep(5000);
            }
        }
	}
	}

	public String getSelectedValue(By element) {
		WebElement element1 = uiDriver.findElement(element);
		Select select = new Select(element1);
		String selectedValue = select.getFirstSelectedOption().getText();
		return selectedValue;
	}

	public void selectByIndex(By element, int index) {
		WebElement element1 = uiDriver.findElement(element);
		Select select = new Select(element1);
		List<WebElement> options = select.getOptions();
		int size = options.size();
		if (size > 0) {
			select.selectByIndex(index);
		}
	}

	public String getSelectedValueFromCombo(By element) {
		WebElement element1 = uiDriver.findElement(element);
		Select select = new Select(element1);
		String selectedValue = select.getFirstSelectedOption().getText();
		return selectedValue;
	}

	public  void clearAndEnterValueInTextBox(By by, String value) {
		WebElement textBox = uiDriver.findElement(by);
		Assert.assertTrue(textBox.isEnabled(), "Text Box is enabled");
		textBox.sendKeys(Keys.CONTROL + "a");
		textBox.sendKeys(Keys.DELETE);
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
		}
		textBox.sendKeys(value);

	}
	
	public void handleAlert() {
		try {
			WebDriverWait wait = new WebDriverWait(uiDriver, 60);
			boolean alertPresent = false;
			if (wait.until(ExpectedConditions.alertIsPresent()) == null) {
				alertPresent = false;
			} else {
				alertPresent = true;
			}
			if (alertPresent) {
				Alert alert = uiDriver.switchTo().alert();
				alert.accept();
			}
		} catch (UnhandledAlertException e) {

		}
	}

	public  void waitImplicit(int millisecods) {
		uiDriver.manage().timeouts().implicitlyWait(millisecods,
		TimeUnit.SECONDS);
		try {
			Thread.sleep(millisecods);
		} catch (InterruptedException e) {
		}
	}
	public  void logOut() throws InterruptedException {
		WebElement logout = uiDriver.findElement(By.xpath(""));
			logout.click();
			waitImplicit(10);
			Thread.sleep(3000);
	}
	
	public void switchToNewWindow() throws Exception {
		for (String winHandle : uiDriver.getWindowHandles()) {
			uiDriver.switchTo().window(winHandle);
		}
	}

	public  String getWindowName() throws Exception {
		String windowName = uiDriver.getWindowHandle();
		return windowName;
	}

	public  boolean isChildWindowPresent() throws Exception {
		Set<String> windows = uiDriver.getWindowHandles();
		int size = windows.size();
		return size > 1;
	}

	public  void switchToParentWindow(String windowName) throws Exception {
		windowName = windowName.toString();
		uiDriver.switchTo().window(windowName);
		waitImplicit(3000);
	}
public  String getPageTitle() {
		return uiDriver.getTitle().trim();
	}
	
	public  void compareTwoStrings(String Actual, String Expected, String Message) {
		Assert.assertEquals(Actual, Expected, Message);
	}


}

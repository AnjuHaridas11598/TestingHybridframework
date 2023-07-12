package com.SeleniumUtility;

import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.Library.BaseClass;

public class Reusable extends BaseClass{
	public Reusable(WebDriver driver) {
		this.driver=driver;
		
	}
	
	public void Enter_Value(WebElement element, String Text) throws InterruptedException {
		Thread.sleep(3000);
		element.sendKeys(Text);

	}
	public void Click(WebElement element) throws InterruptedException {
		Thread.sleep(3000);
		element.click();

	}
	
	public void TakeScreenshot(String path) {
		TakesScreenshot TS=(TakesScreenshot)driver;
		File SrcFile=TS.getScreenshotAs(OutputType.FILE);
		File target=new File(path);

	}
	
	public void Alertaccept() {
		Alert alert = driver.switchTo().alert();
		alert.accept();

	}
	
	public void Alertdismiss() {
		Alert alert=driver.switchTo().alert();
		
		alert.dismiss();

	}
	
	public void Alertpromptaccept(WebElement element,String Text) {
		Alert alert=driver.switchTo().alert();
		alert.sendKeys(Text);
		alert.accept();
		String alertMessage=element.getText();
		
	}
	
	public void AlertPromtdismiss(WebElement element) {
		Alert alert=driver.switchTo().alert();
		alert.dismiss();
		String alertMessage=element.getText();

	}
	
	public void KeyActionUP() {
		Actions action=new Actions(driver);
		action.sendKeys(Keys.UP).perform();
		
	}
	
	public void KeyActionDOWN() {
		Actions action=new Actions(driver);
		action.sendKeys(Keys.DOWN).perform();

	}
	public void KeyActionLEFT() {
		Actions action=new Actions(driver);
		action.sendKeys(Keys.LEFT).perform();
	}
	
	public void KeyAcitonRIGHT() {
		Actions action=new Actions(driver);
		action.sendKeys(Keys.RIGHT).perform();

	}
	public void KeyActionEnter() {
		Actions action=new Actions(driver);
		action.sendKeys(Keys.ENTER).perform();

	}
	public void ActionHover(WebElement element) {
		Actions action=new Actions(driver);
		action.moveToElement(element).perform();

	}
	
	public void ActionHoverClick(WebElement element) {
		Actions action=new Actions(driver);
		action.moveToElement(element).click().perform();
	}
	
	public void DropdwnVisibleText(WebElement element, String Text) {
		Select dropdown=new Select(element);
		dropdown.selectByVisibleText(Text);
	}
	
	public void DropdwnValue(WebElement element, String Text) {
		Select dropdown=new Select(element);
		dropdown.selectByValue(Text);
	}
	
	public void DropdwnIndex(WebElement element,int n) {
		Select dropdown=new Select(element);
		dropdown.selectByIndex(n);		
		
	}
	
	public void DropdwnIsMultiple(WebElement element) {
		Select dropdown=new Select(element);
		dropdown.isMultiple();

	}
	
	
	
	
	
	
	
	

}

package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.SeleniumUtility.Reusable;

public class FindFriendsPage {
	 Reusable RS=new Reusable(driver);
	
	@FindBy(xpath="//span[text()='Find friends']/../../..")
	WebElement Findfrnds;
	
	@FindBy(xpath="//span[text()='Friend requests']")
	WebElement FrndRequest;
	 
	@FindBy(xpath="(//a[@role='link'])[10]")
	WebElement back;
	
	public void Find_friends() {
		

	}

}

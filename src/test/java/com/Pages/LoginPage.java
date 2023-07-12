package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Library.BaseClass;
import com.SeleniumUtility.Reusable;

public class LoginPage extends BaseClass{
	public Reusable RS;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	WebElement username;
	
	@FindBy(id="pass")
	WebElement password;
	
	@FindBy(id="loginbutton")
	WebElement loginbtn;
	
	public void Username(String Text) throws InterruptedException {
		RS=new Reusable(driver);
		RS.Enter_Value(username, Text);

	}
	
	public void password(String Text) throws InterruptedException {
		RS.Enter_Value(password, Text);

	}
	
	public void signin() throws InterruptedException {
		RS.Click(loginbtn);

	}

}

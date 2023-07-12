package com.Testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.Library.BaseClass;
import com.Pages.LoginPage;

public class Facebook_Login extends BaseClass{
	
	 LoginPage LP;
	@BeforeMethod
	public void Launch() throws IOException 
	{
		LaunchURL();
		

	}
	@Test
	public void Login() throws InterruptedException { 
		LP=new LoginPage(driver);

		LP.Username("9789936839");
		  LP.password("Sivajish1104");
		  LP.signin();
		 
	}
	
	@AfterMethod
	public void Closebrowser() {
		closeURL();

	}
	
	

}

package com.StepDefinition;

import java.io.IOException;

import com.Library.BaseClass;
import com.Pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_Steps extends BaseClass{
	public LoginPage LP;
	
	@Given("Launch the facebook applicaiton")
	public void launch_the_facebook_applicaiton() throws IOException {
		LaunchURL();
	    
	}

//	@When("Enter the username and password")
//	public void enter_the_username_and_password() throws InterruptedException {
//		LP=new LoginPage(driver);
//		LP.username("9789936839");
//		LP.password("Sivajish1104");
//	}
	
	@When("Enter the {string} and {string}")
	public void enter_the_and(String username, String password) throws InterruptedException {
		LP=new LoginPage(driver);
		LP.Username(username);
		LP.password(password);
	   

	    
	}

	@When("Click on the login button")
	public void click_on_the_login_button() throws InterruptedException {
		LP.signin();
	    
	}

	@Then("It should navigate to the home page")
	public void it_should_navigate_to_the_home_page() {
		System.out.println("Navigate to the home page");
	    
	}


}

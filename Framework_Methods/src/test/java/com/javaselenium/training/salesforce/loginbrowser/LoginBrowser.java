package com.javaselenium.training.salesforce.loginbrowser;
import java.net.MalformedURLException;

import org.junit.Assert;

import com.javaselenium.training.salesforce.loginbrowser.WebConnector;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginBrowser {
	WebConnector application=new WebConnector();

//	@Given("^I go to salesforce on \"([^\"]*)\"$")
	@Given("^I go to salesforce on \"([^\"]*)\"$")
	  public void salesforce(String browserType)  {
		System.out.println("Going to facebook "+browserType);
		application.openBrowser(browserType);
		application.navigate("https://www.facebook.com/");
	}
	
	@And("I enter \"([a-zA-Z]{1,})\" as \"([^\"]*)\"$")
	     public void input(String object,String data) {
		 System.out.println("Entering in "+ object +" value "+ data);
		 application.input(object,data);
		
	}
	     
	@When("I click on \"([a-zA-Z]{1,})\"$")
	      public void click(String object) {
	    	  System.out.println("Clicking "+ object);
	  		  application.click(object);
	    	  
	  }
	
	@Then("login should be \"([a-zA-Z]{1,})\"$")
	       public void verifyLogin(String expectedReslt) {
		   System.out.println("Expected esult  - "+ expectedReslt);
		   Assert.assertTrue("Login not successfull", application.isElementPresent("profileimage"));
		
		
	}
	          
	
	
	
}

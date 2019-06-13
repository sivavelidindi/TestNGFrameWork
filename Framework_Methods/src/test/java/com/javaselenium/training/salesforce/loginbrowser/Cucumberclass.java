package com.javaselenium.training.salesforce.loginbrowser;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Cucumberclass {

	@Given("hi hello")
	public void hi_hello() {
	    System.out.println("hi");
	    
	}

	@When("i am good")
	public void i_am_good() {
		System.out.println("how are you");
	    
	}

	@Then("bye bye")
	public void bye_bye() {
		System.out.println("i am good");
	    
	}

}

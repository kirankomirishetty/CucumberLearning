/**
 * 
 */
package com.kss;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
/**
 * @author kiran
 *
 */
public class SatishStepDefs {
	
	@Given("^When user creates a first cucumber project$")
	public void when_user_creates_a_first_cucumber_project() throws Throwable {
	    System.out.println("Hi");
	}

	@When("^User clicks on Create$")
	public void user_clicks_on_Create() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Hello");
	}

	@Then("^Display welcome message$")
	public void display_welcome_message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Success");
	}

}

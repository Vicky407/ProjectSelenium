package org.stepdefinition;

import org.bass.BaseClass2;
import org.pjo.FlipkartLoginPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FlipkarLogipage extends BaseClass2{
	
	
	@Given("To launch the chrome browser and maximise window")
	public void to_launch_the_chrome_browser_and_maximise_window() {
	     launchBrowser();
	     windowMaximize();
	}

	@When("To launch the url of the flipkart application")
	public void to_launch_the_url_of_the_flipkart_application() {
	    launchUrl("https://www.flipkart.com/");
	}

	@When("To pass valid mailid in login feild")
	public void to_pass_valid_mailid_in_login_feild() {
	     FlipkartLoginPojo f = new FlipkartLoginPojo();
	     passText("vigneshwaran407usk@gmail.com", f.getMail());
	    
	}

	@When("To click the request otp button")
	public void to_click_the_request_otp_button() {
		FlipkartLoginPojo f = new FlipkartLoginPojo();
		clickBtn(f.getLogin());
	}

	@When("To check whether navigate to the home page or not")
	public void to_check_whether_navigate_to_the_home_page_or_not() {
	    System.out.println("To check your login Credentials");
	}

	@Then("To close the browser")
	public void to_close_the_browser() {
	    closeEntireBrowser();
	}

}

package myFeaturesFor;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;

public class StandardCh_login {
	@Given("Sumran is done with browser configs")
	public void sumran_is_done_with_browser_configs() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("done with browser configs");
	}

	@Then("she launches the application in her favourite chrome browser")
	public void she_launches_the_application_in_her_favourite_chrome_browser() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("launches the application in her favourite chrome browser");
	}

	@Given("She clicks on sign in link")
	public void she_clicks_on_sign_in_link() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println(" clicks on sign in link");
	}

	@Then("She enters the valid credentials")
	public void she_enters_the_valid_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("enters the valid credentials");
	}

	@Then("She clicks on submit button")
	public void she_clicks_on_submit_button() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("clicks on submit button");
	}

	@Given("guest user clicks on signup link")
	public void guest_user_clicks_on_signup_link() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("guest user clicks on signup link");
	}

	@When("She provides all the mandatory data")
	public void she_provides_all_the_mandatory_data() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		System.out.println("provides all the mandatory data");
	}

	@Then("She clicks on submit and id is generated")
	public void she_clicks_on_submit_and_id_is_generated() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("clicks on submit and id is generated");
	}

	@Given("she clicks on forgot password link")
	public void she_clicks_on_forgot_password_link() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println(" clicks on forgot password link");
	}

	@Then("she enters the mobile number")
	public void she_enters_the_mobile_number() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("enters the mobile number");
	}

	@Then("she receives an otp and the same she provides")
	public void she_receives_an_otp_and_the_same_she_provides() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("receives an otp and the same she provides");
	}

}

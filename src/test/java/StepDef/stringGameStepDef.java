package StepDef;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class stringGameStepDef {
	String input ;
	char c;
	
	@Given("^user has a word \"([^\"]*)\"$")
	public void user_has_a_word(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	
		System.out.println(arg1);
		input = arg1;
	}

	@When("^the last character is calaculated$")
	public void the_last_character_is_calaculated() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	
 c =	input.charAt(input.length()-1);
	}

	@Then("^\"([^\"]*)\" should be printed$")
	public void should_be_printed(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    String expectedResult = String.valueOf(c);
	    Assert.assertEquals(expectedResult, arg1);
	}


}

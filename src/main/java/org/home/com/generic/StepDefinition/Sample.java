package org.home.com.generic.StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sample {
	
	String endpoint = "https://jsonplaceholder.typicode.com/todos/1";
	
	@Given("This is a precondition")
	public void preCondition() {
		
		System.out.println("This is precondition");
		System.out.println(endpoint);
		
	}
	
	@When("This is the '(.*)' step to execute")
	public void whenCondition(String stepName) {
		
		System.out.println(stepName + " is the step");
		
	}
	
	@Then("This is the expected result to validate")
	public void expectedCondition() {
		
		System.out.println("This is the expected result");
		
	}
	
	

}

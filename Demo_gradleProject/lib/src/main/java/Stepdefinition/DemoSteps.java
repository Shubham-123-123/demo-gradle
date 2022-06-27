package Stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class DemoSteps {
	@When("I worked on selenium")
	public void selenium() {
		System.out.println("****Selenium****");
	}
	@And ("I worked on provar")
	public void provar() {
		System.out.println("****provar****");	
	}
}

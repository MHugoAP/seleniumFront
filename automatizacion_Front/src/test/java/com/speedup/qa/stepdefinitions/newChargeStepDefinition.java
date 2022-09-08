package com.speedup.qa.stepdefinitions;

import com.speedup.qa.tasks.NewCharge;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

public class newChargeStepDefinition {

    @When("^Add the new job$")
    public void addTheNewJob() {
        OnStage.theActorInTheSpotlight().attemptsTo(NewCharge.newCharger());

    }

    @Then("^I should see in the profile$")
    public void iShouldSeeInTheProfile() {

    }
}

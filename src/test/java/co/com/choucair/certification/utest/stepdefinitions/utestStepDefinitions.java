package co.com.choucair.certification.utest.stepdefinitions;

import co.com.choucair.certification.utest.model.UtestData;
import co.com.choucair.certification.utest.questions.Answer;
import co.com.choucair.certification.utest.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.conditions.Check;


import java.util.List;

import static co.com.choucair.certification.utest.util.Constant.*;
import static net.serenitybdd.screenplay.actors.OnStage.*;


public class utestStepDefinitions {

    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }

    @Given("^That Juan wants to register in uTest$")
    public void thanTheUserWantsToSignUpAtUtest() {
        theActorCalled(NAME_ACTOR).wasAbleTo(OpenUp.theUtestPage(), FindTheRegisterForm.forNewUsers());
    }


    @When("^he send the required information$")
    public void itEntersItsLogInformation(List<UtestData> utestData)throws Exception {
        theActorInTheSpotlight().attemptsTo(
                FilloutPersonalFields.withYourselfData(utestData.get(0)),
                Check.whether(utestData.get(0).getStrCity().equals("") || utestData.get(0).getStrZipCode().equals("") || utestData.get(0).getStrCountry().equals(""))
                        .andIfSo(FilloutLocationFields.withDefaultData())
                        .otherwise(FilloutLocationFields.withYourAddressData(utestData.get(0))),
                FilloutDevicesFields.withYourDeviceData(utestData.get(0)),
                AcceptTermsAndConditions.settingYourPassword(utestData.get(0))
        );
    }
    @Then("^te sign up is complete when he receives the complete setup button$")
    public void itCanRead(List<UtestData> utestData)throws Exception {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(utestData.get(0).getStrMessage())));

    }
}

package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.choucair.certification.utest.userinterface.TermsAndConditionsPage.*;

public class AcceptTermsAndConditions implements Task {
    private UtestData utestData;

    public AcceptTermsAndConditions(UtestData utestData) {
        this.utestData = utestData;
    }

    public static AcceptTermsAndConditions settingYourPassword(UtestData utestData) {
        return Tasks.instrumented(AcceptTermsAndConditions.class, utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(utestData.getStrPassword()).into(INPUT_PASSWORD),
                Enter.theValue(utestData.getStrPassword()).into(INPUT_CONFIRM_PASSWORD),
                Click.on(CHECKBOX_TERMS_OF_USE),
                Click.on(CHECKBOX_SECURITY_POLICY)
        );

    }
}

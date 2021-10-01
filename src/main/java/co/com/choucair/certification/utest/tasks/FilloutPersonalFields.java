package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.interactions.TypeAllValues;
import co.com.choucair.certification.utest.model.UtestData;
import co.com.choucair.certification.utest.userinterface.PersonalFieldsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.targets.Target;

import static co.com.choucair.certification.utest.userinterface.PersonalFieldsPage.*;

public class FilloutPersonalFields implements Task {

    private UtestData utestData;

    public FilloutPersonalFields(UtestData utestData) {
        this.utestData = utestData;
    }

    public static FilloutPersonalFields withYourselfData(UtestData utestData) {
        return Tasks.instrumented(FilloutPersonalFields.class, utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(utestData.getStrFirstName()).into(INPUT_FIRST_NAME),
                Enter.theValue(utestData.getStrLastName()).into(INPUT_LAST_NAME),
                Enter.theValue(utestData.getStrEmail()).into(INPUT_EMAIL),
                SelectFromOptions.byVisibleText(utestData.getStrBirthDay()).from(SELECT_DAY),
                SelectFromOptions.byVisibleText(utestData.getStrBirthMonth()).from(SELECT_MONTH),
                SelectFromOptions.byVisibleText(utestData.getStrBirthYear()).from(SELECT_YEAR),
                TypeAllValues.using(utestData.getStrLanguages(), INPUT_LANGUAGES),
                Click.on(BUTTON_NEXT)
        );

    }
}

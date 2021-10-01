package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.model.UtestData;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static co.com.choucair.certification.utest.userinterface.LocationFieldsPage.*;
import static co.com.choucair.certification.utest.util.Constant.WAIT_TIME;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FilloutLocationFields implements Task {
    private boolean useDefaultData;
    private UtestData utestData;

    public FilloutLocationFields() {
        useDefaultData = true;
    }

    public FilloutLocationFields(UtestData utestData) {
        this.utestData = utestData;
        useDefaultData = false;
    }

    public static FilloutLocationFields withDefaultData() {
        return Tasks.instrumented(FilloutLocationFields.class);
    }

    public static FilloutLocationFields withYourAddressData(UtestData utestData) {
        return Tasks.instrumented(FilloutLocationFields.class, utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if(useDefaultData) {
            actor.attemptsTo(
                    WaitUntil.the(TEXT_CITY_AUTODETECTED, isVisible()).forNoMoreThan(WAIT_TIME).seconds(),
                    WaitUntil.the(TEXT_ZIP_AUTODETECTED, isVisible()).forNoMoreThan(WAIT_TIME).seconds(),
                    WaitUntil.the(TEXT_COUNTRY_AUTODETECTED, isVisible()).forNoMoreThan(WAIT_TIME).seconds(),
                    Click.on(BUTTON_NEXT)
            );
        } else {
            actor.attemptsTo(
                    Enter.theValue(utestData.getStrCity()).into(INPUT_CITY),
                    Hit.the(Keys.ARROW_DOWN, Keys.ENTER).into(INPUT_CITY),
                    Enter.theValue(utestData.getStrZipCode()).into(INPUT_ZIP).thenHit(Keys.ENTER),
                    Click.on(COUNTRY),
                    Enter.theValue(utestData.getStrCountry()).into(INPUT_COUNTRY).thenHit(Keys.ENTER),
                    Click.on(BUTTON_NEXT)
            );
        }
    }
}

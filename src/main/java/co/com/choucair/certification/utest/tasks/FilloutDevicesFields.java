package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.interactions.SelectFromList;
import co.com.choucair.certification.utest.model.UtestData;
import co.com.choucair.certification.utest.userinterface.DevicesFieldsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import static co.com.choucair.certification.utest.userinterface.DevicesFieldsPage.*;

public class FilloutDevicesFields implements Task {

    private UtestData utestData;

    public FilloutDevicesFields(UtestData utestData) {
        this.utestData = utestData;
    }

    public static FilloutDevicesFields withYourDeviceData(UtestData utestData) {
        return Tasks.instrumented(FilloutDevicesFields.class, utestData);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(OS_PC),
                Enter.theValue(utestData.getStrOSPC()).into(INPUT_OS_PC).thenHit(Keys.ENTER),
                Click.on(VERSION_PC),
                Enter.theValue(utestData.getStrVersionPC()).into(INPUT_VERSION_PC).thenHit(Keys.ENTER),
                Click.on(LANGUAGE_PC),
                Enter.theValue(utestData.getStrLanguagePC()).into(INPUT_LANGUAGE_PC).thenHit(Keys.ENTER),
                SelectFromList.using(BRAND_MOBILE_DEVICE, BRAND_ITEMS_XPATH, utestData.getStrMobileDeviceBrand()),
                SelectFromList.using(MODEL_MOBILE_DEVICE, MODEL_ITEMS_XPATH, utestData.getStrMobileDeviceModel()),
                SelectFromList.using(OS_MOBILE_DEVICE, OS_ITEMS_XPATH, utestData.getStrMobileDeviceOS()),
                Click.on(BUTTON_NEXT)
        );

    }
}

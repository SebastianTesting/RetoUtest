package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.userinterface.UtestHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class FindTheRegisterForm implements Task {

    public static FindTheRegisterForm forNewUsers() {
        return Tasks.instrumented(FindTheRegisterForm.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UtestHomePage.BUTTON_SIGN_UP));
    }
}

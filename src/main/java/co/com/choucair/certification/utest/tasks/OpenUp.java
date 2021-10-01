package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.userinterface.UtestHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {

    UtestHomePage utestHomePage;

    public static OpenUp theUtestPage() {
        return Tasks.instrumented(OpenUp.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(utestHomePage));
    }
}

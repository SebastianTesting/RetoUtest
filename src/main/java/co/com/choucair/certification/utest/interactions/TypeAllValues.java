package co.com.choucair.certification.utest.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.type.Type;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.Keys;

public class TypeAllValues implements Interaction {
    private String strValues;
    private Target target;

    public TypeAllValues(String strValues, Target target) {
        this.strValues = strValues;
        this.target = target;
    }

    public static TypeAllValues using(String strValues, Target target) {
        return new TypeAllValues(strValues, target);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        String[] arrValues = strValues.split(",");
        for (String value:arrValues) {
            actor.attemptsTo(Type.theValue(value).into(target).thenHit(Keys.ENTER));
        }

    }
}

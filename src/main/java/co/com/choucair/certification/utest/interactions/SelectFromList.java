package co.com.choucair.certification.utest.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;


public class SelectFromList implements Interaction {

    private Target list;
    private String itemsXpath;
    private String option;

    public SelectFromList(Target list, String itemsXpath, String option) {
        this.list = list;
        this.itemsXpath = itemsXpath;
        this.option = option;
    }

    public static SelectFromList using(Target list, String itemsXpath, String option) {
        return new SelectFromList(list, itemsXpath, option);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(list));
        List<WebElement> listObject = list.resolveFor(actor).findElements(By.xpath(itemsXpath));
        for (WebElement object:listObject) {
          if(object.getText().trim().equals(option)){
              object.click();
              break;
          }
        }

    }
}

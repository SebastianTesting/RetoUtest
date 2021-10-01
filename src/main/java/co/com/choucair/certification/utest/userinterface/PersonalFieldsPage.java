package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PersonalFieldsPage {
    public static final Target INPUT_FIRST_NAME = Target.the("where do we write the first name")
            .located(By.id("firstName"));
    public static final Target INPUT_LAST_NAME = Target.the("where do we write the last name")
            .located(By.id("lastName"));
    public static final Target INPUT_EMAIL = Target.the("where do we write the email")
            .located(By.id("email"));
    public static final Target SELECT_DAY = Target.the("where do we select the day")
            .located(By.id("birthDay"));
    public static final Target SELECT_MONTH = Target.the("where do we select the month")
            .located(By.id("birthMonth"));
    public static final Target SELECT_YEAR = Target.the("where do we select the year")
            .located(By.id("birthYear"));
    public static final Target INPUT_LANGUAGES = Target.the("where do we write the languages we can speak")
            .located(By.xpath("//div[@id='languages']//input")) ;
    public static final Target BUTTON_NEXT = Target.the("button to move on the next page")
            .located(By.xpath("//a[@aria-label= 'Next step - define your location']"));
}

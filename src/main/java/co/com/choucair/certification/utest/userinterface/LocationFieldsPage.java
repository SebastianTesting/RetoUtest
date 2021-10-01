package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LocationFieldsPage {

    public static final Target TEXT_CITY_AUTODETECTED = Target.the("text which confirm us that city was autodetected")
            .located(By.xpath("//span[@ng-show='autoDetectAddress.city']"));
    public static final Target TEXT_ZIP_AUTODETECTED = Target.the("text which confirm us that zip code was autodetected")
            .located(By.xpath("//span[@ng-show='autoDetectAddress.zip']"));
    public static final Target TEXT_COUNTRY_AUTODETECTED = Target.the("text which confirm us that country was autodetected")
            .located(By.xpath("//span[@ng-show='autoDetectAddress.country']"));
    public static final Target BUTTON_NEXT = Target.the("button to move on the next page")
            .located(By.xpath("//a[@aria-label= 'Next step - select your devices']"));
    public static final Target INPUT_CITY = Target.the("where do we write the city")
            .located(By.id("city"));
    public static final Target INPUT_ZIP= Target.the("where do we write the zip code")
            .located(By.id("zip"));
    public static final Target COUNTRY = Target.the("where do we turn on the INPUT_COUNTRY")
            .located(By.xpath("//div[@name='countryId']"));
    public static final Target INPUT_COUNTRY = Target.the("where do we write the country")
            .located(By.xpath("//div[@name='countryId']//input"));

}

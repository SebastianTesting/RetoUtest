package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class TermsAndConditionsPage {
    public static final Target INPUT_PASSWORD = Target.the("where do we write the password")
            .located(By.id("password"));
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("where do we write the password to confirm")
            .located(By.id("confirmPassword"));

    public static final Target CHECKBOX_TERMS_OF_USE = Target.the("Where do we accept terms of use and conduct code")
            .located(By.id("termOfUse"));
    public static final Target CHECKBOX_SECURITY_POLICY = Target.the("Where do we accept privacy and security policy")
            .located(By.id("privacySetting"));
    public static final Target BUTTON_COMPLETE_SETUP = Target.the("button to finalize sign up process")
            .located(By.xpath("//div[@class='pull-right next-step']//span"));
}

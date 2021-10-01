package co.com.choucair.certification.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DevicesFieldsPage {

    public static final Target OS_PC = Target.the("where do we turn on INPUT_OS_PC")
            .located(By.xpath("//div[@name='osId']"));
    public static final Target INPUT_OS_PC = Target.the("where do we write the OS for our PC")
            .located(By.xpath("//div[@name='osId']//input"));
    public static final Target VERSION_PC =  Target.the("where do we turn on INPUT_VERSION_PC")
            .located(By.xpath("//div[@name='osVersionId']"));
    public static final Target INPUT_VERSION_PC =  Target.the("where do we write the version for our PC")
            .located(By.xpath("//div[@name='osVersionId']//input"));
    public static final Target LANGUAGE_PC =  Target.the("where do we turn on INPUT_LANGUAGE_PC")
            .located(By.xpath("//div[@name='osLanguageId']"));
    public static final Target INPUT_LANGUAGE_PC =  Target.the("where do we write the language for our PC")
            .located(By.xpath("//div[@name='osLanguageId']//input"));


    public static final Target BRAND_MOBILE_DEVICE = Target.the("where do we open brand's list")
            .located(By.xpath("//div[@name='handsetMakerId']"));
    public static final String BRAND_ITEMS_XPATH = "//div[@ng-bind-html='device.name | highlight: $select.search']";
    public static final Target MODEL_MOBILE_DEVICE = Target.the("where do we open model's list")
            .located(By.xpath("//div[@name='handsetModelId']"));
    public static final String MODEL_ITEMS_XPATH = "//div[@ng-bind-html='model.name | highlight: $select.search']";
    public static final Target OS_MOBILE_DEVICE = Target.the("where do we open OS's list")
            .located(By.xpath("//div[@name='handsetOSId']"));
    public static final String OS_ITEMS_XPATH = "//div[@ng-bind-html='osVersion.name | highlight: $select.search']";


    public static final Target BUTTON_NEXT = Target.the("button to move on the next page")
            .located(By.xpath("//a[@aria-label='Next - final step']"));
}

package co.com.choucair.certification.utest.questions;

import co.com.choucair.certification.utest.userinterface.TermsAndConditionsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.choucair.certification.utest.userinterface.TermsAndConditionsPage.*;

public class Answer implements Question<Boolean> {
    private String strMessage;

    public Answer(String strMessage) {

        this.strMessage = strMessage;
    }

    public static Answer toThe(String strMessage) {
        return new Answer(strMessage);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String question = Text.of(BUTTON_COMPLETE_SETUP).viewedBy(actor).asString();
        if (question.equals(strMessage)){
            return true;
        }
        return false;
    }
}

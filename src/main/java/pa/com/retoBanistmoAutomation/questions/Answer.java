package pa.com.retoBanistmoAutomation.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import pa.com.retoBanistmoAutomation.model.retoBanistmoData;

import java.util.List;

import static pa.com.retoBanistmoAutomation.userinterface.Verification.VERIFICATION_PERCENTAGE;

public class Answer implements Question<Boolean> {

    List<retoBanistmoData> retobanistmodata;

    public Answer(List<retoBanistmoData> retobanistmodata) {
        this.retobanistmodata = retobanistmodata;
    }

    public static Answer toThe(List<retoBanistmoData> retobanistmodata) {
        return new Answer(retobanistmodata);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
       boolean result;

       String message= Text.of(VERIFICATION_PERCENTAGE).viewedBy(actor).asString();
       if (retobanistmodata.get(0).getStrPorcentage().equals(message)){
           result = true;
       }else{
           result = false;
       }
        return result;
    }
}


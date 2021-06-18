package pa.com.retoBanistmoAutomation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import pa.com.retoBanistmoAutomation.model.retoBanistmoData;

import java.util.List;

import static pa.com.retoBanistmoAutomation.userinterface.ConversorTasasPage.*;


public class Fill implements Task {

    List<retoBanistmoData> retobanistmodata;

    public Fill(List<retoBanistmoData> retobanistmodata){
        this.retobanistmodata = retobanistmodata;
    }

    public static Fill theFields(List<retoBanistmoData> retobanistmodata) {
        return Tasks.instrumented(Fill.class, retobanistmodata);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(retobanistmodata.get(0).strTasaInteres).into(FIELD_INTERES),
                SelectFromOptions.byVisibleText(retobanistmodata.get(0).getStrPeriodicidad()).from(LIST_PERIODICIDAD),
                SelectFromOptions.byVisibleText(retobanistmodata.get(0).getStrCapitalizacion()).from(LIST_CAPITALIZACION)
                );
    }
}

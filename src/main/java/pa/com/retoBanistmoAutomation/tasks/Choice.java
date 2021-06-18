package pa.com.retoBanistmoAutomation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import static pa.com.retoBanistmoAutomation.userinterface.ConversorTasasPage.TASA_NOMINAL_A_EFECTIVA_BUTTON;

public class Choice implements Task {
    public static Choice theOption() {
        return Tasks.instrumented(Choice.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(TASA_NOMINAL_A_EFECTIVA_BUTTON));
    }
}

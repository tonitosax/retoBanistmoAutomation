package pa.com.retoBanistmoAutomation.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import static pa.com.retoBanistmoAutomation.userinterface.NegociosPage.ENLACE_NEGOCIOS;
import static pa.com.retoBanistmoAutomation.userinterface.NegociosPage.ENLACE_HERAMIENTAS;
import static pa.com.retoBanistmoAutomation.userinterface.NegociosPage.CONVERSOR_TASAS_INTERES;
public class Select implements Task {




    public static Select theSection () {
        return Tasks.instrumented(Select.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ENLACE_NEGOCIOS),
                Click.on(ENLACE_HERAMIENTAS),
                Click.on(CONVERSOR_TASAS_INTERES)
        );
    }
}

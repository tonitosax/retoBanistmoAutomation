package pa.com.retoBanistmoAutomation.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ConversorTasasPage {
    public static final Target TASA_NOMINAL_A_EFECTIVA_BUTTON= Target.the("When do you click tasa nominal a tasa efectiva link")
            .located(By.id("btntoolUno"));

    public static final Target FIELD_INTERES= Target.the("When do you fill the tasa de inters")
            .located(By.id("interes"));

    public static final Target LIST_PERIODICIDAD= Target.the("When do you select the periodicidad deseada")
            .located(By.id("periodicidad-deseada"));

    public static final Target LIST_CAPITALIZACION= Target.the("When do you you select the capitalizacion")
            .located(By.id("capitalizacion"));

}
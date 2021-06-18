package pa.com.retoBanistmoAutomation.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class NegociosPage {
    public static final Target ENLACE_NEGOCIOS= Target.the("When do you click negocios link")
            .located(By.id("header-pymes"));

    public static final Target ENLACE_HERAMIENTAS= Target.the("When do you click Herramientas link")
            .located(By.xpath("//a[contains(text(),'Herramientas')]"));

    public static final Target CONVERSOR_TASAS_INTERES= Target.the("When do you click conversor de tasas link")
            .located(By.xpath("//h3[contains(text(),'Conversor de tasas de interés')]"));


}

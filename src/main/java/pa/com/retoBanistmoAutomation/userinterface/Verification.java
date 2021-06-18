package pa.com.retoBanistmoAutomation.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Verification {
    public static final Target VERIFICATION_PERCENTAGE= Target.the("When do youverify the percentage")
            .located(By.xpath("//h3[contains(text(),'10.25 %')]"));
}

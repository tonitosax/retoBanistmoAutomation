package pa.com.retoBanistmoAutomation.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnlineCast;
import pa.com.retoBanistmoAutomation.model.retoBanistmoData;
import pa.com.retoBanistmoAutomation.questions.Answer;
import pa.com.retoBanistmoAutomation.tasks.Choice;
import pa.com.retoBanistmoAutomation.tasks.Fill;
import pa.com.retoBanistmoAutomation.tasks.OpenUp;
import pa.com.retoBanistmoAutomation.tasks.Select;

import java.util.List;

import static net.serenitybdd.screenplay.actors.OnStage.*;

public class retoBanistmoAutomationStepDefinitions {

    @Before
    public void setStage(){
        setTheStage(new OnlineCast());
    }

    @Given("^than Brandon wants to go toBanistmo page$")
    public void thanBrandonWantsToGoToBanistmoPage() throws Exception {
        theActorCalled("Brandon").wasAbleTo(OpenUp.thePage());
    }


    @When("^He select Negocios, Herramientas And option Conversor de tasas de interes$")
    public void heSelectNegociosHerramientasAndOptionConversorDeTasasDeInteres() throws Exception {
        theActorInTheSpotlight().attemptsTo(Select.theSection());
    }

    @When("^click in button Calcular of De tasa nominal a tasa efectiva optios$")
    public void clickInButtonCalcularOfDeTasaNominalATasaEfectivaOptios() throws Exception {
        theActorInTheSpotlight().attemptsTo(Choice.theOption());
    }

    @When("^fill the fields tasa de interes, periodicidad and ingresar capitalizacion$")
    public void fillTheFieldsTasaDeInteresPeriodicidadAndIngresarCapitalizacion(List<retoBanistmoData> retobanistmodata) throws Exception {
        theActorInTheSpotlight().attemptsTo(Fill.theFields(retobanistmodata));
    }

    @Then("^He can view the tasa nominal efectiva porcentage$")
    public void heCanViewTheTasaNominalEfectivaPorcentage(List<retoBanistmoData> retobanistmodata) throws Exception {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(retobanistmodata)));

    }

}

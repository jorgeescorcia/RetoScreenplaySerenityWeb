package stepsdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static task.landingpage.LlenarCamposRegister.llenarCamposRegister;
import static task.landingpage.NavegateToRegister.navegateToRegister;
import static task.landingpage.OpenLandingPage.openLandingPage;

public class CreateAccountSteps extends Setup{

    private static final String ACTOR_NAME = "Student";

    @Given("que el usuario hace click en el boton sing in")
    public void queElUsuarioHaceClickEnElBotonSingIn() {
        actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().wasAbleTo(
                openLandingPage(),
                navegateToRegister()

        );



    }

    @When("el usuario ingresa toda la informacion y hace clic en el boton de registro")
    public void elUsuarioIngresaTodaLaInformacionYHaceClicEnElBotonDeRegistro() {
        theActorInTheSpotlight().wasAbleTo(
                llenarCamposRegister()
                        .EmailAddress("")
                        .FirstName("")
                        .LastName("")
                        .Password("")
                        .Address("")
                        .City("")
                        .State("")
                        .PostalCode("")
                        .Country("")
                        .MobilePhone("")
                        .Alias("")

        );

    }

    @Then("El usuario debe ver la pagina de bienvenida")
    public void elUsuarioDebeVerLaPaginaDeBienvenida() {
        theActorInTheSpotlight().should(
                
        );

    }
}

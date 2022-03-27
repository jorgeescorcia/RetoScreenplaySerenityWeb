package stepsdefinition;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import task.landingpage.RegisterFailed;
import util.register.ResumenRegister;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import static org.hamcrest.core.IsEqual.equalTo;
import static task.landingpage.LlenarCamposRegister.llenarCamposRegister;
import static task.landingpage.NavegateToRegister.navegateToRegister;
import static task.landingpage.OpenLandingPage.openLandingPage;

public class CreateAccountSteps extends Setup{
    Faker faker = new Faker();

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
                        .EmailAddress(faker.internet().emailAddress())
                        .FirstName(faker.name().firstName())
                        .LastName(faker.name().lastName())
                        .Password(faker.phoneNumber().cellPhone())
                        .Address(faker.address().fullAddress())
                        .City(faker.country().name())
                        .State("Arizona")
                        .PostalCode("12458")
                        .MobilePhone(faker.phoneNumber().cellPhone())
                        .Alias(faker.name().firstName())

        );

    }

    @Then("El usuario debe ver la pagina de bienvenida")
    public void elUsuarioDebeVerLaPaginaDeBienvenida() {
        theActorInTheSpotlight().should(
                seeThat( "el mensaje de bienvenida al portal es ", ResumenRegister.Message() , equalTo("My account"))
        );

    }

    @Given("que el usuario va a registrarse")
    public void que_el_usuario_va_a_registrarse() {
        actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().wasAbleTo(
                openLandingPage(),
                navegateToRegister()

        );

    }

    @When("el usuario no ingresa el password")
    public void el_usuario_no_ingresa_el_password() {
        theActorInTheSpotlight().wasAbleTo(
                new RegisterFailed()
                        .EmailAddress(faker.internet().emailAddress())
                        .FirstName(faker.name().firstName())
                        .LastName(faker.name().lastName())
                        .Address(faker.address().fullAddress())
                        .City(faker.country().name())
                        .State("Arizona")
                        .PostalCode("12458")
                        .MobilePhone(faker.phoneNumber().cellPhone())
                        .Alias(faker.name().firstName())

        );

    }

    @Then("El usuario no podra registrarse")
    public void el_usuario_no_podra_registrarse() {
        theActorInTheSpotlight().should(
                seeThat( "el mensaje de erro en password es ", ResumenRegister.MessagePassword() , equalTo("passwd"))
        );

    }

}

package stepsdefinition;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import util.register.ResumenRegister;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;
import static task.landingpage.login.LlenarCamposLogin.llenarCamposLogin;
import static task.landingpage.login.NavegateToLogin.navegateToLogin;
import static task.landingpage.OpenLandingPage.openLandingPage;


public class LoginSteps extends Setup {
    Faker faker = new Faker();
    private static final String ACTOR_NAME = "Student";

    @Given("que el usuario se encuentra en la pagina de inicio de sesion")
    public void que_el_usuario_se_encuentra_en_la_pagina_de_inicio_de_sesion() {
        actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().wasAbleTo(
                openLandingPage(),
                navegateToLogin()

        );

    }

    @When("el usuario ingresa un nombre de usuario y una contrasena validos")
    public void el_usuario_ingresa_un_nombre_de_usuario_y_una_contrasena_validos() {
        theActorInTheSpotlight().wasAbleTo(
                llenarCamposLogin()
                        .EmailAddressLogin("jorgeescorcia@gmail.com")
                        .PasswordLogin("123456789")


        );

    }

    @Then("el usuario debe tener acceso a la pagina de inicio")
    public void el_usuario_debe_tener_acceso_a_la_pagina_de_inicio() {
        theActorInTheSpotlight().should(
                seeThat( "el mensaje de inicio al portal es ", ResumenRegister.Message() , equalTo("My account"))
        );

    }
    @Given("que el usuario quiere iniciar sesion")
    public void que_el_usuario_quiere_iniciar_sesion() {
        actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().wasAbleTo(
                openLandingPage(),
                navegateToLogin()

        );
    }

    @When("el usuario ingresa un password incorrecto")
    public void el_usuario_ingresa_un_password_incorrecto() {
        theActorInTheSpotlight().wasAbleTo(
        llenarCamposLogin()
                .EmailAddressLogin("jorgeescorcia@gmail.com")
                .PasswordLogin(faker.phoneNumber().cellPhone())
        );
    }

    @Then("el usuario espera ver un mensaje de autenticacion fallida")
    public void el_usuario_espera_ver_un_mensaje_de_autenticacion_fallida() {
        theActorInTheSpotlight().should(
                seeThat( "el mensaje de error es ", ResumenRegister.MessageLoginFailed() , equalTo("Authentication failed."))
        );

    }

}

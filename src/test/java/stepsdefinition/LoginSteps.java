package stepsdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static task.landingpage.NavegateToLogin.navegateToLogin;
import static task.landingpage.OpenLandingPage.openLandingPage;

public class LoginSteps extends Setup {

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

    }

    @Then("el usuario debe tener acceso a la pagina de inicio")
    public void el_usuario_debe_tener_acceso_a_la_pagina_de_inicio() {

    }
}

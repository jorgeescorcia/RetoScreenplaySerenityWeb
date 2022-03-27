package stepsdefinition;

import com.github.javafaker.Faker;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import task.landingpage.contactUs.ContactUsFailed;
import task.landingpage.contactUs.LlenarCamposContactUs;
import util.register.ResumenRegister;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.core.IsEqual.equalTo;
import static task.landingpage.OpenLandingPage.openLandingPage;
import static task.landingpage.contactUs.NavegateToContactUs.navegateToContactUs;


public class ContactUsSteps extends Setup{
    Faker faker = new Faker();
    private static final String ACTOR_NAME = "Student";

    @Given("que el usuario esta en la pagina de customer services")
    public void que_el_usuario_esta_en_la_pagina_de_customer_services() {
        actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().wasAbleTo(
                openLandingPage(),
                navegateToContactUs()

        );


    }

    @When("el usuario llena los campos satisfactorimente")
    public void el_usuario_llena_los_campos_satisfactorimente() {
        theActorInTheSpotlight().wasAbleTo(
                new LlenarCamposContactUs()
                        .SubjectHeading("")
                        .EmailContact(faker.internet().emailAddress())
                        .OrderReference(faker.phoneNumber().cellPhone())
                        .Message(faker.lorem().characters())
        );

    }

    @Then("El usuario deberia ver un mensaje de confirmacion del envio del mensaje")
    public void el_usuario_deberia_ver_un_mensaje_de_confirmacion_del_envio_del_mensaje() {
        theActorInTheSpotlight().should(
                seeThat( "el mensaje de exitoso de envio es ", ResumenRegister.MessageContactUs() , equalTo("Your message has been successfully sent to our team."))
        );

    }
    @Given("que quiero enviar un mensaje desde la pagina customer services")
    public void que_quiero_enviar_un_mensaje_desde_la_pagina_customer_services() {
        actorSetupTheBrowser(ACTOR_NAME);
        theActorInTheSpotlight().wasAbleTo(
                openLandingPage(),
                navegateToContactUs()

        );

    }

    @When("el usuario no ingresa el email")
    public void el_usuario_no_ingresa_la_order_de_referencia() {
        theActorInTheSpotlight().wasAbleTo(
                new ContactUsFailed()
                        .SubjectHeading("")
                        .OrderReference(faker.phoneNumber().cellPhone())
                        .Message(faker.lorem().characters())
        );

    }

    @Then("El usuario debera ver un mensaje de error de envio")
    public void el_usuario_debera_ver_un_mensaje_de_error_de_envio() {
        theActorInTheSpotlight().should(
                seeThat( "el mensaje de error de envio de contact us es ", ResumenRegister.MessageContactFailed() , equalTo("Invalid email address."))
        );

    }
}

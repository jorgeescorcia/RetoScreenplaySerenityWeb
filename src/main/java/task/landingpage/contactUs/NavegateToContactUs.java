package task.landingpage.contactUs;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import task.landingpage.register.NavegateToRegister;

import static userinterface.contact.ContactUs.CONTACT_US;
import static userinterface.createAccount.CreateAccount.SING_IN;

public class NavegateToContactUs implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(CONTACT_US)
        );
    }
    public static NavegateToContactUs navegateToContactUs(){
        return new NavegateToContactUs();
    }
}

package task.landingpage.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static userinterface.createAccount.CreateAccount.SING_IN;

public class NavegateToLogin implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(SING_IN)
        );

    }

    public static NavegateToLogin navegateToLogin(){
        return new NavegateToLogin();
    }
}

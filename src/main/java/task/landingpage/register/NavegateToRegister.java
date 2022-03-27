package task.landingpage.register;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


import static userinterface.createAccount.CreateAccount.SING_IN;

public class NavegateToRegister implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(SING_IN)
        );

    }
    public static NavegateToRegister navegateToRegister(){
        return new NavegateToRegister();
    }
}

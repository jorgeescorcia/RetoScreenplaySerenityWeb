package task.landingpage.login;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import task.landingpage.register.LlenarCamposRegister;

import static userinterface.login.Login.*;


public class LlenarCamposLogin implements Task {


    private String EmailAddressLogin;
    private String PasswordLogin;

    public LlenarCamposLogin EmailAddressLogin(String emailAddressLogin) {
        EmailAddressLogin = emailAddressLogin;
        return this;
    }

    public LlenarCamposLogin PasswordLogin(String passwordLogin) {
        PasswordLogin = passwordLogin;
        return this;
    }



    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(EMAIL_ADDRESS),
                Enter.theValue(EmailAddressLogin).into(EMAIL_ADDRESS),

                Scroll.to(PASSWORDLOGIN),
                Enter.theValue(PasswordLogin).into(PASSWORDLOGIN),

                Click.on(BTNLOGIN)
        );




    }
    public static LlenarCamposLogin llenarCamposLogin(){
        return new LlenarCamposLogin();
    }
}

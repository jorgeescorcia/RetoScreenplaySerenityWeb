package question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import util.register.Mensaje;

public class MensajeRegistro implements Question {

    public static Question <String> valueMessage(){
        return new MensajeRegistro();
    }

    @Override
    public String answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(Mensaje.Message).getText();
    }

}

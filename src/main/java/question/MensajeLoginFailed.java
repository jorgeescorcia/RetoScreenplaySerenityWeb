package question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import util.register.Mensaje;

public class MensajeLoginFailed implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(Mensaje.MessageLoginFailed).getText();
    }
}

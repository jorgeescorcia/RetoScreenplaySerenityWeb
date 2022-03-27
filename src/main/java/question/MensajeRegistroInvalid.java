package question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import util.register.MensajeBienvenida;

public class MensajeRegistroInvalid implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return BrowseTheWeb.as(actor).find(MensajeBienvenida.MessagePasswordInvalid).getText();
    }
}

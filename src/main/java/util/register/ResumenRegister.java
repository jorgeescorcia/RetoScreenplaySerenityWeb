package util.register;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;
import util.register.MensajeBienvenida;

public class ResumenRegister {
    public static Question<String> Message(){
        return actor -> TextContent.of(MensajeBienvenida.Message).viewedBy(actor).asString().trim();
    }
    public static Question<String> MessagePassword(){
        return actor -> TextContent.of(MensajeBienvenida.MessagePasswordInvalid).viewedBy(actor).asString().trim();
    }
    public static Question<String> MessageLoginFailed(){
        return actor -> TextContent.of(MensajeBienvenida.MessageLoginFailed).viewedBy(actor).asString().trim();
    }
}

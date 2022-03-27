package util.register;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class ResumenRegister {
    public static Question<String> Message(){
        return actor -> TextContent.of(Mensaje.Message).viewedBy(actor).asString().trim();
    }
    public static Question<String> MessagePassword(){
        return actor -> TextContent.of(Mensaje.MessagePasswordInvalid).viewedBy(actor).asString().trim();
    }
    public static Question<String> MessageLoginFailed(){
        return actor -> TextContent.of(Mensaje.MessageLoginFailed).viewedBy(actor).asString().trim();
    }
    public static Question<String> MessageContactUs(){
        return actor -> TextContent.of(Mensaje.MessageContact).viewedBy(actor).asString().trim();
    }
    public static Question<String> MessageContactFailed(){
        return actor -> TextContent.of(Mensaje.MessageContactFailed).viewedBy(actor).asString().trim();
    }
}

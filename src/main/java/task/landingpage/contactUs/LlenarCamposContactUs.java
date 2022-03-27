package task.landingpage.contactUs;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static userinterface.contact.ContactUs.*;
import static userinterface.createAccount.CreateAccount.EMAIL_ADDRESS;
import static userinterface.createAccount.CreateAccount.STATE;

public class LlenarCamposContactUs implements Task {

    private String SubjectHeading;
    private String EmailContact;
    private String OrderReference;
    private String Message;

    public LlenarCamposContactUs SubjectHeading(String subjectHeading) {
        SubjectHeading = subjectHeading;
        return this;
    }

    public LlenarCamposContactUs EmailContact(String emailContact) {
        EmailContact = emailContact;
        return this;
    }

    public LlenarCamposContactUs OrderReference(String orderReference) {
        OrderReference = orderReference;
        return this;
    }

    public LlenarCamposContactUs Message(String message) {
        Message = message;
        return this;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(SUBJECT_HEADING),
                Click.on(SUBJECT_HEADING),
                SelectFromOptions.byVisibleText("Webmaster").from(SUBJECT_HEADING),

                Scroll.to(EMAIL_CONTACT),
                Enter.theValue(EmailContact).into(EMAIL_CONTACT),

                Scroll.to(ORDER_REFERENCE),
                Enter.theValue(OrderReference).into(ORDER_REFERENCE),

                Scroll.to(MESSAGE),
                Enter.theValue(Message).into(MESSAGE),

                Click.on(BTN_SEND)
        );

    }
}

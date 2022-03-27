package task.landingpage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static userinterface.createAccount.CreateAccount.*;

public class RegisterFailed implements Task {

    private String EmailAddress;
    private String FirstName;
    private String LastName;

    private String Address;
    private String City;
    private String State;
    private String PostalCode;

    private String MobilePhone;
    private String Alias;


    public RegisterFailed EmailAddress(String emailAddress) {
        EmailAddress = emailAddress;
        return this;
    }

    public RegisterFailed FirstName(String firstName) {
        FirstName = firstName;
        return this;
    }

    public RegisterFailed LastName(String lastName) {
        LastName = lastName;
        return this;
    }




    public RegisterFailed Address(String address) {
        Address = address;
        return this;
    }

    public RegisterFailed City(String city) {
        City = city;
        return this;
    }

    public RegisterFailed State(String state) {
        State = state;
        return this;
    }

    public RegisterFailed PostalCode(String postalCode) {
        PostalCode = postalCode;
        return this;
    }



    public RegisterFailed MobilePhone(String mobilePhone) {
        MobilePhone = mobilePhone;
        return this;
    }
    public RegisterFailed Alias(String alias) {
        Alias = alias;
        return this;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Scroll.to(EMAIL_ADDRESS),
                Enter.theValue(EmailAddress).into(EMAIL_ADDRESS),

                Click.on(BTN_CREATE_ACCOUNT),

                Scroll.to(FIRST_NAME),
                Enter.theValue(FirstName).into(FIRST_NAME),

                Scroll.to(LAST_NAME),
                Enter.theValue(LastName).into(LAST_NAME),



                Scroll.to(ADDRESS),
                Enter.theValue(Address).into(ADDRESS),

                Scroll.to(CITY),
                Enter.theValue(City).into(CITY),

                Scroll.to(STATE),
                Click.on(STATE),
                SelectFromOptions.byVisibleText("Alabama").from(STATE),

                Scroll.to(POSTAL_CODE),
                Enter.theValue(PostalCode).into(POSTAL_CODE),

                Scroll.to(COUNTRY),
                SelectFromOptions.byVisibleText("United States").from(COUNTRY),

                Scroll.to(MOBILEPHONE),
                Enter.theValue(MobilePhone).into(MOBILEPHONE),

                Scroll.to(ALIAS),
                Enter.theValue(Alias).into(ALIAS),
                Click.on(BOTON_REGISTER)

        );

    }
}

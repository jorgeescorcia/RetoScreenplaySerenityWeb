package task.landingpage.register;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;

import static userinterface.createAccount.CreateAccount.*;

public class LlenarCamposRegister implements Task {

    private String EmailAddress;
    private String FirstName;
    private String LastName;
    private String Password;
    private String Address;
    private String City;
    private String State;
    private String PostalCode;

    private String MobilePhone;
    private String Alias;


    public LlenarCamposRegister EmailAddress(String emailAddress) {
        EmailAddress = emailAddress;
        return this;
    }

    public LlenarCamposRegister FirstName(String firstName) {
        FirstName = firstName;
        return this;
    }

    public LlenarCamposRegister LastName(String lastName) {
        LastName = lastName;
        return this;
    }


    public LlenarCamposRegister Password(String password) {
        Password = password;
        return this;
    }

    public LlenarCamposRegister Address(String address) {
        Address = address;
        return this;
    }

    public LlenarCamposRegister City(String city) {
        City = city;
        return this;
    }

    public LlenarCamposRegister State(String state) {
        State = state;
        return this;
    }

    public LlenarCamposRegister PostalCode(String postalCode) {
        PostalCode = postalCode;
        return this;
    }



    public LlenarCamposRegister MobilePhone(String mobilePhone) {
        MobilePhone = mobilePhone;
        return this;
    }
    public LlenarCamposRegister Alias(String alias) {
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

                Scroll.to(PASSWORD),
                Enter.theValue(Password).into(PASSWORD),

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

    public static LlenarCamposRegister llenarCamposRegister(){
        return new LlenarCamposRegister();
    }
}

package task.landingpage;

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
    private String Country;
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

    public LlenarCamposRegister Country(String country) {
        Country = country;
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
                Enter.theValue("jorge@gamil.com").into(EMAIL_ADDRESS),
                Click.on(BTN_CREATE_ACCOUNT),
                Enter.theValue("Jorge Andres").into(FIRST_NAME),
                Enter.theValue("Escorcia").into(LAST_NAME),
                Enter.theValue("12345").into(PASSWORD),
                Enter.theValue("Calle 50").into(ADDRESS),
                Enter.theValue("Planeta Rica").into(CITY),
                Click.on(STATE),
                SelectFromOptions.byVisibleText("Alabama").from(STATE),
                Enter.theValue("23385").into(POSTAL_CODE),
                Click.on(COUNTRY),
                SelectFromOptions.byVisibleText("United States").from(COUNTRY),
                Enter.theValue("325585478").into(MOBILEPHONE),
                Enter.theValue("Jorgeeee").into(ALIAS),
                Click.on(BOTON_REGISTER)

        );

    }

    public static LlenarCamposRegister llenarCamposRegister(){
        return new LlenarCamposRegister();
    }
}

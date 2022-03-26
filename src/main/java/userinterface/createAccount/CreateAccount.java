package userinterface.createAccount;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class CreateAccount extends PageObject {
    public static final Target SING_IN = Target
            .the("SingIn")
            .located(By.xpath("//a[contains(text(),'Sign in')]"));

    public static final Target EMAIL_ADDRESS = Target
            .the("EmailAddress")
            .located(By.xpath("//input[@id='email_create']"));

    public static final Target BTN_CREATE_ACCOUNT = Target
            .the("BTNCreateAccount")
            .located(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]/span[1]"));


    public static final Target FIRST_NAME = Target
            .the("FirstName")
            .located(By.xpath("//input[@id='customer_firstname']"));

    public static final Target LAST_NAME = Target
            .the("LastName")
            .located(By.xpath("//input[@id='customer_lastname']"));

    public static final Target PASSWORD = Target
            .the("Password")
            .located(By.xpath("//input[@id='passwd']"));

    public static final Target COMPANY = Target
            .the("Company")
            .located(By.xpath("//input[@id='company']"));

    public static final Target ADDRESS = Target
            .the("Address")
            .located(By.xpath("//input[@id='address1']"));

    public static final Target CITY = Target
            .the("City")
            .located(By.xpath("//input[@id='city']"));

    public static final Target STATE = Target
            .the("State")
            .located(By.xpath("//select[@id='id_state']"));

    public static final Target POSTAL_CODE = Target
            .the("PostalCode")
            .located(By.xpath("//input[@id='postcode']"));

    public static final Target COUNTRY = Target
            .the("Country")
            .located(By.xpath("//select[@id='id_country']"));

    public static final Target MOBILEPHONE = Target
            .the("MobilePhone")
            .located(By.xpath("//input[@id='phone_mobile']"));

    public static final Target ALIAS = Target
            .the("Alias")
            .located(By.xpath("//input[@id='alias']"));

    public static final Target BOTON_REGISTER = Target
            .the("BotonRegister")
            .located(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/form[1]/div[4]/button[1]/span[1]"));






}

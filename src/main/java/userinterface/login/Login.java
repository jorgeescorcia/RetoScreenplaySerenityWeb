package userinterface.login;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class Login extends PageObject {
    public static final Target SING_IN = Target
            .the("SingIn")
            .located(By.xpath("//a[contains(text(),'Sign in')]"));

    public static final Target EMAIL_ADDRESS = Target
            .the("EmailLoginIn")
            .located(By.xpath("//input[@id='email']"));

    public static final Target PASSWORD = Target
            .the("SingIn")
            .located(By.xpath("//input[@id='passwd']"));



}

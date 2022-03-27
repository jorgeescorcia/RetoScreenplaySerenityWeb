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

    public static final Target PASSWORDLOGIN = Target
            .the("SingIn")
            .located(By.xpath("//input[@id='passwd']"));

    public static final Target BTNLOGIN = Target
            .the("BotonLogin")
            .located(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[2]/form[1]/div[1]/p[2]/button[1]/span[1]"));



}

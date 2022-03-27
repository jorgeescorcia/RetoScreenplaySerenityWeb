package util.register;

import org.openqa.selenium.By;

public class MensajeBienvenida {
    public static By Message = By.xpath("//h1[contains(text(),'My account')]");
    public static By MessagePasswordInvalid = By.xpath("//b[contains(text(),'passwd')]");
}
//
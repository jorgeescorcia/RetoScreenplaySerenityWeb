package util.register;

import org.openqa.selenium.By;

public class Mensaje {
    public static By Message = By.xpath("//h1[contains(text(),'My account')]");
    public static By MessagePasswordInvalid = By.xpath("//b[contains(text(),'passwd')]");
    public static By MessageLoginFailed = By.xpath("//li[contains(text(),'Authentication failed.')]");
    public static By MessageContact = By.xpath("//p[contains(text(),'Your message has been successfully sent to our tea')]");
    public static By MessageContactFailed = By.xpath("//li[contains(text(),'Invalid email address.')]");

}
//

//////p[contains(text(),'Your message has been successfully sent to our tea')]
package userinterface.contact;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class ContactUs extends PageObject {
    public static final Target CONTACT_US = Target
            .the("ContactUs")
            .located(By.xpath("//header/div[2]/div[1]/div[1]/nav[1]/div[2]/a[1]"));

    public static final Target SUBJECT_HEADING = Target
            .the("Subject")
            .located(By.xpath("//select[@id='id_contact']"));

    public static final Target EMAIL_CONTACT = Target
            .the("EmailContact")
            .located(By.xpath("//input[@id='email']"));

    public static final Target ORDER_REFERENCE = Target
            .the("OrderReference")
            .located(By.xpath("//input[@id='id_order']"));

    public static final Target MESSAGE = Target
            .the("Message")
            .located(By.xpath("//textarea[@id='message']"));

    public static final Target BTN_SEND = Target
            .the("Send")
            .located(By.xpath("//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/form[1]/fieldset[1]/div[2]/button[1]/span[1]"));
}

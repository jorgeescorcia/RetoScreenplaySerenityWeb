package task.landingpage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.landingpage.LandingPage;

public class OpenLandingPage implements Task {

    private LandingPage landingpage;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                Open.browserOn(landingpage)
        );

    }

    public static OpenLandingPage openLandingPage(){
        return new OpenLandingPage();
    }
}

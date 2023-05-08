package interactions.front;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterface.SelectFormType.BTN_FORMS;
import static userinterface.SelectFormType.BTN_PRACTICE_FORM;


public class SelectFromPrincipalMenu implements Interaction {

    public static SelectFromPrincipalMenu FormMenu(String formType) {
        return instrumented(SelectFromPrincipalMenu.class,formType);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(BTN_FORMS),
                Click.on(BTN_PRACTICE_FORM));

    }
}

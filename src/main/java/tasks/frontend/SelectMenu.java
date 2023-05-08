package tasks.frontend;

import interactions.front.SelectFromPrincipalMenu;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectMenu implements Task {

    private static String formType;
    public static SelectMenu theFormType(String formType) {
        return instrumented(SelectMenu.class,formType);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(SelectFromPrincipalMenu.FormMenu(formType));
    }
}

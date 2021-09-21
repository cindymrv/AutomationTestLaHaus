package tasks.frontend;

import static userinterface.EntraLaHaus.BTN_ACEPTAR_COOKIES;
import static userinterface.EntraLaHaus.DPB_MENU_ENTRA_LAHAUS;
import static userinterface.EntraLaHaus.DPB_MENU_ENTRA_RECURSOS;
import static userinterface.EntraLaHaus.LBL_INGRESAR;
import static userinterface.EntraLaHaus.MODAL_ENTRA_A_LA_HAUS;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;


@AllArgsConstructor
public class AbrirEntraLaHaus implements Task {


  public static AbrirEntraLaHaus ingresar() {
    return Tasks.instrumented(AbrirEntraLaHaus.class);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(MoveMouse.to(DPB_MENU_ENTRA_RECURSOS));
    BTN_ACEPTAR_COOKIES.resolveFor(actor).waitUntilPresent().isCurrentlyVisible();
    actor.attemptsTo(Click.on(BTN_ACEPTAR_COOKIES));
    actor.attemptsTo(MoveMouse.to(DPB_MENU_ENTRA_LAHAUS));
    actor.attemptsTo(Click.on(LBL_INGRESAR));
    MODAL_ENTRA_A_LA_HAUS.resolveFor(actor).waitUntilPresent().isCurrentlyVisible();
  }
}

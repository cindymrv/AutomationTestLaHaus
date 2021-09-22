package questions.frontend;

import static userinterface.EntraLaHaus.DPB_MENU_ENTRA_LAHAUS;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

@AllArgsConstructor
public class MiPerfil implements Question<Boolean> {

  private final String menuMiPerfil;

  public static MiPerfil enPantallaPrincipal(String menuMiPerfil) {
    return new MiPerfil(menuMiPerfil);
  }

  @Override
  public Boolean answeredBy(Actor actor) {
    return DPB_MENU_ENTRA_LAHAUS.resolveFor(actor).getText().contains(menuMiPerfil);
  }
}

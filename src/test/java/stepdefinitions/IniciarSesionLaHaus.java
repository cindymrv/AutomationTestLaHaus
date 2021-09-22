package stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static utils.RecursoFront.URL_LA_HAUS_COLOMBIA;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import java.util.Map;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.frontend.AbrirEntraLaHaus;
import tasks.frontend.IniciarSesionCuentaGoogle;

public class IniciarSesionLaHaus {

  @Dado("que el {string} se encuentra en la página web de La Haus de Colombia")
  public void abrirPaginaWeb(String nombreActor) {
    setTheStage(new OnlineCast());
    theActorCalled(nombreActor).wasAbleTo(Open.url(URL_LA_HAUS_COLOMBIA.getRecursoFront()));
  }

  @Cuando("ingrese a la opción Ingresar en Entra a la Haus")
  public void ingresarEntraLaHaus() {
    theActorInTheSpotlight().attemptsTo(AbrirEntraLaHaus.ingresar());
  }

  @Cuando("inice sesión con la Cuenta de Google")
  public void iniciarSesionCuentaGoogle(Map<String, String> mapInformacionUsuario) {
    theActorInTheSpotlight()
        .attemptsTo(IniciarSesionCuentaGoogle.conCuentaGooge(mapInformacionUsuario));
  }

  @Entonces("el sistema deberá direccionarlo a la página de La Haus, donde el usuario deberá poder ver en el menú la opción {string}")
  public void el_sistema_deberá_direccionarlo_a_la_página_de_la_haus_donde_el_usuario_deberá_poder_ver_en_el_menú_la_opción(
      String string) {
    // Write code here that turns the phrase above into concrete actions
    throw new io.cucumber.java.PendingException();
  }

}

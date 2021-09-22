package stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static utils.RecursoFront.MENU_MI_PERFIL;
import static utils.RecursoFront.URL_LA_HAUS_COLOMBIA;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import java.util.Map;
import static java.lang.Boolean.TRUE;
import static org.hamcrest.core.IsEqual.equalTo;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.frontend.MiPerfil;
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

  @Entonces("el sistema deberá direccionarlo a la página de La Haus, donde el usuario deberá poder ver en el menú la opción Mi perfil")
  public void verificarInicoSesionUsuario() {
    theActorInTheSpotlight().should(GivenWhenThen.seeThat(MiPerfil.enPantallaPrincipal(
        MENU_MI_PERFIL.getRecursoFront()),equalTo(TRUE)));
  }

}

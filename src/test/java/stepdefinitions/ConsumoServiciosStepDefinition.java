package stepdefinitions;

import static net.serenitybdd.screenplay.actors.OnStage.setTheStage;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import java.util.Map;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;
import org.hamcrest.Matchers;
import questions.ComprobarStatusCode;
import tasks.ActualizarUsuario;
import tasks.ConsultarEmpleados;

public class ConsumoServiciosStepDefinition {

  @Dado("que {string} realiza el consumo de la url base {string}")
  public void configurarInicioAutomatizacion(String nombreActor, String urlBase) {
    setTheStage(new OnlineCast());
    theActorCalled(nombreActor).whoCan(CallAnApi.at(urlBase));
  }

  @Cuando("consulte un usuario no registrado en la API")
  public void consultarUsuariosNoRegistradosAPI() {
    theActorInTheSpotlight().attemptsTo(ConsultarEmpleados.deLaApiSegunRecurso("/users/23"));
  }

  @Cuando("actualice un usuario en la API con características")
  public void actualizarUsuarioAPI(Map<String, String> mapCaracteristicasUsuario) {
    theActorInTheSpotlight()
        .attemptsTo(ActualizarUsuario.conCaracteristicas(mapCaracteristicasUsuario));
  }

  @Entonces("el servicio me debe indicar un status code {int}")
  @Entonces("observo una lista de empleados es obtenida correctamente/incorrectamente con un status code {int}")
  public void observo_una_lista_de_empleados(int statusCodeEsperado) {
    theActorInTheSpotlight().should(GivenWhenThen.seeThat(
        ComprobarStatusCode.delResponseServicio(statusCodeEsperado),
        Matchers.equalTo(Boolean.TRUE)));
  }

}

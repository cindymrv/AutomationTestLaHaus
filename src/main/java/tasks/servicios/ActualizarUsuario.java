package tasks.servicios;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.rest.questions.ResponseConsequence.seeThatResponse;

import java.util.Map;
import lombok.AllArgsConstructor;
import models.builders.RequestActualizarUsuarioBuilder;
import models.response.ResponseActualizarUsuario;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Put;

@AllArgsConstructor
public class ActualizarUsuario implements Task {

  private final Map<String, String> mapCaracteristicasUsuario;

  public static Performable conCaracteristicas(Map<String, String> mapCaracteristicasUsuario) {
    return instrumented(ActualizarUsuario.class, mapCaracteristicasUsuario);
  }


  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Put.to("/users/2").with(requestSpecification ->
        requestSpecification
            .body(RequestActualizarUsuarioBuilder.conCaracteristicas(mapCaracteristicasUsuario))));
    actor.should(
        seeThatResponse(response -> response.log().all()));
    SerenityRest.lastResponse().as(ResponseActualizarUsuario.class);
  }
}

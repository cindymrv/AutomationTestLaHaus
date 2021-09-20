package tasks;

import lombok.AllArgsConstructor;
import models.response.ResponseListaEmpleados;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

@AllArgsConstructor
public class ConsultarEmpleados implements Task {

  private final String recurso;

  public static ConsultarEmpleados deLaApiSegunRecurso(String recurso) {
    return Tasks.instrumented(ConsultarEmpleados.class, recurso);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    SerenityRest.rest().log().all().get(CallAnApi.as(actor).resolve(recurso))
        .then().log().all();
    SerenityRest.lastResponse().as(ResponseListaEmpleados.class);
  }
}


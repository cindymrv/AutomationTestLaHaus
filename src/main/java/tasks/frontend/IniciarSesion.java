package tasks.frontend;

import java.util.Map;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

@AllArgsConstructor
public class IniciarSesion implements Task {

  private final Map<String, String> mapInformacionUsuario;

  public static IniciarSesion conCuentaGooge(Map<String, String> mapInformacionUsuario) {
    return Tasks.instrumented(IniciarSesion.class, mapInformacionUsuario);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo();
  }
}

package tasks.frontend;

import static userinterface.IniciarSesionElegirCuenta.BTN_CUENTA_GOOGLE;

import interactions.front.DiligenciarInformacionCuentaGoogle;
import java.util.Map;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

@AllArgsConstructor
public class IniciarSesionCuentaGoogle implements Task {

  private final Map<String, String> mapInformacionUsuario;

  public static IniciarSesionCuentaGoogle conCuentaGooge(Map<String, String> mapInformacionUsuario) {
    return Tasks.instrumented(IniciarSesionCuentaGoogle.class, mapInformacionUsuario);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Click.on(BTN_CUENTA_GOOGLE));
    actor.attemptsTo(DiligenciarInformacionCuentaGoogle.conCredenciales(mapInformacionUsuario));
  }
}

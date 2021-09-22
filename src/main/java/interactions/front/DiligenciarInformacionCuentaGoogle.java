package interactions.front;

import static userinterface.IniciarSesionCuentaGoogle.BTN_NEXT_CONTRASENA;
import static userinterface.IniciarSesionCuentaGoogle.BTN_NEXT_CORREO;
import static userinterface.IniciarSesionCuentaGoogle.TXT_CONTRASENA;
import static userinterface.IniciarSesionCuentaGoogle.TXT_CORREO_GMAIL;

import java.util.Map;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

@AllArgsConstructor
public class DiligenciarInformacionCuentaGoogle implements Interaction {

  private final Map<String, String> mapInformacionUsuario;

  public static DiligenciarInformacionCuentaGoogle conCredenciales(
      Map<String, String> mapInformacionUsuario) {
    return Tasks.instrumented(DiligenciarInformacionCuentaGoogle.class, mapInformacionUsuario);
  }

  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(
        Enter.theValue(mapInformacionUsuario.get("Cuenta de Google")).into(TXT_CORREO_GMAIL));
    actor.attemptsTo(Click.on(BTN_NEXT_CORREO));
    actor.attemptsTo(Enter.theValue(mapInformacionUsuario.get("Contraseña")).into(TXT_CONTRASENA));
    actor.attemptsTo(Click.on(BTN_NEXT_CONTRASENA));
  }
}

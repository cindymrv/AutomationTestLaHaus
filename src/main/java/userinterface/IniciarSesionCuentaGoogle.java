package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IniciarSesionCuentaGoogle {

  public static final Target TXT_CORREO_GMAIL = Target.the("Caja de texto para ingresar el correo de gmail ").located(By.id("identifierId"));
  public static final Target BTN_NEXT_CORREO = Target.the("Botón siguiente en correo ").located(By.id("identifierNext"));
  public static final Target TXT_CONTRASENA = Target.the("Caja de texto para ingresar la contraseña ").located(By.name("password"));
  public static final Target BTN_NEXT_CONTRASENA = Target.the("Botón siguiente en contraseña ").located(By.id("passwordNext"));

}

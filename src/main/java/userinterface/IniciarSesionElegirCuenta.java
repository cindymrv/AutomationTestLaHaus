package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IniciarSesionElegirCuenta {

  public static final Target BTN_CUENTA_GOOGLE = Target.the("Botón para elegir la cuenta de google ").located(By.xpath("//div[@class=\"go-to-gmail-login-button ml-lh-24\"]/a"));


}

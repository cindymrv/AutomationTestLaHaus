package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EntraLaHaus {

  public static final Target DPB_MENU_ENTRA_LAHAUS = Target.the("Label menú Entra a la Haus ").located(By.xpath("//li[@id=\"dropdown-4\"]"));
  public static final Target DPB_MENU_ENTRA_RECURSOS = Target.the("Label menú Recursos ").located(By.xpath("//li[@id=\"dropdown-2\"]"));
  public static final Target LBL_INGRESAR = Target.the("Label menú Ingresar ").located(By.xpath("//a[@id=\"home-sign-up-btn__desktop\"]"));
  public static final Target BTN_ACEPTAR_COOKIES = Target.the("Botón aceptar cookies ").located(By.xpath("//button[contains(text(),'Aceptar')]"));

}

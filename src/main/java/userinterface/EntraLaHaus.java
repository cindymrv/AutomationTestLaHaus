package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class EntraLaHaus {

  public static final Target DPB_MENU_ENTRA_LAHAUS = Target.the("Label menú Entra a la Haus ").located(By.id("dropdown-4"));
  public static final Target DPB_MENU_ENTRA_RECURSOS = Target.the("Label menú Recursos ").located(By.id("dropdown-2"));
  public static final Target LBL_INGRESAR = Target.the("Label menú Ingresar ").located(By.xpath("//a[@id=\"home-sign-up-btn__desktop\"]"));
  public static final Target BTN_ACEPTAR_COOKIES = Target.the("Botón aceptar cookies ").located(By.xpath("//button[contains(text(),'Aceptar')]"));
  public static final Target MODAL_ENTRA_A_LA_HAUS= Target.the("Modal entra a la Haus ").located(By.id("home-sign-up-modal"));

}

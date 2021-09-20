package questions;

import lombok.AllArgsConstructor;
import net.serenitybdd.rest.SerenityRest;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

@AllArgsConstructor
public class ComprobarStatusCode implements Question<Boolean> {

  private final int statusCode;

  public static ComprobarStatusCode delResponseServicio(int statusCode) {
    return new ComprobarStatusCode(statusCode);
  }

  @Override
  public Boolean answeredBy(Actor actor) {
    return SerenityRest.lastResponse().getStatusCode() == statusCode;
  }
}

package utils;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum RecursoFront {

  URL_LA_HAUS_COLOMBIA("https://sobreplanos-staging.herokuapp.com/?locale=co&country_selected=true");

  private final String recursoFront;
}

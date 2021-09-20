package models.builders;

import java.util.Map;
import models.request.RequestCrearUsuario;

public class RequestActualizarUsuarioBuilder {

  private RequestActualizarUsuarioBuilder() { super(); }

  public static RequestCrearUsuario conCaracteristicas(
      Map<String, String> mapCaracteristicasUsuario){
    return RequestCrearUsuario.builder()
        .name(mapCaracteristicasUsuario.get("Nombre"))
        .job(mapCaracteristicasUsuario.get("Trabajo"))
        .build();
  }

}

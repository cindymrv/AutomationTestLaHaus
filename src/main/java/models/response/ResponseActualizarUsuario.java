package models.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "job",
    "updatedAt"
})
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseActualizarUsuario implements Serializable
{

  @JsonProperty("name")
  public String name;
  @JsonProperty("job")
  public String job;
  @JsonProperty("updatedAt")
  public String updatedAt;
  private final static long serialVersionUID = 3641578637710884741L;

}
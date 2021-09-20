package models.creacionusuarios;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "name",
        "job"
})

@Data
@AllArgsConstructor
@Builder
public class RequestCrearUsuario {

    @JsonProperty("name")
    public String name;
    @JsonProperty("job")
    public String job;
    private final static long serialVersionUID = 6551030489768543544L;


}

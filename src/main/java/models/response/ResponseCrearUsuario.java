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
        "id",
        "createdAt"
})

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseCrearUsuario implements Serializable
{

    @JsonProperty("name")
    public String name;
    @JsonProperty("job")
    public String job;
    @JsonProperty("id")
    public String id;
    @JsonProperty("createdAt")
    public String createdAt;
    private final static long serialVersionUID = 3535212383231657931L;

}
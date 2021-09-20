
package models.creacionusuarios;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "url",
    "text"
})

public class Support implements Serializable
{
    @JsonProperty("url")
    public String url;
    @JsonProperty("text")
    public String text;

    private final static long serialVersionUID = 2709566143696207042L;

}


package models.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.io.Serializable;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "page",
    "per_page",
    "total",
    "total_pages",
    "data",
    "support"
})
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ResponseListaEmpleados implements Serializable {

  @JsonProperty("page")
  private Integer page;
  @JsonProperty("per_page")
  private Integer perPage;
  @JsonProperty("total")
  private Integer total;
  @JsonProperty("total_pages")
  private Integer totalPages;
  @JsonProperty("data")
  private List<Datum> data = null;
  @JsonProperty("support")
  private Support support;
  private final static long serialVersionUID = -9112121849417225541L;

}

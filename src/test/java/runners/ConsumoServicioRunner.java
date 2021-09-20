package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src/test/resources/features/consumos_servicios_reqres.feature",
    glue = "stepdefinitions"
)
public class ConsumoServicioRunner {

}

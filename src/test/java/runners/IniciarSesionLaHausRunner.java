package runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features = "src/test/resources/features/iniciar_sesion_la_hause.feature",
    glue = "stepdefinitions"
)
public class IniciarSesionLaHausRunner {

}

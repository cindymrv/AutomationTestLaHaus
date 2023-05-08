package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import tasks.frontend.SelectMenu;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static utils.RecursoFront.URL_BASE;

public class FormDefinition {

    @Given("that the {string} is located in pointing to the base url")
    public void openBaseURL(String actor) {
        theActorCalled(actor).wasAbleTo(Open.url(URL_BASE.getRecursoFront()));
    }

    @When("the user enters the menu Form to fill the {string}")
    public void entersMenuForm(String formType) {
        theActorInTheSpotlight().attemptsTo(SelectMenu.theFormType(formType));
    }
    @When("the {string} fills the form correctly with")
    public void the_fills_the_form_correctly_with(String string, io.cucumber.datatable.DataTable dataTable) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        throw new io.cucumber.java.PendingException();
    }
    @Then("the {string} can see the thanks message")
    public void the_can_see_the_thanks_message(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}

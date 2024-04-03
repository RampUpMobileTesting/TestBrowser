package stepdefinitions;


import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import iteractions.NavigateTo;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.SearchQuestion;
import tasks.SearchGoogle;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static org.hamcrest.Matchers.equalTo;

public class GoogleSearchStepDefinition {

  @Before
  public void setTheStage() {
    OnStage.setTheStage(new OnlineCast());
  }

  @Given("the user open the URL {string}")
  public void theUserOpenTheURL(String url) {
    theActorCalled("User").attemptsTo(new NavigateTo(url));
  }
  @When("the user search {string} in google")
  public void theUserSearchInGoogle(String search) {
    theActorInTheSpotlight().attemptsTo(new SearchGoogle(search));
  }
  @Then("the user should see {string} in the result")
  public void theUserShouldSeeInTheResult(String search) {
      theActorInTheSpotlight().should(
          seeThat("The search", SearchQuestion.value(), equalTo(search))
      );
  }
}

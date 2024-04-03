package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import ui.GoogleHome;
import ui.ResultPage;

public class SearchGoogle implements Task {
  private final String things;

  public SearchGoogle(String things){ this.things=things;}
  @Override
  public <T extends Actor> void performAs(T actor) {
      actor.attemptsTo(
          Enter.theValue(things).into(GoogleHome.searchTextArea),
          Click.on(GoogleHome.searchButton),
          Click.on(ResultPage.popupButton)
      );
  }
}

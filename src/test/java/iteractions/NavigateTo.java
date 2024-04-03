package iteractions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Open;

public class NavigateTo implements Interaction {

  private String url;

  public NavigateTo(String url){
    this.url=url;
  }
  @Override
  public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Open.url(url));
  }
}

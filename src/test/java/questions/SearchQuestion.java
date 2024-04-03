package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import ui.ResultPage;

public class SearchQuestion implements Question {
  @Override
  public Object answeredBy(Actor actor) {
    return ResultPage.searchTextArea.resolveFor(actor).getText();
  }

  public static SearchQuestion value(){
    return new SearchQuestion();
  }
}

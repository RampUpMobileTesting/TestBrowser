package ui;

import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;


public class ResultPage {
  public static Target popupButton = Target
      .the("button now not geolocation button")
      .located(By.xpath("//div[contains(text(),'Ahora no')]"));

  public static Target searchTextArea = Target
      .the("Google search field")
      .located(By.xpath("//textarea[@class='gLFyf']"));
}

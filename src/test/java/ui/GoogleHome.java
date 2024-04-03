package ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class GoogleHome {

  public static Target searchTextArea = Target
      .the("Google search field")
      .located(By.xpath("//textarea[@class='gLFyf']"));

  public static Target searchButton = Target
      .the("Search Button")
      .located(By.xpath("//input[@class='gNO89b' and @value='Buscar con Google']"));
}

package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SelectFormType {

    public static final Target BTN_FORMS = Target.the("Button to choose the forms option").located(By.xpath("//h5[.='Forms']"));
    public static final Target BTN_PRACTICE_FORM = Target.the("Practice From option").located(By.xpath("//span[.='Practice Form']"));

}

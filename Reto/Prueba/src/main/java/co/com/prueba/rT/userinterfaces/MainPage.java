package co.com.prueba.rT.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class MainPage {
    public static final Target BTN_SIGNUP = Target.the("Text").located(By.xpath("//a[contains(text(),'Sign up')]"));
}

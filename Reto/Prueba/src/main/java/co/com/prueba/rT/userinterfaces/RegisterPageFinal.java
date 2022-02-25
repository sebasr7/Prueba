package co.com.prueba.rT.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class RegisterPageFinal {
    public static final Target PASS = Target.the("Box").located(By.id("password"));
    public static final Target CONFIRMPASS = Target.the("Box").located(By.id("confirmPassword"));
    public static final Target TERMS = Target.the("Box").located(By.id("termOfUse"));
    public static final Target PRIVACY = Target.the("Box").located(By.id("privacySetting"));
    public static final Target BTNNEXT4 = Target.the("Box").located(By.id("laddaBtn"));
}

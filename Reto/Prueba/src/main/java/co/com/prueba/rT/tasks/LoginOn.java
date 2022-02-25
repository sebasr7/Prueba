package co.com.prueba.rT.tasks;

import co.com.prueba.rT.model.RegisterUser;
import co.com.prueba.rT.userinterfaces.*;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class LoginOn implements Task {

    private RegisterUser data;

    public LoginOn(RegisterUser data) {
        this.data = data;
    }

    public static LoginOn ThePageWith(RegisterUser data) {
        return Tasks.instrumented(LoginOn.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(MainPage.BTN_SIGNUP, isVisible()).forNoMoreThan(20).seconds(),
                Click.on(MainPage.BTN_SIGNUP),
                WaitUntil.the(RegisterPage1.BTNNEXT, isVisible()).forNoMoreThan(20).seconds(),
                Enter.theValue(data.getNombre().trim()).into(RegisterPage1.FIRSTNAME),
                Enter.theValue(data.getApellido().trim()).into(RegisterPage1.LASTNAME),
                Enter.theValue(data.getEmail().trim()).into(RegisterPage1.EMAIL),
                Click.on(RegisterPage1.MONTH),
                Enter.theValue(data.getMes().trim()).into(RegisterPage1.LISTMONTH),
                Hit.the(Keys.ENTER).into(RegisterPage1.LISTMONTH),
                Click.on(RegisterPage1.DAY),
                Enter.theValue(data.getDia().trim()).into(RegisterPage1.LISTDAY),
                Hit.the(Keys.ENTER).into(RegisterPage1.LISTDAY),
                Click.on(RegisterPage1.YEAR),
                Enter.theValue(data.getAno().trim()).into(RegisterPage1.LISTYEAR),
                Hit.the(Keys.ENTER).into(RegisterPage1.LISTYEAR),
                Click.on(RegisterPage1.GENDER),
                Enter.theValue(data.getGenero().trim()).into(RegisterPage1.LISTGENDER),
                Hit.the(Keys.ENTER).into(RegisterPage1.LISTGENDER),
                Click.on(RegisterPage1.BTNNEXT),
                WaitUntil.the(RegisterPage2.BTNNEXT2, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(RegisterPage2.BTNNEXT2),
                WaitUntil.the(RegisterPage3.BTNNEXT3, isVisible()).forNoMoreThan(10).seconds(),
                Click.on(RegisterPage3.BTNNEXT3),
                WaitUntil.the(RegisterPageFinal.PASS, isVisible()).forNoMoreThan(10).seconds(),
                Enter.theValue(data.getPass().trim()).into(RegisterPageFinal.PASS),
                Enter.theValue(data.getPass().trim()).into(RegisterPageFinal.CONFIRMPASS),
                Click.on(RegisterPageFinal.TERMS),
                Click.on(RegisterPageFinal.PRIVACY),
                Click.on(RegisterPageFinal.BTNNEXT4)
        );
    }
}

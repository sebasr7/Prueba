package co.com.prueba.rT.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import static co.com.prueba.rT.userinterfaces.RegisterEXIT.REGISTEREXIT;

public class LaRespuesta implements Question<Boolean> {

    String word;

    public LaRespuesta(String word) {
        this.word = word;
    }

    public static LaRespuesta es(String pregunta) {
        return new LaRespuesta(pregunta);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String text = Text.of(REGISTEREXIT).viewedBy(actor).asString();
        return word.equals(text);
    }
}

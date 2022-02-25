package co.com.prueba.rT.stepdefinition;

import co.com.prueba.rT.model.RegisterUser;
import co.com.prueba.rT.question.LaRespuesta;
import co.com.prueba.rT.tasks.Abrir;
import co.com.prueba.rT.tasks.LoginOn;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static co.com.prueba.rT.utilities.Constants.ZERO;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class stepdefinitions {

    @Before
    public void configuracionInicial() {
        setTheStage(new OnlineCast());
    }

    @Dado("^Ingresar a la pagina principal$")
    public void ingresar_a_la_pagina_principal() {
        theActorCalled("Kevin").wasAbleTo(Abrir.LaPagina());
    }


    @Cuando("^Registrarse en la pagina$")
    public void registrarse_en_la_pagina(List<RegisterUser> data) {
        theActorInTheSpotlight().attemptsTo(LoginOn.ThePageWith(data.get(ZERO)));
    }

    @Entonces("^Validar que se haya completado el registro (.*)$")
    public void validar_que_se_haya_completado_el_registro(String pregunta) {
        theActorInTheSpotlight().should(seeThat(LaRespuesta.es(pregunta)));
    }
}

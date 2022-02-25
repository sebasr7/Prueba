package co.com.prueba.rT.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/feature/practice.feature",
        glue = "co.com.prueba.rT.stepdefinition",
        snippets = SnippetType.CAMELCASE)

public class run {
}

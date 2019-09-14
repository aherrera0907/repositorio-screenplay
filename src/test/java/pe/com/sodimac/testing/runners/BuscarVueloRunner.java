package pe.com.sodimac.testing.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/java/pe/com/sodimac/testing/features/PedirVuelo.feature",
glue="pe.com.sodimac.testing.stepsdefinitions",
snippets = SnippetType.CAMELCASE)

public class BuscarVueloRunner {

}
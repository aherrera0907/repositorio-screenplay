package pe.com.sodimac.testing.stepsdefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import pe.com.sodimac.testing.models.Vuelos;
import pe.com.sodimac.testing.task.BuscarVuelo;
import pe.com.sodimac.testing.task.EntrarALaPaginaDeSodimac;
import pe.com.sodimac.testing.task.EntrarALaPaginaDeVuelosFalabella;
import pe.com.sodimac.testing.ui.ElementosDePagina;
import pe.com.sodimac.testing.ui.ElementosDePaginaVuelo;

public class ComprarVueloStepdefinitions {
	
	ElementosDePaginaVuelo paginainicio;
	
	@Managed(driver = "chrome")
	WebDriver SuNavegador;
	
	Actor Anderson = Actor.named("Anderson");
	@Before 
	public void setUp() {
		Anderson.can(BrowseTheWeb.with(SuNavegador));
		
	  }
	

	@Given("^Anderson ingreso a la pagina vuelosfalabella")
	public void AndersonIngresoALaPaginaVuelosFalabella() throws Exception {
		Anderson.attemptsTo(EntrarALaPaginaDeVuelosFalabella.En(paginainicio));
	}
	
	
	@When("^El selecciona el vuelo y lo agrega al carrito")
	public void ElseleccionaElVueloYLoAgregaAlCarrito(List<Vuelos> vuelo) throws Exception {
	Anderson.attemptsTo(BuscarVuelo.Con(vuelo));
		
	}
	
}

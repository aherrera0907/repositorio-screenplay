package pe.com.sodimac.testing.stepsdefinitions;

import org.openqa.selenium.WebDriver;



import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import pe.com.sodimac.testing.task.EntrarALaPaginaDeSodimac;
import pe.com.sodimac.testing.ui.ElementosDePagina;

public class ComprarProductoStepdefinitions {
	
	ElementosDePagina paginadeinicio;

	@Managed(driver = "chrome")
	WebDriver SuNavegador;
	
	Actor Anderson = Actor.named("Anderson");
	
	@Before
	public void setUp() {
		Anderson.can(BrowseTheWeb.with(SuNavegador));
	}
	
	
	@Given("^Anderon ingreso a la pagina Sodimac$")
	public void anderonIngresoALaPaginaSodimac() throws Exception {
	   
		Anderson.attemptsTo(EntrarALaPaginaDeSodimac.En(paginadeinicio)); 
	}


	//@When("^el selecciona el celular y lo agrega al carrito$")
	//public void elSeleccionaElCelularYLoAgregaAlCarrito(DataTable arg1) throws Exception {
	 
	    	//}

	@Then("^el valida que el producto del carrito sea un telefono celular$")
	public void elValidaQueElProductoDelCarritoSeaUnTelefonoCelular() throws Exception {
	  
	}

}

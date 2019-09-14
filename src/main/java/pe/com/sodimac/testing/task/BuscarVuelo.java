package pe.com.sodimac.testing.task;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import java.util.List;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import pe.com.sodimac.testing.models.Vuelos;

public class BuscarVuelo implements Task {

	PageObject pagina;
	
	public BuscarVuelo(PageObject pagina) {
		this.pagina = pagina;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		
		
		actor.attemptsTo(Open.browserOn(pagina));
	}

	public static BuscarVuelo Con(List<Vuelos> vuelo) {
		// TODO Auto-generated method stub
		return instrumented(BuscarVuelo.class, vuelo);
	}
	
}

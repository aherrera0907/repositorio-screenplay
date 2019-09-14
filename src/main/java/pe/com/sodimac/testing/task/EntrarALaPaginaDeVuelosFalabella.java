package pe.com.sodimac.testing.task;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class EntrarALaPaginaDeVuelosFalabella implements Task {

	PageObject pagina;
	
	public EntrarALaPaginaDeVuelosFalabella(PageObject pagina) {
		this.pagina = pagina;
	}
	
	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Open.browserOn(pagina));
	}

	public static EntrarALaPaginaDeVuelosFalabella En(PageObject paginadeinicio) {
		// TODO Auto-generated method stub
		return instrumented(EntrarALaPaginaDeVuelosFalabella.class, paginadeinicio);
	}
	
}

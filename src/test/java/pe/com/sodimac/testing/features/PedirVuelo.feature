#Author: your.email@your.domain.com
Feature: Solicitud Vuelo
  Yo como usuario voy a ingrear a la pagina viajesfalabella y realizare una compra de un vuelo

  
  Scenario Outline: Comprar vuelo en pagina vuelosfalabella
    Given Anderson ingreso a la pagina vuelosfalabella
    When  El selecciona el vuelo y lo agrega al carrito
    |<ciudadorigen>| <ciudaddestino>|<fechaida>|<fecharegreso>|<adultos>|<ninos>|<infantes>|
    Then  el valida que el vuelo del carrito sea el vuelo seleccionado
    |<mensaje>|
    
    Examples:
    
       |ciudadorigen|ciudaddestino|fechaida|fecharegreso|adultos|ninos|infantes|mensaje|
       |medellin    |	madrid	    |16/09/19|	17/09/19	|1	    |1    |	1      |exitoso|
       
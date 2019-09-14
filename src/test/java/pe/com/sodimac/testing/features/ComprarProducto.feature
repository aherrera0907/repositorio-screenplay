#Author: your.email@your.domain.com
Feature: Compra de dispositivo mobile
  Yo como usuario voy a ingrear a la pagina Sodimac y realizarè una compra de un celular

  
  Scenario Outline: Comprar telefono celular en Tienda Sodimac
    Given Anderon ingreso a la pagina Sodimac
    When  el selecciona el celular y lo agrega al carrito
     | <Samung value >| <status>     | 
    Then  el valida que el producto del carrito sea un telefono celular


    Examples: 
      | Samung value | status     |        
      | A30          | Articulo 1 |
      | S5           | Articulo 2 |  
      

Feature: funcionalidad creacion de cuenta en http://automationpractice.com/

  Scenario: registro para una nueva cuenta
    Given que el usuario hace click en el boton sing in
    When el usuario ingresa toda la informacion y hace clic en el boton de registro
    Then El usuario debe ver la pagina de bienvenida
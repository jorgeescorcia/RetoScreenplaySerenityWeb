# new feature
# Tags: optional

Feature: funcionalidad Login en http://automationpractice.com/
    Yo como usuario
    Quiero poder loguearme en la web
    Para  navegar dentro de ella


    Scenario: inicio de sesion exitoso
        Given que el usuario se encuentra en la pagina de inicio de sesion
        When el usuario ingresa un nombre de usuario y una contrasena validos
        Then el usuario debe tener acceso a la pagina de inicio
# new feature
# Tags: optional

Feature: verificar funcionalidad servicio al cliente

  Scenario: Envio exitoso del mensaje
    Given que el usuario esta en la pagina de customer services
    When el usuario llena los campos satisfactorimente
    Then El usuario deberia ver un mensaje de confirmacion del envio del mensaje

  Scenario: Envio erroneo del mensaje
    Given que quiero enviar un mensaje desde la pagina customer services
    When el usuario no ingresa el email
    Then El usuario debera ver un mensaje de error de envio
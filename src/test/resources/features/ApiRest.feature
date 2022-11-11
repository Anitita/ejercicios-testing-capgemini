Feature: Appirest

 Scenario:
    Given Configurar el cliente web
    When  Lanzar peticion que devuelva un String
    Then  Comprobar que devuelve un codigo 200

  Scenario:
    Given Cliente web
    When  Lanzar peticion que devuelva un String
    Then  Comprobar la respuesta

  Scenario:
    Given Cliente
    When  Lanzar peticion que devuelva un String
    Then  Comprobamos los parametros
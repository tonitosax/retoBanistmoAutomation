@stories
Feature:
  As user, I want calculate the tasa nominal efectiva in Banistmo page

  @scenario
  Scenario: Go to Banistmo page and calculate "tasa nominal efectiva"
    Given than Brandon wants to go toBanistmo page
    When He select Negocios, Herramientas And option Conversor de tasas de interes
    And click in button Calcular of De tasa nominal a tasa efectiva optios
    And fill the fields tasa de interes, periodicidad and ingresar capitalizacion
    |strTasaInteres| strPeriodicidad| strCapitalizacion|
    |10            |Anual           |Semestral         |
    Then He can view the tasa nominal efectiva porcentage
      |strPorcentage |
      |10.25 %       |
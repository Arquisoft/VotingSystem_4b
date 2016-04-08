# language: es
Característica: página de aterrizaje 
  Escenario: Ir a la página de aterrizaje
    Cuando el cliente invoca /
    Entonces el cliente recibe el código de estado 200
    Y el cliente recibe una cadena que contiene "Voting"
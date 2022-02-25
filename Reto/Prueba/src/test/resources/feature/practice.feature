#language:es

Característica: Registrarme en la pagina

  Esquema del escenario: Kevin como usuario de la pagina quiere registrarse
    Dado Ingresar a la pagina principal
    Cuando Registrarse en la pagina
      | nombre   | apellido   | mes   | dia   | ano   | genero   | ciudad   | postal   | country   | computadora   | version   | lenguaje   | pass   | email   |
      | <nombre> | <apellido> | <mes> | <dia> | <ano> | <genero> | <ciudad> | <postal> | <country> | <computadora> | <version> | <lenguaje> | <pass> | <email> |
    Entonces Validar que se haya completado el registro We are excited that you have found your way to the uTest Community!
    Ejemplos:
      | nombre | apellido | mes      | dia | ano  | genero | ciudad   | postal | country  | computadora | version      | lenguaje | pass          | email              |
      | TestO  | testK    | March    | 9   | 1993 | Male   | Medellin | 050024 | Colombia | macOS       | OS X 10.11.5 | Spanish  | Kevin314634ñl | test1123@gmail.com |
      | TestL  | testM    | November | 20  | 2010 | Female | Medellin | 050024 | Colombia | macOS       | OS X 10.11.5 | Spanish  | Kevin314634ñl | test1123@gmail.com |
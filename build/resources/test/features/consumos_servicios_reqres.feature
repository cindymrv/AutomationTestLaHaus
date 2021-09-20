#language: es

Característica: Pruebas de consumos de API de reqres in
  Yo como Automatizador
  Quiero realizar los consumos de la API reqres.in
  Para obtener los resultados esperados en cada tipo de Consumo.

  Antecedentes: Definir Precondiciones Propias para todos los escenarios
    Dado que 'Cindy' realiza el consumo de la url base 'https://reqres.in/api'

  Escenario: Obtener respuesta de un usuario no registrado en la API
    Cuando consulte un usuario no registrado en la API
    Entonces observo una lista de empleados es obtenida correctamente con un status code 404
    Y el servicio me debe indicar un status code 404

  Escenario: Actualizar lista de empleados en la API
    Cuando actualice un usuario en la API con características
      | Nombre  | Oscar         |
      | Trabajo | Líder Técnico |
    Entonces observo una lista de empleados es obtenida correctamente con un status code 200
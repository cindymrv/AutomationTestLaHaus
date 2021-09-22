#language: es

Característica: Pruebas de inicio de sesión en La Haus
  Yo como usuario
  Quiero iniciar sesión en La Haus
  Para poder realizar búsquedas de propiedades, guardarlas y agendar visitas.

  Escenario: Iniciar sesión en la aplicación La Haus por medio de la cuenta de Google
    Dado que el 'usuario' se encuentra en la página web de La Haus de Colombia
    Cuando ingrese a la opción Ingresar en Entra a la Haus
    E inice sesión con la Cuenta de Google
      | Cuenta de Google | cuentapruebaspruebas5@gmail.com |
      | Contraseña       | pruebas17*                      |
#    Entonces el sistema deberá direccionarlo a la página de La Haus, donde el usuario deberá poder ver en el menú la opción "Mi perfil"
## Contrato 1: crearRuta ()

| Nombre | crearRuta() |
| :---- | :---- |
| **Responsabilidades** | Crea una instancia de ruta para un lote. |
| **Tipo** | Coordinador de ruta |
| **Referencias** | Gestionar ruta |
| **Notas** | La ruta creada es para el lote seleccionado previamente |
| **Excepciones** | \- Si no se ha seleccionado una ruta previamente, indicar error. \- Si el lote ya tiene una ruta creada anteriormente, indicar error. |
| **Salida** | Objeto ruta recién creado, asociado al lote. |
| **Precondiciones** | \- El sistema conoce la información del lote seleccionado anteriormente. \- El sistema se encuentra operativo y con acceso a la base de datos. \- El lote no tiene una ruta asignada. |
| **Postcondiciones** | \- Se crea una instancia de ruta con un identificador único. \- La ruta nueva que da asociada al lote seleccionado. \- No hay recicladores asociados todavía. |


## Contrato 2: modificarRuta(nueva\_ruta: Ruta)

| Nombre | modificarRuta(nueva\_ruta: Ruta) |
| :---- | :---- |
| **Responsabilidades** |  \- Ingresa una planificación de ruta para sobrescribir la existente o para establecer la primera planificación de una nueva ruta.   \- Asegura la validez de la nueva ruta y su coherencia con las solicitudes del lote |
| **Tipo** | Sistema |
| **Referencias** | Gestionar ruta |
| **Notas** |  |
| **Excepciones** | \- Si la nueva ruta no está bien formada (ej: no recorre todos los puntos de recolección), arroja un error de validación.   \- Si la nueva ruta no es validada por el sistema de geolocalización, arroja un error de validación.   \- El coordinador está autenticado y tiene permisos para gestionar rutas. |
| **Salida** | Mensaje de confirmación |
| **Precondiciones** |  \- Sistema conoce la ruta que se desea actualizar y su estado actual.   \- Sistema conoce del lote al cual se le quiere crear/modificar la ruta asociada. |
| **Postcondiciones** |  \- Si se trata de una ruta recién creada, le asigna su planificación inicial.   \- Si se trata de una ruta que ya tiene una planificación existente, modifica su planificación.   \- La nueva ruta y su planificación está asociada al lote correspondiente.   \- Si la ruta es válida, queda registrada. |


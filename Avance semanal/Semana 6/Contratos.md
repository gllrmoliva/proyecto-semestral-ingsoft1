## Contrato 1: Acceder Historial de solicitudes (ID\_Cliente)

### Responsabilidades

- Se devuelve una lista con solicitudes hechas por cliente

### Referencias

- Ver historial solicitudes

### Notas

- Utilizar acceso indexado de base de datos

### Excepciones

- Si  ID\_Cliente no existe devolver error  
- Si Cliente no posee solicitudes devolver vacío

### Salida

- Lista con solicitudes (puede estar vacío)

### Precondiciones

### Postcondiciones

## Contrato 2: ingresarSolicitud(ubicación: string, tipo\_desecho1: string, cantidad\_desecho1: float, tipo\_desecho2: string, cantidad\_desecho2: float, ...)

### Responsabilidades

- Permitir a clientes ingresar solicitudes.  
- Verificar e informar si dichas solicitudes son válidas.

### Referencias

- Caso de Uso "Ingresar Solicitud".

### Notas

- Una solicitud es ingresada después de ser validada, no antes.

### Excepciones

- Error: ubicación ingresada no válida.  
- Error: no es posible obtener ubicación GPS.  
- Error: ubicación GPS no coincide con ubicación ingresada.

### Salida

- Verdadero o Falso: la solicitud es válida y fue ingresada exitosamente.

### Precondiciones

- Debe existir y estar disponible un sistema de geolocalización.  
- El usuario que hace la solicitud debe estar ingresado en el sistema.  
- Debe haber un registro de materiales y rangos que son válidos.

### Precondiciones

- Si la solicitud no es válida:  
  - No hay cambios en el estado del sistema.  
- Si la solicitud es válida:  
  - Se crea una nueva Solicitud.  
    *(creación de objeto)*  
  - La nueva Solicitud tiene como atributos los valores ingresados en 'ubicación', 'tipo\_desecho1', 'cantidad\_desecho1', …  
    *(modificación de atributos)*  
  - La nueva Solicitud tiene como estado "Pendiente".  
    *(modificación de atributos)*  
  - En la nueva Solicitud queda guardada la fecha y hora en que se ingresó.  
    *(modificación de atributos)*  
  - La nueva Solicitud se vincula con el Usuario que la ingresó.  
    *(creación de enlace)*
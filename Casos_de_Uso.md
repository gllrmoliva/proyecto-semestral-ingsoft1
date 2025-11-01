## **UC1: Crear lote de recolección**

### **Actor principal**

Coordinador de ruta.

### **Actores involucrados e intereses**

- **Coordinador de ruta**: Desea agrupar solicitudes que estén geográficamente cercanas para optimizar el proceso de recolección.  
- **Sistema de geolocalización**: Debe validar las ubicaciones de las solicitudes y permitir su correcto agrupamiento.

### **Precondiciones**

- El coordinador está autenticado en el sistema y tiene permisos de gestión de rutas.  
- Existen solicitudes con el estado pendiente en el sistema.  
- El sistema de geolocalización está disponible.  
- Las solicitudes pendientes ya han sido previamente validadas por el sistema de geolocalización.

### **Postcondiciones**

- Se crea un lote de recolección con solicitudes agrupadas e identificador único.  
- El estado de las solicitudes pasas de *pendiente* a *en ejecución*  
- El lote queda asociado a una ruta geográfica inicial (definida o optimizada).

### **Escenario principal de éxito**

1. El coordinador consulta el registro general del sistema.  
2. El coordinador filtra las solicitudes pendientes.  
3. El coordinador selecciona un conjunto de solicitudes cercanas.  
4. El coordinador asigna una ruta al lote de recolección, ejecutándose el caso de uso “*Gestionar ruta*”.  
5. El coordinador confirma la creación del lote.  
6. El sistema crea un nuevo lote y actualiza el estado de las solicitude
7. El sistema muestra un mensaje de confirmación.

### **Extensiones**

**2’**:	No existen solicitudes pendientes, en este caso se muestra un mensaje de error.  
**3’**:	Las solicitudes no son lo suficientemente cercanas, si esto sucede se muestra una advertencia que denuncia la infactibilidad de la ruta.  
**1-6’**:	Cancelar. En caso de no haber sido finalizado el proceso, este se puede cancelar la creación del lote de recolección.

## **UC2: Gestionar ruta**

### **Actor principal**

Coordinador de ruta

### **Actores involucrados e intereses**

- **Coordinador de ruta**: Desea asignar o modificar la ruta que debe seguir un recolector al realizar el trabajo de recolección de un lote determinado.  
- **Sistema de geolocalización**: En caso de que el coordinador lo requiera, el sistema de geolocalización debe sugerir una ruta eficiente para el trabajo de recolección.  
- **Reciclador**: Es el responsable de recorrer la ruta asignada y realizar el trabajo de recolección.

### **Precondiciones**

- Existe un lote de recolección en el sistema al que se desea gestionar su ruta de recolección.  
- El lote de recolección es válido en cuanto a las solicitudes que lo componen, las cuales están ubicadas en áreas geográficamente cercanas.  
- El lote de recolección es válido en cuanto a estar dentro del área de cobertura de la cooperativa de reciclaje.  
- El coordinador está autenticado en el sistema.

### **Postcondiciones**

- Se asigna o sobreescribe la ruta asociada al lote de recolección.  
- El lote de recolección queda actualizado con la nueva información de ruta.  
- Un reciclador asignado puede consultar la nueva ruta a través del sistema.  
- Si un reciclador estaba previamente asignado a la ruta y esta se modificó, el sistema le notifica automáticamente del cambio.  
- El historial de rutas del lote se actualiza para conservar un registro de las modificaciones realizadas.  
- Si se utilizó el sistema de geolocalización, la ruta optimizada queda registrada como referencia en el sistema.

### **Escenario principal de éxito**

1. El coordinador consulta el registro general del sistema.  
2. El coordinador consulta un lote de recolección determinado.  
3. El coordinador puede consultar la ruta del lote de recolección.  
4. Si el coordinador lo desea, puede asignar un reciclador a la ruta, ejecutándose el caso de uso “Asignar reciclador a la ruta”.  
5. El coordinador puede solicitar al sistema una ruta óptima, ejecutándose el caso de uso “Optimizar ruta”.  
6. El coordinador puede modificar manualmente la ruta.  
7. El sistema actualiza la ruta asociada al lote de recolección.  
8. El sistema muestra un mensaje de confirmación.

### **Extensiones**

**2’**:	Si se intenta acceder a un lote inexistente, el sistema muestra un mensaje de error indicando que el lote seleccionado no existe o fue eliminado.  
**3’**:	Si el lote no es válido, ya sea porque las solicitudes del lote son inválidas o están fuera de cobertura, el sistema muestra una advertencia y permite eliminar las solicitudes afectadas o cancelar la gestión.  
**4’**:	Si el sistema de geolocalización no está disponible, o bien, no se puede obtener la ruta optimizada, el sistema notifica el error y permite continuar con la configuración manual.  
**5’**:	Si la ruta sugerida por el sistema de geolocalización incluye puntos no válidos, el sistema muestra una advertencia y permite corregir manualmente.  
**6’**:	Si el recolector asignado no está disponible, el sistema muestra una advertencia y permite seleccionar otro.  
**1–7’**:	En cualquier punto previo a la confirmación, el coordinador puede cancelar la gestión, manteniendo la ruta anterior.

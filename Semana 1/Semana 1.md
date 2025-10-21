# **Documentación**

# **Contexto**

En distintas comunas del país, cooperativas de recicladores de base realizan la recolección de materiales reciclables directamente desde los hogares. Actualmente, el proceso de solicitud y coordinación se realiza por vías informales (llamados, planillas, papel), generando confusiones, rutas ineficientes y solicitudes de pérdida. 

Se busca una solución que digitalice el proceso y permita una mejor coordinación entre hogares, recicladores y coordinadores de ruta. Se espera que los usuarios puedan ingresar solicitudes de retiro, que se validan automáticamente según su ubicación geográfica, y que se agrupan por zonas para formar rutas de recolección eficientes. Además, el sistema debe permitir a los recicladores reportar el resultado de cada retiro y emitir comprobantes para los hogares.

# **Visión**

## **Visión del problema**

El problema que enfrentan las cooperativas de recicladores de base es la falta de una manera organizada de realizar, gestionar y coordinar las múltiples solicitudes de recolección de materiales.  
Esto provoca varios problemas de logística como confusión entre los distintos agentes, rutas ineficientes y solicitudes pérdidas.  
Es importante resolver este problema para lograr operar eficientemente y tener una mejor trazabilidad y verificación de las solicitudes.

## **Visión del producto**

Como producto se busca un sistema informático que busque agilizar y llevar mejor registro del proceso de recolección para los recicladores, como también, facilitar y digitalizar las distintas solicitudes, coordinando de forma más eficaz las rutas de recolección.  
Esto es con el fin de hacer más cómodo el uso del sistema para los usuarios finales y de tener una operación más eficiente y escalable.

# **Requisitos de Software**

## **Funcionales**

* El sistema debe permitir que los usuarios puedan ingresar solicitudes de retiro.  
* El sistema debe permitir que las solicitudes se validen automáticamente según su ubicación geográfica.  
* El sistema debe derivar la tarea a la cooperativa de recicladores más cercana.  
* El sistema debe permitir que los recicladores puedan reportar el resultado de cada retiro.  
* El sistema debe permitir que los recicladores puedan emitir comprobantes para los hogares.  
* El sistema debe mostrar las rutas a seguir para realizar un retiro.

## **No funcionales**

* El sistema debe ser portátil, es decir debe poder ser ejecutado en dispositivos móviles.  
* Para una mayor seguridad debe existir un método de registro, esto asegura que las peticiones son de personas reales.  
* Debe tener la menor cantidad de pasos posibles para llevar a cabo la tarea, esto para que su uso sea sencillo.  
* Debe tener una interfaz clara y legible.  
* Las solicitudes ya completadas deben ser guardadas en un historial para llevar una mejor trazabilidad.  
* El sistema debe coordinar una ruta solo en el horario establecido de actividad disponible de los recicladores.  
* El sistema debe manejar posibles errores e inconsistencias (ej.: un usuario que envió dos solicitudes para un mismo retiro).   
* Las rutas deben existir y ser factibles.  
* Se debe validar que existe la ubicación geográfica desde donde se realiza una solicitud de retiro.  
* Se debe poder generar rutas alternativas.

# **Actores Involucrados**

* Cooperativa de recicladores (como empresa): Empresas que se dedican a la recolección, están están a cargo de 1 o más recicladores.  
* Recicladores (como individuo): Trabajadores de la cooperativa que realizan las rutas de recolección.  
* Usuarios de recicladores (hogares): Usuarios de la aplicación, estos hacen solicitudes con su ubicación geográfica del sitio en cuestión.  
* Coordinadores de ruta: Persona encargada de gestionar una ruta la cual deberán realizar los recicladores, pueden hacer cambios en medio de la ruta.


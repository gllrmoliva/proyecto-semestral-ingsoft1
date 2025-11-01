## **Funcionales**

1. El sistema debe permitir que los clientes puedan ingresar solicitudes de retiro.  
2. El sistema debe validar automáticamente las solicitudes ingresadas según su ubicación geográfica.  
3. El sistema debe notificar a los clientes cuando una solicitud asociada cambie de estado.  
4. El sistema debe permitir a los clientes ver su historial de solicitudes realizadas.  
5. El sistema debe permitir a los clientes cancelar sus solicitudes pendientes.  
6. El sistema debe permitir a los coordinadores cancelar solicitudes pendientes de cualquier usuario.  
7. El sistema debe permitir a los coordinadores crear un **lote de recolección** a partir de solicitudes pendientes cercanas, actualizando el estado de estas a "*en ejecución*".  
8. El sistema debe permitir a los coordinadores modificar los lotes de recolección todavía no completados (ej: quitar una solicitud del lote, devolviéndola al estado "*pendiente*").  
9. El sistema debe permitir a los coordinadores generar y asignar una ruta a un lote de recolección, utilizando el sistema de geolocalización.  
10. El sistema debe permitir a los coordinadores modificar la ruta asignada a un lote de recolección todavía no completado.  
11. El sistema debe permitir a los coordinadores asignar un recolector a una ruta.  
12. El sistema debe permitir a los coordinadores cambiar el recolector asignado a una ruta.  
13. El sistema debe permitir a los coordinadores monitorear el estado y ubicación de las solicitudes en *ejecución*.  
14. El sistema debe permitir a los coordinadores consultar el historial de todas las solicitudes y rutas ingresadas.  
15. El sistema debe permitir a los recolectores consultar la ruta actual en la cual están asignados, junto al estado de cada solicitud involucrada en dicha ruta.  
16. El sistema debe permitir a los recolectores consultar el historial de rutas realizadas.  
17. El sistema debe permitir a los recolectores registrar los resultados de las solicitudes terminadas, para posteriormente enviar un comprobante de recibo.  
18. El sistema debe permitir a los recolectores reportar problemas al intentar terminar una solicitud.

## **No funcionales**

| Requisito no funcional | Atributo |
| :---- | :---- |
| El sistema debe permitir filtrar y ordenar el historial de solicitudes por diversos criterios. Principalmente por estado (*pendiente*, *en ejecución*, *completada*, *no válida, cancelada*). | Usabilidad |
| El sistema debe requerir autenticación de los clientes, recolectores y coordinadores, este debe utilizar cifrado de datos y almacenamiento seguro de contraseñas. | Seguridad |
| El sistema debe restringir aquellos clientes que han hecho un mal uso del sistema. | Seguridad |
| El sistema debe ser compatible con las dos últimas versiones de los sistemas operativos iOS y Android. | Portabilidad |
| El sistema debe permitir que los clientes puedan acceder a través de navegador web. | Portabilidad |
| El sistema debe tener un tiempo de carga inicial inferior a 5 segundos. | Eficiencia |
| El sistema debe manejar posibles errores e inconsistencias (ejemplo: un usuario que envió dos solicitudes para un mismo retiro). | Confiabilidad |
| El sistema debe asegurarse de que las rutas deben existir y ser factibles. | Confiabilidad |
| El sistema debe permitir generar rutas alternativas. | Usabilidad |
| El sistema debe contemplar un tiempo de finalización de solicitud de no más de 30 segundos para un usuario con experiencia promedio. | Usabilidad |
| El sistema debe contemplar *backups* de los datos registrados. | Mantenibilidad |
| Los datos sensibles almacenados para la autenticación deben cumplir con la legislación vigente de protección de datos. | Seguridad |
| El sistema debe asegurar una precisión en el seguimiento de geolocalización de los recicladores de no más de 10 metros de su ubicación real. | Eficiencia |
| El sistema debe asegurar una disponibilidad del 99% mensual del sistema de geolocalización en tiempo real. | Disponibilidad |

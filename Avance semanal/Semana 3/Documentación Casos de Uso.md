## **COSAS A REVISAR EN LOS CASOS DE USO ANTERIORES**

- Agregar el resto de extends

## **UC1: Ver historial de solicitudes**

### **Actor principal**

Empresa de reciclaje, Reciclador y Usuario (hogar)

### **Actores involucrados e intereses**

- **Empresa de reciclaje**: Desea obtener la información necesaria acerca de la fecha, la ubicación y de los usuarios que han hecho alguna solicitud, y el estado de estas.  
- **Reciclador:** Desea obtener la información necesaria acerca de la fecha, la ubicación y de los usuarios que han hecho alguna solicitud, y el estado de estas.  
- **Usuario (hogar)**: Desea obtener la información necesaria acerca de la fecha y la ubicación de las solicitudes que ingresó y el estado de estas..

### **Precondiciones**

- Deben existir solicitudes en el sistema vinculadas al actor.  
- Tiene acceso al sistema.

### **Postcondiciones (garantías de éxito)**

- La información de las solicitudes se entregan con éxito.  
- Los datos de las solicitudes son válidos.

### **Escenario principal de éxito (flujo básico)**

1. El actor accede al historial de solicitudes.  
2. El actor visualiza la información acerca de las solicitudes y sus estados. Estas muestran más o menos información dependiendo del actor involucrado:  
   1. Empresa: Le muestra las solicitudes ingresadas por los Usuarios (Hogar), la fecha, la ubicación, el Reciclador a cargo de esa solicitud o si no se ha designado a ninguno aún, y el estado de las solicitudes; pendiente, en proceso, completadas y canceladas.  
   2. Usuario (Hogar): Le muestra las solicitudes que ha ingresado, la fecha, la ubicación y el estado de sus solicitudes; pendiente, en proceso, completadas y canceladas.  
3. Si el actor lo desea se puede filtrar por estado de solicitud; pendiente (UC2), en proceso (UC3), completadas (UC4) y canceladas (UC5).

### **Extensiones (flujos alternativos \[errores\])**

2’ No hay antecedentes de solicitudes, En este caso se muestra un mensaje de error.

## **UC2: Ver solicitudes pendientes**

### **Actor principal**

Empresa de reciclaje, Reciclador y Usuario (hogar)

### **Actores involucrados e intereses**

- **Empresa de reciclaje**: Desea obtener la información necesaria acerca de la fecha, la ubicación y los usuarios que han hecho alguna solicitud que están pendientes.  
    
- **Reciclador:** Desea obtener la información necesaria acerca de la fecha, la ubicación y los usuarios que han hecho alguna solicitud que están pendientes.  
    
- **Usuario (hogar)**: Desea obtener la información necesaria acerca de la fecha y la ubicación de las solicitudes que ingresó y que están pendientes.

### **Precondiciones**

- Deben existir solicitudes pendientes en el sistema vinculadas al actor.  
- Tiene acceso al sistema.

### **Postcondiciones**

- La información de las solicitudes pendientes se entregan con éxito.  
- Los datos de las solicitudes son válidos.

### **Escenario principal de éxito (flujo básico)**

1. El actor accede al historial de solicitudes (UC1).  
2. El actor accede específicamente al historial de solicitudes pendientes.  
3. El actor visualiza la información acerca de las solicitudes pendientes en ese momento. Estas muestran más o menos información dependiendo del actor involucrado:  
   1. Empresa: Le muestra las solicitudes ingresadas por los Usuarios (Hogar) que están pendientes, la fecha, la ubicación y el Reciclador a cargo de esa solicitud o si no se ha designado a ninguno aún.  
   2. Usuario (Hogar): Le muestra las solicitudes que ha ingresado y que están pendientes, la fecha y la ubicación.

   

### **Extensiones (flujos alternativos)**

2’ No hay antecedentes de solicitudes, En este caso se muestra un mensaje de error.

## **UC3: Ver solicitudes en proceso**

### **Actor principal**

Empresa de reciclaje, Reciclador y Usuario (hogar)

### **Actores involucrados e intereses**

- **Empresa de reciclaje**: Desea obtener la información necesaria acerca de la fecha, la ubicación y los usuarios que han hecho alguna solicitud que está en proceso.  
    
- **Reciclador:** Desea obtener la información necesaria acerca de la fecha, la ubicación y los usuarios que han hecho alguna solicitud que está en proceso.  
    
- **Usuario (hogar)**: Desea obtener la información necesaria acerca de la fecha y la ubicación de las solicitudes que ingresó y que están en proceso.

### **Precondiciones**

- Deben existir solicitudes en proceso en el sistema vinculadas al actor.  
- Tiene acceso al sistema.

### **Postcondiciones**

- La información de las solicitudes en proceso se entregan con éxito.  
- Los datos de las solicitudes son válidos.

### **Escenario principal de éxito (flujo básico)**

4. El actor accede al historial de solicitudes (UC1).  
5. El actor accede específicamente al historial de solicitudes en proceso.  
6. El actor visualiza la información acerca de las solicitudes en proceso en ese momento. Estas muestran más o menos información dependiendo del actor involucrado:  
   1. Empresa: Le muestra las solicitudes ingresadas por los Usuarios (Hogar) que aún no han sido completadas, la fecha y la ubicación.  
   2. Usuario (Hogar): Le muestra las solicitudes que ha ingresado y que aún no se completan, la fecha y la ubicación.

   

### **Extensiones (flujos alternativos)**

2’ No hay antecedentes de solicitudes, En este caso se muestra un mensaje de error.

## **UC4: Ver Solicitudes Completadas** 

### **Actor principal**

Empresa de reciclaje, Reciclador y Usuario (hogar)

### **Actores involucrados e intereses**

- **Empresa de reciclaje**: Desea obtener la información necesaria acerca de la fecha, la ubicación y los usuarios que han hecho alguna solicitud que está en proceso.  
    
- **Reciclador:** Desea obtener la información necesaria acerca de la fecha, la ubicación y los usuarios que han hecho alguna solicitud que está en proceso.  
    
- **Usuario (hogar)**: Desea obtener la información necesaria acerca de la fecha y la ubicación de las solicitudes que ingresó y que están en proceso.

### **Precondiciones**

- Deben existir solicitudes pendientes en el sistema vinculadas al actor.  
- Tiene acceso al sistema.

### **Postcondiciones**

- La información de las solicitudes completadas se entregan con éxito.  
- Los datos de las solicitudes son válidos.

### **Escenario principal de éxito (flujo básico)**

### **Extensiones (flujos alternativos)**

2’ No hay antecedentes de solicitudes, En este caso se muestra un mensaje de error.

## **UC5: Ver Solicitudes Canceladas**

### **Actor principal**

Empresa de reciclaje, Reciclador y Usuario (hogar)

### **Actores involucrados e intereses**

- **Empresa de reciclaje**: Desea obtener la información necesaria acerca de la fecha, la ubicación y los usuarios que han hecho alguna solicitud que está en proceso.  
    
- **Reciclador:** Desea obtener la información necesaria acerca de la fecha, la ubicación y los usuarios que han hecho alguna solicitud que está en proceso.  
    
- **Usuario (hogar)**: Desea obtener la información necesaria acerca de la fecha y la ubicación de las solicitudes que ingresó y que están en proceso.

### **Precondiciones**

- Deben existir solicitudes pendientes en el sistema vinculadas al actor.  
- Tiene acceso al sistema.

### **Postcondiciones**

- La información de las solicitudes canceladas.  
- Los datos de las solicitudes son válidos.

### **Escenario principal de éxito (flujo básico)**

### **Extensiones (flujos alternativos)**

2’ No hay antecedentes de solicitudes, En este caso se muestra un mensaje de error.


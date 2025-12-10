package main.java;

import main.java.controller.ControladorLogistica;
import main.java.model.operacion.LoteRecoleccion;
import main.java.model.operacion.RutaRecoleccion;
import main.java.model.operacion.SolicitudRetiro;
import main.java.model.usuario.Recolector;

import java.util.ArrayList;
import java.util.List;

// En este archivo se encuentran tests sobre principalmente el controlador, ya que es el que más interactua con el sistema
// Coordinador ruta utiliza a Controlador por lo que se omitio, Lotes fueron creados de manera "sintetica"

public class Main {

    private static void assertTest(boolean condition, String message) {
        // Asserts en terminal
        if (condition) {
            System.out.println("[OK] " + message);
        } else {
            System.err.println("[FAIL] " + message);
        }
    }

    private static List<SolicitudRetiro> generarSolicitudesPrueba() {
        // Se crean 5 solicitudes y se guardan en lista
        List<SolicitudRetiro> lista = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            SolicitudRetiro s = new SolicitudRetiro();
            s.idSolicitud = i;
            // Se alternan los estados para ver como responde sistema
            s.estado = (i <= 3) ? "PENDIENTE" : "COMPLETADO";
            lista.add(s);
        }
        return lista;
    }

    public static void main(String[] args) {

        System.out.println(".........INICIANDO TESTS.........\n");

        ControladorLogistica controlador = new ControladorLogistica();

        // generar solicitudes prueba
        List<SolicitudRetiro> solicitudesMock = generarSolicitudesPrueba();


        controlador.repositorioSolicitudes.addAll(solicitudesMock);

        System.out.println("Numero de Solicitudes: " + controlador.repositorioSolicitudes.size());

        // Prueba de filtrado PENDIENTE
        System.out.println("\n...Filtrado de Solicitudes...");
        List<SolicitudRetiro> pendientes = controlador.filtrarSolicitudes("PENDIENTE");
        assertTest(pendientes.size() == 3, "El filtro debería retornar 3 solicitudes pendientes.");

        // Crear Lote
        System.out.println("\n...Creación de Lote de Recolección...");
        try {
            LoteRecoleccion lote = controlador.crearLote(pendientes);

            // verificamos si lote está en lista que gestiona controlador (esto simula BD)
            boolean loteExiste = controlador.lotesGestionados.contains(lote);
            assertTest(loteExiste, "El lote creado debe estar en la lista de lotes gestionados.");
        } catch (Exception e) {
            System.err.println("   FALLO: Excepción al crear lote - " + e.getMessage());
        }

        // Crear y Asignar Ruta
        System.out.println("\n...Gestión de Rutas y Asignación de Recolector...");
        RutaRecoleccion nuevaRuta = controlador.crearRuta();

        Recolector recolector1 = new Recolector();
        recolector1.disponible = true;

        // asignamos ruta a recolector
        boolean asignacionExito = controlador.asignarRecolector(nuevaRuta, recolector1);

        assertTest(asignacionExito, "La asignación debería retornar true.");
        assertTest(!recolector1.disponible, "El recolector debería quedar no disponible (false).");
        assertTest(nuevaRuta.estado.equals("ASIGNADA"), "El estado de la ruta debe ser 'ASIGNADA'.");

        // Cancelación de Solicitud
        System.out.println("\n...Cancelación de Solicitud...");

        // controlador cancela solicitud id:1
        boolean cancelado = controlador.cancelarSolicitudUsuario(1);
        SolicitudRetiro solicitudCancelada = controlador.repositorioSolicitudes.stream()
                .filter(s -> s.idSolicitud == 1).findFirst().orElse(null);

        // verificar estado y bool
        assertTest(cancelado, "El método cancelar debe retornar true si existe el ID.");
        if (solicitudCancelada != null) {
            assertTest(solicitudCancelada.estado.equals("CANCELADO"), "El estado de la solicitud debe cambiar a 'CANCELADO'.");
        }

        // ...Recolector no disponible... (debería fallar)
        System.out.println("\n...Validación de Recolector Ocupado (debería dar error)...");
        RutaRecoleccion rutaSegunda = controlador.crearRuta();

        // Intentamos asignar el mismo recolector que ta ocupado
        boolean asignacionFallida = controlador.asignarRecolector(rutaSegunda, recolector1);
        assertTest(!asignacionFallida, "No se debe permitir asignar un recolector no disponible.");
    }


}
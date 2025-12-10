package main.java.model.operacion;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class LoteRecoleccion {
    private int idLote;
    private LocalDateTime fechaCreacion;
    public String estado;
    private int numeroSolicitudes;

    private RutaRecoleccion rutaGenerada;        // relaciones
    private List<SolicitudRetiro> solicitudesAgrupadas;  // relaciones


    public LoteRecoleccion() {
        // Constructor
        this.solicitudesAgrupadas = new ArrayList<>();
    }

    public boolean crearDesdeSolicitudes(List<SolicitudRetiro> solicitudes) {
        if (solicitudes == null || solicitudes.isEmpty()) {
            return false; // No tiene sentido crear un lote vacío
        }

        this.solicitudesAgrupadas = new ArrayList<>(solicitudes);

        // Actualización datos del lote
        this.fechaCreacion = LocalDateTime.now();
        this.numeroSolicitudes = this.solicitudesAgrupadas.size();
        this.estado = "SIN ASIGNAR";

        return true;
    }

    public boolean modificarSolicitudes() {
        // Actúa como un "commit", actualiza contador de lote,
        if (this.solicitudesAgrupadas == null) {
            this.numeroSolicitudes = 0;
            return false;
        }

        this.numeroSolicitudes = this.solicitudesAgrupadas.size();

        // Si un lote no tiene solicitudes no es válido
        if (this.numeroSolicitudes == 0) {
            this.estado = "SIN ASIGNAR";
            return false;
        }

        this.estado = "PENDIENTE";
        return true;
    }

    public void actualizarEstadosSolicitudes(String nuevoEstadoSolicitud) {
        // Propaga el estado del Lote a sus Solicitudes hijas
        if (this.solicitudesAgrupadas == null || this.solicitudesAgrupadas.isEmpty()) {
            return;
        }

        // actualizar cada solicitud
        for (SolicitudRetiro solicitud : this.solicitudesAgrupadas) {
            solicitud.actualizarEstado(nuevoEstadoSolicitud);
        }
        this.estado = nuevoEstadoSolicitud;
    }

    public int getIdLote() {
        return idLote;
    }
}
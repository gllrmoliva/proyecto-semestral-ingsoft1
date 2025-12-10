package main.java.model.operacion;

import main.java.model.documento.Informe;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class SolicitudRetiro {
    private int idSolicitud;
    private LocalDateTime fechaSolicitud;
    private LocalDateTime fechaEstimadaRetiro;
    public String estado;
    private String observaciones;

    private Ubicacion ubicacion;     // modelado relación
    private List<Desecho> desechos;  // modelado relación
    private List<Informe> informes;  // modelado relación

    public SolicitudRetiro() {
        this.desechos = new ArrayList<>();
        this.informes = new ArrayList<>();
    }

    public boolean validarUbicacion() {
        // AL no tener api externa, todo es válido
        return true;
    }
    public boolean cancelar() {
        this.estado = "CANCELADO";
        return true; }

    public void actualizarEstado(String nuevoEstado) {
        // siempre se puede hacer cambio, entonces siempre notificamos (solo implementación minima)
        this.notificarCambioEstado(nuevoEstado);
        this.estado = nuevoEstado;
    }
    public void notificarCambioEstado(String nuevoEstado) {
        System.out.printf("Se cambio el estado de solicitud de " + estado + " a " + nuevoEstado + "." );
    }

    public int getIdSolicitud() {
        return idSolicitud;
    }

    public void setIdSolicitud(int idSolicitud) {
        this.idSolicitud = idSolicitud;
    }
}
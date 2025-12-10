package main.java.model.usuario;

import main.java.model.operacion.SolicitudRetiro;
import main.java.model.operacion.Ubicacion;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Cliente extends Usuario {
    public LocalDateTime fechaRegistro;
    public List<SolicitudRetiro> solicitudes; // esto se deberia guardar en Base de datos
    public List<Ubicacion> ubicacionesRegistradas;  // Esto se deberia guardar en Base de datos


    public Cliente() {
        this.fechaRegistro = LocalDateTime.now();
        this.solicitudes = new ArrayList<>();
        this.ubicacionesRegistradas = new ArrayList<>();
    }

    public SolicitudRetiro ingresarSolicitud() {
        SolicitudRetiro nueva_solicitud = new SolicitudRetiro();
        this.solicitudes.add(nueva_solicitud);
        return nueva_solicitud;
    }

    public List<SolicitudRetiro> verHistorial() {
        return new ArrayList<>(this.solicitudes);
    }

    public List<SolicitudRetiro> filtrarHistorial(String criterios) {
        // Logica de función todavía no implementada, debe devolver historial filtrado
        return new ArrayList<>(this.solicitudes);
    }

    public boolean cancelarSolicitud(int id) {
        // suponemos que siempre se pueden cancelar solicitudes
        // SOLO para demostrar modelado base
        return true;
    }
}
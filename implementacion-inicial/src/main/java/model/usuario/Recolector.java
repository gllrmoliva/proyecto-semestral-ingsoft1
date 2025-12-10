package main.java.model.usuario;

import main.java.model.documento.ComprobanteRetiro;
import main.java.model.documento.Informe;
import main.java.model.documento.Reporte;
import main.java.model.operacion.RutaRecoleccion;
import main.java.model.operacion.SolicitudRetiro;
import java.util.ArrayList;
import java.util.List;

public class Recolector extends Usuario {
    public boolean disponible;
    public String estado;
    public List<Informe> informes;   // deberia estar en base de datos modela relación
    public RutaRecoleccion rutaActual; // deberia estar en base de datos "activada"

    public List<RutaRecoleccion> historialRutas;    // modela relación

    public Recolector() {
        super();
        this.disponible = true;
        this.estado = "DISPONIBLE";
        this.informes = new ArrayList<>();
        this.historialRutas = new ArrayList<>();
    }

    public RutaRecoleccion consultarRutaActual() {
        return this.rutaActual;
    }

    public List<RutaRecoleccion> consultarHistorialRutas() {
        return new ArrayList<>(this.historialRutas);
    }

    public ComprobanteRetiro registrarResultado(SolicitudRetiro solicitud, String datos) {
        return new ComprobanteRetiro();
    }

    public Reporte reportarProblema(SolicitudRetiro solicitud, String descripcion) {
        return new Reporte();
    }

    public ComprobanteRetiro emitirComprobante(SolicitudRetiro solicitud) {
        return new ComprobanteRetiro();
    }

    public void finalizarRuta() {
        if (this.rutaActual != null) {
            this.historialRutas.add(this.rutaActual);
            this.rutaActual = null;
            this.disponible = true;
            this.estado = "DISPONIBLE";
        }
    }
}
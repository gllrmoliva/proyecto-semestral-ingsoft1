package main.java.controller;

import main.java.model.operacion.LoteRecoleccion;
import main.java.model.operacion.RutaRecoleccion;
import main.java.model.operacion.SolicitudRetiro;
import main.java.model.usuario.Recolector;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ControladorLogistica {
    // variables que simulan base de datos
    public List<LoteRecoleccion> lotesGestionados;
    public List<RutaRecoleccion> rutasSupervisadas;

    public List<SolicitudRetiro> repositorioSolicitudes;

    public ControladorLogistica() {
        this.lotesGestionados = new ArrayList<>();
        this.rutasSupervisadas = new ArrayList<>();
        this.repositorioSolicitudes = new ArrayList<>();
    }

    public LoteRecoleccion crearLote(List<SolicitudRetiro> solicitudes) {
        if (solicitudes == null || solicitudes.isEmpty()) {
            throw new IllegalArgumentException("No se puede crear un lote sin solicitudes.");
        }

        LoteRecoleccion nuevoLote = new LoteRecoleccion();

        nuevoLote.crearDesdeSolicitudes(solicitudes);

        this.lotesGestionados.add(nuevoLote);
        System.out.println("Lote creado con " + solicitudes.size() + " solicitudes.");
        return nuevoLote;
    }

    public boolean modificarLote(LoteRecoleccion loteModificado) {
        // Busca y reemplaza el lote en la lista gestionada
        for (int i = 0; i < lotesGestionados.size(); i++) {
            if (lotesGestionados.get(i).idLote == loteModificado.idLote) {
                lotesGestionados.set(i, loteModificado);
                return true;
            }
        }
        return false;
    }

    public LoteRecoleccion seleccionarLote(int lote_id) {
        return lotesGestionados.stream()
                .filter(l -> l.idLote == lote_id)
                .findFirst()
                .orElse(null);
    }

    public RutaRecoleccion crearRuta() {
        RutaRecoleccion nuevaRuta = new RutaRecoleccion();
        nuevaRuta.estado = "PLANIFICACION";
        this.rutasSupervisadas.add(nuevaRuta);
        return nuevaRuta;
    }

    public boolean asignarRuta(List<SolicitudRetiro> solicitudes, RutaRecoleccion ruta) {
        return true;
    }

    public boolean asignarRecolector(RutaRecoleccion ruta, Recolector recolector) {
        if (ruta == null || recolector == null) return false;

        if (!recolector.disponible) {
            System.err.println("El recolector no está disponible.");
            return false;
        }
        ruta.recolectorAsignado = recolector;
        ruta.estado = "ASIGNADA";
        recolector.disponible = false;

        return true;
    }

    public RutaRecoleccion solicitarRutaOptima(LoteRecoleccion lote) {
        RutaRecoleccion rutaOptima = new RutaRecoleccion();
        return rutaOptima;
    }

    public List<RutaRecoleccion> monitorearRutas() {
        return new ArrayList<>(this.rutasSupervisadas);
    }

    public List<SolicitudRetiro> filtrarSolicitudes(String estado) {
        return repositorioSolicitudes.stream()
                .filter(s -> s.estado.equalsIgnoreCase(estado))
                .collect(Collectors.toList());
    }

    public boolean cancelarSolicitudUsuario(int id) {
        Optional<SolicitudRetiro> solicitud = repositorioSolicitudes.stream()
                .filter(s -> s.idSolicitud == id)
                .findFirst();

        if (solicitud.isPresent()) {
            solicitud.get().estado = "CANCELADO";
            return true;
        }
        return false;
    }

    public RutaRecoleccion consultarRutaDeLote(int idLote) {

        return null;
    }

    public boolean confirmarCreacionLote() {
        return true;
    }

    public boolean modificarRuta(RutaRecoleccion ruta) {
        return true;
    }

    public boolean seleccionarSolicitudes(int id) {
        return true;
    }

    public List<Object> consultarRegistroGeneral() {
        List<Object> registroUnificado = new ArrayList<>();

        if (this.repositorioSolicitudes != null) {
            registroUnificado.addAll(this.repositorioSolicitudes);
        }
        if (this.lotesGestionados != null) {
            registroUnificado.addAll(this.lotesGestionados);
        }
        if (this.rutasSupervisadas != null) {
            registroUnificado.addAll(this.rutasSupervisadas);
        }

        return registroUnificado;
    }
}
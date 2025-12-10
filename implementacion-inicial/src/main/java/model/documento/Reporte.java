package main.java.model.documento;

public class Reporte extends Informe {

    private String[] adjuntos;
    private String estadoProceso;

    public Reporte() {
        super();
        this.adjuntos = new String[0];
        this.estadoProceso = "PENDIENTE";
    }

    public void actualizarEstado() {
        // implementado con maquina de estados sencilla
        if ("PENDIENTE".equals(this.estadoProceso)) {
            this.estadoProceso = "EN_REVISION";
        } else if ("EN_REVISION".equals(this.estadoProceso)) {
            this.estadoProceso = "CERRADO";
        }

        System.out.println(" > Estado del Reporte #" + this.getIdInforme() + " cambiado a: " + this.estadoProceso);
    }

    public void notificarCoordinador() {
        System.out.println("Notificando al coordinador sobre el reporte ID: " + this.getIdInforme());
    }
}
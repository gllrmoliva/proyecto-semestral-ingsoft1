package main.java.model.documento;

import java.time.LocalDateTime;

public class ComprobanteRetiro extends Informe {
    public int idComprobante;
    public double pesoTotalRecolectado;
    public LocalDateTime fechaRetiro;

    public ComprobanteRetiro() {
        super();
    }

    public void generarComprobante() {

        this.fechaEmision = LocalDateTime.now();

        if (this.fechaRetiro == null) {
            this.fechaRetiro = LocalDateTime.now();
        }


        System.out.println("--- COMPROBANTE GENERADO ---");
        System.out.println("ID: " + this.idComprobante);
        System.out.println("Peso: " + this.pesoTotalRecolectado + " kg");
        System.out.println("Fecha Emisión: " + this.fechaEmision);
    }

    public boolean enviarAlCliente(int id) {
        System.out.println("Enviando comprobante " + this.idComprobante + " al cliente ID: " + id + "...");
        return true;
    }
}
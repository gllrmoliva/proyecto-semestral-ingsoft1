package main.java.model.documento;

import java.time.LocalDateTime;

public class Informe {
    private int idInforme;
    LocalDateTime fechaEmision;
    private String nombreReciclador;

    public int getIdInforme() {
        return idInforme;
    }

    public LocalDateTime getFechaEmision() {
        return fechaEmision;
    }
}
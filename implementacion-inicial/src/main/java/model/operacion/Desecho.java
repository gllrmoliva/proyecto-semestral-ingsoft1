package main.java.model.operacion;

public class Desecho {
    private int idDesecho;
    private String tipoMaterial;
    private float cantidadAproximada;
    private String unidadMedida;


    public Desecho(int id, String tipo, float cantidad, String unidad) {
        // Constructor
        this.idDesecho = id;
        this.tipoMaterial = tipo;
        this.cantidadAproximada = cantidad;
        this.unidadMedida = unidad;
    }
}
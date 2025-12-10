package main.java.model.operacion;

public class Desecho {
    public int idDesecho;
    public String tipoMaterial;
    public float cantidadAproximada;
    public String unidadMedida;


    public Desecho(int id, String tipo, float cantidad, String unidad) {
        // Constructor
        this.idDesecho = id;
        this.tipoMaterial = tipo;
        this.cantidadAproximada = cantidad;
        this.unidadMedida = unidad;
    }
}
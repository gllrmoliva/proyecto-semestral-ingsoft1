package main.java.model.operacion;

import main.java.model.usuario.Recolector;
import java.time.LocalDateTime;
import java.time.Duration;

public class RutaRecoleccion {
    private int idRuta;
    public String estado;
    private LocalDateTime fechaCreacion;
    private LocalDateTime fechaInicio;
    private LocalDateTime fechaFin;
    private double distanciaTotal;
    private Duration duracionEstimada;
    private Duration duracionReal;

    public Recolector recolectorAsignado;   // modelado (puede ser null)

    public RutaRecoleccion optimizarRuta() {
        // Como no tenemos sistema de geolocalización, este método solo devuelve la ruta
        return this;
    }
    public RutaRecoleccion generarAlternativa() {
        // en esta ocurre lo mismo que la anterior
        return this;
    }
    public boolean validarFactibilidad() {
        // Igual que anterior (no está sistema de geolocalización), en implementación base todas las rutas son factibles
        return true;
    }
    public double calcularTiempoEstimado() {
        // Consideramos una velocidad promedio ficticia para calcular la distancia total
        return this.distanciaTotal * 3.0;
    }
}
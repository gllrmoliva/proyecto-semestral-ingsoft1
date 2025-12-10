package main.java.model.operacion;

public class Ubicacion {
    public int idUbicacion;
    public double latitud;
    public double longitud;
    public String direccion;
    public String comuna;
    public String referencia;

    public boolean validar() {
        // En la implementación solo se toma en cuenta que posea los atributos, pero en vida real se haría llamado a
        // Sistema de geolocalización
        boolean tieneCoordenadas = (latitud != 0.0 && longitud != 0.0);
        boolean tieneDireccion = (direccion != null && !direccion.trim().isEmpty());
        return tieneCoordenadas || tieneDireccion;
    }

    public double calcularDistancia(Ubicacion otraUbicacion) {
        // Calcula la distancia con norma L2 (distancia euclidiana tipica)
        // Esto probablemente igual lo debería hacer el sistema de geolocalización
        if (otraUbicacion == null) return -1.0;

        double deltaLat = this.latitud - otraUbicacion.latitud;
        double deltaLon = this.longitud - otraUbicacion.longitud;

        return Math.hypot(deltaLat, deltaLon);
    }
}
package main.java.model.usuario;

public abstract class Usuario {
    public int id;
    public String nombre;
    public String email;
    public String telefono;


    // para mostrar ejemplo sencillo
    public Usuario() {}

    public Usuario(int id, String nombre, String email) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
    }

    public boolean actualizarPerfil(String nuevoNombre, String nuevoEmail, String nuevoTelefono) {
        boolean modificado = false;

        if (nuevoNombre != null && !nuevoNombre.trim().isEmpty()) {
            this.nombre = nuevoNombre;
            modificado = true;
        }

        if (nuevoEmail != null && !nuevoEmail.trim().isEmpty()) {
            this.email = nuevoEmail;
            modificado = true;
        }

        if (nuevoTelefono != null && !nuevoTelefono.trim().isEmpty()) {
            this.telefono = nuevoTelefono;
            modificado = true;
        }

        return modificado;
    }

}
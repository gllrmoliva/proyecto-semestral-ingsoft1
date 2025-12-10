package main.java.model.usuario;

import main.java.controller.ControladorLogistica;

public class CoordinadorRuta extends Usuario {

    public CoordinadorRuta() {
        super();
    }

    public ControladorLogistica delegarAccion(ControladorLogistica controlador) {
        // Representa que coordinador puede utilizar a controlador
        return controlador;
    }
}
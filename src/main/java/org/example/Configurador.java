package org.example;

public class Configurador {
    private static Configurador instancia;
    private String configuracion;

    private Configurador() {
    }

    public static Configurador obtenerInstancia() {
        if (instancia == null) {
            instancia = new Configurador();
        }
        return instancia;
    }

    public void establecerConfiguracion(String configuracion) {
        this.configuracion = configuracion;
    }

    public String obtenerConfiguracion() {
        return configuracion;
    }
}

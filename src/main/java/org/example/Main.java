package org.example;

public class Main {
    public static void main(String[] args) {
        Configurador configurador = Configurador.obtenerInstancia();
        configurador.establecerConfiguracion("Hola mundo");

        System.out.println(configurador.obtenerConfiguracion());
    }
}
package com.capgemini.pruebasintegracion;

public class Aplicacion {

    private Controlador controlador;
    private Modelo modelo;

    public Aplicacion() {
        this.controlador = new Controlador();
        this.modelo = new Modelo();
    }

    public Aplicacion(Controlador controlador, Modelo modelo) {
        this.controlador = controlador;
        this.modelo = modelo;
    }

    public void main() {
        controlador.list();
    }

    public Controlador getControlador() {
        return controlador;
    }

    public void setControlador(Controlador controlador) {

        this.controlador = controlador;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }
}

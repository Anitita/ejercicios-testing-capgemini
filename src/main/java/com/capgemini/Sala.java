package com.capgemini;

public class Sala {

    private String dimensiones;
    private Boolean aireacond;

    public Sala(){

        this.dimensiones = "";
        this.aireacond = true;

    }

    public Sala(String dimensiones, Boolean aireacond) {
        this.dimensiones = dimensiones;
        this.aireacond = aireacond;
    }

    @Override
    public String toString() {
        return "Sala{" +
                "dimensiones='" + dimensiones + '\'' +
                ", aireacond=" + aireacond +
                '}';
    }

    public String getDimensiones() {
        return dimensiones;
    }

    public void setDimensiones(String dimensiones) {
        this.dimensiones = dimensiones;
    }

    public Boolean getAireacond() {
        return aireacond;
    }

    public void setAireacond(Boolean aireacond) {
        this.aireacond = aireacond;
    }
}

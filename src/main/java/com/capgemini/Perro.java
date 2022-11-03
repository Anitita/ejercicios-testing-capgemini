package com.capgemini;

public class Perro {

    public String raza;

    public Perro()
    {
        raza = "";
    }

    public Perro(String raza) {
        this.raza = raza;
    }

    public String getRaza() {
        return this.raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
}

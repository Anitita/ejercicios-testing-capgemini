package com.capgemini;

public class ClientePrivado {

    private String nombre;
    private String direccion;
    private Integer edad;

    ClientePrivado(){
        this.nombre = "";
        this.direccion = "";
        this.edad = 0;
    }

    public ClientePrivado(String nombre, String direccion, Integer edad) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.edad = edad;
    }

    public String getNombre(){
        return this.nombre;
    }
}

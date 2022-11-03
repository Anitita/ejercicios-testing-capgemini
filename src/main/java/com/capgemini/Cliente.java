package com.capgemini;

public class Cliente {

    public String nombre;
    public String direccion;
    public Integer edad;

    public Cliente() {
        this.nombre = "";
        this.direccion = "";
        this.edad = 0;
    }

    public Cliente(String nombre, String direccion, Integer edad){
       this.nombre = nombre;
       this.direccion = direccion;
       this.edad = edad;
    }



    public String toString(){
        return "Cliente(nombre:, direccion:, edad";
    }

}

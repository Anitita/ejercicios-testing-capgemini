package com.capgemini;

public class Empelado extends Persona{

    public String dni;
    public Integer  tlf;
    public Float sueldo;
    public String cargo;

    public Empelado(){

        super();
        this.dni = "";
        this.tlf = 0;
        this.sueldo = 0F;
        this.cargo = "";

    }

    public Empelado(String nombre, String dni, Integer tlf, Float sueldo, String cargo) {

        super(nombre);
        this.dni = dni;
        this.tlf = tlf;
        this.sueldo = sueldo;
        this.cargo = cargo;

    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Integer getTlf() {
        return tlf;
    }

    public void setTlf(Integer tlf) {
        this.tlf = tlf;
    }

    public Float getSueldo() {
        return sueldo;
    }

    public void setSueldo(Float sueldo) {
        this.sueldo = sueldo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "Empelado{" +
                "nombre='" + getNombre() + '\'' +
                ", dni='" + dni + '\'' +
                ", tlf=" + tlf +
                ", sueldo=" + sueldo +
                ", cargo='" + cargo + '\'' +
                '}';
    }
}

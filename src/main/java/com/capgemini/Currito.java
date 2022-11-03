package com.capgemini;

public class Currito extends Empelado{

    private String departamento;

    public Currito() {
        super();
        this.departamento = "";
    }

    public Currito(String nombre, String dni, Integer tlf, Float sueldo, String cargo, String departamento) {
        super(nombre, dni, tlf, sueldo, cargo);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Currito{" +
                "departamento='" + departamento + '\'' +
                ", dni='" + getDni() + '\'' +
                ", tlf=" + getTlf() +
                ", sueldo=" + getSueldo() +
                ", cargo='" + getCargo() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                '}';
    }
}

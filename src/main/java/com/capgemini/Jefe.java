package com.capgemini;

public class Jefe extends Empelado{

    private Integer genteACargo;

    public Jefe() {
        super();
        this.genteACargo = 0;
    }

    public Jefe(String nombre, String dni, Integer tlf, Float sueldo, String cargo, Integer genteACargo) {
        super(nombre, dni, tlf, sueldo, cargo);
        this.genteACargo = genteACargo;
    }

    public Integer getGenteACargo() {
        return genteACargo;
    }

    public void setGenteACargo(Integer genteACargo) {
        this.genteACargo = genteACargo;
    }

    @Override
    public String toString() {
        return "Jefe{" +
                "genteACargo=" + genteACargo +
                ", dni='" + getDni() + '\'' +
                ", tlf=" + getTlf() +
                ", sueldo=" + getSueldo() +
                ", cargo='" + getCargo() + '\'' +
                ", nombre='" + getNombre() + '\'' +
                '}';
    }
}

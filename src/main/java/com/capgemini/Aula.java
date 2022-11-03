package com.capgemini;

public class Aula extends Sala{

    private String profesorAsignado;

    public Aula(){

        super();
        this.profesorAsignado = "";

    }

    public Aula(String dimensiones, Boolean aireacond, String profesorAsignado) {
        super(dimensiones, aireacond);
        this.profesorAsignado = profesorAsignado;
    }

    public String getProfesorAsignado() {
        return profesorAsignado;
    }

    public void setProfesorAsignado(String profesorAsignado) {
        this.profesorAsignado = profesorAsignado;
    }

    @Override
    public String toString() {
        return "Aula{" +
                "profesorAsignado='" + profesorAsignado + '\'' +
                ", dimensiones='" + getDimensiones() + '\'' +
                ", aireacond=" + getAireacond() +
                '}';
    }
}

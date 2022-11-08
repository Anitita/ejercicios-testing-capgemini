package com.capgemini.pruebasintegracion;

import com.capgemini.pruebasintegracion.Proceso;

public class Procesador {

    private String comando;

    private Proceso proceso;

    public Procesador() {
        this.comando = "";
        this.proceso = new Proceso();
    }

    public Procesador(String comando, Proceso proceso) {
        this.comando = comando;
        this.proceso = proceso;
    }

    public void llamaProceso(){

        this.comando = this.proceso.getNombre()+" -i";

    }

    public String getComando() {
        return comando;
    }

    public void setComando(String comando) {
        this.comando = comando;
    }


    public Proceso getProceso() {
        return proceso;
    }

    public void setProceso(Proceso proceso) {
        this.proceso = proceso;
    }


    @Override
    public String toString() {
        return "Procesador{" +
                "comando='" + comando + '\'' +
                ", proceso=" + proceso +
                '}';
    }


}

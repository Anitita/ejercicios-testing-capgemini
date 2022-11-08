package com.capgemini.pruebasintegracion;

import java.util.ArrayList;
import java.util.List;

public class Controlador {
    private Modelo modelo;
    private List<String> datosProcesados;

    public Controlador(){
        this.modelo = new Modelo();
        this.datosProcesados = new ArrayList<String>();
    }

    public void list(){
        datosProcesados = modelo.list();
        processData();
        for (String item: datosProcesados){
            System.out.println(item);
        }
    }

    public void processData(){
        int index = 0;
        for (String item: datosProcesados){
            datosProcesados.set(index, item+"1");
            index++;
        }

    }
    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public List<String> getDatosProcesados() {
        return datosProcesados;
    }

    public void setDatosProcesados(List<String> datosProcesados) {
        this.datosProcesados = datosProcesados;
    }
}

package com.capgemini.pruebasintegracion;

import java.util.ArrayList;
import java.util.List;

public class Modelo {
    private List<String> listado;

    public Modelo(){
        listado = new ArrayList<String>();
        listado.add("UnValor");
        listado.add("OtroValor");
    }

    public List<String> list (){
        return listado;
    }
}

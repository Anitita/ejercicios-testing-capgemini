package com.capgemini.pruebasintegracion;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class AplicacionTest {

    @Test
    public void testConstructor(){

        Aplicacion apli = new Aplicacion();
        assertNotNull(apli.getControlador());
        assertNotNull(apli.getModelo());
    }

    @Test
    public void testSetControlador(){

        Aplicacion apli = new Aplicacion();
        Controlador c = new Controlador();
        apli.setControlador(c);
        assertEquals(c, apli.getControlador());

    }

    @Test
    public void testSetModelo(){

        Aplicacion apli = new Aplicacion();
        Modelo m = new Modelo();
        apli.setModelo(m);
        assertEquals(m, apli.getModelo());
    }

}

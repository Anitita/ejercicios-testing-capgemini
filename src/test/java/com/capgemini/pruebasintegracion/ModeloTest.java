package com.capgemini.pruebasintegracion;

import com.capgemini.pruebasintegracion.Modelo;
import org.junit.Before;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class ModeloTest {



    @Test
    public void testConstructor(){

        Modelo modelo = new Modelo();
        assertNotNull(modelo.list());
        assertEquals(2,modelo.list().size());
        assertEquals("UnValor",modelo.list().get(0));
        assertEquals("OtroValor",modelo.list().get(1));
    }

}

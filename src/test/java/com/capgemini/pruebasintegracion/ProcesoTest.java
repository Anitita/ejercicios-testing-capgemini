package com.capgemini.pruebasintegracion;

import com.capgemini.pruebasintegracion.Proceso;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProcesoTest {


    @Test
    public void testConstructorSinParametros(){

        Proceso proceso = new Proceso();
        assertEquals("", proceso.getNombre());

    }

    @Test
    public void testConstructorConParametros(){

        Proceso proceso = new Proceso("nombre");
        assertEquals("nombre", proceso.getNombre());


    }

    @Test
    public void testGet(){

        Proceso proceso = new Proceso();
        proceso.setNombre("nombre");
        assertEquals("nombre", proceso.getNombre());

    }



}

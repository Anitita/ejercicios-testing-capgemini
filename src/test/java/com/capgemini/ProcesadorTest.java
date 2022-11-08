package com.capgemini;



import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProcesadorTest {

    @Test
    public void testContructorSinParametros(){

        Procesador proce = new Procesador();
        assertEquals("", proce.getComando());

    }

    @Test
    public void testContructorConParametros(){

        Proceso proceso = new Proceso();
        Procesador proce = new Procesador("comando", proceso);
        assertEquals("comando", proce.getComando());
        assertEquals(proceso, proce.getProceso());

    }

    @Test
    public void testGet(){

        Procesador proce = new Procesador();
        proce.setComando("comando");
        assertEquals("comando", proce.getComando());
    }
}

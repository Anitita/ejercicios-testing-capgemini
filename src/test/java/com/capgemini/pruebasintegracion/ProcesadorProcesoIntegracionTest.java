package com.capgemini.pruebasintegracion;

import com.capgemini.pruebasintegracion.Procesador;
import com.capgemini.pruebasintegracion.Proceso;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;

public class ProcesadorProcesoIntegracionTest {


    @Test
    public void testIntegracionLlamaProceso(){

        Proceso proceso = spy(new Proceso());
        Procesador procesador = new Procesador("", proceso);

        String nombre = "nombre-proceso";

        when(proceso.getNombre()).thenReturn(nombre);
        procesador.llamaProceso();
        verify(proceso).getNombre();
        assertEquals("nombre-proceso -i", procesador.getComando());

    }


}

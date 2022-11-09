package com.capgemini.pruebasintegracion;


import org.junit.Before;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.spy;

public class ControladorModeloIntegracion {
    private Controlador c;
    private Modelo modeloMockeado;
    @Before
    public void setup() {
        c = new Controlador();
        modeloMockeado = spy(new Modelo());
        c.setModelo(modeloMockeado);
    }
    /*
        Método que comprueba si el método list del modelo
        es llamado cuando se llama al método list del controlador
     */
    @Test
    public void testModel(){
        // When
        // llamo al método que debería llamar al método del modelo
        c.list();
        // Then
        // assert de que se ha llamado al método list del modelo mockeado
        verify(modeloMockeado).list();
    }
    @Test
    public void checkModelProcessing(){
        // Disponer de unos datos iniciales
        List<String> listadoEsperado = new ArrayList<String>();
        listadoEsperado.add("Uno");
        listadoEsperado.add("Dos");
        listadoEsperado.add("Tres");
        // pedirle al objeto mockeado que devuelva esos datos
        when(modeloMockeado.list()).thenReturn(listadoEsperado);
        // llamar al método que pide esos datos
        c.list();
        // comprobar que los procesa adecuadamente
        assertEquals("Uno1",c.getDatosProcesados().get(0));
        assertEquals("Dos1",c.getDatosProcesados().get(1));
        assertEquals("Tres1",c.getDatosProcesados().get(2));
        assertEquals(3,c.getDatosProcesados().size());
    }
}

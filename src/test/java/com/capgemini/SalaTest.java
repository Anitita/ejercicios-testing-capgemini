package com.capgemini;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


@Tag("unit")
public class SalaTest {


    @Test
    public void testSalaDimensionesConstructorSinParametros(){
        // Given
        Sala sala = new Sala();
        // Then
        assertEquals(true, sala.getAireacond());
        assertEquals("", sala.getDimensiones());
    }

    @Test
    public void testSalaDimensiones(){
        // Given
        Sala sala = new Sala();
        // When
        sala.setDimensiones("60x50");
        // Then
        assertEquals("60x50", sala.getDimensiones());

    }


    @Test
    public void testSalaAireacond(){
        // Given
        Sala s = new Sala();
        // When
        s.setAireacond(true);
        // Then
        assertEquals(true, s.getAireacond());

    }


    @Test
    public void testAula(){
        // Given
        Aula aula = new Aula();
        // When
        aula.setProfesorAsignado("David");
        // Then
        assertEquals("David", aula.getProfesorAsignado());

    }

}

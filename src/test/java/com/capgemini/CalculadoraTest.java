package com.capgemini;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("unit")
public class CalculadoraTest {

    @Test
    public void testSuma(){

        Float resultado = Calcuradora.suma(1F, 2F);
        assertEquals(3F, resultado);

    }

    @Test
    public void testResta(){

        Float resultado = Calcuradora.resta(2F, 1F);
        assertEquals(1F,resultado);

    }

    @Test
    public void testDivi(){

        Float resultado = Calcuradora.divi(4F,2F);
        assertEquals(2F, resultado);
    }

    @Test
    public void testMulti(){

        Float resultado = Calcuradora.multi(2F,1F);
        assertEquals(2F, resultado);

    }

}

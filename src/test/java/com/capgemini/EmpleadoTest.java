package com.capgemini;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.lang.reflect.Array;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Tag("unit")
public class EmpleadoTest {

    @Test
    public void testContructor(){

        Empelado e = new Empelado();
        assertEquals("", e.getDni());
        assertEquals("", e.getNombre());
        assertEquals("", e.getCargo());
        assertEquals(0F, e.getSueldo());
        assertEquals(0, e.getTlf());

    }

    @ParameterizedTest
    @CsvFileSource(resources = "/dataEmpleado.csv", numLinesToSkip = 1)
    public void testConCSV(String input, String expected){

        String actualValue = input.toUpperCase();
        assertEquals(expected, actualValue);

    }


}

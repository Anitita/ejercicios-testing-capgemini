package com.capgemini;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

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


    @ParameterizedTest(name = "{2} * {1} = {2}")
    @CsvSource({
            "1, 2, 2",
            "5, 5, 25",
            "8, 4, 32"

    })
    public void testMultiCsvSource(float first, float second, float expectedResult){
        Calcuradora c = new Calcuradora();
        assertEquals(expectedResult, c.multi(first, second),
                () -> first + "*" + second + "should equal" + expectedResult);


    }

    /*@ParameterizedTest
    @CsvFileSource(resources = "/dataCalcu.csv")*/

}

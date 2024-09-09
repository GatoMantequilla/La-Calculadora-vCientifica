package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ACT1Test {
    @Test
    void testCalcularPorcentaje() {
        assertEquals( 5 , ACT1.calcularPorcentaje(10, 50));
        assertEquals( 50 , ACT1.calcularPorcentaje(100, 50));
        assertEquals( 100 , ACT1.calcularPorcentaje( 200, 50));        
    }

    @Test
    void testCualEsMayor() {
        assertEquals( 50 , ACT1.cualEsMayor(10, 50));
        assertEquals( 50 , ACT1.cualEsMayor(50, 50));
        assertEquals( 10 , ACT1.cualEsMayor(10, -6));

    }

    @Test
    void testCualEsMenor() {
        assertEquals( 10 , ACT1.cualEsMenor(10, 50));
        assertEquals( 50 , ACT1.cualEsMenor(50, 50));
        assertEquals( 6 , ACT1.cualEsMenor(10, 6));
    }

    @Test
    void testMain() {

    }

    @Test
    void testPotenciaNumero() {
        assertEquals(100, ACT1.potenciaNumero(10,2));
        assertEquals(4, ACT1.potenciaNumero(2,2));
        assertEquals(64, ACT1.potenciaNumero(8,2));
        assertEquals(1, ACT1.potenciaNumero(10,0));

    }
}

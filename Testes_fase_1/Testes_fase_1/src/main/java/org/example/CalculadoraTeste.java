package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTeste {
    @Test
    void funcSomar(){
        Calculadora calc = new Calculadora();
        int resultado = calc.somar(10, 10);
        Assertions.assertEquals(20, resultado);
    }

    @Test
    void funcSubstrair(){
        Calculadora calc = new Calculadora();
        int resultado = calc.subtrair(10, 20);
        Assertions.assertEquals(-10, resultado);
    }
}

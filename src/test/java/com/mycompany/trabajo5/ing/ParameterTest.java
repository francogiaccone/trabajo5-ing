package com.mycompany.trabajo5.ing;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class ParameterTest {
   static Calculador calculador = new Calculador(); 
    
    
    @ParameterizedTest
    @CsvSource({
        "8, 7, 15",
        "2, 0, 20",
        "10, -1, 9"
    })
    public void testDivCero(double num1, double num2, double expected) {
        assertEquals(expected, calculador.sumar(num1, num2));
    }
}

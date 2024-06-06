package com.mycompany.trabajo5.ing;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.lang.ArithmeticException;

public class DivisionTest {
    
    static Calculador calculador = new Calculador();
    
    /* No me deja usar el metodo ya que estoy usando la version 5
    @Test(expected = ArithmeticException.class)
    public void testDivisionCero() {
        calculador.dividir(10, 0);
    }
    */

    @Test
    public void testDivisionCero() {
        assertThrows(ArithmeticException.class, () -> {
            calculador.dividir(10, 0);
        });
    }
    
}

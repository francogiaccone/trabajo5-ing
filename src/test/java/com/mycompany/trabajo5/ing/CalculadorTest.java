package com.mycompany.trabajo5.ing;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadorTest {
    
    static Calculador calculador;
    
    @BeforeAll //igual al BeforeClass
    public static void setUpClass() {
        calculador = new Calculador();
        System.out.println("Bienvenido al test de prueba de calculador.");
    }
    
    @BeforeEach
    public void setUp() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName() );
    }

    @Test
    public void testSumar() {
        assertEquals(2.1, calculador.sumar(1.1, 1), 0.001);
    }
    
    @Test
    public void testRestar() {
        assertEquals(2.1, calculador.restar(3, 0.9), 0.001);
    }
    
    @AfterEach
    public void tearDown() {
        System.out.println("Prueba finalizada, campos en 0");
    }
    
    @AfterAll
    public static void tearDownClass() {
        System.out.println("La operacion ha finalizado");
    }
}

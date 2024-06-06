package com.mycompany.trabajo5.ing;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({CalculadorTest.class, DivisionTest.class, ParameterTest.class})
public class miSweetSuite {
    
}

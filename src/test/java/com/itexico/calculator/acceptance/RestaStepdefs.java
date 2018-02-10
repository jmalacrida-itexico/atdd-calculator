package com.itexico.calculator.acceptance;

import com.itexico.calculator.Calculator;
import com.itexico.calculator.CalculatorImpl;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dada;
import cucumber.api.java.es.Entonces;

import static org.junit.Assert.assertEquals;

public class RestaStepdefs {

    Calculator calculator ;
int rdo ;

    @Dada("^una calculadora básica$")
    public void unaCalculadoraBásica() throws Throwable {
        calculator = new CalculatorImpl();
    }

    @Cuando("^el usuario resta (-?\\d+) menos (-?\\d+)$")
    public void elUsuarioRestaMenos(int arg0, int arg1) throws Throwable {
        rdo = calculator.subtract(arg0, arg1);
    }

    @Entonces("^el resultado es (\\d+)$")
    public void elResultadoEs(int arg0) throws Throwable {
        assertEquals(rdo, arg0);
    }
}

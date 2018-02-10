package com.itexico.calculator.acceptance;

import com.itexico.calculator.Calculator;
import com.itexico.calculator.CalculatorImpl;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertEquals;

public class CalculatorStepdefs {

    Calculator calculator;
    int rdo;
    @Given("^a basic calculator$")
    public void aBasicCalculator() throws Throwable {
        calculator = new CalculatorImpl();
    }

    @When("^the user sums (-?\\d+) plus (-?\\d+)$")
    public void theUserSumsPlus(int arg0, int arg1) throws Throwable {
         rdo = calculator.sum(arg0, arg1);
    }

    @Then("^the result is (-?\\d+)$")
    public void theResultIs(int arg0) throws Throwable {
        assertEquals(rdo, arg0);
    }
}

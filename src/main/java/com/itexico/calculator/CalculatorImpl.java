package com.itexico.calculator;

public class CalculatorImpl implements Calculator {

    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public int subtract(int a, int b) {
        return a - b;
    }
}

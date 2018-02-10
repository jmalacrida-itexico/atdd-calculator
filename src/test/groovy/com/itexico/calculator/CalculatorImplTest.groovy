package com.itexico.calculator

import spock.lang.Specification

class CalculatorImplTest extends Specification {


    def "sum two numbers"() {
        expect: ""
        def calc = new CalculatorImpl()
        rdo == calc.sum(a ,b)
        where: ""
        a | b | rdo
        2 | 2 | 4
        3 | 5 | 8

    }

    def "sum two negative numbers"()    {
        given:
        def calc = new CalculatorImpl()
        when:
        def rdo = calc.sum(-2 ,-3)
        then:
        rdo == -5
    }
    //Arrange

    //Act

    //Assert

}

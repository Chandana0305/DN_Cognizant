package com.example;

import static
        org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {

        Calculator calculator = new Calculator();

        assertEquals(5, calculator.add(2, 3));

    }

}
package com.example;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Kelas test kalkulator.
 */
public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        final int a = 10;
        final int b = 5;
        final int target = 15;
        assertEquals(target, calculator.add(a, b));
    }

    @Test
    public void testSubtract() {
        final int a = 10;
        final int b = 5;
        final int target = 5;
        assertEquals(target, calculator.subtract(a, b));
    }

    @Test
    public void testMultiply() {
        final int a = 10;
        final int b = 5;
        final int target = 50;
        assertEquals(target, calculator.multiply(a, b));
    }

    @Test
    public void testDivide() {
        final int a = 10;
        final int b = 5;
        final int target = 2;
        assertEquals(target, calculator.divide(a, b));
    }
}

package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    //Додавання
    @Test
    public void add() {
        int a = 10;
        int b = 15;
        assertEquals(25, Calculator.add(a, b), 0.0);
    }
    //Віднімання
    @Test
    public void subtract() {
        int a = 25; int b = 20;
        int expectedResult = 5;
        double result = Calculator.subtract(a, b);
        assertEquals(expectedResult, result, 0.0);
    }
    //Множення
    @Test
    public void multiply() {
        int a = 10; int b = 25;
        long expectedResult = 250;
        double result = Calculator.multiply(a, b);
        assertEquals(expectedResult, result, 0.0);
    }
    //Ділення
    @Test
    public void division() {
        int a = 56; int b = 10;
        double expectedResult = 5.6;
        double result = Calculator.division(a, b);
        assertEquals(expectedResult, result,0.00005);
    }
    //Остача
    @Test
    public void findRemainder() {
        int a = 10; int b = 2;
        double expectedResult = 0;
        double result = Calculator.findRemainder(a, b);
        assertEquals(expectedResult, result,0.00005);
    }
    //Піднесення до степення
    @Test
    public void power() {
        int a = 2; int b = 3;
        double expectedResult = 8;
        double result = Calculator.power(a, b);
        assertEquals(expectedResult, result,0.00005);
    }
}
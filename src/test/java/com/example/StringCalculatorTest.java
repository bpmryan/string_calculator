package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {
    
    // declare at the class level
    private final StringCalculator calc = new StringCalculator();

    @Test
    public void testEmptyStringReturnsZero() {
        // assert that passing an empty string should return 0
        assertEquals(0, calc.add(""));
    }

    @Test
    public void testSingleNumberReturnsValue() {
        assertEquals(1, calc.add("1"));
    }

    @Test 
    public void testTwoNumbersCommmaSeparatedReturnsSum() {
        assertEquals(3, calc.add("1,2"));
    }

    @Test 
    public void testMultipleNumbersCommaSeparatedReturnsSum() {
        assertEquals(15, calc.add("1,2,3,4,5"));
    }

    @Test 
    public void testNewlinesBetweenReturnsSum() {
        assertEquals(6, calc.add("1\n2,3"));
    }

    @Test
    public void testCustomDelimiterReturnsSum() {
        assertEquals(3, calc.add("//;\n1;2"));
    }
}

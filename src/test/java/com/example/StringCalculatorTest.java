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
}

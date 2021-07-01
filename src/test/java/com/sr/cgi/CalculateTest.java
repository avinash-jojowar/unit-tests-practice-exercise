package com.sr.cgi;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculateTest {
    private static Calculate cal;

    @BeforeAll
    static void setUpAll() {
        cal = new Calculate();
    }

    @AfterAll
    static void tearDownAll() {
        cal = null;
    }

    @Test
    void givenTwoNumbersThenReturnSum() {
        int result = cal.addSum(15, 16);
        assertEquals(31, result);
    }

    @Test
    void givenEvenNumberThenReturnTrue() {
        boolean result = cal.isEven(28);
        assertTrue(result);
    }

    @Test
    void givenOddNumberThenReturnFalse() {
        boolean result = cal.isEven(31);
        assertFalse(result);
    }

}
package com.sr.cgi;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Locale;

import static org.junit.jupiter.api.Assertions.*;

class StringManipulationTest {
        private static StringManipulation strMan;

        @BeforeAll
        static void setUpAll() {
            strMan = new StringManipulation();
        }

        @AfterAll
        static void tearDownAll() {
            strMan = null;
        }

    @Test
    void givenStringWithVowelReturnVowelCount() {
        int result = strMan.vowelCount("Avinash Jojowar");
        assertEquals(6, result);
    }

    @Test
    void givenStringReturnStringLength() {
        int result = strMan.characterCount("Avinash");
        assertEquals(7, result);
    }


}
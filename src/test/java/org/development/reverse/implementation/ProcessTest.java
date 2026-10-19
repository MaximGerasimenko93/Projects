package org.development.reverse.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProcessTest {

    private final Process process = new Process();

    @Test
    void testReverse() {
        String result = process.reverse("String");
        String mock = "gnirtS";
        assertEquals(mock, result);
    }

    @Test
    void shouldReturnEmptyString() {
        String result = process.reverse("");
        String mock = "";
        assertEquals(mock, result);
    }

    @Test
    void shouldReturnOneSymbol() {
        String result = process.reverse("a");
        String mock = "a";
        assertEquals(mock, result);
    }

    @Test
    void shouldReturnStringWithOnlySymbolsOrDigits() {
        String result = process.reverse("'|'-123:456");
        String mock = "'|'-123:456";
        assertEquals(mock, result);
    }

    @Test
    void shouldReturnOnlyLetters() {
        String result = process.reverse("text");
        String mock = "txet";
        assertEquals(mock, result);
    }

    @Test
    void shouldReturnSymbolsOrDigitsOnSidesAndMiddle() {
        String result = process.reverse("1ab2cd3");
        String mock = "1dc2ba3";
        assertEquals(mock, result);
    }

    @Test
    void shouldReturnStringWithDifferentCase() {
        String result = process.reverse("MoTheR");
        String mock = "RehToM";
        assertEquals(mock, result);
    }
}
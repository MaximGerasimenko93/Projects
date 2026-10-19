package org.development.reverse.implementation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckerTest {

    private final Checker checker = new Checker();

    @Test
    void shouldReturnExceptionIfNullValue() {
        String text = null;
        assertThrows(IllegalArgumentException.class, () -> {
            checker.nullCheck(text);
        });
    }

    @Test
    void shouldReturnExceptionIfOnlyOneLetterValue() {
        String text = "a";
        assertThrows(IllegalArgumentException.class, () -> {
            checker.onlyOneLetterCheck(text);
        });
    }

    @Test
    void shouldReturnExceptionIfOnlyOneSymbolValue() {
        String text = "!";
        assertThrows(IllegalArgumentException.class, () -> {
            checker.onlyOneSymbolCheck(text);
        });
    }

    @Test
    void shouldReturnExceptionIfOnlyOneLetterInString() {
        String text = "123a123";
        assertThrows(IllegalArgumentException.class, () -> {
            checker.onlyOneLetterInStringCheck(text);
        });
    }

    @Test
    void shouldReturnExceptionIfEmptyString() {
        String text = "";
        assertThrows(IllegalArgumentException.class, () -> {
            checker.emptyStringCheck(text);
        });
    }
}
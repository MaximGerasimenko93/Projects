package org.development.reverse.implementation;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class InputTest {

    private final Scanner sc = new Scanner("Тест");
    private final Input input = new Input(sc);

    @Test
    void testGetInputText() {
        String result = input.getInputText();
        assertEquals("Тест", result);
    }
}
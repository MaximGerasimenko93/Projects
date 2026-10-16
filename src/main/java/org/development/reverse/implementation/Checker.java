package org.development.reverse.implementation;

import org.development.reverse.service.TextChecker;

public class Checker implements TextChecker {


    @Override
    public void nullCheck(String text) throws IllegalArgumentException {
        if (text == null) {
            throw new IllegalArgumentException("Строка не передана");
        }
    }

    @Override
    public void onlyOneLetterCheck(String text) throws IllegalArgumentException {
        if (text.length() == 1 && Character.isLetter(text.charAt(0))) {
            throw new IllegalArgumentException("Строка из одной буквы");
        }
    }

    @Override
    public void onlyOneSymbolCheck(String text) throws IllegalArgumentException {
        if (text.length() == 1 && !Character.isLetter(text.charAt(0))) {
            throw new IllegalArgumentException("Строка из одного символа");
        }
    }

    public void onlyOneLetterInStringCheck(String text) throws IllegalArgumentException {
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) {
                count++;
            }
        }
        if (count == 1) {
            throw new IllegalArgumentException("В строке всего одна буква");
        }
    }

    @Override
    public void emptyStringCheck(String text) throws IllegalArgumentException {
        if (text.isEmpty()) {
            throw new IllegalArgumentException("Передана пустая строка");
        }
    }
}


package org.development.reverse.service;

public interface TextChecker {

    void nullCheck(String text) throws IllegalArgumentException;

    void onlyOneLetterCheck(String text) throws IllegalArgumentException;

    void onlyOneSymbolCheck(String text) throws IllegalArgumentException;

    void onlyOneLetterInStringCheck(String text) throws IllegalArgumentException;

    void emptyStringCheck(String text) throws IllegalArgumentException;
}

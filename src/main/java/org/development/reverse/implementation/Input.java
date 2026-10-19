package org.development.reverse.implementation;

import org.development.reverse.service.TextReader;

import java.util.Scanner;

public class Input implements TextReader {

    private final Scanner sc;

    @Override
    public String getInputText() {
        System.out.println("Введите текст:");
        return sc.nextLine();
    }

    public Input(Scanner sc) {
        this.sc = sc;
    }
}
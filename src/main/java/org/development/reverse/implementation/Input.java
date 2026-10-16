package org.development.reverse.implementation;

import org.development.reverse.service.TextReader;

import java.util.Scanner;

public class Input implements TextReader {

    private final Scanner sc = new Scanner(System.in);

    @Override
    public String getInputText() {
        System.out.println("Введите текст:");
        return sc.nextLine();
    }
}
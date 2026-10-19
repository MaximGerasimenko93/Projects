package org.development.reverse.implementation;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Input input = new Input(new Scanner(System.in));
        Process process = new Process();
        Output output = new Output();
        Checker checker = new Checker();

        String inputText = input.getInputText();
        String reverse = process.reverse(inputText);
        checker.nullCheck(inputText);
        checker.onlyOneLetterCheck(inputText);
        checker.onlyOneLetterInStringCheck(inputText);
        checker.onlyOneSymbolCheck(inputText);
        checker.emptyStringCheck(inputText);
        System.out.println();
        System.out.println("Вывод текста:");
        output.getOutputText(reverse);
    }
}
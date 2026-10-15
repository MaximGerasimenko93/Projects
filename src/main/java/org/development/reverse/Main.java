package org.development.reverse;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Input input = new Input();
        Process process = new Process();
        Output output = new Output();

        String inputText = input.getInputText();
        String reverse = process.reverse(inputText);
        output.getOutputText(reverse);
    }
}

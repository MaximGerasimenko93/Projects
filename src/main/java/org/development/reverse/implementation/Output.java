package org.development.reverse.implementation;

import org.development.reverse.service.TextPrinter;

public class Output implements TextPrinter {

    @Override
    public void getOutputText(String text) {
        System.out.println(text);
    }
}
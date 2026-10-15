package org.development.reverse;

public class Output implements TextPrinter {

    @Override
    public void getOutputText(String text) {
        System.out.println(text);
    }
}

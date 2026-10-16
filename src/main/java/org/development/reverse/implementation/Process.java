package org.development.reverse.implementation;

import org.development.reverse.service.TextReverser;

public class Process implements TextReverser {

    @Override
    public String reverse(String text) {
        char[] charArray = text.toCharArray();
        int left = 0;
        int right = charArray.length - 1;

        while (left < right) {
            boolean leftIndex = Character.isLetter(charArray[left]);
            boolean rightIndex = Character.isLetter(charArray[right]);
            if (!leftIndex) {
                left++;
            } else if (!rightIndex) {
                right--;
            } else {
                char tmp = charArray[left];
                charArray[left] = charArray[right];
                charArray[right] = tmp;

                left++;
                right--;
            }
        }
        return new String(charArray);
    }
}
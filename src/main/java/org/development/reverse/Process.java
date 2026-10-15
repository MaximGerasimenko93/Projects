package org.development.reverse;

public class Process implements TextReverser {

    @Override
    public String reverse(String text) {
        Input input = new Input();
        char[] charArray = input.getInputText().toCharArray();
        int left = 0;
        int right = 0;

        while (left < right) {
            char tmp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = tmp;
            boolean leftIndex = Character.isLetter(charArray[left]);
            boolean rightIndex = Character.isLetter(charArray[right]);
            if (leftIndex) {
                continue;
            } else if (!leftIndex) {
                left++;
            } else if (rightIndex) {
                continue;
            } else if (!rightIndex) {
                right--;
            }
        }

        return new String(charArray);
    }
}

public class Solution {
    public String reverseWords(String inputString) {
        StringBuilder reversedString = new StringBuilder(inputString).reverse();
        reverseEachWord(reversedString, reversedString.length());
        return removeExtraSpaces(reversedString, reversedString.length());
    }

    private void reverseEachWord(StringBuilder strBuilder, int length) {
        int startIndex = 0;
        int endIndex = 0;

        while (startIndex < length) {
            while (startIndex < endIndex || (startIndex < length && strBuilder.charAt(startIndex) == ' '))
                ++startIndex;
            while (endIndex < startIndex || (endIndex < length && strBuilder.charAt(endIndex) != ' '))
                ++endIndex;
            reverse(strBuilder, startIndex, endIndex - 1);
        }
    }

    private String removeExtraSpaces(StringBuilder strBuilder, int length) {
        int i = 0;
        int j = 0;

        while (j < length) {
            while (j < length && strBuilder.charAt(j) == ' ')
                ++j;
            while (j < length && strBuilder.charAt(j) != ' ')
                strBuilder.setCharAt(i++, strBuilder.charAt(j++));
            while (j < length && strBuilder.charAt(j) == ' ')
                ++j;
            if (j < length)
                strBuilder.setCharAt(i++, ' ');
        }

        return strBuilder.substring(0, i).toString();
    }

    private void reverse(StringBuilder strBuilder, int leftIndex, int rightIndex) {
        while (leftIndex < rightIndex) {
            char temp = strBuilder.charAt(leftIndex);
            strBuilder.setCharAt(leftIndex++, strBuilder.charAt(rightIndex));
            strBuilder.setCharAt(rightIndex--, temp);
        }
    }
}


package Java.ReversePrefixString;

public class Solution {
    public static String reversePrefix(String word, char ch) {
        String realRes = "";
        int indexOfChar = -1;
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == ch && indexOfChar < 0) {
                indexOfChar = i;
            }
        }
        StringBuilder sb2;
        StringBuilder sb3;
        if (indexOfChar > 0) {
            sb2 = new StringBuilder(word.substring(0, indexOfChar + 1));
            sb3 = new StringBuilder(word.substring(indexOfChar + 1));
            realRes = sb2.reverse() + sb3.toString();
            return realRes;
        }
        return word;
    }

    public static void main(String[] args) {
        System.out.println(reversePrefix("abcdefd", 'd'));

    }
}
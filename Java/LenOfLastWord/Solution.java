package Java.LenOfLastWord;

import java.util.Objects;

public class Solution {

    public static int lengthOfLastWord(String s) {
        boolean wordComplete = false;
        boolean foundStart = false;

        StringBuilder sb = new StringBuilder();
        for (int i = s.length()-1; i >= 0; i--) {
            if (s.charAt(i) == ' ' && !foundStart){
                continue;
            }
            if (s.charAt(i) != ' ' && !foundStart) foundStart = true;
            if (s.charAt(i) == ' ' && foundStart) wordComplete = true;
            if (s.charAt(i) == ' ' && wordComplete) break;
            sb.append(s.charAt(i));
        }
        sb.trimToSize();
        sb.reverse();

        return sb.length();
    }

    public static void main(String[] args) {
        System.out.println(lengthOfLastWord("day    "));
    }
}

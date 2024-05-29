package Java.LongestPalindromeSubStr;


public class Solution {
    /*
    Leetcode Q#5 - Medium
    Given a string s, return the longest palindromic substring in s.
     */
    private static final String CASE_ONE = "babad";
    private static final String CASE_TWO = "cbbd";

    public static void main(String[] args) {
        System.out.println("Output of 'babad' -> " + longestPalindrome(CASE_ONE));
        //System.out.println("Output of 'cbbd' -> " + longestPalindrome(CASE_TWO));
    }

    public static String longestPalindrome(String s) {
        int startIdx = 0, endIdx = 0;
        String holder = "";

        for (int i = 0; i < s.length(); i++) {
            String oddLenPalindrome = helper(i, i, s);
            String evenLenPalindrome = helper(i, i + 1, s);
            if (oddLenPalindrome.length() >= holder.length()){
                holder = oddLenPalindrome;
            }
            if (evenLenPalindrome.length() >= holder.length()){
                holder = evenLenPalindrome;
            }
        }

        return holder;
    }

    public static String helper(int start, int end, String word) {
        while (start >= 0 && end < word.length() && word.charAt(start) == word.charAt(end)) {
            start--;
            end++;
        }
        return word.substring(start + 1, end);
    }
}
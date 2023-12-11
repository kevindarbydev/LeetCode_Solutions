package Java.LargestOddNumString;

public class Solution {
    // Leetcode daily #1903 - Easy

    public static String largestOddNumber(String num) {
        int lsf = Integer.MIN_VALUE;
        int convert = Integer.parseInt(num);
        if (convert % 2 != 0){
            return String.valueOf(convert);
        }

        for (int i = num.length() - 1; i >= 0; i--) {
            int iter = num.charAt(i);
            if (iter % 2 != 0){
                return num.substring(0,i+1);
            }
        }
       return "";
    }

    public static void main(String[] args) {
        String num = "52";

        String res = largestOddNumber(num);
        System.out.println("Output: " + res);
    }
}

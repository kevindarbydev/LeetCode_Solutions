package Java.RemoveKDigits;

import java.util.LinkedList;
/* Leetcode Daily 402. Remove K Digits
*
*   couldn't solve, solution w/ help of chatgpt
*  */
class Solution {
    public static String removeKdigits(String num, int k) {
        LinkedList<Character> stack = new LinkedList<>();
        for (char digit : num.toCharArray()){
            while(!stack.isEmpty() && k > 0 && stack.peekLast() > digit){
                stack.removeLast();
                k--;
            }
            stack.addLast(digit);
        }

        while (k > 0){ // k == amount needed to remove, remove until 0
            stack.removeLast();
            k--;
        }



        StringBuilder sb = new StringBuilder();
        boolean leadingZero = true; // boolean flag to skip leading zero
        for (char digit : stack) {
            if (leadingZero && digit == '0') {
                continue;
            }
            leadingZero = false; // only concerned w 1st char
            sb.append(digit);
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(removeKdigits("1432219", 3));

    }
}
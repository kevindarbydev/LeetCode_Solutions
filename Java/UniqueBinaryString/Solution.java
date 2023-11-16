package Java.UniqueBinaryString;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    private String res = "";

    public String findDifferentBinaryString(String[] nums) {
        Set<String> unique = new HashSet<>();
        for (String num : nums) {
            unique.add(num);
        }
        helper(nums[0], unique, 0);
        return res;
    }

    public void helper(String curr, Set<String> unique, int index) {
        if (!unique.contains(curr)) {
            res = curr;
            return;
        }
        int len = curr.length();
        if (len == index) return;

        char[] charArr = curr.toCharArray();
        charArr[index] = '1';
        helper(new String(curr), unique, index + 1);
        charArr[index] = '0';
        helper(new String(curr), unique, index + 1);
    }
}

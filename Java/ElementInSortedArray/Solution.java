package Java.ElementInSortedArray;

import java.util.Collection;
import java.util.HashMap;

public class Solution {
    // Leetcode daily - #1287 - Easy

    public static int findSpecialInteger(int[] arr){
        int len = arr.length;
        int threshold = len / 4;

        for (int i = 0; i < len - threshold; i++) {
            if (arr[i] == arr[i + threshold]) return arr[i];
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12};
        int res = findSpecialInteger(arr);

        System.out.println("Output: " + res);
    }
}


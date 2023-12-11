package Java.ElementInSortedArray;

import java.util.Collection;
import java.util.HashMap;

public class Solution {
    // Leetcode daily - #1287 - Easy

    public static int findSpecialInteger(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.merge(arr[i],1, Integer::sum);
        }

        int hsf = Integer.MIN_VALUE;
        int hvsf = Integer.MIN_VALUE;
        for (int x : map.keySet()){
            int currVal = map.get(x);
            if (currVal > hvsf){
                hsf = x;
                hvsf = map.get(x);
            }
        }

        return hsf;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,1,1,1,1,2,3,4,5,6,7,8,9,10,11,12,12,12,12};
        int res = findSpecialInteger(arr);

        System.out.println("Output: " + res);
    }
}


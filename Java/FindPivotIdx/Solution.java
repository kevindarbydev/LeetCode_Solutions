package Java.FindPivotIdx;

import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        int[] input1 = {1,7,3,6,5,6};
        System.out.println(pivotIndex(input1));
    }
    public static int pivotIndex(int[] nums){
        int sumOfLeft = 0, sumOfRight = 0;
        int total = 0;
        for (int x : nums) {
            total += x;
        }
        for (int i = 0; i < nums.length; i++) {
            sumOfRight = total - sumOfLeft - nums[i];
            if (sumOfRight == sumOfLeft) return i;

            sumOfLeft += nums[i];
        }



        return -1;
    }
}

package Java.MaxNumOfKSumPairs;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] input = { 1, 2, 3, 4 };
        maxOperations(input, 5);
    }


    public static int maxOperations(int[] nums, int k) {
        int countOfPairs = 0;
        Arrays.sort(nums);

        int farSide = nums.length - 1;
            for (int i = 0; i <nums.length; i++){

                for (int j = farSide; j < nums.length; j--) {
                    if (nums[i] + nums[j] == k){
                       countOfPairs++;
                       continue;
                    }
                }
            }

        return countOfPairs;
    }
}

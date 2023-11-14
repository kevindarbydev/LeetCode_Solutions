package Java.ContainsDuplicateII;

import java.util.Hashtable;

public class Solution {

    public static void main(String[] args) {
        int[] input = { 1, 2, 3, 1 };
        boolean output = containsNearbyDuplicate(input, 3);

        System.out.println(output);
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Hashtable<Integer, Integer> table = new Hashtable<>();

        for (int i = 0; i < nums.length; i++) {
            if (table.containsKey(nums[i])){
                int lastIndex = table.get(nums[i]);
                if (Math.abs(i - lastIndex) <= k){
                    return true;
                }
            }
            table.put(nums[i], i);

        }

        return false;
    }
}

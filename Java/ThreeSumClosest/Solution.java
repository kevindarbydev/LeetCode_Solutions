package Java.ThreeSumClosest;

import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        int[] input = {-1, 2, 1, -4};
        System.out.println(threeSumClosest(input, 1));
    }

    public static int threeSumClosest(int[] nums, int target) {
        int csf = Integer.MAX_VALUE; // closest so far
        int n = nums.length;
        int sum = 0;
        int diff = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        if (n == 3){
           return nums[0] + nums[1] + nums[2];
        }

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    sum = nums[i] + nums[j] + nums[k];
                    map.put(k, sum);
                }
            }
        }
        for (int i = 0; i < map.size(); i++) {
            if (map.get(i) - target < csf){
                csf = map.
            }

        }

        return csf;
    }
}

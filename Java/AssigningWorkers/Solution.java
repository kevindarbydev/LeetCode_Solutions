package Java.AssigningWorkers;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) {
        int[] diff = {2,4,6,8,10};
        int[] profit = {10,20,30,40,50};
        int[] worker = {4,5,6,7};
        System.out.println(maxProfitAssignment(diff,profit,worker));
    }
    //june 18th leetcode daily, #826 (Medium) Most Profit Assigning Work
    //couldnt solve on my own, solution is partly from chatgpt
    public static int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int numOfJobs = difficulty.length;

        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < numOfJobs; i++) {
            map.put(difficulty[i], Math.max(map.getOrDefault(difficulty[i], 0), profit[i]));
        }

        int maxProfit = 0;
        for (int key : map.keySet()) {
            maxProfit = Math.max(maxProfit, map.get(key));
            map.put(key, maxProfit);
        }

        Arrays.sort(worker);

        int totalProfit = 0;

        for (int ability : worker) {
            Map.Entry<Integer, Integer> entry = map.floorEntry(ability);
            if (entry != null) {
                totalProfit += entry.getValue();
            }
        }

        return totalProfit;
    }


}

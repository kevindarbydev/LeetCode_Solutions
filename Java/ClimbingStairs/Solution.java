package Java.ClimbingStairs;

public class Solution {
    public static int minCostClimbingStairs(int[] cost) {
        int startIdx;
        int totalCost = 0;

        if (cost[0] <= cost[1]) {
            startIdx = 0;
        } else startIdx = 1;

        int givenCost;
        for (int i = startIdx; i < cost.length -1;) {
            if (i == cost.length -1 || i == cost.length -2){
                return totalCost;
            }
            int steps = determineStepCount(i, cost);
            totalCost+= cost[i + steps];
            i = i + steps;
        }

        return totalCost;
    }
    //130/269 test cases
    public static void main(String[] args) {
        int[] input = {1,100,1,1,1,100,1,1,100,1};
        int[] input2 = {10,15,20};
        int[] input3 = {0,1,1,1};
        System.out.println(minCostClimbingStairs(input));
    }


    public static int determineStepCount(int givenIdx, int[] cost) {
        if (cost.length <= 3) {
            if (givenIdx + 1 >= cost.length - 1) {
                return 1;
            } //else return 2;
        }
        if (cost[givenIdx + 1] < cost[givenIdx + 2]) {
            return 1;
        } else if (cost[givenIdx + 1] == cost[givenIdx + 2]){
            return 1;
        } else {
            return 2;
        }
    }

}
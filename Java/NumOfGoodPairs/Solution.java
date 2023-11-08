package Java.NumOfGoodPairs;

import java.util.ArrayList;
import java.util.Objects;

public class Solution {

    public static int numIdenticalPairs(int[] nums) {
        int countOfPairs = 0;

        ArrayList<int[]> pairsEncountered = new ArrayList<>();
        try {
            for (int i = 0; i < nums.length; i++) {
                for (int j = 1; j < nums.length; j++) {
                    int[] pair = new int[2];
                    pair[0] = i;
                    pair[1] = j;
                    if (Objects.equals(nums[i], nums[j])){
                        if (i < j){
                            if (!pairsEncountered.contains(pair)) {
                                countOfPairs++;

                                pairsEncountered.add(pair);
                            }
                        }
                    }

                }

            }
        } catch (IndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }
        return countOfPairs;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,1,1,3};

        System.out.println(numIdenticalPairs(nums));
    }
}

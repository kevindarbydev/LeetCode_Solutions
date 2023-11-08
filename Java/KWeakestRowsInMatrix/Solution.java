package Java.KWeakestRowsInMatrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

class Solution {
    public static int[] kWeakestRows(int[][] mat, int k) {
        //arraylist with 2 nums in ea array, first num is row index, second num is count of 1s
        //could also do hashmap K is index, V is count
        //find out which is better memory-wise
        ArrayList<int[]> soldiersPerRow = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int[][] strengths = new int[mat.length][2];

        for (int i = 0; i < mat.length; i++) {
            int count = 0;
            for (int j = 0; j < mat[1].length; j++) {
                if (Objects.equals(mat[i][j], 1)){
                    count++;
                }

            }
            System.out.println("Row " + i + " finished, count: " + count);
            strengths[i][0] = count;
            strengths[i][1] = i;
            map.put(i,count);
        }
        Arrays.sort(strengths, (a,b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);

        int[] res = new int[k];
        for (int i = 0; i < k; ++i){
            res[i] = strengths[i][1];
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] mat = { {1,1,0,0,0}, {1,1,1,1,0}, {1,0,0,0,0}, {1,1,0,0,0}, {1,1,1,1,1} };
        kWeakestRows(mat, 2);
    }
}

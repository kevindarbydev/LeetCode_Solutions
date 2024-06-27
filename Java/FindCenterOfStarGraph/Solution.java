package Java.FindCenterOfStarGraph;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        int[][] input = {{1,2}, {5,1}, {1,3}, {1,4}};

        System.out.println(findCenter(input));
    }

    public static int findCenter(int[][] edges) {
        ArrayList<Integer> numStore = new ArrayList<>(2);
        int result = 0;
        for (int i = 0; i < edges.length; i++) {
            if (numStore.isEmpty()){
                numStore.add(edges[i][0]);
                numStore.add(edges[i][1]);
            } else {
                if (numStore.contains(edges[i][0]) && !numStore.contains(edges[i][1])){
                    result = edges[i][0];
                } else result = edges[i][1];
            }
        }
        return result;
    }
}
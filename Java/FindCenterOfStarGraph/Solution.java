package Java.FindCenterOfStarGraph;

public class Solution {
    public static void main(String[] args) {
        int[][] input = {{1, 2}, {5, 1}, {1, 3}, {1, 4}};

        System.out.println(findCenter(input));
    }

    //dont need a loop, can look at first 2 elements, and compare with 2nd set of elements
    //whichever number matches is the center
    public static int findCenter(int[][] edges) {
        int numOne = edges[0][0];
        int numTwo = edges[0][1];
        return (edges[1][0] == numOne || edges[1][0] == numTwo) ? edges[1][0] : edges[1][1];
    }
//    public static int findCenter(int[][] edges) {
//        ArrayList<Integer> numStore = new ArrayList<>(2);
//        int result = 0;
//        for (int i = 0; i < edges.length; i++) {
//            if (numStore.isEmpty()){
//                numStore.add(edges[i][0]);
//                numStore.add(edges[i][1]);
//            } else {
//                if (numStore.contains(edges[i][0]) && !numStore.contains(edges[i][1])){
//                    result = edges[i][0];
//                } else result = edges[i][1];
//            }
//        }
//        return result;
//    }
}
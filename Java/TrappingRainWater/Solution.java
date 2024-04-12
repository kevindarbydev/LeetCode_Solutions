package Java.TrappingRainWater;

import java.util.HashMap;

class Solution {
/*
Leetcode Daily April 12 2024
42. Trapping Rain Water
Given n non-negative integers representing an elevation map where
the width of each bar is 1, compute how much water it can trap
after raining.

First leetcode Hard question - no chatgpt
*/

    //solves first 2 examples, and 26/320 test cases
    // probably need a different approach
    public static int trap(int[] height) {
        int rainCollectable = 0;
        boolean trappable = false;
        boolean isFirstPass = true;
        int previousNum = 0;
        int heightOfLeftWall = 0;
        for (int i = 0; i < height.length; i++) {
            if (!isFirstPass){
                if (height[i] < previousNum  && !trappable && heightOfLeftWall != 0){
                    heightOfLeftWall = height[i];
                    trappable = true;
                    rainCollectable++;
                } else if (heightOfLeftWall <= height[i]){
                    trappable = false;
                } else if (trappable){
                    int amountToAdd = heightOfLeftWall - height[i];
                    rainCollectable+=amountToAdd;
                }
            } else{
                isFirstPass = false;
                if (height[i] > 0){
                    heightOfLeftWall = height[i];
                    trappable = true;
                }
            }
            previousNum = height[i];


        }

        return rainCollectable;
    }



    public static void main(String[] args) {
        System.out.println(trap(new int[]{4,2,0,3,2,5}));

    }

    //    public static int trapHashmapSolution(int[] height){
//        HashMap<Integer,Integer> valueStore = new HashMap<>();
//        int rainCollectable = 0;
//        int heightOfLeftWall = 0;
//        boolean isFirstPass = true;
//        for (int i = 0; i < height.length; i++) {
//            valueStore.put(i,height[i]);
//        }
//
//        for (int i = 0; i < valueStore.size(); i++) {
//            if (isFirstPass){
//                if (valueStore.get(i) > 0){
//                    heightOfLeftWall = valueStore.get(i);
//                }
//                isFirstPass = false;
//                continue;
//            }
//            if (heightOfLeftWall != 0) {
//                if (valueStore.get(i) < heightOfLeftWall) {
//                    int amountToAdd = heightOfLeftWall - valueStore.get(i);
//                    rainCollectable += amountToAdd;
//                }
//            }
//
//        }
//        return rainCollectable;
//    }
}
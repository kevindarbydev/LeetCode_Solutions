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
    // update 5/13, now solves 39/322
    // 5/29 - 44/322

    public static int trap(int[] height) {
        int rainCollectable = 0;
        boolean trappable = false;
        int heightOfLeftWall = 0;
        for (int i = 0; i < height.length; i++) {
            if (!trappable) {
                if (height[i] > 0) {
                    heightOfLeftWall = height[i];
                    if (i != height.length -1) {
                        if (checkAhead(height, i, i + 1)) {
                            trappable = true;
                        }
                    }
                }
            } else {
                if (heightOfLeftWall > height[i]) {
                    rainCollectable += heightOfLeftWall - height[i];
                } else {

                    if (height[i] > heightOfLeftWall){
                        continue;
                    } else if (height[i] < heightOfLeftWall){
                        heightOfLeftWall = height[i];
                        rainCollectable += height[i] - heightOfLeftWall;

                    }


                    if (i != height.length -1) {
                        if (checkAhead(height, i, i + 1)) {
                            trappable = false;
                        }
                    } else trappable = false;
                }
            }
        }

        return rainCollectable;
    }

    public static boolean checkAhead(int[] arr, int currentIndex, int indexToCheck) {
        return arr[currentIndex] > arr[indexToCheck];
    }

    public static void main(String[] args) {
      System.out.println("output of 0102 array: " + trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));

    }
}

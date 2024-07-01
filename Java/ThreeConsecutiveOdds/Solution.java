package Java.ThreeConsecutiveOdds;

public class Solution {
    /*
    July 1st Daily, #1550. Three Consecutive Odds
    Given an integer array arr, return true if there
    are three consecutive odd numbers in the array.
    Otherwise, return false.


    0ms runtime, beats 100% of solutions
     */
    public static void main(String[] args) {

    }
    public boolean threeConsecutiveOdds(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (counter >= 3) return true; //return early if there are 3 consecutive
            if (arr[i] % 2 != 0){
                counter++;
            } else {
                counter = 0;
            }
        }
        return (counter >= 3);
    }
}
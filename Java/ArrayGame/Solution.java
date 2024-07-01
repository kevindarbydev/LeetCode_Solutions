package Java.ArrayGame;

import java.util.HashMap;
import java.util.LinkedList;

public class Solution {
    /*
    July 1st, #1535 Medium Find the Winner of an Array Game

    Given an integer array arr of distinct integers and an integer k.
    A game will be played between the first two elements of the array
    (i.e. arr[0] and arr[1]). In each round of the game, we compare
     arr[0] with arr[1], the larger integer wins and remains at position
     0, and the smaller integer moves to the end of the array.

    The game ends when an integer wins k consecutive rounds.
    Return the integer which will win the game.
    It is guaranteed that there will be a winner of the game.


     */
    public static void main(String[] args) {
        int[] input = {2,1,3,5,4,6,7};
        System.out.println(getWinner(input, 2));
    }

    public static int getWinner(int[] arr, int k) {
        //hashmap, each time it encounters a new value at arr[0],
        // add it to hashmap, increment counter when encountered again
        //after loop, look for the key that has a value >= k
        HashMap<Integer,Integer> map = new HashMap<>();
        int frontElement = 0;
        int counter = 0;
        while (true){
            if (arr[0] > arr[1]){

            }
            // if k is reached
            break;
        }

        return frontElement;
    }
//    public static int getWinner(int[] arr, int k) {
//        //hashmap, each time it encounters a new value at arr[0],
//        // add it to hashmap, increment counter when encountered again
//        //after loop, look for the key that has a value >= k
//
//        LinkedList<Integer> list = new LinkedList<>();
//        HashMap<Integer,Integer> map = new HashMap<>();
//        int frontElement = 0;
//        int counter = 0;
//        for (int i = 1; i < arr.length; i++) {
//
//            // frontElement = arr[0];
//            if (arr[0] > arr[1]){
//                int temp = arr[1];
//            } else {
//
//            }
//
//            if (counter >= k) return frontElement;
//        }
//
//        return frontElement;
//    }
}

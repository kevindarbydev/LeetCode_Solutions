package Java.ProductOfArrayExceptSelf;

/*
 * Given an integer array nums, return an array answer such
 * that answer[i] is equal to the product of all the elements
 * of nums except nums[i]. The product of any prefix or suffix
 *  of nums is guaranteed to fit in a 32-bit integer.You must
 *  write an algorithm that runs in O(n) time and without
 * using the division operation.
 * */
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] leftProducts = new int[n];
        int[] rightProducts = new int[n];
        int[] answer = new int[n];

        leftProducts[0] = 1;
        for (int i = 1; i < n; i++) {
            leftProducts[i] = leftProducts[i - 1] * nums[i - 1];
        }

        rightProducts[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            rightProducts[i] = rightProducts[i + 1] * nums[i + 1];
        }

        for (int i = 0; i < n; i++) {
            answer[i] = leftProducts[i] * rightProducts[i];
        }

        return answer;
    }

    public static void main(String[] args) {

    }
}
package Java.AverageWaitingTime;

public class Solution {
    /*
    Medium - 1701. Average Waiting Time

There is a restaurant with a single chef. You are given an array customers,
where customers[i] = [arrivali, timei]: arrivali is the arrival time of the ith customer.
The arrival times are sorted in non-decreasing order.
timei is the time needed to prepare the order of the ith customer.
When a customer arrives, he gives the chef his order, and the chef
starts preparing it once he is idle. The customer waits till the chef
finishes preparing his order. The chef does not prepare food for more than
one customer at a time. The chef prepares food for customers in the order they were given in the input.

Return the average waiting time of all customers. Solutions within 10  -5 from the actual answer are considered accepted.

     */
    public static void main(String[] args) {
        int[][] input = {{1, 2}, {2, 5}, {4, 3}};
        int[][] input2 = {{5, 2}, {5, 4}, {10, 3}, {20, 1}};
        int[][] input3 = {{2, 3}, {6, 3}, {7, 5}, {11, 3}, {15, 2}, {18, 1}};
        System.out.println(averageWaitingTime(input3));
    }

    // my solution is a bit janky, but it works
    // 3ms, beats 93%
    // no google no chatgpt
    public static double averageWaitingTime(int[][] customers) {
        double avg = 0;
        int firstArrival = -1;
        int givenArrival = 0;
        int newTime = 0;
        int givenTime = 0;
        int totalTime = 0;
        double[] timeTaken = new double[customers.length]; // store time taken for each, calculate avg after loop
        for (int i = 0; i < customers.length; i++) {
            givenArrival = customers[i][0];
            givenTime = customers[i][1];
            if (firstArrival < 0) {
                firstArrival = customers[i][0];
                totalTime += givenArrival + givenTime;
                timeTaken[i] = totalTime - givenArrival;
            } else {
                if (givenArrival > totalTime) {
                    totalTime = givenArrival + givenTime;
                    timeTaken[i] = givenTime;
                } else {
                    totalTime = newTime + givenTime;
                    timeTaken[i] = totalTime - givenArrival;
                }
            }
            newTime = totalTime;
        }
        for (double time : timeTaken) {
            avg += time;
        }

        return avg / customers.length;
    }
}

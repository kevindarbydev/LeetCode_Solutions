package Java.NumOfRecentCalls;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public static void main(String[] args) {
        RecentCounter obj = new RecentCounter();
        int param_1 = obj.ping(1);
    }

}
class RecentCounter {
    private int counter;
    private Queue<Integer> tsQueue; //timestamp queue
    public RecentCounter() {
        tsQueue = new LinkedList<>();
        counter = 0;
    }

    public int ping(int t) {
        tsQueue.add(t);

        int range = t - 3000;
        while (!tsQueue.isEmpty() && tsQueue.peek() < range){
            tsQueue.poll();
        }
        return tsQueue.size();
    }
}

package Java.NumOfRecentCalls;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    public static void main(String[] args) {
        RecentCounter obj = new RecentCounter();
        int param_1 = obj.ping(1);
    }

}
class RecentCounter {
    private Deque<Integer> tsDeque; //timestamp dequeue
    public RecentCounter() {
        tsDeque = new LinkedList<>();
    }

    public int ping(int t) {
        tsDeque.add(t);

        int range = t - 3000;
        while (!tsDeque.isEmpty() && tsDeque.peekFirst() < range){
            tsDeque.removeFirst();
        }
        return tsDeque.size();
    }
}

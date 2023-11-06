package Java.SeatManager;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Solution {
    public static void main(String[] args) {
        SeatManager obj = new SeatManager(5);
        int param_1 = obj.reserve();
        obj.unreserve(1);
        int param_2 = obj.reserve();
        int param_3 = obj.reserve();
        int param_4 = obj.reserve();
        int param_5 = obj.reserve();

        System.out.println("Output: " + param_1 + param_2 + param_3 + param_4 + param_5);
    }
}
class SeatManager {
    LinkedHashMap<Integer, Boolean> map = new LinkedHashMap<>();

    PriorityQueue<Integer> tablesAvail = new PriorityQueue<>();

    final int CAPACITY;
    int lastTableReserved = 0;

    public SeatManager(int n) {

        for (int i = 1; i <= n; i++) {
            map.put(i, false);
        }
        CAPACITY = n;
    }

    public int reserve() {
        if (map.isEmpty()){ return -1;}
        if (!tablesAvail.isEmpty()){
            int seat = tablesAvail.poll();
            map.put(seat,true);
            return seat;
        }
        for (int i = lastTableReserved + 1; i <= CAPACITY; i++){
            if (!map.get(i)){
                map.put(i,true);
                lastTableReserved = i;
                return i;
            }
        }
        return -1;
    }

    public void unreserve(int seatNumber) {
        tablesAvail.add(seatNumber);
        map.put(seatNumber, false);
    }
}

//public class Solution {
//

//
//    static class SeatManager {
//        LinkedHashMap<Integer, Boolean> map = new LinkedHashMap<>();
//
//        PriorityQueue<Integer> tablesAvail = new PriorityQueue<>();
//
//        final int CAPACITY;
//
//        int lastTableSat = 1;
//
//        public SeatManager(int n) {
//            map = IntStream.range(1, n + 1)
//                    .boxed()
//                    .collect(Collectors.toMap(i -> i, i -> false, (a, b) -> b, LinkedHashMap::new));
//            CAPACITY = n;
//        }
//
//
//        public int reserve() {
//            if (map.isEmpty()){ return -1;}
//            if (!tablesAvail.isEmpty()){
//                return tablesAvail.poll();
//            }
//            if (!map.get(lastTableSat)){
//                map.put(lastTableSat, true);
//                return lastTableSat;
//            }
//            for (int i = lastTableSat; i <= CAPACITY; i++){
//                if (!map.get(i)){
//                    map.put(i,true);
//                    lastTableSat = i;
//                    return i;
//                }
//            }
//            return -1;
//        }
//
//        public void unreserve(int seatNumber) {
//           tablesAvail.add(seatNumber);
//        }
//    }
//}


package Java.TimeNeededToBuyTickets;

public class Solution {
    /* Leetcode daily #2073 Time Needed to Buy Tickets */
    public static void main(String[] args) {
        int[] tickets = {5,1,1,1};
        System.out.println(timeRequiredToBuy(tickets, 0));
    }

    public static int timeRequiredToBuy(int[] tickets, int k) {
        int ticketsBought = 0; // each ticket = 1s
        for (int i = 0; tickets[k] > 0; i++) {
            if (i == tickets.length){
                i = 0;
            }
            if (tickets[i] == 0) {
                continue;
            }
            tickets[i] -= 1;
            ticketsBought++;
        }

        return ticketsBought;
    }

//    public int timeRequiredToBuy(int[] tickets, int k) {
//        int ticketsBought = 0; // each ticket = 1s
//        int counter = 0;
//        int lastIndex = tickets.length;
//
//        int[] copy = tickets;
//        while (true) {
//            tickets[counter] -= 1;
//            ticketsBought++;
//            counter++;
//            if (tickets[counter] == 0 && counter != k){
//
//            }
//            if (tickets[k] == 0) {
//                return ticketsBought;
//            } else if (counter == lastIndex) {
//                counter = 0;
//            }
//        }
//    }

}

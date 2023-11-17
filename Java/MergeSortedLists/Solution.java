package Java.MergeSortedLists;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {

    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1.next == null || list2.next == null) return new ListNode();

        ListNode output = new ListNode(0);
        ListNode curr = output;

        while (list1 != null || list2 != null){
            if (list2 == null || (list1 != null && list1.val < list2.val)){
                curr.next = new ListNode(list1.val);
                list1 = list1.next;
                curr = curr.next;
            } else if (list1==null || (list2 != null && list2.val < list1.val)){
                curr.next = new ListNode(list2.val);
                list2 = list2.next;
                curr = curr.next;
            } else{
                curr.next = new ListNode(list1.val);
                curr.next.next = new ListNode(list2.val);
                curr = curr.next.next;
                list1 = list1.next;
                list2 = list2.next;
            }
        }

        return output.next;
    }



    class ListNode{
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val;}
        ListNode(int val, ListNode next) { this.val = val; this.next = next;}
    }
}

package Java.ReverseLinkList;

import java.util.ArrayList;
import java.util.Objects;

public class Solution {
    public static void main(String[] args) {
        ListNode x = new ListNode(1);
        ListNode y = new ListNode(2);
        ListNode a = new ListNode(3);
        ListNode b = new ListNode(4);
        ListNode c = new ListNode(5);
        x.next = y;
        y.next = a;
        a.next = b;
        b.next = c;
        System.out.println(reverseList(x));
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null) return new ListNode();

        ArrayList<ListNode> nodeArr = new ArrayList<>();
        while (head != null){
            nodeArr.add(new ListNode(head.val));
            head = head.next;
        }

        ListNode newHead = nodeArr.get(nodeArr.size() -1); // get the last node, becomes first
        ListNode current = newHead;

        // i = size - 2 , since we already got the node at -1 in newHead
        for (int i = nodeArr.size() - 2; i >= 0; i--) {
           current.next = nodeArr.get(i);
           current = current.next;
        }
        System.out.println(Objects.toString(newHead));
        return newHead;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}

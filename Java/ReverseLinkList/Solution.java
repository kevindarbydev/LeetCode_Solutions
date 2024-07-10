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
        System.out.println("Printing list before");
        printList(x);
        reverse(x);
        System.out.println("Printing list after");
        printList(a);

    }
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + ",");
            node = node.next;
        }
        System.out.println();
    }

    public static ListNode reverseList(ListNode head) {
        if (head == null) return null;

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

        return newHead;
    }
    public static ListNode reverse(ListNode head) {
        ListNode current = head;
        ListNode next = null;
        ListNode prev = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;

            current = next;
        }
        head = prev;
        return head;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}

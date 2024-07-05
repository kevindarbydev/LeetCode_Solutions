package Java.AddTwoNumbers;

public class Solution {
    /*
    LeetCode Medium - #2 Add Two Numbers

    You are given two non-empty linked lists representing two non-negative integers.
    The digits are stored in reverse order, and each of their nodes contains a single
     digit. Add the two numbers and return the sum as a linked list.

    You may assume the two numbers do not contain any leading zero, except the number 0 itself.

     */
    public static void main(String[] args) {
        ListNode l1b = new ListNode(3);
        ListNode l1a = new ListNode(4, l1b);
        ListNode l1 = new ListNode(2,l1a);

        ListNode l2b = new ListNode(4);
        ListNode l2a = new ListNode(6, l2b);
        ListNode l2 = new ListNode(5,l2a);
        addTwoNumbers(l1,l2);
    }
    public static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + ",");
            node = node.next;
        }
        System.out.println();
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1.next == null && l2.next == null){
            return new ListNode(l1.val + l2.val);
        }
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        while (l1 != null){
            sb1.append(l1.val);
            l1 = l1.next;
        }
        while (l2 != null) {
            sb2.append(l2.val);
            l2 = l2.next;
        }
        System.out.println("sb1 -> " + sb1.reverse());
        System.out.println("sb2 -> " + sb2.reverse());

        int total = Integer.parseInt(String.valueOf(sb1.reverse())) + Integer.parseInt(String.valueOf(sb2.reverse()));
        String totalAsString = String.valueOf(total);

        ListNode newHead = null;
        ListNode current = null;

        for (int i = totalAsString.length()-1; i >= 0; i--) {
            int digit = Character.getNumericValue(totalAsString.charAt(i));
            ListNode newNode = new ListNode(digit);
            if (newHead == null) { //first pass
                newHead = newNode;
                current = newNode;
            } else {
                current.next = newNode;
                current = newNode;
            }
        }
        System.out.println("printing");
        printList(newHead);
        return newHead;
    }


}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) {this.val = val;}
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
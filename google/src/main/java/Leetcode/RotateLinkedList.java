package Leetcode;

public class RotateLinkedList {
    public static ListNode rotateRight(ListNode head, int k) {
        //base case
        if (head == null || head.next == null) return head;
        int size = 0;
        ListNode temp = head;
        //reach the last node
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = head;//7->1
        //n=6
        k = k % size;
        int jump = size - k;//6-2=4
        temp = head;
        while (jump > 0) {
            temp = temp.next;
        }
        ListNode preveous = temp.next;//6
        temp.next = null;
        return preveous;
    }

    ListNode head;

    public ListNode insert(int data) {
        ListNode node = new ListNode(data, null);
        node.val = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            ListNode n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
        return node;
    }

    public int show(ListNode n) {
        n = head;
        while (n.next != null) {
            n = n.next;
            return n.val;

        }
        return n.val;
    }

    public static void main(String[] args) {
        ListNode head = null;
        RotateLinkedList listNode = new RotateLinkedList();
        head = listNode.insert(1);
        head = listNode.insert(2);
        head = listNode.insert(3);
        head = listNode.insert(4);
        head = listNode.insert(5);
        listNode.show(head);

        head = RotateLinkedList.rotateRight(head, 2);
        listNode.show(head);

    }

}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
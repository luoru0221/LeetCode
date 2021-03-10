import java.util.List;

public class LeetCode61 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        }

        int len = 0;
        //求出链表长度
        ListNode node = head;
        ListNode tail = head;//尾结点
        while (node != null) {
            len++;
            tail = node;
            node = node.next;
        }
        //需要移动的结点数
        int n = k % len;

        if (len == 1 || n == 0) {
            return head;
        }


        ListNode first = head;
        ListNode second = head.next;
        ListNode fast = head.next;

        for (int i = 0; i < n; i++) {
            fast = fast.next;
        }

        while (fast != null) {
            fast = fast.next;
            first = first.next;
            second = second.next;
        }

        first.next = null;
        tail.next = head;
        return second;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}

public class LeetCode19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        //在头结点前添加一个空结点，方便当删除的结点是头结点时不需要特殊讨论
        ListNode empty = new ListNode();
        empty.next = head;

        ListNode first = head;
        ListNode second = empty;

        //第一个指针先移动n步
        for (int i = 0; i < n; i++) {
            first = first.next;
        }

        //第一个指针遍历到尾
        while (first != null) {
            first = first.next;
            second = second.next;
        }

        second.next = second.next.next;

        return empty.next;
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

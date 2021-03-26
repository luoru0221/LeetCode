/**
 * @author RuL
 */
public class LeetCode23 {

    public ListNode mergeKLists(ListNode[] lists) {
        int len = lists.length;
        ListNode ans = null;
        if (len > 0) {
            ans = lists[0];
        }
        for (int i = 1; i < len; i++) {
            ans = mergeTwoLists(ans, lists[i]);
        }
        return ans;
    }

    public ListNode mergeTwoLists(ListNode head1, ListNode head2) {
        ListNode head = new ListNode(); //头结点简化操作
        ListNode point = head;

        while (head1 != null && head2 != null) {
            if (head1.val < head2.val) {
                point.next = head1;
                head1 = head1.next;
            } else {
                point.next = head2;
                head2 = head2.next;
            }
            point = point.next;
        }

        while (head1 != null) {
            point.next = head1;
            head1 = head1.next;
            point = point.next;
        }

        while (head2 != null) {
            point.next = head2;
            head2 = head2.next;
            point = point.next;
        }
        return head.next;
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

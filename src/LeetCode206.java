/**
 * @author RuL
 */
public class LeetCode206 {
    public ListNode reverseList(ListNode head) {

        if (head == null) {
            return null;
        }

        ListNode front = null;
        ListNode middle = head;
        ListNode post = head.next;

        while (post != null) {
            middle.next = front;

            front = middle;
            middle = post;
            post = post.next;
        }

        middle.next = front;
        return middle;
    }

    public static class ListNode {
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

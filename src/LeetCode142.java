/**
 * @author RuL
 */
public class LeetCode142 {
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        ListNode meet = null;

        while (fast != null) {
            if (fast.next == null) {
                return null;
            }
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) {
                meet = fast;

                while (head != meet) {
                    head = head.next;
                    meet = meet.next;
                }
                return head;
            }
        }
        return null;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}

/**
 * @author RuL
 */
public class LeetCode160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) {
            return null;
        }

        ListNode pointA = headA;
        ListNode pointB = headB;

        while (pointA != pointB) {
            pointA = pointA == null ? headB : pointA.next;
            pointB = pointB == null ? headA : pointB.next;
        }
        return pointA;
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}

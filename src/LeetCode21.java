public class LeetCode21 {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode point1 = l1;
        ListNode point2 = l2;
        ListNode ansHead = null;
        ListNode ansPoint = null;
        int val;

        while (point1 != null && point2 != null) {
            if (point1.val <= point2.val) {
                val = point1.val;
                point1 = point1.next;
            } else {
                val = point2.val;
                point2 = point2.next;
            }

            if (ansHead == null) {
                ansHead = new ListNode(val);
                ansPoint = ansHead;
            } else {
                ansPoint.next = new ListNode(val);
                ansPoint = ansPoint.next;
            }
        }
        while (point1 != null) {
            val = point1.val;
            point1 = point1.next;
            if (ansHead == null) {
                ansHead = new ListNode(val);
                ansPoint = ansHead;
            } else {
                ansPoint.next = new ListNode(val);
                ansPoint = ansPoint.next;
            }
        }
        while (point2 != null) {
            val = point2.val;
            point2 = point2.next;
            if (ansHead == null) {
                ansHead = new ListNode(val);
                ansPoint = ansHead;
            } else {
                ansPoint.next = new ListNode(val);
                ansPoint = ansPoint.next;
            }
        }

        return ansHead;
    }
    class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int x) {
            val = x;
        }
    }
}

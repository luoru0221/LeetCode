/**
 * @author RuL
 */
public class LeetCode92 {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode empty = new ListNode();
        empty.next = head;
        int count = 0;
        ListNode leftPre = null;
        ListNode rightPost = null;
        ListNode leftPoint = null;
        ListNode rightPoint = null;
        ListNode current = empty;
        while (count <= right + 1 && current != null) {
            if (count == left - 1) {
                leftPre = current;
            }
            if (count == left) {
                leftPoint = current;
            }
            if (count == right) {
                rightPoint = current;
            }
            if (count == right + 1) {
                rightPost = current;
            }
            count++;
            current = current.next;
        }
        //断开链表
        rightPoint.next = null;
        reverse(leftPoint);
        leftPre.next = rightPoint;
        leftPoint.next = rightPost;

        return empty.next;
    }

    /**
     * 翻转链表，不改变head引用
     *
     * @param head 头结点
     */
    public void reverse(ListNode head) {
        ListNode point = head;
        ListNode current = null;
        ListNode post;

        while (point != null) {
            post = point.next;
            point.next = current;
            current = point;
            point = post;
        }

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

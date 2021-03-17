/**
 * @author RuL
 */
public class LeetCode25 {

    /**
     * 将链表的k个节点进行翻转，返回新的头结点
     *
     * @param head 链表头结点
     * @param k    翻转节点数
     * @return 翻转后的新节点
     */
    public ListNode reverseKGroup(ListNode head, int k) {
        int cnt = 1;

        ListNode point = head;
        ListNode next_head;
        ListNode new_head = head;

        //找出k个节点
        while (cnt < k && point != null) {
            point = point.next;
            cnt++;
        }

        if (cnt == k && point != null) {
            //记录下条链表的头结点
            next_head = point.next;
            //断开链表
            point.next = null;
            //翻转链表
            new_head = reverseList(head);
            //将下一组链表翻转后的链表头结点连接到上一组链表旧的头结点（翻转后为尾结点）
            head.next = reverseKGroup(next_head, k);
        }
        return new_head;
    }

    /**
     * 翻转链表
     *
     * @param head 链表头结点
     * @return 翻转后的链表头结点
     */
    public ListNode reverseList(ListNode head) {
        ListNode current = null;
        ListNode next;

        while (head != null) {
            next = head.next;
            head.next = current;
            current = head;
            head = next;
        }
        return current;
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

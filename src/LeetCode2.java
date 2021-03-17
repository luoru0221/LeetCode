public class LeetCode2 {

/*    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode list = new ListNode(0);
        ListNode sum = list;
        boolean haveHead = false;

        while (l1 != null && l2 != null) {
            list.next = new ListNode((l1.val + l2.val + carry) % 10);
            carry = (l1.val + l2.val + carry) / 10;
            list = list.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        while (l1 != null) {
            list.next = new ListNode((l1.val + carry) % 10);
            carry = (l1.val + carry) / 10;
            list = list.next;
            l1 = l1.next;
        }
        while (l2 != null) {
            list.next = new ListNode((l2.val + carry) % 10);
            carry = (l2.val + carry) / 10;
            list = list.next;
            l2 = l2.next;
        }
        if (carry != 0) {
            list.next = new ListNode(carry);
        }
        return sum.next;
    }*/
}

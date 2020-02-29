public class LeetCode141 {

    public boolean hasCycle(ListNode head) {
        ListNode fast = new ListNode();
        ListNode slow = new ListNode();
        fast.next = head;
        slow.next = head;

        while(slow.next!=null&&fast.next!=null&&fast.next.next!=null){
            slow.next = slow.next.next;
            fast.next = fast.next.next.next;
            if(slow.next==fast.next){
                return true;
            }
        }
        return false;
    }
}

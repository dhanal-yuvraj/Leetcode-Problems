/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    private ListNode merge2(ListNode head1, ListNode head2){
        ListNode dummy = new ListNode(-1);
        ListNode t1 = head1;
        ListNode t2 = head2;
        ListNode temp = dummy;
        while(t1!=null && t2!=null){
            if(t1.val<t2.val){
                temp.next = t1;
                temp = t1;
                t1=t1.next;
            }else{
                temp.next = t2;
                temp = t2;
                t2 = t2.next;
            }
        }

        while(t1!=null){
            temp.next = t1;
            temp = t1;
            t1 = t1.next;
        }

        while(t2!=null){
            temp.next = t2;
            temp = t2;
            t2 = t2.next;
        }

        return dummy.next;
    }

    private ListNode findMid(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast.next!=null && fast.next.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode middle = findMid(head);
        ListNode leftHead = head;
        ListNode rightHead = middle.next;
        middle.next = null;
        leftHead = sortList(leftHead);
        rightHead = sortList(rightHead);

        return merge2(leftHead, rightHead);
    }
}
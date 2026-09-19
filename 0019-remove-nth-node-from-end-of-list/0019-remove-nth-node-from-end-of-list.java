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
    public ListNode reverse(ListNode head){
        if(head==null || head.next==null){
            return head;
        }
        ListNode newHead = reverse(head.next);
        ListNode front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null || head.next==null){
            return null;
        }
        ListNode revHead = reverse(head);
        if(n==1){
            revHead = revHead.next;
            return reverse(revHead);
        }

        ListNode prev = revHead;
        int count = 0;
        ListNode temp = revHead;
        while(temp!=null){
            count++;
            if(count==n){
                break;
            }
            prev = temp;
            temp = temp.next;
        }

        ListNode front = temp.next;
        prev.next = front;
        temp.next = null;
        return reverse(revHead);
    }
}
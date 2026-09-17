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
        ListNode prev = null;
        ListNode temp = head;
        while(temp!=null){
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
    public boolean isPalindrome(ListNode head) {
        boolean palindrome = true;
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode secondHead = reverse(slow.next);
        ListNode first = head;
        ListNode second = secondHead;
        while(second!=null){
            if(second.val!=first.val){
                palindrome = false;
                reverse(secondHead);
                break;
            }
            first = first.next;
            second = second.next;
        }
        reverse(secondHead);
        return palindrome;
    }
}
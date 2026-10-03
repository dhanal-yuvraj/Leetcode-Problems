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
    private ListNode findKthNode(ListNode current, int k){
        while(current!=null && k>1){
            k--;
            current=current.next;
        }
        return current;
    }
    private ListNode reverseList(ListNode head){
        ListNode temp = head;
        ListNode prev = null;
        while(temp!=null){
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prevNode = null;
        while(temp!=null){
            ListNode kthNode = findKthNode(temp,k);
            if(kthNode==null){
                if(prevNode!=null){
                    prevNode.next = temp;
                }
                break;
            }
            ListNode front = kthNode.next;
            kthNode.next = null;
            reverseList(temp);
            if(temp==head){
                head = kthNode;
            }else{
                prevNode.next = kthNode;
            }

            prevNode = temp;
            temp = front;
        }
        return head;
    }
}
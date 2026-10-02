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
    private ListNode reverseList(ListNode current){
        ListNode prev = null;
        ListNode temp = current;
        while(temp != null){
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
    private ListNode findKthNode(ListNode current, int k){
        k -= 1;
        while(current!=null && k>0){
            current = current.next;
            k--;
        }
        return current;
    }
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode temp = head;
        ListNode prevNode = null;
        while(temp!=null){
            ListNode kthNode = findKthNode(temp,k);
            if(kthNode == null){
                if(prevNode != null){
                    prevNode.next = temp;
                    break;
                }
            }
            ListNode nextNode = kthNode.next;
            kthNode.next = null;
            reverseList(temp);
            if(head==temp){
                head = kthNode;
            }else{
                prevNode.next = kthNode;
            }

            prevNode = temp;
            temp = nextNode;
        }
        return head;
    }
}
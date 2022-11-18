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
    public ListNode deleteDuplicates(ListNode head) {
        
        if (head == null) {
            return head;
        }
        
        ListNode headCpy = head;
        ListNode headPtr = head.next;
        ListNode tailPtr = head;
        
        while(true) {
            if (headPtr == null) {
                tailPtr.next = null;
                break;
            }
            
            if (headPtr.val == tailPtr.val) {
                headPtr = headPtr.next;
            } else {
                tailPtr.next = headPtr;
                tailPtr = tailPtr.next;
                headPtr = headPtr.next;
            }
            
        }
        return headCpy;
        
        
    }
}

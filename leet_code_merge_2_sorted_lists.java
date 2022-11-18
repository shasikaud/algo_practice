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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode sortedList = new ListNode();
        ListNode head = sortedList;
        ListNode list1Ptr = list1;
        ListNode list2Ptr = list2;
        
        while(true) {
            if (list2Ptr == null || list1Ptr == null){
                break;
            }
            if (list1Ptr.val > list2Ptr.val) {
                sortedList.next = new ListNode (list2Ptr.val);
                list2Ptr = list2Ptr.next;
            } else {
                sortedList.next = new ListNode (list1Ptr.val);
                list1Ptr = list1Ptr.next;
            } 
            sortedList = sortedList.next;
        }
        
        if (list1Ptr == null) {
            sortedList.next = list2Ptr;
        } else {
            sortedList.next = list1Ptr;
        }
        return head.next;
        
    }
}

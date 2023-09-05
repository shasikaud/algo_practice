'''
Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
'''

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode slowPtr = head;
        ListNode fastPtr = head.next;

        while (slowPtr!=null || fastPtr.next!=null) {
            if (slowPtr == fastPtr) return true;
            if (fastPtr == null || fastPtr.next == null) return false;
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }

        return false;
    }
}
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String n1 = "";
        String n2 = "";
        while (l1 != null) {
            n1 = String.valueOf((l1.val)).concat(n1);
            l1 = l1.next;
        }
        while (l2 != null) {
            n2 = String.valueOf((l2.val)).concat(n2);
            l2 = l2.next;
        }
        String sum = String.valueOf(Long.parseLong(n1)+Long.parseLong(n2));
        ListNode head = new ListNode();
        ListNode curr = head;
        curr.val = Integer.parseInt(String.valueOf(sum.charAt(sum.length()-1)));
        for (int i = 1; i < sum.length(); i++){
            ListNode node = new ListNode(Integer.parseInt(String.valueOf(sum.charAt(sum.length()-1-i))));
            curr.next = node;
            curr = curr.next;
        }
        return head;   
    }
}

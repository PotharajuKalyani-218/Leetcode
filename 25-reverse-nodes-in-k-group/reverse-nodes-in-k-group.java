class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k == 1) return head;

        ListNode p = new ListNode(0);
        p.next = head;
        ListNode curr = head;
        int c = 0;

        // Count total nodes
        while (curr != null) {
            c++;
            curr = curr.next;
        }

        ListNode prev = p;

        // Reverse in groups
        while (c >= k) {
            curr = prev.next;
            ListNode next = curr.next;

            for (int i = 1; i < k; i++) {
                curr.next = next.next;
                next.next = prev.next;
                prev.next = next;
                next = curr.next;
            }

            prev = curr;
            c -= k;
        }

        return p.next;
    }
}

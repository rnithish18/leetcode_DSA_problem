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
    public int[] nodesBetweenCriticalPoints(ListNode head) {

        int[] ans = {-1, -1};

        ListNode prev = head;
        ListNode curr = head.next;

        int index = 1;
        int first = -1;
        int last = -1;

        int minDistance = Integer.MAX_VALUE;

        while (curr.next != null) {

            // Critical point:
            // Local maximum OR local minimum
            if ((curr.val > prev.val && curr.val > curr.next.val) ||
                (curr.val < prev.val && curr.val < curr.next.val)) {

                if (first == -1) {
                    // First critical point
                    first = index;
                } else {
                    // Distance from previous critical point
                    minDistance = Math.min(minDistance, index - last);
                }

                // Update last critical point
                last = index;
            }

            prev = curr;
            curr = curr.next;
            index++;
        }

        // Need at least 2 critical points
        if (first == -1 || first == last) {
            return ans;
        }

        // Minimum distance
        ans[0] = minDistance;

        // Maximum distance = last critical point - first critical point
        ans[1] = last - first;

        return ans;
    }
}
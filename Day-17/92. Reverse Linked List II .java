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
    public ListNode reverseBetween(ListNode head, int left, int right) {
         if (head == null || left == right) return head;

        // Step 1: Store all values in an ArrayList
        ArrayList<Integer> list = new ArrayList<>();
        ListNode node = head;
        while (node != null) {
            list.add(node.val);
            node = node.next;
        }

        // Step 2: Reverse the subarray between left and right
        int i = left - 1;
        int j = right - 1;
        while (i < j) {
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
            i++;
            j--;
        }

        // Step 3: Write values back into linked list
        node = head;
        for (int val : list) {
            node.val = val;
            node = node.next;
        }

        return head;
    }
}

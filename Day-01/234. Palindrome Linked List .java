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
class Solution 
{
    public boolean isPalindrome(ListNode head) 
    {
         ListNode s=head;
          ListNode f=head;
           ListNode r=null;
         while(f!=null&&f.next!=null)
         {
             ListNode t=s;
             s=s.next;
             f=f.next.next;
             t.next=r;
             r=t;
         }
         if(f!=null)
         {
            s=s.next;
         }
         while(s!=null&&s.val==r.val)
         {
            s=s.next;
            r=r.next;
         }
         return s==null;
    }
}

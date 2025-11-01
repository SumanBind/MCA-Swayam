import java.util.*;


class ListNode 
{
    int val;
    ListNode next;
    ListNode() 
  {}
    ListNode(int val) 
  {
    this.val = val; 
  }
    ListNode(int val, ListNode next)
  { 
        this.val = val; 
        this.next = next; 
    }
}

class Solution 
{
    public ListNode removeNodes(ListNode head) 
  {
       
        head = reverse(head);

        
        ListNode curr = head;
        int currMax = head.val;

        while (curr != null && curr.next != null) 
        {
            if (curr.next.val < currMax) 
            {
              
                curr.next = curr.next.next;
            } 
            else 
            {
              
                currMax = curr.next.val;
                curr = curr.next;
            }
        }

        return reverse(head);
    }

    
    private ListNode reverse(ListNode head)
  {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) 
        {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}


public class Main 
{
    public static void main(String[] args) 
  {
       
        ListNode head = new ListNode(5, new ListNode(2, new ListNode(13, new ListNode(3, new ListNode(8)))));

        Solution sol = new Solution();
        ListNode result = sol.removeNodes(head);

   
        while (result != null) 
        {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}

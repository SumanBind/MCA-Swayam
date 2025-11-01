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
    public ListNode modifiedList(int[] nums, ListNode head) 
  {
       
        Set<Integer> set = new HashSet<>();
        for (int num : nums)
            set.add(num);
        while (head != null && set.contains(head.val)) 
        {
            head = head.next;
        }

    
        ListNode temp = head;
        while (temp != null && temp.next != null) 
        {
            if (set.contains(temp.next.val)) 
            {
                temp.next = temp.next.next;
            }
            else
            {
                temp = temp.next;
            }
        }

        return head;
    }
}


public class Main 
{
    public static void main(String[] args)
  {
      
        int[] nums = {2, 3};
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4))));

        Solution sol = new Solution();
        ListNode result = sol.modifiedList(nums, head);

    
        while (result != null)
          {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}

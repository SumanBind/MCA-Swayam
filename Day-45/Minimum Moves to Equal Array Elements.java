import java.util.*;

public class Solution 
{
    public int minMoves(int[] nums)
  {
        int mn = nums[0];
        int rs = 0;

       
        for (int i = 0; i < nums.length; i++)
          {
            if (nums[i] < mn)
                mn = nums[i];
        }

        
        for (int i = 0; i < nums.length; i++) 
        {
            rs += nums[i] - mn;
        }

        return rs;
    }

    public static void main(String[] args) 
  {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) 
        {
            nums[i] = sc.nextInt();
        }

        int result = sol.minMoves(nums);
        System.out.println("Minimum number of moves: " + result);

        sc.close();
    }
}

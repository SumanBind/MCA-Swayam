import java.util.*;

public class Solution 
{
    public int findDuplicate(int[] nums) 
  {
        Set<Integer> seen = new HashSet<>();

        for (int num : nums) 
        {
            if (seen.contains(num)) 
            {
                return num; 
            }
            seen.add(num);
        }

        return -1; 
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

        int result = sol.findDuplicate(nums);
        if (result != -1)
            System.out.println("Duplicate element found: " + result);
        else
            System.out.println("No duplicate found.");

        sc.close();
    }
}

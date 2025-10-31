import java.util.*;

public class Solution 
{
    public int maximumCount(int[] nums) 
  {
        int count = 0;   
        int count1 = 0;  

        for (int i = 0; i < nums.length; i++) 
        {
            if (nums[i] != 0) 
            {
                if (nums[i] > 0)
                {
                    count++;
                }
                else
                {
                    count1++;
                }
            }
        }

       
        int result;
        if (count > count1)
        {
            result = count;
        } 
        else
        {
            result = count1;
        }

        return result;
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

        int result = sol.maximumCount(nums);
        System.out.println("Maximum count of positive or negative numbers: " + result);

        sc.close();
    }
}

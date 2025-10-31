import java.util.*;

public class Solution 
{
   
    public int longestNiceSubarray(int[] nums)
  {
        int n = nums.length;
        int m = 0;
        for (int i = 0; i < n; i++)
          {
            int b = 0;
            for (int j = i; j < n; j++)
              {
                if ((b & nums[j]) != 0)
                {
                    break;
                }
                b |= nums[j];
                m = Math.max(m, j - i + 1);
            }
        }
        return m;
    }

   
    public int longestNiceSubarrayOptimized(int[] nums)
  {
        int n = nums.length;
        int left = 0;
        int bitmask = 0;
        int maxLen = 0;

        for (int right = 0; right < n; right++)
          {
           
            while ((bitmask & nums[right]) != 0)
              {
                bitmask ^= nums[left];
                left++;
            }
            bitmask |= nums[right];
            maxLen = Math.max(maxLen, right - left + 1);
        }
        return maxLen;
    }

    public static void main(String[] args) 
  {
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter elements (space separated or newline):");
        for (int i = 0; i < n; i++) 
        {
            nums[i] = sc.nextInt();
        }

        
        int result = sol.longestNiceSubarray(nums);
        System.out.println("Longest nice subarray length (original): " + result);

        
        int resultOpt = sol.longestNiceSubarrayOptimized(nums);
        System.out.println("Longest nice subarray length (optimized): " + resultOpt);

        sc.close();
    }
}

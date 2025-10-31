import java.util.*;

public class Solution 
{
    public int[] sortArrayByParity(int[] nums)
  {
        int j = 0;
        for (int i = 0; i < nums.length; i++) 
        {
            if (nums[i] % 2 == 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                j++;
            }
        }
        return nums;
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

        int[] result = sol.sortArrayByParity(nums);

        System.out.println("Array after sorting by parity:");
        for (int num : result)
          {
            System.out.print(num + " ");
        }

        sc.close();
    }
}

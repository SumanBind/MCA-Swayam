import java.util.*;

public class Solution 
{
    public int findMin(int[] nums)
{
        Arrays.sort(nums);   
        return nums[0];      
    }

    public static void main(String[] args) 
{
        Scanner sc = new Scanner(System.in);
        Solution sol = new Solution();

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = sol.findMin(nums);
        System.out.println("Minimum element in the array: " + result);

        sc.close();
    }
}

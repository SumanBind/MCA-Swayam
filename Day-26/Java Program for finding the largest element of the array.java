import java.util.*;
class Solution 
{
    public int findKthLargest(int[] nums, int k) 
    {
        Arrays.sort(nums);
        int n=nums.length;
        return nums[n-k];
    }
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        Solution  ob=new Solution ();
        System.out.println("Enter arrays size");
        int n=sc.nextInt();
        System.out.println("Enter Key");
        int k=sc.nextInt();
        int nums[]=new int[n];
        System.out.println("Enter array elements");
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();
        }
       int result=ob.findKthLargest(nums,k);
        System.out.println("Result:"+result);
    }
}
